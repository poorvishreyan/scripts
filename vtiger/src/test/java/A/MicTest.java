package A;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.event.KeyEvent;
import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

import io.github.bonigarcia.wdm.WebDriverManager;

public class MicTest {
	
public static void main(String[] args) throws Throwable {
		
		
		
		ChromeOptions options = new ChromeOptions();
		options.addArguments("--disable-notifications");
		
		WebDriverManager.chromedriver().setup();
		
		WebDriver driver = new ChromeDriver(options);
		
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		
		driver.get("https://mictests.com/");
		
		driver.findElement(By.xpath("//button[@id='mic-launcher']")).click();
		
		Thread.sleep(10000);
		
		Robot r = new Robot();
		r.keyPress(KeyEvent.VK_ESCAPE);
		r.keyRelease(KeyEvent.VK_ESCAPE);
		
		System.out.println("handled");
		
		//click on Test Webcam
		driver.findElement(By.xpath("//a[text()='Test Webcam']")).click();
		
		
		driver.close();
		
		

}
}
