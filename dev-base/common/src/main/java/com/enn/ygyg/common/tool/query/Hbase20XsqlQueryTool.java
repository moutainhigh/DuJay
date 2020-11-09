package com.enn.ygyg.common.tool.query;

import com.enn.ygyg.common.tool.database.DataSourceInfo;
import com.enn.ygyg.common.utils.JdbcUtils;
import com.enn.ygyg.common.utils.LocalCacheUtils;
import com.google.common.collect.Lists;

import java.sql.*;
import java.util.ArrayList;
import java.util.List;

/**
 * for HBase2.X and Phoenix5.X
 */
public class Hbase20XsqlQueryTool extends BaseQueryTool implements QueryToolInterface {
    Connection conn = null;


    /**
     * 构造方法
     *
     * @param dataSourceInfo
     */
    public Hbase20XsqlQueryTool(DataSourceInfo dataSourceInfo) throws Exception {
        super(dataSourceInfo);

        if (LocalCacheUtils.get(dataSourceInfo.getDatasourceName()) == null) {
            getDataSource(dataSourceInfo);
        } else {
            conn = (Connection) LocalCacheUtils.get(dataSourceInfo.getDatasourceName());
            if (conn == null) {
                LocalCacheUtils.remove(dataSourceInfo.getDatasourceName());
            }
        }
        LocalCacheUtils.set(dataSourceInfo.getDatasourceName(), conn, 4 * 60 * 60 * 1000);

    }

    @Override
    public List <String> getTableNames(String tableSchema) {
        DatabaseMetaData metaData = null;
        List <String> tables = new ArrayList <String>();
        ResultSet rs = null;
        try {
            metaData = conn.getMetaData();
            rs = metaData.getTables(conn.getCatalog(), null, "%", new String[]{"TABLE"});
            while (rs.next()) {
                tables.add(rs.getString("TABLE_NAME"));
            }

        } catch (SQLException e) {
            logger.error("[getTableNames Exception] --> "
                    + "the exception message is:" + e.getMessage());
        } finally {
            JdbcUtils.close(rs);
        }


        return tables;
    }

    @Override
    public List <String> getColumnNames(String tableName, String datasource) {
        DatabaseMetaData metaData = null;
        List <String> columnNames = Lists.newArrayList();
        ResultSet rs = null;
        try {
            metaData = conn.getMetaData();
            rs = metaData.getColumns(conn.getCatalog(), null, tableName, "%");
            while (rs.next()) {
                columnNames.add(rs.getString("COLUMN_NAME"));
                // 获取字段的数据类型  rs.getString("TYPE_NAME")
            }

        } catch (SQLException e) {
            logger.error("[getColumnNames Exception] --> "
                    + "the exception message is:" + e.getMessage());
        } finally {
            JdbcUtils.close(rs);
        }


        return columnNames;
    }


    private static int getSize(ResultSet rs) {
        try {
            if (rs.getType() == ResultSet.TYPE_FORWARD_ONLY) {
                return -1;
            }

            rs.last();
            int total = rs.getRow();
            rs.beforeFirst();
            return total;
        } catch (SQLException sqle) {
            return -1;
        } catch (AbstractMethodError ame) {
            return -1;
        }
    }


    private void getDataSource(DataSourceInfo dataSourceInfo) throws SQLException {
        conn = DriverManager.getConnection(dataSourceInfo.getJdbcUrl());
    }


}
