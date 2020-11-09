package com.enn.ygyg.common.http;

import lombok.Data;

/**
 * HTTP结果封装
 * @author hourz
 * @date Oct 29, 2018
 */
@Data
public class HttpResult {

	private int code = 200;
	private String msg;
	private Object data;
	
	public static HttpResult error() {
		return error(HttpStatus.SC_INTERNAL_SERVER_ERROR, "未知异常，请联系管理员");
	}
	
	public static HttpResult error(String msg) {
		return error(HttpStatus.SC_INTERNAL_SERVER_ERROR, msg);
	}
	
	public static HttpResult error(int code, String msg) {
		HttpResult r = new HttpResult();
		r.setCode(code);
		r.setMsg(msg);
		return r;
	}

	public static HttpResult ok(String msg) {
		HttpResult r = new HttpResult();
		r.setMsg(msg);
		return r;
	}
	
	public static HttpResult ok(Object data) {
		HttpResult r = new HttpResult();
		r.setData(data);
		return r;
	}
	public static HttpResult ok(Object data, String msg) {
		HttpResult r = new HttpResult();
		r.setData(data);
		r.setMsg(msg);
		return r;
	}
	
	public static HttpResult ok() {
		return new HttpResult();
	}
}
