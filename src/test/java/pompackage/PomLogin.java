package pompackage;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import basePackage.BaseHRMClass;

public class PomLogin extends BaseHRMClass {

	@FindBy(id="txtUsername")  //driver.findElement(By.
	WebElement Username;
	@FindBy(id="txtPassword") WebElement Password;
	@FindBy(id="btnLogin") WebElement Loginbtn;
	
	//initiate page elements
	public PomLogin() {
		
		PageFactory.initElements(driver, this);
	}
	
	public void typeusername(String username) {
		Username.sendKeys(username);
	}
	public void typepassword(String pass) {
		Password.sendKeys(pass);
	}
	public void clickbtn() {
		Loginbtn.click();
	}
	public String verify() {
		return driver.getTitle();
		
	}
}
