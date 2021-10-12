package com.xl.xim.common.protocol;

import com.google.protobuf.InvalidProtocolBufferException;


/**
 * @author: xl
 * @date: 2021/8/5
 **/

public class ProtocolUtil {

    public static void main(String[] args) throws InvalidProtocolBufferException {
        XIMRequestProto.XIMReqProtocol protocol = XIMRequestProto.XIMReqProtocol.newBuilder()
                .setRequestId(123L)
                .setReqMsg("你好啊")
                .build();

        byte[] encode = encode(protocol);

        XIMRequestProto.XIMReqProtocol parseFrom = decode(encode);

        System.out.println(protocol.toString());
        System.out.println(protocol.toString().equals(parseFrom.toString()));
    }

    /**
     * 编码
     *
     * @param protocol
     * @return
     */
    public static byte[] encode(XIMRequestProto.XIMReqProtocol protocol) {
        return protocol.toByteArray();
    }

    /**
     * 解码
     *
     * @param bytes
     * @return
     * @throws InvalidProtocolBufferException
     */
    public static XIMRequestProto.XIMReqProtocol decode(byte[] bytes) throws InvalidProtocolBufferException {
        return XIMRequestProto.XIMReqProtocol.parseFrom(bytes);
    }
}
