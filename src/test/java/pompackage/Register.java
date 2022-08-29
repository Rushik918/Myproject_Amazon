package pompackage ;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import basePackage.BaseAmazonClass;

public class Register extends BaseAmazonClass  {
	@FindBy(css="#ap_customer_name") // driver.findelement(BY.
	WebElement Name;
	@FindBy(css="#ap_email")
	WebElement Email;
	@FindBy(css="#ap_password")
	WebElement Password;
	@FindBy(css="#ap_password_check")
	WebElement Rpassword;
	@FindBy(css="#continue")
	WebElement Rbtn;
	
	//initiate page elements
	public Register() {
		PageFactory.initElements(driver, this);
	}
	public void typefname(String name) {
		Name.sendKeys(name);
	}
	public void typeemail(String email) {
		Email.sendKeys(email);
	}
	public void typepassword(String password) {
		Password.sendKeys(password);
	}
	public void typerpassword(String rpassword) {
		Rpassword.sendKeys(rpassword);
	}
	public void Rbtn() {
		Rbtn.click();
	}
	public String verify() {
		return driver.getTitle();
		
	}
}
