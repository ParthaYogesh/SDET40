package Selenium.elementRepository;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LoginLocator 
{
	public LoginLocator(WebDriver driver)
	{
		PageFactory.initElements(driver, this);
	}
	@FindBy(id="username")
private WebElement usernameTB;
	
	@FindBy(name="pwd")
private WebElement passwordTB;
	
	@FindBy(id="loginButton")
private WebElement loginButton;

public WebElement getUserName()
{
	return usernameTB;
}

public WebElement getPassword()
{
	return passwordTB;
}

public WebElement getLoginButton()
{
	return loginButton;
}

public void LoginApp()
{
	getUserName().sendKeys("admin");
	getPassword().sendKeys("manager");
	getLoginButton().click();
}
}
