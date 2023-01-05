package ObjectRepositories;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class HomePage {
	
	//Declaration
	@FindBy(xpath="//a[text()='Calendar']") private WebElement calenderLink;
	@FindBy(xpath="//td[@class='tabUnSelected']/child::a[text()='Leads']") private WebElement leadsLink;
	@FindBy(xpath="//td[@class='tabUnSelected']/child::a[text()='Organizations']") private WebElement organizationsLink;
	@FindBy(xpath="//td[@class='tabUnSelected']/child::a[text()='Contacts']") private WebElement contactsLink;
	@FindBy(xpath="//td[@class='tabUnSelected']/child::a[text()='Opportunities']") private WebElement opportunitiesLink;
	@FindBy(xpath="//td[@class='tabUnSelected']/child::a[text()='Products']") private WebElement productsLink;
	@FindBy(xpath="//td[@class='tabUnSelected']/child::a[text()='Documents']") private WebElement documentsLink;
	@FindBy(xpath="//td[@class='tabUnSelected']/child::a[text()='Email']") private WebElement emailLink;
	@FindBy(xpath="//td[@class='tabUnSelected']/child::a[text()='Dashboard']") private WebElement dashboardLink;
	@FindBy(xpath="//a[text()='More']") private WebElement moreLink;
	
	
	//Initialization
	public HomePage(WebDriver driver) {
		PageFactory.initElements(driver, this);
	}

	//utilization
	public WebElement getCalenderLink() {
		return calenderLink;
	}


	public WebElement getLeadsLink() {
		return leadsLink;
	}


	public WebElement getOrganizationsLink() {
		return organizationsLink;
	}


	public WebElement getContactsLink() {
		return contactsLink;
	}


	public WebElement getOpportunitiesLink() {
		return opportunitiesLink;
	}


	public WebElement getProductsLink() {
		return productsLink;
	}


	public WebElement getDocumentsLink() {
		return documentsLink;
	}


	public WebElement getEmailLink() {
		return emailLink;
	}


	public WebElement getDashboardLink() {
		return dashboardLink;
	}


	public WebElement getMoreLink() {
		return moreLink;
	}
	
	public void setcalenderLink() {
		calenderLink.click();
	}
	public void setleadsLink() {
		leadsLink.click();
	}
	public void setorganizationsLink() {
		organizationsLink.click();
	}
	public void setcontactsLink() {
		contactsLink.click();
	}
	public void setopportunitiesLink() {
		opportunitiesLink.click();
	}
	public void setproductsLink() {
		productsLink.click();
	}
	public void setdocumentsLink() {
		documentsLink.click();
	}
	public void setemailLink() {
		emailLink.click();
	}
	public void setdashboardLink() {
		dashboardLink.click();
	}
	public void setmoreLink() {
		moreLink.click();
	}
	
	

}
