package com.huqing.icu.exception;

import lombok.Data;

/**
 * 系统异常
 *
 * @author huqing
 * @date 2024-01-04 20:09:38
 */
@Data
public class SystemException extends RuntimeException {

    protected int code;

    protected String msg;
}
