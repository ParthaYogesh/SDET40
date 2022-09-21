//If we want Customize the Order of Execution the Use "priority"
package com.section3;

import org.testng.annotations.Test;

public class DemoTestNG3 
{
	@Test(priority=1)
	public void  CreateCustomer()
	{
	System.out.println("Customer Created");
	}
	@Test(priority=2)
	public void  modifyCustomer()
	{
		System.out.println("Customer Modified");
	}
	@Test(priority=3)
	public void deleteCustomer()
	{
		System.out.println("Customer Deleted");
	}
}
