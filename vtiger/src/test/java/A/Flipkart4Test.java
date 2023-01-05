package A;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Flipkart4Test {
	
	@FindBy(id="searchDropdownBox") private WebElement dropdown;
	@FindBy(xpath="//div[text()='EN']") private WebElement language;
	
	
	public void FlipkartTest(WebDriver driver)
	{
		PageFactory.initElements(driver, this);
	}
	
	public void select(WebDriver driver, WebElement element)
	{
		select(driver, element);
	}
	
	public void selectForLanguage(WebDriver driver, WebElement element)
	{
		select(driver, element);
	}
	
	
	

}


