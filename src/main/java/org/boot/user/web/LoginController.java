package org.boot.user.web;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
/**
 * @Author:jinjunzhu
 * @Date:2018年5月17日
 */
@Controller
public class LoginController {

	private final static Logger logger = LoggerFactory.getLogger(LoginController.class);

	@GetMapping("/")
	public String login(){
		logger.info("登录成功,跳转主页面");
		return "index";
	}

}
