package com.tryautobuild.demo.commen;

import com.tryautobuild.demo.commen.exception.BadRequestException;
import com.tryautobuild.demo.commen.result.Meta;
import com.tryautobuild.demo.commen.result.ResultInfo;
import com.tryautobuild.demo.commen.result.ResultStatus;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.ResponseBody;


/**
 * Package:com.tryautobuild.demo.commen
 * *Author:ray
 * *version:...
 * *Created in 2020/5/31  21:56
 **/
@ControllerAdvice
public class BaseExceptionHandler {



	@ExceptionHandler(value = Exception.class)
	@ResponseBody
	public ResultInfo error(Exception e){
		ResultInfo resultInfo = new ResultInfo();
		Meta meta =  new Meta();
		if( e instanceof BadRequestException){
			meta.setMsg("请求异常");
			meta.setStatus(ResultStatus.BAD_REQUEST);
		}else if(e instanceof BadRequestException){
			meta.setMsg(e.getMessage());
			meta.setStatus(ResultStatus.VALIDATE_ERROR);
		}
		resultInfo.setMeta(meta);
		return resultInfo;
	}
}
