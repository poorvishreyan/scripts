package com.vtiger.login;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;


	public class FlipkartMobilesBrandClickNext {

		@Test
		public void getAllProducts() throws InterruptedException {
			WebDriverManager.chromedriver().setup();
			WebDriver driver = new ChromeDriver();
			driver.manage().window().maximize();
			driver.get("https://flipkart.com");
			driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));

			driver.findElement(By.xpath("//input[@type='text' and @class='_2IX_2- VJZDxU']"))
					.sendKeys("pragathi20.kiran@gmail.com");
			driver.findElement(By.xpath("//input[@type='password' and @class='_2IX_2- _3mctLh VJZDxU']"))
					.sendKeys("bindura2");
			driver.findElement(By.xpath("//button[@type='submit' and @class='_2KpZ6l _2HKlqd _3AWRsL']")).click();
			Thread.sleep(1000);
			driver.findElement(By.xpath("//button[text()='✕']")).click();

			driver.findElement(By.xpath("//input[@name='q']")).sendKeys("mobiles");
			driver.findElement(By.xpath("//button[@class='L0Z3Pu']")).click();

			driver.findElement(By.xpath(
					"//div[text()='realme']/parent::label[@class='_2iDkf8 t0pPfW']/descendant::div[@class='_24_Dny']"))
					.click();
			// String text = driver.findElement(By.xpath("//span[contains(text(),'Showing 1
			// – 24 of 289']")).getText();

			Thread.sleep(3000);
			String strTotalMobiles = driver.findElement(By.xpath("//span[@class='_10Ermr']")).getText();

			System.out.println("strTotalMobiles is " + strTotalMobiles);
			String[] arr = strTotalMobiles.split(" ");
			String strNo = null;
			for (int i = 0; i < arr.length; i++) {
				System.out.println(arr[i]);
				strNo = arr[5];
			}
			int n = Integer.parseInt(strNo);
			System.out.println(n);

			List<WebElement> list;
			int links = 12;
			int sum = 0;
			int click = 0;

			while (links > 0) {
				System.out.println("links is " + links);
				list = driver.findElements(By.xpath("//div[@class='_4rR01T']"));
				System.out.println("list.size() is " + list.size());
				sum = sum + list.size();
				try {
					WebElement next = driver.findElement(By.xpath("//a[@class='_1LKTO3' and contains(.,'Next')]"));
					if (next.isDisplayed()) {
						click++;
						JavascriptExecutor jse = (JavascriptExecutor) driver;
						jse.executeScript("arguments[0].scrollIntoView()", next);

						next.click();
						Thread.sleep(3000);

					}

					links--;
				} catch (Exception e) {
					
					  System.out.println("end of products");
					  links--;
					 //break;

			}
			 }

			System.out.println("total clicks " + click);
			System.out.println(sum);
		}

	}


