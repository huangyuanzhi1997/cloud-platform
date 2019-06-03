package com.common.exception.auth;


import com.common.constant.CommonConstants;
import com.common.exception.BaseException;


public class ClientTokenException extends BaseException {
    public ClientTokenException(String message) {
        super(message, CommonConstants.EX_CLIENT_INVALID_CODE);
    }
}
