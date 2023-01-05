package com.Hello;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Pagination {

	public static void main(String[] args) throws Throwable {
		
		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		
		driver.get("https://demo.opencart.com/admin/index.php");
		driver.manage().window().maximize();
		
		//Login page
		//enter user name
		driver.findElement(By.id("input-username")).sendKeys("demo");
		//enter password
		driver.findElement(By.id("input-password")).sendKeys("demo");
		//click on login button
		driver.findElement(By.xpath("//button[@class='btn btn-primary']")).click();
		
		driver.findElement(By.xpath("//button[@class='btn-close']")).click();
		
		//click on sales
		driver.findElement(By.xpath("//a[text()=' Sales']")).click();
		
		
		//click on Orders under sales
		driver.findElement(By.xpath("//a[text()='Orders']")).click();
		
		//to find total number of pages in table(showing 1 of 
		String totalPages = driver.findElement(By.xpath("//div[@class='col-sm-6 text-end']")).getText();
		System.out.println(totalPages);
		
		//convert string into integer
		int pagesNumber = Integer.valueOf(totalPages.substring(totalPages.indexOf("(")+1,totalPages.indexOf("Pages")-1));
		System.out.println(pagesNumber);
		
		//to click on the active page
		for(int p=1;p<=5;p++)
		{
			WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(20));
			WebElement activePage = driver.findElement(By.xpath("//ul[@class='pagination']//li//span"));
			
			System.out.println("activePage:"+activePage.getText());
			wait.until(ExpectedConditions.elementToBeClickable(activePage));
			activePage.click();
			
			//to get all the row values
			int rows = driver.findElements(By.xpath("//table[@class='table table-bordered table-hover']//tbody/tr")).size();
			System.out.println(rows);
			
			//read all the Rows from each page
			for(int r=1;r<rows;r++)
			{
				String orderId = driver.findElement(By.xpath("//table[@class='table table-bordered table-hover']//tbody/tr["+r+"]/td[2]")).getText();
				String customerName = driver.findElement(By.xpath("//table[@class='table table-bordered table-hover']//tbody/tr[1]/td[3]")).getText();
				String status = driver.findElement(By.xpath("//table[@class='table table-bordered table-hover']//tbody/tr[1]/td[4]")).getText();
			
				
				System.out.println(orderId+" "+customerName+"  "+status);
			}
			
			//go to the next page
			String pageNo = Integer.toString(p+1);     //converting int p=1 value to string
			driver.findElement(By.xpath("//ul[@class='pagination']//li//a[text()='"+pageNo+"']")).click();
			
		}

	}

	
}
