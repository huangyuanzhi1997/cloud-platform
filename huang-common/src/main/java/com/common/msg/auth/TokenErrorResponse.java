package com.common.msg.auth;

import com.common.constant.RestCodeConstants;
import com.common.msg.BaseResponse;


public class TokenErrorResponse extends BaseResponse {
    public TokenErrorResponse(String message) {
        super(RestCodeConstants.TOKEN_ERROR_CODE, message);
    }
}
