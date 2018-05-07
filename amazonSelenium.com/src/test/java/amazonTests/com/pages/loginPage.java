package amazonTests.com.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class loginPage extends Page{
	
	
	
	By email=By.xpath("//input[@id='ap_email']");
	By password=By.xpath("//input[@id='ap_password']");
	By signIn=By.xpath("//input[@id='signInSubmit']");

	public loginPage(WebDriver driver) {
		super(driver);
		// TODO Auto-generated constructor stub
	}
	
	
	public WebElement putEmail()
	{
		
		return driver.findElement(email);
	}

	
	public WebElement putPassword()
	{
		
		return driver.findElement(password);
		
		
	}
	public WebElement signIn()
	{
		
		return driver.findElement(signIn);
	}

}
