package pompackage;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import basePackage.BaseAmazonClass;

public class Orders extends BaseAmazonClass{
	
	@FindBy(css="#ap_email")
	WebElement Email;
	@FindBy(css="#continue")
	WebElement Cbtn;
	@FindBy(css="#ap_password")
	WebElement Lpassword;
	@FindBy(css="#signInSubmit")
	WebElement Sbtn;
	@FindBy(linkText="Buy Again")
	WebElement Buy;
	@FindBy(linkText="Not Yet Shipped")
	WebElement Not_Skipped;
	@FindBy(linkText="Cancelled Orders")
	WebElement Cancelled;
	
	
	
	
	

	public Orders() {
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
	public void Buy_again() {
		Buy.click();
		
	}
	public void not_shipped() {
		Not_Skipped.click();
		
	}
	public void cancelled() {
		Cancelled.click();
		
	}

}
