package com.enn.ygyg.common.utils;

import org.apache.commons.lang3.time.DateUtils;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.text.SimpleDateFormat;
import java.util.Date;

public class DateUtil extends DateUtils {

    private static final Logger logger = LoggerFactory.getLogger(DateUtil.class);

    /**
     * 8位年月日时间格式
     */
    public static final String YYYYMMDD = "yyyyMMdd";

    /**
     * 14位时间格式
     */
    public static final String YYYYMMDDHHMMSS = "yyyyMMddHHmmss";

    /**
     * 显示日期 年月日
     */
    public static final String DATE_PATTERN = "yyyy-MM-dd";

    /**
     * 显示具体到秒的时间
     */
    public static final String TIME_PATTERN = "yyyy-MM-dd HH:mm:ss";

    /**
     * 转换 date 成对应格式的string
     *
     * @param date
     * @param pattern
     *            格式
     * @return
     */
    public static String formatDate(Date date, String pattern) {
        if (date == null) {
            return null;
        } else {
            SimpleDateFormat sdf = new SimpleDateFormat(pattern);
            return sdf.format(date);
        }
    }
}
