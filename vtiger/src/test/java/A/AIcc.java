package A;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.testng.Assert;
import org.testng.Reporter;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;



import io.github.bonigarcia.wdm.WebDriverManager;

public class AIcc {

	
		@DataProvider
		public Object[][] data()
		{
			Object[][] objArr = new Object[10][1];
			
			objArr[0][0]="Australia";
			objArr[1][0]="India";
			objArr[2][0]="South Africa";
			objArr[3][0]="England";
			objArr[4][0]="New Zealand";
			objArr[5][0]="Pakistan";
			objArr[6][0]="Sri Lanka";
			objArr[7][0]="West Indies";
			objArr[8][0]="Bangladesh";
			objArr[9][0]="Zimbabwe";
			
			return objArr;
			
		}
		@Test(dataProvider = "data")
		
		public void ICCTest(String teamName) {
			
			WebDriverManager.chromedriver().setup();
			WebDriver driver = new ChromeDriver();
			driver.manage().window().maximize();
			//passing url
			driver.get("https://www.icc-cricket.com/homepage");
			
			//wait statement
			driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
			
			//mouse hivering
			WebElement rankings = driver.findElement(By.xpath("//div[@class='main-navigation__header u-hide-desktop']/descendant::button[@class='linked-list__dropdown-label js-dropdown-btn' and normalize-space()='Rankings']"));
			
			Actions action = new Actions(driver);
			action.moveToElement(rankings).perform();
			//clicking on team rankings
			driver.findElement(By.xpath("//div[@class='main-navigation__header u-hide-desktop']/descendant::a[@href='/rankings/mens/team-rankings']")).click();
			
			//verification
			String teamRankingTitle = "ICC Men's Test Team Rankings | ICC";
			
			if(driver.getTitle().contains(teamRankingTitle))
			{
				Assert.assertTrue(true);
				Reporter.log("Team ranking page is displayed, PASS", true);
			}else
			{
				Reporter.log("Team ranking page is not displayed, FAIL", true);
				Assert.assertTrue(false);
			}
			
			//dynamic xpath for team to find rating
			WebElement teamXpath = driver.findElement(By.xpath("//table[@class='table']/tbody/tr[contains(.,'"+teamName+"')]/td[5]"));
			
			//printing all the Rating of team
			String rating = teamXpath.getText();
			
			Reporter.log("Team "+teamName+" rating is "+rating, true);
			
			//close the browser
			driver.quit();
			
			
	}

}
