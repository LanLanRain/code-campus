package com.rainsoul.subject.common.entity;

import com.rainsoul.subject.common.enums.ResultCodeEnum;
import lombok.Data;

/**
 * @author RainSoul
 * @create 2024-07-28
 */
@Data
public class Result<T> {
    private Boolean success;
    private String message;
    private Integer code;

    private T data;

    public static Result success() {
        Result result = new Result();
        result.setSuccess(true);
        result.setMessage(ResultCodeEnum.SUCCESS.getMsg());
        result.setCode(ResultCodeEnum.SUCCESS.getCode());
        return result;
    }

    public static <T> Result success(T data) {
        Result result = new Result();
        result.setSuccess(true);
        result.setMessage(ResultCodeEnum.SUCCESS.getMsg());
        result.setCode(ResultCodeEnum.SUCCESS.getCode());
        result.setData(data);
        return result;
    }

    public static  Result fail() {
        Result result = new Result();
        result.setSuccess(false);
        result.setMessage(ResultCodeEnum.FAIL.getMsg());
        result.setCode(ResultCodeEnum.FAIL.getCode());
        return result;
    }

    public static <T> Result fail(T data) {
        Result result = new Result();
        result.setSuccess(false);
        result.setMessage(ResultCodeEnum.FAIL.getMsg());
        result.setCode(ResultCodeEnum.FAIL.getCode());
        result.setData(data);
        return result;
    }

}
