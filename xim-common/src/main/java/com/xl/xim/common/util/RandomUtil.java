package com.xl.xim.common.util;

/**
 * @author: xl
 * @date: 2021/8/5
 **/
public class RandomUtil {

    public static int getRandom() {

        double random = Math.random();
        return (int) (random * 100);
    }
}
