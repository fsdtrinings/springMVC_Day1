package com.rapipay.web.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class AccountWebController {

	public AccountWebController() {
		System.out.println("-->> Account Web Controller ");
	}

	@RequestMapping("/")
	public String  firstReq()
	{
		/*
		 <property name="prefix" value="/WEB-INF/view/" />
		<property name="suffix" value=".jsp" />
		 * */
		return "index"; // /WEB-INF/view/index.jsp
	}
}
