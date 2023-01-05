package A;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class cedricPereriaTest{
	
	@Test
	public void cedricPereria()
	{
		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		
		driver.get("https://www.cedricpereira.com/");
		driver.manage().window().maximize();
	}

}
