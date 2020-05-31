package com.tryautobuild.demo.controller;

import com.tryautobuild.demo.commen.exception.BadRequestException;
import com.tryautobuild.demo.commen.exception.ValidateException;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * Package:com.tryautobuild.demo
 * *Author:ray
 * *version:...
 * *Created in 2020/5/31  15:17
 **/
@RestController
public class BuildController {

	@RequestMapping("/build/{id}")
	public String getResult(@PathVariable("id") Integer id){
		if(id == 201){
			throw new BadRequestException();
		}else if(id == 202){
			throw new ValidateException("我也是头大");
		}
		return "项目构建成功";
	}
}
