package pompackage;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import basePackage.BaseAmazonClass;

public class Login extends BaseAmazonClass {
	@FindBy(css="#ap_email")
	WebElement Email;
	@FindBy(css="#continue")
	WebElement Cbtn;
	@FindBy(css="#ap_password")
	WebElement Lpassword;
	@FindBy(css="#signInSubmit")
	WebElement Sbtn;
	
	
	
	
	public Login() {
		PageFactory.initElements(driver, this);
	}
	public void typeemail(String email) {
		Email.sendKeys(email);
	}
	public void Cbtn() {
		Cbtn.click();
	}
	public void Lpassword(String password) {
		Lpassword.sendKeys(password);
	}
	public void Lbtn() {
		Sbtn.click();
	}
	public String verify() {
		return driver.getTitle();
		
	}
	
}