package com.lis001.invest.common.enums;

import org.springframework.http.HttpStatus;

import lombok.Getter;
import lombok.ToString;

@Getter
@ToString
public enum ExceptionEnum {
    RUNTIME_EXCEPTION(HttpStatus.BAD_REQUEST, "E40001"),
    ACCESS_DENIED_EXCEPTION(HttpStatus.UNAUTHORIZED, "E40101"),
    INTERNAL_SERVER_ERROR(HttpStatus.INTERNAL_SERVER_ERROR, "E50001"),
    SECURITY_01(HttpStatus.UNAUTHORIZED, "S40101", "NOT have permission"),
    SOLDOUT(HttpStatus.NOT_ACCEPTABLE, "S40601", "Sold out");

    private final HttpStatus status;
    private final String code;
    private String message;

    ExceptionEnum(HttpStatus status, String code) {
        this.status = status;
        this.code = code;
    }

    ExceptionEnum(HttpStatus status, String code, String message) {
        this.status = status;
        this.code = code;
        this.message = message;
    }
}
