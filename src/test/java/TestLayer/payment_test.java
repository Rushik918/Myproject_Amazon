package TestLayer;

import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import basePackage.BaseAmazonClass;
import pompackage.payment;

public class payment_test extends BaseAmazonClass {
	payment  pay;
	public payment_test() {
		super();
	}
	@BeforeMethod
	public void initsetup() {
		initiation();
		pay=new payment();
		
	}
	@Test(priority=1)
	
	public void Payment() throws InterruptedException {
		pay.typeemail(prop.getProperty("lemail"));
		Thread.sleep(1000);
		pay.Cbtn();
		Thread.sleep(1000);
		pay.Lpassword(prop.getProperty("lpassword"));
		Thread.sleep(1000);
		pay.Lbtn();
		Thread.sleep(1000);
		pay.link();
		Thread.sleep(1000);
		pay.clink();
		Thread.sleep(3000);
		driver.switchTo().frame(1);
		pay.Cname();
	}
	@AfterMethod
	public void close() {
		driver.close();
	}
	

}
