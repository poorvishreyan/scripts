package com.Hello;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class DatePickerJquey {

	public static void main(String[] args) {
		
		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		
		driver.get("https://jqueryui.com/datepicker/#date%E2%88%92range");
		
		
		WebElement r = driver.findElement(By.xpath("//iframe[@class='demo-frame']"));
		driver.switchTo().frame(r);
		
		WebElement ele = driver.findElement(By.xpath("//input[@id='datepicker']"));
		ele.click();
		
		List<WebElement> date = driver.findElements(By.xpath("//table[@class='ui-datepicker-calendar']/tbody/tr/td"));
		for(int i=0;i<date.size();i++)
		{
			String s = date.get(i).getText();
			if(s.equals("14"))
			{
				date.get(i).click();
				break;
			}
		}
		
		String m = ele.getAttribute("value");
		System.out.println("Date selected in calendar is: "+m);
		
		driver.close();
	}

}
