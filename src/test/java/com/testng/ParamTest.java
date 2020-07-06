package com.testng;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

import com.beust.jcommander.Parameter;

public class ParamTest {
	WebDriver driver;
	@Test
	@Parameters({"url","username"})
	public void yahoologin(String url, String username){

		System.setProperty("Webdriver.gecko.driver", "D:\\Executables\\geckodriver.exe");
		driver=new FirefoxDriver();
		driver.manage().window().maximize();
		driver.manage().deleteAllCookies();
		driver.manage().timeouts().pageLoadTimeout(20, TimeUnit.SECONDS);
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		driver.get(url);
		driver.findElement(By.xpath("//input[@id='login-username']")).sendKeys(username);
		driver.findElement(By.xpath("//*[@id=\"login-signin\"]")).click();
		driver.findElement(By.xpath("//input[@id='login-passwd']")).sendKeys("12345");
		
		
	}
	
	
}
