package com.section3;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class Dataprovider 
{
	@Test(dataProvider="dataSupplier")
	public void ActitimeLogin(String username, String password )
	{
		System.setProperty("webdriver.chrome.driver" , "E:\\Selenium\\chromedriver_win32\\chromedriver.exe");

		WebDriver driver=new ChromeDriver();
		
		driver.manage().window().maximize();
	 	driver.get("https://demo.actitime.com/login.do");
	 	driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
	 	driver.findElement(By.id("username")).sendKeys(username);
	 	driver.findElement(By.name("pwd")).sendKeys(password);
	}
	@DataProvider
public Object[] [] dataSupplier()
{
	Object[][] objarr=new Object[3][2];
	
	objarr[0][0]="admin1";
	objarr[0][1]="manager1";
	objarr[1][0]="admin2";
	objarr[1][1]="manager2";
	objarr[2][0]="admin3";
	objarr[2][1]="manager3";
	
	return objarr;
}
	
}
