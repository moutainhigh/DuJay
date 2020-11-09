package com.enn.ygyg.common.tool.query;

import com.enn.ygyg.common.tool.database.DataSourceInfo;

/**
 * mysql数据库使用的查询工具
 *
 * @author zhouhongfa@gz-yibo.com
 * @ClassName MySQLQueryTool
 * @Version 1.0
 * @since 2019/7/18 9:31
 */
public class MySQLQueryTool extends BaseQueryTool implements QueryToolInterface {

    public MySQLQueryTool(DataSourceInfo dataSourceInfo) throws Exception {
        super(dataSourceInfo);
    }

}
