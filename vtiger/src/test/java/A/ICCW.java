package A;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Reporter;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import com.vtiger.GenericUtility.BaseClass;

import io.github.bonigarcia.wdm.WebDriverManager;

public class ICCW extends BaseClass{
	
@DataProvider(name="getData")
	
	public Object[][] getdata()
	{
		Object[][] obj = new Object[10][1];
		obj[0][0]="Australia";
		obj[1][0]="India";
		obj[2][0]="South Africa";
		obj[3][0]="England";
		obj[4][0]="New Zealand";
		obj[5][0]="Pakistan";
		obj[6][0]="Sri Lanka";
		obj[7][0]="West Indies";
		obj[8][0]="Bangladesh";
		obj[9][0]="Zimbabwe";
	
		return obj;
	}
	
	@Test(dataProvider="getData")
	
	public void Icc(String teamName) 
	{
	
		
		
		//click on team rankings
		driver.findElement(By.xpath("//div[@class='main-navigation__header u-hide-desktop']/descendant::button[contains(text(),'Rankings')]")).click();
		
		//click on mens team ranking
		driver.findElement(By.xpath("//div[@class='main-navigation__header u-hide-desktop']/descendant::a[@href='/rankings/mens/team-rankings']")).click();
		
		//fetch all ratings
		WebElement teams = driver.findElement(By.xpath("//table[@class='table']/tbody/tr[contains(.,'"+teamName+"')]/td[5]"));
		
		String text = teams.getText();
		
		Reporter.log(text);
		
		//driver.close();
	}
}


