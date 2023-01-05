package com.Hello;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class amazon1Test {

	public static void main(String[] args) throws Throwable {
		
		
		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		
		
		driver.get("https://www.amazon.in/");
		driver.manage().window().maximize();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		
		driver.findElement(By.xpath("//input[@id='twotabsearchtextbox']")).sendKeys("iphones");
		
		driver.findElement(By.xpath("//input[@id='nav-search-submit-button']")).click();
		Thread.sleep(2000);
		
		driver.findElement(By.xpath("//div[@class='a-row a-spacing-micro']/ancestor::div[@class='a-section a-spacing-none puis-padding-right-small s-title-instructions-style']/descendant::span[text()='Apple iPhone 12 (64GB) - Blue']")).click();
		
		
		driver.close();
		
		
		

	}

}
