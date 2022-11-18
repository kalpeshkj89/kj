package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LoginPage {
	
	//declaration
	@FindBy (xpath="//input[@id='user-name']") private WebElement un;
	@FindBy (xpath="//input[@id='password']") private WebElement pwd;
	@FindBy (xpath="//input[@id='login-button']") private WebElement lgnbtn;
	
	//initialization
	public LoginPage(WebDriver driver)
	{
		PageFactory.initElements(driver,this);
	}
	
//usage
	public void setLoginPageun()
	{
		un.sendKeys("standard_user");
	}
	
	public void setLoginPagepwd()
	{
		pwd.sendKeys("secret_sauce");
	}
	
	public void ClicLoginPageLgnBtn()
	{
		lgnbtn.click();
	}
}



