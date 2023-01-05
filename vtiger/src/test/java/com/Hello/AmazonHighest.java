package com.Hello;

import java.time.Duration;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class AmazonHighest {

	public static void main(String[] args) {
		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		
		driver.get("https://www.amazon.in/");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		
		//search phones in text box
		WebElement searchBox = driver.findElement(By.id("twotabsearchtextbox"));
		searchBox.sendKeys("phones");
		
		//click on search button
		driver.findElement(By.id("nav-search-submit-button")).click();
		
		//select the mobile phones
		List<WebElement> listOfPhones = driver.findElements(By.xpath("//span[@class='a-price-whole']"));
		Map<String, Integer> map = new HashMap<String, Integer>();
		for(int i=0;i<listOfPhones.size();i++)
		{
			String text = listOfPhones.get(i).getText().replaceAll(",", "");
			//System.out.println(text);
			try {
				int m = Integer.parseInt(text);
				map.put(text, m);
				System.out.println(m);
				
			} catch (Exception e) {
				
			}
		
		}
		
		ArrayList<Integer> list = new ArrayList<Integer>();
		Collections.sort(list);
		//System.out.println(list);
		
		for(Integer num:list)
		{
			System.out.println(num);
		}
		
		
		
		
		driver.close();
		
		
		

	}

}
