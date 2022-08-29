package TestLayer;

import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import basePackage.BaseAmazonClass;
import pompackage.Register;

public class RegisterTest extends BaseAmazonClass {
	Register reg;
	public RegisterTest() {
		super();
	}
	@BeforeMethod
	public void initsetup() {
		initiation();
		reg=new Register();
		
	}
	@Test(priority=1)
	public void Title() {
		String Actual=reg.verify();
		Assert.assertEquals(Actual, "Amazon Registration");
	}
	/*@DataProvider
	public Object[][] Details(){
		Object result[][]=Exelsheet.readdata("Sheet1");
		return result;
		
	}*/
	@Test(priority=2/*,dataProvider="Details"*/)
	public void reg() {
		reg.typefname(prop.getProperty("name"));
		reg.typeemail(prop.getProperty("email"));
		reg.typepassword(prop.getProperty("password"));
		reg.typerpassword(prop.getProperty("rpassword"));
		reg.Rbtn();
	
		
	}
	@AfterMethod
	public void close() {
		driver.close();
	}
	
	
	
	
	
		
}

