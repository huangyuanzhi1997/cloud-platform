package com.common.exception.auth;


import com.common.constant.CommonConstants;
import com.common.exception.BaseException;


public class ClientInvalidException extends BaseException {
    public ClientInvalidException(String message) {
        super(message, CommonConstants.EX_CLIENT_INVALID_CODE);
    }
}
