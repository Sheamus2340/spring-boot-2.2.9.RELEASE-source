package com.sheamus.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * title：
 */
@RestController
public class MyController {

	@RequestMapping("/test")
	 public String test() {
		 return "源码环境构建成功！";
	 }

}
