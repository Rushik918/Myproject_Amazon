package TestLayer;



import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import basePackage.BaseAmazonClass;
import pompackage.search;

public class search_test  extends BaseAmazonClass {
	search ser;
	public search_test() {
		super();
	}
	@BeforeMethod
	public void initsetup() {
		initiation();
		ser=new search();
		
	}
	@Test
	public void search() throws InterruptedException {
		ser.typeemail(prop.getProperty("lemail"));
		Thread.sleep(1000);
		ser.Cbtn();
		Thread.sleep(1000);
		ser.Lpassword(prop.getProperty("lpassword"));
		Thread.sleep(1000);
		ser.Lbtn();
		ser.sendsearch(prop.getProperty("search"));
		Thread.sleep(3000);
		ser.S_btn();
		Thread.sleep(3000);
		Actions action = new Actions(driver);
		action.moveToElement(driver.findElement(By.xpath("//body[1]/div[1]/div[2]/div[1]/div[2]/div[1]/div[3]/span[1]/div[1]/div[1]/div[1]/div[4]/ul[1]/li[1]/span[1]/a[1]/span[1]"))).build().perform();
		//sorting
		ser.El1();
		Thread.sleep(2000);
		JavascriptExecutor js = (JavascriptExecutor) driver;
		js.executeScript("window.scrollBy(0,250)", "");
		ser.El2();
		Thread.sleep(2000);
		//go to next page 
		ser.Next();
		Thread.sleep(3000);
		
		
	}
	@AfterMethod
	public void close() {
		driver.quit();
	}

}
