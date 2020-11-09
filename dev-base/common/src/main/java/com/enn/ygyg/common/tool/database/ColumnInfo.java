package com.enn.ygyg.common.tool.database;

public class ColumnInfo {
    /**
     * 字段名称
     */
    private String name;
    /**
     * 注释
     */
    private String comment;
    /**
     * 字段类型
     */
    private String type;

    /**
     * 是否是主键列
     */
    private Boolean ifPrimaryKey;
    /**
     * 是否可为null   0 不可为空  1 可以为null
     */
    private int isnull;

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

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public Boolean getIfPrimaryKey() {
        return ifPrimaryKey;
    }

    public void setIfPrimaryKey(Boolean ifPrimaryKey) {
        this.ifPrimaryKey = ifPrimaryKey;
    }

    public int getIsnull() {
        return isnull;
    }

    public void setIsnull(int isnull) {
        this.isnull = isnull;
    }
}