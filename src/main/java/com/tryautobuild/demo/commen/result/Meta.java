package com.tryautobuild.demo.commen.result;

/**
 * Package:com.tryautobuild.demo.commen.result
 * *Author:ray
 * *version:...
 * *Created in 2020/5/31  22:05
 **/
public class Meta {

	private Integer status;
	private String msg;

	public Meta() {
	}

	public Meta(Integer status, String msg) {
		this.status = status;
		this.msg = msg;
	}

	public Integer getStatus() {
		return status;
	}

	public void setStatus(Integer status) {
		this.status = status;
	}

	public String getMsg() {
		return msg;
	}

	public void setMsg(String msg) {
		this.msg = msg;
	}
}
