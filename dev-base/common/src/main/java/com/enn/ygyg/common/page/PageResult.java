package com.enn.ygyg.common.page;

import lombok.Data;

import java.util.List;

/**
 * 分页返回结果
 * @author hourz
 * @date Aug 19, 2018
 */
@Data
public class PageResult {
	/**
	 * 当前页码
	 */
	private int pageNum;
	/**
	 * 每页数量
	 */
	private int pageSize;
	/**
	 * 记录总数
	 */
	private long totalSize;
	/**
	 * 页码总数
	 */
	private int totalPages;
	/**
	 * 分页数据
	 */
	private List<?> content;
}
