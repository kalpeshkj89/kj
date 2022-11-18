package Test;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import pages.HomePage;
import pages.LoginPage;

public class TestDemo {
	
	

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver","D:\\kalpesh\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		
		driver.get("https://www.saucedemo.com/");
		driver.manage().window().maximize();
		
		driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
		
		LoginPage l=new LoginPage(driver);
		l.setLoginPageun();
		l.setLoginPagepwd();
		l.ClicLoginPageLgnBtn();
		
		HomePage h=new HomePage(driver);
		h.verifyHomePageLog();
		
	}
}


