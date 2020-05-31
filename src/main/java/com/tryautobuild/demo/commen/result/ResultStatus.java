package com.tryautobuild.demo.commen.result;

import org.omg.CORBA.INTERNAL;

/**
 * Package:com.tryautobuild.demo.commen.result
 * *Author:ray
 * *version:...
 * *Created in 2020/5/31  21:59
 **/
public class ResultStatus {

//201
//CREATED
//创建成功
//204
//DELETED
//删除成功
//400
//BAD REQUEST
//请求的地址不存在或者包含不支持的参数
//401
//UNAUTHORIZED
//未授权
//403
//FORBIDDEN
//被禁止访问
//404
//NOT FOUND
//请求的资源不存在
//422
//Unprocesable entity
//[POST/PUT/PATCH] 当创建一个对象时，发生一个验证错误
//500
//INTERNAL SERVER ERROR
//内部错误

	public static final Integer OK = 200;
	public static final Integer BAD_REQUEST = 201;
	public static final Integer VALIDATE_ERROR = 202;
}
