package com.enn.ygyg.common.tool.database;

public class DasColumn {
    /**
     * 字段名称列
     */
    private String columnName;
    /**
     * 字段类型列
     */
    private String columnTypeName;
    /**
     * 列所属对象名称
     */
    private String columnClassName;
    /**
     * 注释列
     */
    private String columnComment;
    /**
     * 是否可为null   0 不可为空  1 可以为null
     */
    private int isNull;
    /**
     * 是否是主键列
     */
    private boolean isprimaryKey;

    public String getColumnName() {
        return columnName;
    }

    public void setColumnName(String columnName) {
        this.columnName = columnName;
    }

    public String getColumnTypeName() {
        return columnTypeName;
    }

    public void setColumnTypeName(String columnTypeName) {
        this.columnTypeName = columnTypeName;
    }

    public String getColumnClassName() {
        return columnClassName;
    }

    public void setColumnClassName(String columnClassName) {
        this.columnClassName = columnClassName;
    }

    public String getColumnComment() {
        return columnComment;
    }

    public void setColumnComment(String columnComment) {
        this.columnComment = columnComment;
    }

    public int getIsNull() {
        return isNull;
    }

    public void setIsNull(int isNull) {
        this.isNull = isNull;
    }

    public boolean isIsprimaryKey() {
        return isprimaryKey;
    }

    public void setIsprimaryKey(boolean isprimaryKey) {
        this.isprimaryKey = isprimaryKey;
    }
}
