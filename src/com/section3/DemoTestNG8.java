package com.section3;


import org.testng.annotations.*;

public class DemoTestNG8 
{
	@BeforeClass
public void launchBrowser()
{
	System.out.println("Browser Launched");
}
@BeforeMethod
public void login()
{
	System.out.println("Login app");
}
@Test
public void createCustomer()
{
	System.out.println("Customer Created");
}
@Test
public void modifyCustomer()
{
	System.out.println("Customer Modified");
}
@AfterMethod
public void logout()
{
	System.out.println("Logout app");
}
@AfterClass
public void closeBrowser()
{
	System.out.println("Browser closed");
}
}
