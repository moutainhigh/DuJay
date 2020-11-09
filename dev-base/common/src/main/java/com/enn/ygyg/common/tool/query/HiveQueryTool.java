package com.enn.ygyg.common.tool.query;

import com.enn.ygyg.common.tool.database.DataSourceInfo;

/**
 * hive
 *
 * @author wenkaijing
 * @version 2.0
 * @since 2020/01/05
 */
public class HiveQueryTool extends BaseQueryTool implements QueryToolInterface {
    public HiveQueryTool(DataSourceInfo dataSourceInfo) throws Exception {
        super(dataSourceInfo);
    }
}
