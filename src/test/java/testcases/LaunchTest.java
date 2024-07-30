package testcases;



import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeSuite;


import base.AmazonClassTestPage;
import io.github.bonigarcia.wdm.WebDriverManager;


public class LaunchTest 
{

	public static WebDriver driver;
	AmazonClassTestPage tstpg;
	
	@BeforeSuite
	public void launchBrowser()
	{
		
		
	    WebDriverManager.chromedriver().setup();
	    ChromeOptions opt=new ChromeOptions();
		opt.addArguments("--incognito");
		driver=new ChromeDriver(opt);
		
	 //driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.manage().window().maximize();
		driver.get("https://www.amazon.in/");
		
	}
	
	@BeforeClass
	public void createObject()
	{
		tstpg = new AmazonClassTestPage(driver);
	}
	
	
	
	@AfterSuite
	public void closeBrowser()
	{
		driver.close();
	}
	
}
