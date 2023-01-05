package com.vtiger.GenericUtility;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;

import io.github.bonigarcia.wdm.WebDriverManager;

 

public class BaseClass {
	public static  WebDriver driver;
	
	@BeforeClass
	public void launchTheBrowser()
	{
		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		
		
		//enter url
		driver.get("https://www.icc-cricket.com/rankings/mens/team-rankings/test");
	}
	
	@AfterClass
	public void closeTheBrowser()
	{
		driver.close();
	}

}
