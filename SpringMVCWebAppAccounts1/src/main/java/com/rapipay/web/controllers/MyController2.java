package com.rapipay.web.controllers;

import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.stereotype.Service;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;

import com.rapipay.web.beans.Account;

@Controller
@RequestMapping("/accounts")
public class MyController2 {
	
	@Autowired
	AccountService service;
	
	public MyController2() {
		System.out.println("====>> My Controller 2 Constructor called ");
	}
	
	@RequestMapping("/req2")
	public String doThings(Model bag)
	{
		Account account = new Account();
		bag.addAttribute("accountInBag", account);
		return "NewAccountInput";
	}
	
	
	@RequestMapping("/abc")
	public String abcHandler(@ModelAttribute ("accountInBag")Account account)
	{
		System.out.println(account);
		return "display-account-info";
	}

}
