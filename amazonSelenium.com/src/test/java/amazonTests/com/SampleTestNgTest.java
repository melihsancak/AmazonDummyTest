package amazonTests.com;

import org.openqa.selenium.support.PageFactory;

import org.testng.Assert;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import amazonTests.com.pages.HomePage;
import amazonTests.com.pages.Search;
import amazonTests.com.pages.loginPage;

public class SampleTestNgTest extends TestNgTestBase {

  private HomePage homepage;
  
  
  @DataProvider
  public Object[][]getData()
  {
	  Object[][] data=new Object[0][1];
	  data[0][0]="melihsancakbilkent@gmail.com";
	  data[0][1]="san16187135173";
	  
	  return  data;
	  
  }

  @BeforeMethod
  public void initPageObjects() {
    homepage = PageFactory.initElements(driver, HomePage.class);
  }

  @Test
  public void testHomePageHasAHeader() {
    driver.get(baseUrl);
    Assert.assertFalse("".equals(homepage.header.getText()));
  }
  
  
  @Test
  public void loginPage()
  {
	  driver.get(baseUrl);
	HomePage l=new HomePage(driver);
	l.loginProcess().click();
	loginPage lp=new loginPage(driver);
	lp.putEmail().sendKeys("melihsancakbilkent@gmail.com");  ////should be in properties..
	lp.putPassword().sendKeys("san161871351737");  
	lp.signIn();
	Assert.assertFalse("".equals(homepage.header.getText()));
  }
  
  
  @Test
  public void search() throws InterruptedException
  {
	  
	driver.get(baseUrl);
	HomePage l=new HomePage(driver);
	l.search().sendKeys("samsung"); //should be in properties
	l.searchButton();
	Thread.sleep(1000);
	String current=driver.getTitle();
	if(current.contains("samsung"))
	{
		Assert.assertEquals(true, true);
	}
	l.clickNextPage().click();//going next page
	String tittle=driver.getTitle();//currentpage
	if(tittle.contains("page=2"))//detecting page in url instead of locators
	{
		Assert.assertEquals(true, true);
	}
	else {
		
		Assert.assertEquals(false, false);
	}
	//put the is is in second page
	l.clickNextPage();// dynamically setting second product
	l.thirdProduct();//relative path is given , because it is dynamic.
	Search s=new Search(driver);//to click addToList
	
	s.addToList().click();
	s.list();
	s.wishList().click();
	String backtoMenu=s.getTitle();
	if(backtoMenu.contentEquals("https://www.amazon.com/"))
	{
		System.out.println("Come back to main menu");
		Assert.assertEquals(true, true);
	}
	
  }
  
  
}
