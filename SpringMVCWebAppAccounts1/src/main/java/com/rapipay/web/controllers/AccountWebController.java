package com.rapipay.web.controllers;

import javax.servlet.http.HttpServletRequest;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

import com.rapipay.web.beans.Account;

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
	
	
	@RequestMapping(value = "/readAccount",method = RequestMethod.POST)
	public String doReq2(HttpServletRequest req)
	{
		
		String accountHolderName = req.getParameter("name");
		String accountNumber = req.getParameter("accId");
		String balance = req.getParameter("balance");
		
		Account a = new Account();
		a.setName(accountHolderName);
		a.setBalance(Integer.parseInt(balance));
		a.setId(Integer.parseInt(accountNumber));
		
		System.out.println(""+accountHolderName+" "+balance+" "+accountNumber);
		
		return "display-account-info";  // /WEB-INF/view/display-account-info.jsp
	
	}
	
	
	
}//end of controller

















