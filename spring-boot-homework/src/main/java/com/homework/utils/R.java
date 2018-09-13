package com.homework.utils;

import lombok.Data;

/**
 * Created by Hukai
 * 2018/9/13 23:07
 * 自定义结果封装类
 */
@Data
public class R {

    private String code;

    private String msg;

    private Object data;

    public static R success(String msg) {
        R success = new R();

        success.setCode("200");
        success.setData(null);
        success.setMsg(msg);

        return success;
    }

    public static R success(String msg, Object data) {
        R success = new R();

        success.setCode("200");
        success.setData(data);
        success.setMsg(msg);

        return success;
    }

    public static R fail(String msg) {
        R fail = new R();

        fail.setCode("400");
        fail.setData(null);
        fail.setMsg(msg);

        return fail;
    }

    public static R fail(String msg, Object data) {
        R fail = new R();

        fail.setCode("400");
        fail.setData(data);
        fail.setMsg(msg);

        return fail;
    }
}
