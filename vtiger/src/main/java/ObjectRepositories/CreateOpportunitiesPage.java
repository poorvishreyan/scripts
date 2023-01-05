package ObjectRepositories;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class CreateOpportunitiesPage {

	@FindBy(xpath="//input[@name='potentialname']") private WebElement oppurtunityNameEdt;
	@FindBy(xpath="//input[@id='related_to_display']//following-sibling::img[@title='Select']") private WebElement relatedToLkp;
	@FindBy(xpath="//input[@id='search_txt']") private WebElement relatedToSearchEdt;
	@FindBy(xpath="//input[@name='search']")  private WebElement searchBtn;
	@FindBy(xpath="//a[@onclick='return vtlib_setvalue_from_popup(2, \"org\", \"related_to\")']")  private WebElement organizationLinkClick;
	@FindBy(xpath="//select[@name='leadsource']") private WebElement typeDropDown;
	@FindBy(xpath="//select[@name='leadsource']") private WebElement leadSource;
	
}
