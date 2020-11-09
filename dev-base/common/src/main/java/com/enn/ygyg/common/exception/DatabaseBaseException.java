package com.enn.ygyg.common.exception;

import com.enn.ygyg.common.config.ConfigException;
import com.enn.ygyg.common.constant.Constants;
import com.enn.ygyg.common.constant.JdbcConstants;
import com.enn.ygyg.common.http.HttpStatus;

public class DatabaseBaseException extends BaseException {

    public DatabaseBaseException(String msg, int code) {
        super(msg, code);
    }

    public static BaseException asConnException(String dataBaseType, Exception e, String jdbcUsername, String datasourceName) {
        if (dataBaseType.equals(JdbcConstants.MYSQL)) {
            if (e.getMessage().contains(Constants.MYSQL_DATABASE)) {
                return BaseException.runException(HttpStatus.DATABASE_NAME_ERROR,
                        ConfigException.getInstance().getProperty(String.valueOf(HttpStatus.DATABASE_NAME_ERROR)), e);
            }
            if (e.getMessage().contains(Constants.MYSQL_CONNEXP)) {
                return BaseException.runException(HttpStatus.IP_PORT_ERROR,
                        ConfigException.getInstance().getProperty(String.valueOf(HttpStatus.IP_PORT_ERROR)), e);
            }
            if (e.getMessage().contains(Constants.MYSQL_ACCDENIED)) {
                return BaseException.runException(HttpStatus.USERNAME_PASSWORD_ERROR,
                        ConfigException.getInstance().getProperty(String.valueOf(HttpStatus.USERNAME_PASSWORD_ERROR)), e);
            }
            return BaseException.runException(HttpStatus.DB_CONNECTION_ERROR,
                    ConfigException.getInstance().getProperty(String.valueOf(HttpStatus.DB_CONNECTION_ERROR)), e);
        }
        return BaseException.runException(HttpStatus.DB_CONNECTION_ERROR,
                ConfigException.getInstance().getProperty(String.valueOf(HttpStatus.DB_CONNECTION_ERROR)), e);
    }


}
