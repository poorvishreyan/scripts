package A;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Action;
import org.openqa.selenium.interactions.Actions;

import io.github.bonigarcia.wdm.WebDriverManager;

public class FlipkartTest {

	public static void main(String[] args) {
		
		WebDriverManager.chromedriver().setup();
		
		WebDriver driver = new ChromeDriver();
		
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		
		driver.get("https://www.flipkart.com/");
		
		driver.findElement(By.xpath("//button[text()='✕']")).click();
		
		//search the phone 
		driver.findElement(By.xpath("//input[@name='q']")).sendKeys("phones");
		
		//click on search button
		driver.findElement(By.xpath("//button[@type='submit']")).click();
		
		/*Actions action = new Actions(driver);
		Action sendPageDown = action.sendKeys(Keys.PAGE_DOWN).build();
		sendPageDown.perform();*/
		
		 
		
		/*String xpathNoOfPhones="//*[@class='_1YokD2 _3Mn1Gg']/div";
		//List<WebElement> listTotal = driver.findElements(By.xpath("//div[@class='_1YokD2 _3Mn1Gg']"));
		List<WebElement> listTotal = driver.findElements(By.xpath(xpathNoOfPhones));
		System.out.println(listTotal.size());
		
		for(WebElement textList:listTotal)
		{
			System.out.println(textList.getText());
		}*/
		
		List<WebElement> phoneText = driver.findElements(By.xpath("//div[@class='_4rR01T']"));
		
		for(WebElement text:phoneText)
		{
			System.out.println();
		}
		
		
		 
		

	}

}
