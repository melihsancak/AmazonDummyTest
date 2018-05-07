package resources;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Base {

	
	public WebDriver driver;
	
	public WebDriver initilizeDriver() throws IOException
	{
		
		Properties prop= new Properties();
		FileInputStream fis=new FileInputStream("C:\\Users\\Melih Sancak\\amazonSelenium.com\\src\\main\\java\\resources\\data.properties");
		prop.load(fis);
		String browserName =prop.getProperty("browser");
		System.out.println(browserName);
		
		if(browserName.equals("chrome"))
		{

			System.setProperty("webdriver.chrome.driver", "C:\\Users\\Melih Sancak\\Downloads\\chromedriver.exe");
			driver=new ChromeDriver();
			
			
		}
		else if(browserName.equals("firefox"))
		{
			System.setProperty("webdriver.gecko.driver", "C:\\Users\\Melih Sancak\\Downloads\\geckodriver.exe");
			driver=new FirefoxDriver();
			
		}
		
		driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
		
		return driver;
		
		
	}
		
		
		
	}

