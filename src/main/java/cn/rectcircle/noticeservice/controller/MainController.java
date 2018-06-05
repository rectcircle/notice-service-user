package cn.rectcircle.noticeservice.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * Copyright (c) 2018, rectcircle. All rights reserved.
 *
 * @author rectcircle
 * @date 2018-06-06
 * @version 0.0.1
 */
@RestController
public class MainController {

	@RequestMapping
	public String hello() {
		return "Hello World";
	}
}