package amazonTests.com.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;

/**
 * Sample page
 */
public class HomePage extends Page {

  @FindBy(how = How.TAG_NAME, using = "h1")
  @CacheLookup
  public WebElement header;
  
  	By accounts=By.xpath("\"//a[@id='nav-link-accountList']//span[@class='nav-line-2']\"");
	By search=By.xpath("//input[@id='twotabsearchtextbox']");
	By searchButton=By.xpath("//div[@class='nav-search-submit nav-sprite']//input[@type='submit']");
	
	By dynamicSearch =By.xpath("//ul[@id='s-results-list-atf']//li[2]");//search for dynamic second result
	
	By currentPage =By.xpath("//span[@class='pagnCur']");//search for dynamic second result
	
	By clickNextPage =By.xpath("//a[@href='/s/ref=sr_pg_2?rh=i%3Aaps%2Ck%3Asamsung&page=2&keywords=samsung&ie=UTF8&qid=1525701544'][contains(text(),'2')]");
	//clicking second page href tag..
	
	By addToList =By.xpath("//span[@class='pagnCur']");//addToList Button
	
	By thirdProduct=By.xpath("//ul[@id='s-results-list-atf']//li[3]//a");
	
	By wishList=By.xpath("//a[@id='itemName_I2UIMWN3JZAW6F']");//should be change , should give relative path because it is dynamic
	
	By deleteButton=By.xpath("//span[@id='a-autoid-5']//span[@class='a-button-inner']//input[@name='submit.deleteItem']");
	
	
  public HomePage(WebDriver webDriver) {
    super(webDriver);
  }
  public WebElement wishList()
  {
	  
	  return driver.findElement(wishList);
  }
 
  public WebElement loginProcess()
	{
		
		return driver.findElement(accounts);
	}

	
	public WebElement search()
	{
		
		return driver.findElement(search);
		
	}
	public WebElement searchButton()
	{
		
		return driver.findElement(searchButton);
		
	}
	
	public WebElement dynamicSearch()
	
	{
		
		return driver.findElement(dynamicSearch);
	}
	
	public WebElement clickNextPage()
	{
		
		return driver.findElement(clickNextPage);
	}
	public WebElement thirdProduct()
	
	{
		
		return driver.findElement(thirdProduct);
	}
	  public WebElement deleteButton()
	  {
		  
		  return driver.findElement(deleteButton);
	  }
}
