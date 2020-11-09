package com.enn.ygyg.common.exception.auth;


import com.enn.ygyg.common.constant.CommonConstants;
import com.enn.ygyg.common.exception.BaseException;

/**
 * Created by ace on 2017/9/12.
 */
public class ClientForbiddenException extends BaseException {
    public ClientForbiddenException(String message) {
        super(message, CommonConstants.EX_CLIENT_FORBIDDEN_CODE);
    }

}
