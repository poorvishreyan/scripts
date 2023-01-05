package com.Hello;

import java.time.Duration;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Flipkart2Test {

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
		
		List<WebElement> allPhones = driver.findElements(By.xpath("//div[@class='_30jeq3 _1_WHN1']"));
		int count = allPhones.size();
		System.out.println(count);
		ArrayList<String> list = new ArrayList<String>();
		
		for(int i=0;i<allPhones.size();i++)
		{
			String text = allPhones.get(i).getText().replaceAll(",", "");
			 list.add(text);
				Collections.sort(list);
		}
		/*for(WebElement price:allPhones)
		{
			   String text = price.getText().replaceAll("[^1-9]","");*/
			   //list.add(text);
			//Collections.sort(list);
			
			for(String num:list)
			{
				try {
					   System.out.println(Integer.parseInt(num));
					
				} catch (Exception e) {
					// TODO: handle exception
				}
				//System.out.println(Integer.parseInt(num));
			}
			System.out.println();
			
		}
		
		

	}


