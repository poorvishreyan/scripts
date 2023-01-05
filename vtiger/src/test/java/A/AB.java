package A;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.remote.DesiredCapabilities;

import io.github.bonigarcia.wdm.WebDriverManager;

public class AB {
	
	public static void main(String[] args) throws Throwable
	{
		
		
		WebDriverManager.chromedriver().setup();
		
		ChromeOptions options = new ChromeOptions();
		options.addArguments("--disable-notifications");
		WebDriver driver = new ChromeDriver(options);
		driver.manage().window().maximize();
		driver.get("https://www.irctc.co.in");
		
		driver.findElement(By.xpath("//button[text()='OK']")).click();
		
		//ChromeOptions options = new ChromeOptions();
		//options.addArguments("start-maximized");
		//options.addArguments("--disable-notifications--");
		
		//DesiredCapabilities capability = new DesiredCapabilities();
		//capability.setAcceptInsecureCerts(false);
		//ChromeOptions options = new ChromeOptions();
		//options.addArguments("--start-maximized");
		//options.merge(capability);
		//WebDriver driver = new ChromeDriver(capability);
		
		
		//enter from
		driver.findElement(By.xpath("//input[contains(@class,'ng-tns-c57-8 ui-inputtext ui-widget ui-state')]")).sendKeys("delhi");
		driver.findElement(By.xpath("//span[text()='NEW DELHI - NDLS']")).click();
		
		//enter to field
		driver.findElement(By.xpath("//input[contains(@class,'ng-tns-c57-9 ui-inputtext ui-widget ui-state-default ui-corner')]")).sendKeys("mumbai");
		Thread.sleep(2000);
		driver.findElement(By.xpath("//span[text()='MUMBAI CENTRAL - BCT']")).click();
		
		//click on calender
		driver.findElement(By.xpath("//input[contains(@class,'ng-tns-c58-10 ui-inputtext ui-widget ui-state-default ui')]")).click();
		
		//click on date 25
		driver.findElement(By.xpath("//span[@class='ui-datepicker-month ng-tns-c58-10 ng-star-inserted']//following::tr[@class='ng-tns-c58-10']//following::a[text()='25']")).click();
		
		//click on all class dropdown
		driver.findElement(By.xpath("//span[@class='ui-dropdown-trigger-icon ui-clickable ng-tns-c65-11 pi pi-chevron-down']")).click();
		
		//click on AC First class
		driver.findElement(By.xpath("//span[text()='AC First Class (1A) ']")).click();
		
		//click on ticket-type drop-down
		driver.findElement(By.xpath("//span[@class='ui-dropdown-trigger-icon ui-clickable ng-tns-c65-12 pi pi-chevron-down']")).click();
		
		//click on senior citizen
		driver.findElement(By.xpath("//span[text()='LOWER BERTH/SR.CITIZEN']")).click();
		
		//click on OK
		driver.findElement(By.xpath("//span[text()='OK']")).click();
		
		//click on train with available berth
		driver.findElement(By.xpath("//label[text()='Train with Available Berth ']")).click();
		
		//click on search
		driver.findElement(By.xpath("//button[text()='Search']")).click();
		
		Thread.sleep(2000);
		
		//click on next day
		driver.findElement(By.xpath("//button[text()=' Next Day ']")).click();
		
		//click on refresh
		for(int i=0;i<=2;i++)
		{
			try {
				driver.findElement(By.xpath("//strong[contains(text(),' MMCT TEJAS RAJ ')]//ancestor::div[@class='form-group no-pad col-xs-12 bull-back border-all']//child::strong[text()='AC 3 Tier (3A)']/../..")).click();
				break;
				
			} catch (Exception e) {
			System.out.println(e.getMessage());
			}
		}
		//driver.findElement(By.xpath("//strong[contains(text(),' MMCT TEJAS RAJ ')]//ancestor::div[@class='form-group no-pad col-xs-12 bull-back border-all']//child::strong[text()='AC 3 Tier (3A)']/../..")).click();
		
		driver.close();
		
		
	}
	

}
