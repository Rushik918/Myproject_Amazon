package TestLayer;

import org.openqa.selenium.By;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import basePackage.BaseAmazonClass;
import pompackage.cart;


public class Cart_test extends BaseAmazonClass {
	cart car;
	public Cart_test() {
		super();
	}
	@BeforeMethod
	public void initsetup() {
		initiation();
		car=new cart();
		
	}
	@Test
	public void search() throws InterruptedException {
		car.typeemail(prop.getProperty("lemail"));
		Thread.sleep(1000);
		car.Cbtn();
		Thread.sleep(1000);
		car.Lpassword(prop.getProperty("lpassword"));
		Thread.sleep(1000);
		car.Lbtn();
		car.sendsearch(prop.getProperty("search"));
		Thread.sleep(3000);
		car.S_btn();
		Thread.sleep(3000);
		Actions action = new Actions(driver);
		action.moveToElement(driver.findElement(By.xpath("//body[1]/div[1]/div[2]/div[1]/div[2]/div[1]/div[3]/span[1]/div[1]/div[1]/div[1]/div[4]/ul[1]/li[1]/span[1]/a[1]/span[1]"))).build().perform();
		car.link1();
		Thread.sleep(3000);
		car.add_button();
		Thread.sleep(3000);
		car.go_cart();
		Thread.sleep(3000);
		car.Delete();
		Thread.sleep(3000);
	
		
	}
	@AfterMethod
	public void close() {
		driver.quit();
	}
}
