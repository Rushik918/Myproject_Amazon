package TestLayer;

import org.testng.Assert;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import basePackage.BaseAmazonClass;
import pompackage.LoginandSecurity;

public class Log_security_test  extends BaseAmazonClass{
	
	LoginandSecurity Lns;
	public Log_security_test() {
		super();
	}
	@BeforeMethod
	public void initsetup() {
		initiation();
		Lns=new LoginandSecurity();
		
	}
	@Test
	public void Title() {
		String Actual=Lns.verify();
		Assert.assertEquals(Actual, "Amazon Sign In");
	}
	@Test(priority=1)
	public void Loginandsecurity() throws InterruptedException {
		Lns.typeemail(prop.getProperty("lemail"));
		Thread.sleep(1000);
		Lns.Cbtn();
		Thread.sleep(1000);
		Lns.Lpassword(prop.getProperty("lpassword"));
		Thread.sleep(1000);
		Lns.Lbtn();
		Thread.sleep(10000);
		Lns.Nameedit();
		
		
	}

}
