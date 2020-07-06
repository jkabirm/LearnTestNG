package regressoin;

import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

public class Testcase1 {
	
	@BeforeTest
	public void createdbconn() {
		System.out.println("create connec");
	}
	@AfterTest
	public void closedbconn() {
		System.out.println("closedb conn");
	}
	@BeforeMethod
	public void LauncingBrowser() {
		System.out.println("lauch browser");
	}
	
@Test(priority=2)
	public void dologin() {
		System.out.println("hi");
	}
@Test(priority=1)
public void douserReg() {
	System.out.println("hello");
}
@AfterMethod
public void closebrowser() {
	System.out.println("close");
}
}
