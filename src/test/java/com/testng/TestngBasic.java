package com.testng;

import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class TestngBasic {

	@BeforeSuite
	public void setUp() {
		System.out.println("setup sys property for chrome");
	}

	@BeforeTest
	public void lauchBrowser() {
		System.out.println("lauch browser");
	}

	@BeforeClass
	public void enterURL() {
		System.out.println("login to app");
	}

	@BeforeMethod
	public void login() {
		System.out.println("enter url");
	}

	@Test
	public void googletitletest() {
		System.out.println("google title test");
	}
	@Test
	public void searchTest() {
		System.out.println("search test");
	}
	@Test
	public void googleLogoTest() {
		System.out.println("logo test");
	}
	
	
	@AfterMethod
	public void logout() {
		System.out.println("logout");
	}
	
	@AfterClass
	public void deleteallcookies() {
		System.out.println("clear cookies");
	}
	
	@AfterTest
	public void closeBrowser() {
		System.out.println("close browser");
	}
	@AfterSuite
	public void generatetestReport() {
		System.out.println("generate report");
	}
	
	
	
	
	
}
