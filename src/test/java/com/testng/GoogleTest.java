package com.testng;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class GoogleTest {
WebDriver driver;
@BeforeMethod
public void setup(){

	System.setProperty("Webdriver.gecko.driver", "D:\\Executables\\geckodriver.exe");
	driver=new FirefoxDriver();
	driver.manage().window().maximize();
	driver.manage().deleteAllCookies();
	driver.manage().timeouts().pageLoadTimeout(20, TimeUnit.SECONDS);
	driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
	driver.get("http://www.google.com");
}
@Test(priority=3,groups="title")
public void googletitleTest() {
	String title = driver.getTitle();
	System.out.println(title);
	Assert.assertEquals(title, "Google","title is not matched");
	}
@Test(priority=2,groups="logo")
public void googlelogoTest() {
boolean b = driver.findElement(By.id("hplogo1")).isDisplayed();
Assert.assertTrue(b);
}

@Test(priority=1,groups="link")
public void maillinkTest() {
boolean b1= driver.findElement(By.xpath("//a[@class='gb_g']")).isDisplayed();
}

@AfterMethod
public void teardown() {
driver.quit();
}





}
