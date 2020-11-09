package com.enn.ygyg.common.exception.data;

import com.enn.ygyg.common.constant.CommonConstants;
import com.enn.ygyg.common.exception.BaseException;

public class TableInvalidException extends BaseException {
    public TableInvalidException(String message) {
        super(message, CommonConstants.DATA_SOURCE_INVALID_CODE);
    }
}
