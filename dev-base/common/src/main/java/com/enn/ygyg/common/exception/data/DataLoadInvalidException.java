package com.enn.ygyg.common.exception.data;

import com.enn.ygyg.common.constant.CommonConstants;
import com.enn.ygyg.common.exception.BaseException;

public class DataLoadInvalidException extends BaseException {
    public DataLoadInvalidException(String message) {
        super(message, CommonConstants.DATA_SOURCE_INVALID_CODE);
    }
}