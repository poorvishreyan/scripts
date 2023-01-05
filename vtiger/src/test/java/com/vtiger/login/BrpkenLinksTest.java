package com.vtiger.login;

import java.io.IOException;
import java.net.HttpURLConnection;
import java.net.MalformedURLException;
import java.net.URL;
import java.time.Duration;
import java.util.Iterator;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class BrpkenLinksTest {

	

	public static void main(String[] args) throws MalformedURLException {

		WebDriverManager.chromedriver().setup();
		WebDriver driver= new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		
		
		driver.get("https://www.javatpoint.com/java-programs");
		driver.manage().window().maximize();
		
		
		List<WebElement> links = driver.findElements(By.xpath("//a"));
		int count = links.size();
		for (WebElement ele : links) {
			
			
			String link = ele.getAttribute("href");
			System.out.println(link);
			
			URL url = new URL(link);
			
			
			
			try {
				HttpURLConnection conn = (HttpURLConnection)url.openConnection();
			
			 conn.connect();
			 if(conn.getResponseCode()==200)
			 {
				 System.out.println(link + "is valid");
			 }
			 else {
				System.out.println(link + "is not valid");
			 }
		}
		
		catch (IOException e) {
			e.printStackTrace();
		}

	}
	}
}


