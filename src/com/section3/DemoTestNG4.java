//If we pass -ve / 0 then it will no make any Changes
package com.section3;

import org.testng.annotations.Test;

public class DemoTestNG4 
{
	@Test(priority=-1)
	public void  CreateCustomer()
	{
	System.out.println("Customer Created");
	}
	@Test(priority=0)
	public void  modifyCustomer()
	{
		System.out.println("Customer Modified");
	}
	@Test(priority=2)
	public void deleteCustomer()
	{
		System.out.println("Customer Deleted");
	}
}
