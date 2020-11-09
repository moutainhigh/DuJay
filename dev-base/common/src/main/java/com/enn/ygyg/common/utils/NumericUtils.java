package com.enn.ygyg.common.utils;

import java.util.Date;

public class NumericUtils {
    /**
     * 在进制表示中的字符集合
     */
    final static char[] digits = {'0', '1', '2', '3', '4', '5', '6', '7', '8',
            '9', 'A', 'B', 'C', 'D', 'E', 'F', 'G', 'H', 'I', 'J', 'K', 'L',
            'M', 'N', 'O', 'P', 'Q', 'R', 'S', 'T', 'U', 'V', 'W', 'X', 'Y',
            'Z'};

    /**
     * 将十进制的数字转换为指定进制的字符串
     *
     * @param n    十进制的数字
     * @param base 指定的进制
     * @return
     */
    public static String toOtherBaseString(long n, int base) {
        long num = 0;
        if (n < 0) {
            num = ((long) 2 * 0x7fffffff) + n + 2;
        } else {
            num = n;
        }
        char[] buf = new char[32];
        int charPos = 32;
        while ((num / base) > 0) {
            buf[--charPos] = digits[(int) (num % base)];
            num /= base;
        }
        buf[--charPos] = digits[(int) (num % base)];
        String code = new String(buf, charPos, (32 - charPos));
        String str = "000";
        code = str.substring(0, 3 - code.length()) + code;
        return code;
    }

    public static void main(String[] args) {
        System.out.println(getCode("", 1L));
    }

    public static String getCode(String code, Long userId) {
        StringBuffer sb = new StringBuffer();
        String channelFlag = NumericUtils.toOtherBaseString(userId, 32);
        sb.append(PingYinUtils.getFirstSpell(code)).append(channelFlag);
        String year = DateUtil.formatDate(new Date(), DateUtil.YYYYMMDD);
        sb.append(year.substring(2, 3));
        sb.append(10 - Integer.valueOf(year.substring(3, 4)));
        sb.append(year.substring(6, 8)).append(year.substring(4, 6));
        int random = (int) ((Math.random() * 9 + 1) * 1000000);
        sb.append(random);
        return sb.toString();
    }


}
