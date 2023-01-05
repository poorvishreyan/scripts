package com.vtiger.login;

import java.time.Duration;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Flipkart2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		
		driver.get("https://www.flipkart.com");
		
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		
		
		driver.findElement(By.xpath("//button[text()='✕']")).click();
		driver.findElement(By.xpath("//input[@class='_3704LK']")).sendKeys("laptop");
		driver.findElement(By.xpath("//button[@class='L0Z3Pu']")).click();
		
		
		List<WebElement> priceList = driver.findElements(By.xpath("//div[@class='_30jeq3 _1_WHN1']"));
		int count = priceList.size();
		System.out.println(count);
		ArrayList<String> list = new ArrayList<String>();
		for(int i=0;i<count;i++)
		{
			String text = priceList.get(i).getText();
			System.out.println(text);
			list.add(text);
			
		}

		Collections.sort(list);
		System.out.println(list);
	}

}
