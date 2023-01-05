package A;

import java.time.Duration;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map.Entry;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import com.mysql.cj.jdbc.Driver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class CricekbuzzForRuns {

	public static void main(String[] args) throws Throwable {
		
		WebDriverManager.chromedriver().setup();
		
		WebDriver driver = new ChromeDriver();
		
		driver.get("https://www.cricbuzz.com/");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		
		//click on live scores
		driver.findElement(By.xpath("//a[text()='Live Scores']")).click();
		
		//click on southAfrica vs India
		driver.findElement(By.xpath("//a[text()='South Africa vs India,']")).click();
		
		//click on score card
		driver.findElement(By.xpath("//a[text()='Scorecard']")).click();
		
		//store all names
		List<WebElement> names = driver.findElements(By.xpath("//a[@class='cb-text-link']"));
		
		//List<WebElement> runs = driver.findElements(By.xpath("//div[@class='cb-col cb-col-8 text-right text-bold']"));
		//store the Run values
		List<WebElement> runs = driver.findElements(By.xpath("//span[text()='South Africa Innings']/ancestor::div[@class='cb-col cb-col-100 cb-ltst-wgt-hdr']/descendant::div[@class='cb-col cb-col-8 text-right text-bold']"));
		Thread.sleep(2000);
		
		
		HashMap<String, Integer> map = new HashMap<String, Integer>();
		for(int i=0;i<runs.size();i++)
		{
			String name = names.get(i).getText();
			String run = runs.get(i).getText();
			
			try {
			
			int r = Integer.parseInt(run);
			map.put(name, r);
			} catch (NumberFormatException e) {
				
			}
		}
		
		Collection value = map.values();
		
		ArrayList<Integer> list = new ArrayList<Integer>(value);
		Collections.sort(list);
		System.out.println(list);
		
		System.out.println(list.get(list.size()-1));
		int n = (int)list.get(list.size()-1);
		
		
		for(Entry<String, Integer> map1:map.entrySet())
		{
			if(map1.getValue()==n)
			{
				System.out.println(map1.getKey()+""+map1.getValue());
			}
		}
		
		driver.close();
	}


}
