package ObjectRepositories;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class OpportunitiesPage {
	
	//Declaration
	@FindBy(xpath="//img[@title='Create Opportunity...']") private WebElement opportunityLkp;
	
	//initialization
	public OpportunitiesPage(WebDriver driver) {
		PageFactory.initElements(driver, this);
	}

	
	//utilization
	public WebElement getOpportunityLkp() {
		return opportunityLkp;
	}
	
	public void setopportunityLkp() {
		opportunityLkp.click();
	}

	
	
	
}
