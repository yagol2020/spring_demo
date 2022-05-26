package com.example.yagolxyz.rest;

/**
 * @author yagol
 * @date 2022/5/26
 */
public enum RestCode {
    /**
     *
     */
    SUCCESS(200, "success"),
    FAIL(500, "fail"),
    NOT_FOUND(404, "not found"),
    UNAUTHORIZED(401, "unauthorized"),
    FORBIDDEN(403, "forbidden"),
    BAD_REQUEST(400, "bad request"),
    INTERNAL_SERVER_ERROR(500, "internal server error");

    RestCode(int i, String success) {
    }
}
