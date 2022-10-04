package com.naveenautomations.Tests;

import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import com.naveenautomation.pages.RegisterAccountPage;
import com.naveenautomation.pages.YourStorePage;
import com.naveenautomations.base.TestBase;

public class RegisterAccountPageTest  extends TestBase{
	YourStorePage yourStorePage;
	RegisterAccountPage registerAccountPage;

	@BeforeMethod
	public void startBrowser() {
		initialization();
		yourStorePage = new YourStorePage();

	}

	@Test
	public void test() {
		System.out.println("testing register page");
	}
	
	
	
	@AfterMethod
	public void quittingBrowser() {
		quitBrowser();
	}

}
