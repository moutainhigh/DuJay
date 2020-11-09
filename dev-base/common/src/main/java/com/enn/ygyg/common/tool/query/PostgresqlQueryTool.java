package com.enn.ygyg.common.tool.query;

import com.enn.ygyg.common.tool.database.DataSourceInfo;

/**
 * TODO
 *
 * @author zhouhongfa@gz-yibo.com
 * @ClassName PostgresqlQueryTool
 * @Version 1.0
 * @since 2019/8/2 11:28
 */
public class PostgresqlQueryTool extends BaseQueryTool implements QueryToolInterface {
    public PostgresqlQueryTool(DataSourceInfo dataSourceInfo) throws Exception {
        super(dataSourceInfo);
    }

}
