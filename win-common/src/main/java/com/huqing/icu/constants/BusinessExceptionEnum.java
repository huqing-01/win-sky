package com.huqing.icu.constants;

import lombok.Getter;

/**
 * 业务异常类型枚举
 *
 * @author huqing
 * @date 2024-01-04 20:16:23
 */
@Getter
public enum BusinessExceptionEnum {

    THIRD_API_REQUEST_ERROR(500017, "请求第三方接口出现异常，请稍候重试"),
    ;

    private int code;

    private String msg;

    BusinessExceptionEnum(int code, String msg) {
        this.code = code;
        this.msg = msg;
    }
}
