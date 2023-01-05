package A;

import java.time.Duration;
import java.util.ArrayList;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.Test;

import com.beust.jcommander.internal.Lists;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Pagehandling {
	
	@Test
	public void handling() throws Throwable {
		
		
		WebDriverManager.chromedriver().setup();
		
		WebDriver driver = new ChromeDriver();
		driver.get("https://datatables.net/examples/advanced_init/dt_events.html");
		
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		
		List<WebElement> names = driver.findElements(By.xpath("//body[@class='wide comments example']//tbody//tr//td[1]"));
		
		ArrayList<String> list = new ArrayList<String>();
		for( WebElement names1:names)
		{
			list.add(names1.getText());
		}
		
		String nextButtonClass = driver.findElement(By.id("example_next")).getAttribute("class");
		
		while(!nextButtonClass.contains("disabled"))
		{
			driver.findElement(By.id("example_next")).click();
			names = driver.findElements(By.xpath("//body[@class='wide comments example']//tbody//tr//td[1]"));
			
			for( WebElement names1:names)
			{
				list.add(names1.getText());
			}
			
			nextButtonClass = driver.findElement(By.id("example_next")).getAttribute("class");
		}
		for(String alist:list)
		{
			System.out.println(alist);
		}
			
			 int totalNames = list.size();
			 System.out.println("The total number of names:  " +totalNames);
			 
			String displayedCount = driver.findElement(By.id("example_info")).getText().split(" ")[5];
			System.out.println("The displayed count " +displayedCount);
			
			Assert.assertEquals(displayedCount, String.valueOf(totalNames));
			
			Thread.sleep(2000);
			
			driver.close();
			 
			
		}
	
}

