package com.naveenautomations.Tests;

import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;

import com.naveenautomation.Reports.AllureReportListener;
import com.naveenautomation.pages.YourStorePage;
import com.naveenautomations.base.TestBase;

import io.qameta.allure.Severity;
import io.qameta.allure.SeverityLevel;

@Listeners({ AllureReportListener.class })
public class YourStorePageTest extends TestBase {

	YourStorePage yp;

	@BeforeMethod
	public void startBrowserSession() {
		initialization();
		yp = new YourStorePage();
	}

	@Test()
	@Severity(SeverityLevel.CRITICAL)
	public void testSomething() {
		yp.ClickMyAccountBtn();
	}

	@AfterMethod
	public void quitBrowserSession() {
		quitBrowser();
	}

}
