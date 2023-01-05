package A;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import io.github.bonigarcia.wdm.WebDriverManager;

public class CedricPereria {

	public static void main(String[] args) throws Throwable {


		WebDriverManager.chromedriver().setup();
		
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.get("https://www.cedricpereira.com/");
		
		Thread.sleep(5000);
		
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
		WebElement ele = wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//span[text()='About']")));
		
		JavascriptExecutor jseExecutor = (JavascriptExecutor)driver;
		jseExecutor.executeScript("arguments[0].click()", ele);
		//click on About
		//driver.findElement(By.xpath("//span[text()='About']")).click();
		
		Thread.sleep(2000);
		
		//click on email
		  WebElement ele1 = driver.findElement(By.xpath("//span[text()='Email']"));
		  
		  Actions action = new Actions(driver);
		  action.moveToElement(ele1).perform();
		//ele1.click();
		
		  driver.findElement(By.xpath("//span[text()='Copy email to clipboard']")).click();
		  
		  
		  driver.close();
		
		

	}

}
