package com.Hello;

import java.time.Duration;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.HashMap;
import java.util.LinkedList;
import java.util.List;
import java.util.TreeSet;
import java.util.Map.Entry;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class FlipkartTT {

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
		int count = allPhonePrices.size();
		
		
		
		ArrayList<Integer> priceInt = new ArrayList<Integer>();
		for(int i=0;i<count;i++)
		{
			priceInt.add(Integer.parseInt(allPhonePrices.get(i).getText().replaceAll(",", "").substring(1)));
		}
		
		TreeSet<Integer> set = new TreeSet<Integer>(priceInt);
		
		ArrayList<String> nameAndPrice = new ArrayList<String>();
		for(int i=0;i<count;i++)
		{
			nameAndPrice.add(allPhoneNames.get(i).getText()+" "+ Integer.parseInt(allPhonePrices.get(i).getText().replaceAll(",", "").substring(1)));
		}
		for(Integer price:set)
		{
			for(int i=0;i<nameAndPrice.size();i++)
			{
				if(nameAndPrice.get(i).contains(price+""))
				{
					System.out.println(nameAndPrice.get(i));
				}
			}
		}
		
		
		
	}

}
