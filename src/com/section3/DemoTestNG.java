// "@Test" acts like main Method to Execute all the Methods we have to Pass the 
//"@Test" annotation for all Methods  OR
// Pass "@Test" Outside the Class Once
package com.section3;

import org.testng.annotations.Test;

public class DemoTestNG 
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
	
}
