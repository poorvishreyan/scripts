package A;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import io.github.bonigarcia.wdm.WebDriverManager;

public class MakeMyTrip {

	public static void main(String[] args) throws Throwable {
		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		
		driver.get("https://www.makemytrip.com/");
		driver.manage().window().maximize();
		
		WebElement hindi = driver.findElement(By.xpath("//span[@class='langCardClose']"));
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
		wait.until(ExpectedConditions.elementToBeClickable(hindi));
		
		 driver.switchTo().frame("webklipper-publisher-widget-container-notification-frame");
			driver.findElement(By.xpath("//i[@class='wewidgeticon we_close']")).click();
			driver.switchTo().defaultContent();
		
		//click on from
		driver.findElement(By.id("fromCity")).click();

		driver.findElement(By.xpath("//p[text()='New Delhi, India']")).click();
		
		 driver.findElement(By.xpath("//span[@class='langCardClose']")).click();
		
		
		//click on To
		//driver.findElement(By.id("toCity")).click();
		
		
	 driver.findElement(By.xpath("//div[@class='makeFlex hrtlCenter']/ancestor::div[@class='hsw_autocomplePopup autoSuggestPlugin makeFlex column spaceBetween']/descendant::li[@id='react-autowhatever-1-section-0-item-0']")).click();
	
	 /*
		
		//driver.findElement(By.id("departure")).click();
		//enter date 18
	//	driver.findElement(By.xpath("//div[@class='DayPicker-Day'][contains(@aria-label,'Thu Nov 17 2022')]")).click();
	String flag="False";
	 while(flag=="False") {
	 if(driver.findElement(By.xpath("//div[@class='DayPicker-Day DayPicker-Day--selected' and @aria-label='Wed Oct 19 2022']")) != null)
	 {
		 driver.findElement(By.xpath("//div[@class='DayPicker-Day DayPicker-Day--selected' and @aria-label='Wed Oct 19 2022']")).click();
		 flag="True";
	 }*/
	 
	 	//WebElement departure = driver.findElement(By.xpath("//div[@class='DayPicker-Month']/descendant::div[@class='DayPicker-Body']/descendant::div[@class='DayPicker-Day DayPicker-Day--selected' and @aria-label='Wed Oct 19 2022']"));
	 	driver.findElement(By.xpath("//div[@aria-label='Wed Oct 19 2022']")).click();
	 	//departure.click();
		//click on return date dropdown
		driver.findElement(By.xpath("//span[text()='RETURN']")).click();
		
		//click on next month 17
		driver.findElement(By.xpath("//div[@class='DayPicker-Day'][contains(@aria-label,'Thu Nov 17 2022')]")).click();
		
		//click on search button
		driver.findElement(By.xpath("//a[text()='Search']")).click();
		
		
		
		
		Thread.sleep(2000);
		
		//poopular filters
		//p[text()='Popular Filters']/parent::div[@class='filtersOuter']/descendant::span[@class='filterName' and text()='IndiGo']
		//click on Indigo checkbox
		WebElement chkBox = driver.findElement(By.xpath("//p[text()='Popular Filters']/parent::div[@class='filtersOuter']/descendant::span[@class='filterName' and text()='IndiGo']"));
		chkBox.click();
	 
	 //click on book now
		driver.findElement(By.xpath("//button[text()='Book Now']")).click();
		
		//click on saver
		driver.findElement(By.xpath("//span[text()='IndiGo | 6E-5305, IndiGo | 6E-531']/ancestor::div[@class='makeFlex']/descendant::div[@id='farecard-0']/descendant::p[text()='Saver']")).click();
	 
		//click on continue
		driver.findElement(By.xpath("//button[text()='Continue']")).click();
	 
	 }

}

