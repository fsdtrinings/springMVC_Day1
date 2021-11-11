package com.rapipay.web.controllers;

import static org.junit.jupiter.api.Assertions.assertArrayEquals;
import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertIterableEquals;
import static org.junit.jupiter.api.Assertions.assertSame;
import static org.junit.jupiter.api.Assertions.assertThrows;

import org.aspectj.lang.annotation.Before;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Disabled;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.TestInstance;
import org.junit.jupiter.api.TestInstance.Lifecycle;

import com.rapipay.web.beans.Account;


@TestInstance(Lifecycle.PER_CLASS)
public class AccountServiceTest {
	
	public static AccountService accountService;
	@BeforeAll
	public static void beforeAllTest()
	{
		accountService = new AccountService();
	}

	@Test
	//@Disabled
	@DisplayName("Test case to test doThings for normal input")
	public void testDoThings() {
		// create test data : manual
		int inputData = 2;
		
		// assume expected output : manual
		int expected = 4;
		
		// call method to be test and collect result
		int actual = accountService.doThings(inputData);
		
		// assert test on expected output and actual output
		assertEquals(expected, actual);
	}
	
	@Test
	@DisplayName("Test 2 ")
	public void doTest()
	{
		Account a1 = new Account(101, "Mike", 2000);
		// expected
		Account a2 = a1;
		// actual
		
		//assertEquals(a1, a2);  // equals hash code
		assertSame(a1, a2); // ==
	}
	
	
	@Test
	@DisplayName("Test 3 ")
	public void doTest3()
	{
		
		int expected[] = {1,2,3,4};
		int actual[] = {1,2,3,4};  // by calling service method
		
		assertArrayEquals(expected, actual);
	}
	
	@Test
	@DisplayName("Test 4 ")
	public void doTest4()
	{
		// step 1
		// 1.1 test data 
		// 1.2 business method
		
		// step 2
		// create expected data
		
		// step 3
		// call business operation
		
		// step 4
		//assertIterableEquals(expected, actual);
		// two list are same or not
	}
	
	@Test
	@DisplayName("Test case to test exception raised on invalid input above max")
	public void test5()
	{
		
		assertThrows(Exception.class, ()->{
				accountService.doThings2(30);
		});
	}
	
	@Test
	@DisplayName("Test case to test exception raised on invalid input below min")
	public void test6()
	{
		
		assertThrows(Exception.class, ()->{
				accountService.doThings2(5);
		});
	}
	
	
	
	
	

}//end test class



















