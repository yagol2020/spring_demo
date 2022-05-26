package com.example.yagolxyz.rest;

import lombok.AllArgsConstructor;
import lombok.Data;

/**
 * @author yagol
 * @date 2022/5/26
 */
@Data
@AllArgsConstructor
public class RestResp {
    private RestCode code;
    private Object data;

    public static RestResp success(Object data) {
        return new RestResp(RestCode.SUCCESS, data);
    }

    public static RestResp fail(Object data) {
        return new RestResp(RestCode.FAIL, data);
    }

    public static RestResp notFound(Object data) {
        return new RestResp(RestCode.NOT_FOUND, data);
    }

}
