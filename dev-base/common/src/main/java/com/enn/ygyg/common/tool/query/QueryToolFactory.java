package com.enn.ygyg.common.tool.query;

import com.enn.ygyg.common.constant.JdbcConstants;
import com.enn.ygyg.common.exception.DatabaseBaseException;
import com.enn.ygyg.common.tool.database.DataSourceInfo;

import java.sql.SQLException;

/**
 * 工具类，获取单例实体
 *
 * @author zhouhongfa@gz-yibo.com
 * @ClassName QueryToolFactory
 * @Version 1.0
 * @since 2019/7/18 9:36
 */
public class QueryToolFactory {

    public static BaseQueryTool getByDbType(DataSourceInfo dataSourceInfo) {
        //获取dbType
        String datasource = dataSourceInfo.getDatasource();
        try{
            if (JdbcConstants.MYSQL.equals(datasource)) {
                return getMySQLQueryToolInstance(dataSourceInfo);
            } else if (JdbcConstants.ORACLE.equals(datasource)) {
                return getOracleQueryToolInstance(dataSourceInfo);
            } else if (JdbcConstants.POSTGRESQL.equals(datasource)) {
                return getPostgresqlQueryToolInstance(dataSourceInfo);
            } else if (JdbcConstants.SQL_SERVER.equals(datasource)) {
                return getSqlserverQueryToolInstance(dataSourceInfo);
            } else if (JdbcConstants.HIVE.equals(datasource)) {
                return getHiveQueryToolInstance(dataSourceInfo);
            } else if (JdbcConstants.CLICKHOUSE.equals(datasource)) {
                return getClickHouseQueryToolInstance(dataSourceInfo);
            } else if (JdbcConstants.HBASE20XSQL.equals(datasource)) {
                return getHbase20XsqlQueryToolQueryToolInstance(dataSourceInfo);
            }
            throw new UnsupportedOperationException("找不到该类型: ".concat(datasource));
        }catch (Exception ex){
            throw new UnsupportedOperationException("未知异常",ex);
        }
    }

    private static BaseQueryTool getMySQLQueryToolInstance(DataSourceInfo dataSourceInfo) throws Exception {
        try {
            return new MySQLQueryTool(dataSourceInfo);
        } catch (Exception e) {
            throw DatabaseBaseException.asConnException(JdbcConstants.MYSQL, e,
                    dataSourceInfo.getJdbcUsername(), dataSourceInfo.getDatasourceName());
        }
    }

    private static BaseQueryTool getOracleQueryToolInstance(DataSourceInfo dataSourceInfo) throws Exception {
        try {
            return new OracleQueryTool(dataSourceInfo);
        } catch (SQLException e) {
            throw DatabaseBaseException.asConnException(JdbcConstants.ORACLE,
                    e, dataSourceInfo.getJdbcUsername(), dataSourceInfo.getDatasourceName());
        } catch (Exception e) {
            throw DatabaseBaseException.asConnException(JdbcConstants.ORACLE,
                    e, dataSourceInfo.getJdbcUsername(), dataSourceInfo.getDatasourceName());
        }
    }

    private static BaseQueryTool getPostgresqlQueryToolInstance(DataSourceInfo dataSourceInfo) throws Exception {
        try {
            return new PostgresqlQueryTool(dataSourceInfo);
        } catch (SQLException e) {
            throw DatabaseBaseException.asConnException(JdbcConstants.ORACLE,
                    e, dataSourceInfo.getJdbcUsername(), dataSourceInfo.getDatasourceName());
        }
    }

    private static SqlServerQueryTool getSqlserverQueryToolInstance(DataSourceInfo dataSourceInfo) throws Exception {
        try {
            return new SqlServerQueryTool(dataSourceInfo);
        } catch (SQLException e) {
            throw DatabaseBaseException.asConnException(JdbcConstants.SQL_SERVER,
                    e, dataSourceInfo.getJdbcUsername(), dataSourceInfo.getDatasourceName());
        }
    }

    private static BaseQueryTool getHiveQueryToolInstance(DataSourceInfo dataSourceInfo) throws Exception {
        try {
            return new HiveQueryTool(dataSourceInfo);
        } catch (SQLException e) {
            throw DatabaseBaseException.asConnException(JdbcConstants.HIVE,
                    e, dataSourceInfo.getJdbcUsername(), dataSourceInfo.getDatasourceName());
        }
    }

    private static BaseQueryTool getClickHouseQueryToolInstance(DataSourceInfo dataSourceInfo) throws Exception {
        try {
            return new ClickHouseQueryTool(dataSourceInfo);
        } catch (SQLException e) {
            throw DatabaseBaseException.asConnException(JdbcConstants.CLICKHOUSE,
                    e, dataSourceInfo.getJdbcUsername(), dataSourceInfo.getDatasourceName());
        }
    }

    private static Hbase20XsqlQueryTool getHbase20XsqlQueryToolQueryToolInstance(DataSourceInfo dataSourceInfo) throws Exception {
        try {
            return new Hbase20XsqlQueryTool(dataSourceInfo);
        } catch (SQLException e) {
            throw DatabaseBaseException.asConnException(JdbcConstants.HBASE20XSQL,
                    e, dataSourceInfo.getJdbcUsername(), dataSourceInfo.getDatasourceName());
        }
    }
}
