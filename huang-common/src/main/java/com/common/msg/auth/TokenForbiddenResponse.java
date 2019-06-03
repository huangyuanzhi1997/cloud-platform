package com.common.msg.auth;

import com.common.constant.RestCodeConstants;
import com.common.msg.BaseResponse;


public class TokenForbiddenResponse  extends BaseResponse {
    public TokenForbiddenResponse(String message) {
        super(RestCodeConstants.TOKEN_FORBIDDEN_CODE, message);
    }
}
