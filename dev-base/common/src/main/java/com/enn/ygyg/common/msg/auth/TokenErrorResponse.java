package com.enn.ygyg.common.msg.auth;

import com.enn.ygyg.common.constant.RestCodeConstants;
import com.enn.ygyg.common.msg.BaseResponse;

/**
 * Created by ace on 2017/8/23.
 */
public class TokenErrorResponse extends BaseResponse {
    public TokenErrorResponse(String message) {
        super(RestCodeConstants.TOKEN_ERROR_CODE, message);
    }
}
