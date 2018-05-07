package amazonTests.com.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;



public class Search extends Page{
	
	
	
	//input[@id='add-to-wishlist-button-submit']
	By addToList=By.xpath("\"//a[@id='nav-link-accountList']//span[@class='nav-line-2']\"");
	By list=By.xpath("//a[@id='nav-link-accountList']//span[@class='nav-line-2']");
	By wishList=By.xpath("//a[@href='/gp/registry/wishlist/newwl/ref=nav_wishlist_lists_3']//span[@class='nav-text']");

	By deleteButton=By.xpath("//span[@id='a-autoid-5']//span[@class='a-button-inner']//input[@name='submit.deleteItem']");
	
	public Search(WebDriver driver) {
		super(driver);
		// TODO Auto-generated constructor stub
	}
	
	public WebElement addToList()
	{
		
		return driver.findElement(addToList);
	}
	
	public WebElement list()
	{
		
		return driver.findElement(list);
	}
	public WebElement wishList()
	{
		
		return driver.findElement(wishList);
	}
	
	  public WebElement deleteButton()
	  {
		  
		  return driver.findElement(deleteButton);
	  }

}
