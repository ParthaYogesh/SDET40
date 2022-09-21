//To make Dependency b/w two TC's use dependsOnMethods
package com.section3;

import org.testng.annotations.Test;

public class DemoTestNG7 
{
	@Test(dependsOnMethods="signUp")
public void signIn()
{
	System.out.println("Sign In");
}

	@Test
	public void signUp()
	{
		System.out.println("Sign Up");
	}
}
