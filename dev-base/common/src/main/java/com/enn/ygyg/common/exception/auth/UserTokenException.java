package com.enn.ygyg.common.exception.auth;


import com.enn.ygyg.common.constant.CommonConstants;
import com.enn.ygyg.common.exception.BaseException;

/**
 * Created by ace on 2017/9/8.
 */
public class UserTokenException extends BaseException {
    public UserTokenException(String message) {
        super(message, CommonConstants.EX_USER_INVALID_CODE);
    }
}
