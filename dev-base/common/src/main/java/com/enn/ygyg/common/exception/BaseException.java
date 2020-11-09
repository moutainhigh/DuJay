package com.enn.ygyg.common.exception;

import java.io.PrintWriter;
import java.io.StringWriter;

/**
 * Created by ace on 2017/9/8.
 */
public class BaseException extends RuntimeException {
    private int status = 200;

    public BaseException(String message, int status, Throwable cause) {
        super(message, cause);
        this.status = status;
    }

    protected static BaseException runException(int ipPortError, String property, Exception e) {
        if (e instanceof BaseException) {
            return (BaseException) e;
        }
        return new BaseException(property, ipPortError, e);
    }

    public int getStatus() {
        return status;
    }

    public void setStatus(int status) {
        this.status = status;
    }

    public BaseException() {
    }

    public BaseException(String message,int status) {
        super(message);
        this.status = status;
    }

    public BaseException(String message) {
        super(message);
    }

    public BaseException(String message, Throwable cause) {
        super(message, cause);
    }

    public BaseException(Throwable cause) {
        super(cause);
    }

    public BaseException(String message, Throwable cause, boolean enableSuppression, boolean writableStackTrace) {
        super(message, cause, enableSuppression, writableStackTrace);
    }

    public BaseException runException(int status, Throwable cause, Exception e) {
        if (cause instanceof BaseException) {
            return (BaseException) cause;
        }
        return new BaseException(getMessage(cause), status, cause);
    }

    private String getMessage(Throwable cause) {
        if (cause == null) {
            return "";
        }
        if (cause instanceof Throwable) {
            StringWriter str = new StringWriter();
            PrintWriter pw = new PrintWriter(str);
            ((Throwable) cause).printStackTrace(pw);
            return str.toString();
        } else {
            return cause.toString();
        }
    }
}
