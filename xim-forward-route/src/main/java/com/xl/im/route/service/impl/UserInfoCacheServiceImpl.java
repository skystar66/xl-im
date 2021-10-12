package com.xl.im.route.service.impl;

import com.github.benmanes.caffeine.cache.Cache;
import com.github.benmanes.caffeine.cache.Caffeine;
import com.github.benmanes.caffeine.cache.LoadingCache;
import com.xl.im.route.constant.Constant;
import com.xl.im.route.service.UserInfoCacheService;
import com.xl.xim.common.pojo.XIMUserInfo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.redis.core.RedisTemplate;
import org.springframework.stereotype.Service;

import java.util.HashSet;
import java.util.Map;
import java.util.Set;
import java.util.concurrent.ConcurrentHashMap;


/**
 * @author: xl
 * @date: 2021/8/5
 **/
@Service
public class UserInfoCacheServiceImpl implements UserInfoCacheService {


    private final LoadingCache<Long, XIMUserInfo> USER_INFO_MAP = Caffeine.newBuilder()
            .maximumSize(Constant.CACHE_MAX_SIZE)
            .build(this::loadUserInfoByUserIdFromRedis);


    @Autowired
    private RedisTemplate<String, String> redisTemplate;


    public XIMUserInfo loadUserInfoByUserIdFromRedis(Long userId) {
        XIMUserInfo ximUserInfo = null;
        //load redis
        String sendUserName = redisTemplate.opsForValue().get(Constant.ACCOUNT_PREFIX + userId);
        if (sendUserName != null) {
            ximUserInfo = new XIMUserInfo(userId, sendUserName);
        }
        return ximUserInfo;
    }

    @Override
    public XIMUserInfo loadUserInfoByUserId(Long userId) {
        //优先从本地缓存获取
        XIMUserInfo ximUserInfo = USER_INFO_MAP.get(userId);
        if (ximUserInfo != null) {
            return ximUserInfo;
        }
        return null;
    }

    @Override
    public boolean saveAndCheckUserLoginStatus(Long userId) throws Exception {

        Long add = redisTemplate.opsForSet().add(Constant.LOGIN_STATUS_PREFIX, userId.toString());
        if (add == 0) {
            return false;
        } else {
            return true;
        }
    }

    @Override
    public void removeLoginStatus(Long userId) throws Exception {
        redisTemplate.opsForSet().remove(Constant.LOGIN_STATUS_PREFIX, userId.toString());
    }

    @Override
    public Set<XIMUserInfo> onlineUser() {
        Set<XIMUserInfo> set = null;
        Set<String> members = redisTemplate.opsForSet().members(Constant.LOGIN_STATUS_PREFIX);
        for (String member : members) {
            if (set == null) {
                set = new HashSet<>(64);
            }
            XIMUserInfo ximUserInfo = loadUserInfoByUserId(Long.valueOf(member));
            set.add(ximUserInfo);
        }

        return set;
    }

}
