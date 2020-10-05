package com.ray.mybatis.utils;

/**
 * 代码复用，为了防止多次出现new Result()的代码造成冗余，增加一个工具类ResultUtil
 * Date: 2020-09-28
 */
public class ResultUtil {

    public static Result success(Object object) {
        Result result = new Result();
        result.setCode(200);
        result.setMsg("成功");
        result.setData(object);
        return result;
    }

    public static Result success() {
        return success(null);
    }

    public static Result error(Integer code, String msg) {
        Result result = new Result();
        result.setCode(code);
        result.setMsg(msg);
        return result;
    }
}
