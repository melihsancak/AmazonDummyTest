package amazonTests.com;

import java.io.IOException;

import org.testng.annotations.Test;

import resources.Base;

public class HomePage extends Base {
	
	
	//1 st test
		@Test
		public void basePageNavigation() throws IOException
		{
			driver=initilizeDriver();
			
			driver.get("https://www.amazon.com");
			String tittle=driver.getTitle();
			System.out.println(tittle);
			if(tittle.equalsIgnoreCase("https://www.amazon.com"))
			{
				System.out.println("Site entered");
			}
		}
		//2
		
		//2 nd test
		//@Test
//		public void login() throws IOException
//		{
//			driver=initilizeDriver();
//			driver.get("https://www.amazon.com");
//			LandingPage l=new LandingPage(driver);
//			l.loginProcess().click();
//			LoginPage lp=new LoginPage(driver);
//			lp.getLogin().click();
//		}
		//3 rd Test
		@Test
		public void Search()
		{
			
			
			
		}
		//4 rd Test
		public void isResult()
		{
			
			
		}
		
		
		public void isPage()
		{
			
			
		}
		
		public void AddToList()
		{
			
			
		}
		
		public void WishList()
		{
			
			
		}
		
		
		public void isProductAvalailable()
		{
			
			
		}
		
		
		public void delete()
		
		{
			
			
		}
		
		public void isDeleted()
		{
			
			
		}
		
	/*	@DataProvider
		public void getData()
		{
			//row stands for how many  different data types test should run
			//column stands for  how many values per each tests
			Object[][] data=new Object[][];
		}*/
		

}
