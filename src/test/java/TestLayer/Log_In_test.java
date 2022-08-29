package TestLayer;

import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import basePackage.BaseAmazonClass;
import pompackage.Login;

public class Log_In_test extends BaseAmazonClass {
	Login Log;
	public Log_In_test() {
		super();
	}
	@BeforeMethod
	public void initsetup() {
		initiation();
		Log=new Login();
		
	}
	@Test
	public void Title() {
		String Actual=Log.verify();
		Assert.assertEquals(Actual, "Amazon Sign In");
	}
	@Test
	public void Login() throws InterruptedException {
		Log.typeemail(prop.getProperty("lemail"));
		Thread.sleep(1000);
		Log.Cbtn();
		Thread.sleep(1000);
		Log.Lpassword(prop.getProperty("lpassword"));
		Thread.sleep(1000);
		Log.Lbtn();
		
	}
	@AfterMethod
	public void close() {
		driver.close();
	}

}
