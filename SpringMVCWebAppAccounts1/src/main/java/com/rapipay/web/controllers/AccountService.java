package com.rapipay.web.controllers;

public class AccountService {
	
	public int doThings2(int data)throws Exception
	{
		if(data>10 && data<20)
		{
			return data+data;
		}
		else {
			throw new Exception("Data is not in the range");
		}
	}
	
	public int doThings(int data)
	{
		if(data>10 && data<20)
		{
			return data+data;
		}
		else return 0;
		
	}
	
	
	

}
