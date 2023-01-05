package A;

import java.time.Duration;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import io.github.bonigarcia.wdm.WebDriverManager;

public class AutomatioTestingAlert {

	public static void main(String[] args) throws Throwable {
	
		
		ChromeOptions options = new ChromeOptions();
		options.addArguments("--disable-notifications");
		
		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver(options);
		
		//driver.get("https://www.makemytrip.com/");
		driver.get("https://demo.automationtesting.in/Alerts.html");
		
		driver.manage().window().maximize();
		//driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		
		//driver.findElement(By.xpath("//a[text()='Search']")).click();
		
		
		
		//driver.findElement(By.xpath("//button[text()='click the button to display a confirm box ']")).click();
		WebDriverWait wait = new WebDriverWait(driver,Duration.ofSeconds(10));
		WebElement ele = wait.until(ExpectedConditions.presenceOfElementLocated(By.xpath("//button[text()='click the button to display a confirm box ']")));
		
		
		JavascriptExecutor jse = (JavascriptExecutor) driver;
	      jse.executeScript("arguments[0].click();", ele);
		
	      Thread.sleep(3000);
		
		Alert alert = driver.switchTo().alert();
		alert.accept();
		
		driver.quit();
	}

}
