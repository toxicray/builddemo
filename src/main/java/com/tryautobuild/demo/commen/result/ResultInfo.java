package com.tryautobuild.demo.commen.result;

/**
 * Package:com.tryautobuild.demo.commen.result
 * *Author:ray
 * *version:...
 * *Created in 2020/5/31  21:58
 **/
public class ResultInfo<T> {

	private T data;

	private Meta meta;

	public ResultInfo() {

	}

	public ResultInfo(T data, Meta meta) {
		this.data = data;
		this.meta = meta;
	}

	public T getData() {
		return data;
	}

	public void setData(T data) {
		this.data = data;
	}

	public Meta getMeta() {
		return meta;
	}

	public void setMeta(Meta meta) {
		this.meta = meta;
	}
}
