package TestLayer;

import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import basePackage.BaseAmazonClass;
import pompackage.Orders;

public class Orders_test extends BaseAmazonClass {
	Orders Ord;
	public Orders_test() {
		super();
	}
	@BeforeMethod
	public void initsetup() {
		initiation();
		Ord=new Orders();
		
	}
	@Test(priority=1)
	public void buyagain() throws InterruptedException {
		Ord.typeemail(prop.getProperty("lemail"));
		Thread.sleep(1000);
		Ord.Cbtn();
		Thread.sleep(1000);
		Ord.Lpassword(prop.getProperty("lpassword"));
		Thread.sleep(1000);
		Ord.Lbtn();
		Ord.Buy_again();
		Thread.sleep(4000);
		Ord.not_shipped();
		Thread.sleep(4000);
		Ord.cancelled();
		
	}
	@AfterMethod
	public void close() {
		driver.close();
	}
	

}
