//If we don't want to execute particular TC then use "enabled=false"
package com.section3;

import org.testng.annotations.Test;

public class DemoTestNG5
{
	@Test(priority=1)
	public void  CreateCustomer()
	{
	System.out.println("Customer Created");
	}
	@Test(enabled=false)
	public void  modifyCustomer()
	{
		System.out.println("Customer Modified");
	}
	
}
