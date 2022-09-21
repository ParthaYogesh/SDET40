//"@Test" annotation always follows Alphabetical Order Execution
package com.section3;

import org.testng.annotations.Test;

public class DemoTestNG2 
{
	@Test
	public void  CreateCustomer()
	{
	System.out.println("Customer Created");
	}
	@Test
	public void  modifyCustomer()
	{
		System.out.println("Customer Modified");
	}
	@Test
	public void deleteCustomer()
	{
		System.out.println("Customer Deleted");
	}
}
