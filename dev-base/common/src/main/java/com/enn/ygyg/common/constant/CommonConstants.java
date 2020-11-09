package com.enn.ygyg.common.constant;

/**
 * Created by ace on 2017/8/29.
 */
public class CommonConstants {
    public final static String RESOURCE_TYPE_MENU = "menu";
    public final static String RESOURCE_TYPE_BTN = "button";
    public static final Integer EX_TOKEN_ERROR_CODE = 40101;
    // 用户token异常
    public static final Integer EX_USER_INVALID_CODE = 40101;
    public static final Integer EX_USER_PASS_INVALID_CODE = 40001;
    // 客户端token异常
    public static final Integer EX_CLIENT_INVALID_CODE = 40131;
    public static final Integer EX_CLIENT_FORBIDDEN_CODE = 40331;
    public static final Integer EX_OTHER_CODE = 500;
    public static final String CONTEXT_KEY_USER_ID = "currentUserId";
    public static final String CONTEXT_KEY_USERNAME = "currentUserName";
    public static final String CONTEXT_KEY_USER_NAME = "currentUser";
    public static final String CONTEXT_KEY_USER_TOKEN = "currentUserToken";
    public static final String JWT_KEY_USER_ID = "userId";
    public static final String JWT_KEY_NAME = "name";
    public static final String JWT_ID = "id";
    // 数据源配置异常码
    public static final Integer DATA_SOURCE_INVALID_CODE = 100001;
    // 数据源表异常码
    public static final Integer DATA_TABLE_INVALID_CODE = 100010;
    // 数据源表字段异常码
    public static final Integer DATA_COLUMN_INVALID_CODE = 100020;
    // 数据服务接口异常码
    public static final Integer DATA_API_INVALID_CODE = 100040;
    // 数据查询异常码
    public static final Integer DATA_LOAD_INVALID_CODE = 100040;
    /**
     * UTF-8 字符集
     */
    public static final String UTF8 = "UTF-8";

    /**
     * GBK 字符集
     */
    public static final String GBK = "GBK";
}
