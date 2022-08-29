package pompackage;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import basePackage.BaseAmazonClass;

public class payment  extends BaseAmazonClass{

	@FindBy(css="#ap_email")
	WebElement Email;
	@FindBy(css="#continue")
	WebElement Cbtn;
	@FindBy(css="#ap_password")
	WebElement Lpassword;
	@FindBy(css="#signInSubmit")
	WebElement Sbtn;
	@FindBy(linkText="Add a payment method")
	WebElement plink;
	@FindBy(xpath="//body/div[@id='a-page']/div[4]/div[1]/div[2]/div[1]/div[1]/div[2]/div[3]/div[1]/div[2]/div[1]/div[1]/div[1]/div[1]/div[2]/div[1]/div[1]/span[1]/span[1]/span[1]/input[1]")
	WebElement clink;
	
	

	public payment() {
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
	public void link() {
		plink.click();
	}
	public void clink() {
		clink.click();
	}
	public void Cname() {
		driver.findElement(By.id("pp-lJjOZj-15")).sendKeys("12345");
	}


}
