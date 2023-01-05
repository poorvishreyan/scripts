package com.vtiger.login;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

  @Test
public class Amazon {
	
	public  void amazonTest()
	{
		
		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.amazon.com/");
		
		driver.manage().window().maximize();
		
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		
		List<WebElement> list = driver.findElements(By.xpath("//i[@class='hm-icon nav-sprite']"));
		System.out.println(list.size());
		
		for(WebElement a:list)
		{
			System.out.println(a.getText());
		}
		
	}

}
