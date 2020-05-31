package com.tryautobuild.demo.controller;

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

	@RequestMapping("/build")
	public String getResult(){
		return "项目构建成功";
	}
}
