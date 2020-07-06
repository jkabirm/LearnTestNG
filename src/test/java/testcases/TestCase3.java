package testcases;

import org.testng.Assert;
import org.testng.annotations.Test;

public class TestCase3 {

	@Test(priority=2,dependsOnMethods="douserReg")
	public void dologin() {
		System.out.println("hi");
	}
@Test(priority=1)
public void douserReg() {
	System.out.println("hello");
	Assert.fail("user regis not successfull");
}
@Test(priority=3)
public void thirdtest() {
	System.out.println("executing third test");
}
@Test(priority=4)
public void fourthtest() {
	System.out.println("executing 4 test");
}
}
