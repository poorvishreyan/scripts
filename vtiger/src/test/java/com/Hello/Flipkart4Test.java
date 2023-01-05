package com.Hello;

import java.time.Duration;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.HashMap;
import java.util.LinkedList;
import java.util.List;
import java.util.Map.Entry;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Flipkart4Test {

	public static void main(String[] args) {
		
		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		
		driver.get("https://www.flipkart.com");
		
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.findElement(By.xpath("//button[text()='✕']")).click();
		
		
		driver.findElement(By.name("q")).sendKeys("phones");

		//click on search
		driver.findElement(By.xpath("//button[@class='L0Z3Pu']")).click();
		
		//search for all the phone names
		List<WebElement> allPhoneNames = driver.findElements(By.xpath("//div[@class='_4rR01T']"));
		//search for all the phone prices
		List<WebElement> allPhonePrices = driver.findElements(By.xpath("//div[@class='_30jeq3 _1_WHN1']"));
		
		HashMap<String, Integer> map = new HashMap<String, Integer>();
		for(int i=0;i<allPhonePrices.size();i++)
		{
			String names = allPhoneNames.get(i).getText();
			String prices = allPhonePrices.get(i).getText();
			
			try {
				int p = Integer.parseInt(prices);
				map.put(names, p);
				
			} catch (Exception e) {
				
			}
			
		}
		
		Collection value = map.values();
		
		LinkedList<Integer> list = new LinkedList<Integer>(value);
		
		Collections.sort(list);
		System.out.println(list);

	}

}
