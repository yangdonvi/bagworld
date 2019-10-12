package com.donvi.utils;

public enum ResponseCode {
    // 成功
    SUCCESS("200","SUCCESS"),
    //错误
    ERROR("0","ERROR");
    private final String code;
    private final String desc;

    ResponseCode(String code, String desc) {
        this.code = code;
        this.desc = desc;
    }

    public String getCode() {
        return code;
    }

    public String getDesc() {
        return desc;
    }
}
