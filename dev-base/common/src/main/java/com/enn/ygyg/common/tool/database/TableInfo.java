package com.enn.ygyg.common.tool.database;

import java.util.List;

/**
 *
 */
public class TableInfo {
    /**
     * 表名
     */
    private String name;
    /**
     * 注释
     */
    private String comment;
    /**
     * 所有列
     */
    private List<ColumnInfo> columns;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getComment() {
        return comment;
    }

    public void setComment(String comment) {
        this.comment = comment;
    }

    public List <ColumnInfo> getColumns() {
        return columns;
    }

    public void setColumns(List <ColumnInfo> columns) {
        this.columns = columns;
    }
}
