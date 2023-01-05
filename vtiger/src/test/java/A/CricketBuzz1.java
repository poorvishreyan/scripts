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

import io.github.bonigarcia.wdm.WebDriverManager;

public class CricketBuzz1 {

	public static void main(String[] args) {
		
WebDriverManager.chromedriver().setup();
		
		WebDriver driver = new ChromeDriver();
		
		driver.get("https://www.cricbuzz.com/live-cricket-scorecard/50963/ind-vs-rsa-3rd-odi-south-africa-tour-of-india-2022");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		
		List<WebElement> names = driver.findElements(By.xpath("//span[text()='South Africa Innings']/following::div[text()='Bowler'][1]/ancestor::div[@class='cb-col cb-col-100 cb-ltst-wgt-hdr']/child::div"));
		
		List<WebElement> wickets = driver.findElements(By.xpath("//span[text()='South Africa Innings']/following::div[text()='Bowler'][1]/ancestor::div[@class='cb-col cb-col-100 cb-ltst-wgt-hdr']/child::div[@class='cb-col cb-col-100 cb-scrd-itms ']/child::div[@class='cb-col cb-col-8 text-right text-bold']"));

		HashMap<String, Integer> map = new HashMap<String, Integer>();
		
		for(int i=0;i<wickets.size();i++)
		{
			String name = names.get(i).getText();
			String wicket = wickets.get(i).getText().substring(1);
			
			int w = Integer.parseInt(wicket);
			
			map.put(name, w);
			
		}
		 Collection value = map.values();
		 
		 ArrayList<Integer> list = new ArrayList<Integer>(value);
		 Collections.sort(list);
		 System.out.println(list);
		 
		 System.out.println(list.get(list.size()-1));
		 int n = list.get(list.size()-1);
		 
		 for(Entry<String, Integer> map1:map.entrySet())
		 {
			 if(map1.getValue()==n)
			 {
				 System.out.println(map1.getKey()+" "+map1.getValue());
			 }
		 }
		
		driver.close();
	}
	


	
}
