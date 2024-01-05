package com.huqing.icu.exception;


import com.huqing.icu.constants.BusinessExceptionEnum;
import lombok.Data;

/**
 * 业务异常
 *
 * @author huqing
 * @date 2024-01-04 20:11:00
 */
@Data
public class BusinessException extends SystemException {

    private int code;

    private String msg;

    public BusinessException(int code, String msg) {
        this.code = code;
        this.msg = msg;
    }

    public BusinessException(BusinessExceptionEnum exceptionEnum) {
        this.code = exceptionEnum.getCode();
        this.msg = exceptionEnum.getMsg();
    }
}
