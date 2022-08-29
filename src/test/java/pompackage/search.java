package pompackage;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import basePackage.BaseAmazonClass;

public class search extends BaseAmazonClass {
	
	@FindBy(css="#ap_email")
	WebElement Email;
	@FindBy(css="#continue")
	WebElement Cbtn;
	@FindBy(css="#ap_password")
	WebElement Lpassword;
	@FindBy(css="#signInSubmit")
	WebElement Sbtn;
	@FindBy(css="#twotabsearchtextbox")
	WebElement Search;
	@FindBy(css="#nav-search-submit-button")
	WebElement s_btn;
	@FindBy(xpath="//body[1]/div[1]/div[2]/div[1]/div[2]/div[1]/div[3]/span[1]/div[1]/div[1]/div[1]/div[4]/ul[1]/li[1]/span[1]/a[1]/span[1]")
	WebElement el1;
	@FindBy(xpath="//body[1]/div[1]/div[2]/div[1]/div[2]/div[1]/div[3]/span[1]/div[1]/div[1]/div[1]/div[6]/ul[1]/li[1]/span[1]/a[1]/div[1]/label[1]/i[1]")
	WebElement el2;
	@FindBy(linkText="2")
	WebElement next;
	
	
	

	public search() {
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
	public void sendsearch(String search) {
		Search.sendKeys(search);
	}
	public void S_btn() {
		s_btn.click();
	}
	public void El1() {
		el1.click();
	}
	public void El2() {
		el2.click();
	}
	public void Next() {
		next.click();
		
	}

}
