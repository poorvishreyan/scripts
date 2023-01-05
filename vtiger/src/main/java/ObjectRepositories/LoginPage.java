package ObjectRepositories;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LoginPage {
	//Declaration
		@FindBy(xpath="//input[@name='user_name']") private WebElement userNameEdt;
		@FindBy(xpath="//input[@name='user_password']") private WebElement passwordEdt;
		@FindBy(xpath="//input[@id='submitButton']") private WebElement loginBtn;
	
	
	//Initialization
	public  LoginPage(WebDriver driver) {
		PageFactory.initElements(driver, this);
	}
		
		//utilization
	
	public WebElement getUserNameEdt() {
		return userNameEdt;
	}


	public WebElement getPasswordEdt() {
		return passwordEdt;
	}


	public WebElement getLoginBtn() {
		return loginBtn;
	}
	
	public void login(String un, String pwd) {
		userNameEdt.sendKeys(un);
		passwordEdt.sendKeys(pwd);
		loginBtn.click();
	}

}
