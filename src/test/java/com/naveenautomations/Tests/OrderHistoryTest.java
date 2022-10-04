package com.naveenautomations.Tests;

import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;

import com.naveenautomation.Reports.AllureReportListener;
import com.naveenautomation.pages.AccountLogin;
import com.naveenautomation.pages.ChangePasswordField;
import com.naveenautomation.pages.MyAccountPage;
import com.naveenautomation.pages.OrderHistoryPage;
import com.naveenautomation.pages.YourStorePage;
import com.naveenautomations.base.TestBase;

import io.qameta.allure.Severity;
import io.qameta.allure.SeverityLevel;
@Listeners({ AllureReportListener.class })
public class OrderHistoryTest extends TestBase {

	YourStorePage yp;
	AccountLogin accountLogin;
	MyAccountPage myAccountPage;
	ChangePasswordField passwordPage;

	@BeforeMethod
	public void startBrowserSession() {
		initialization();
		yp = new YourStorePage();
		yp.ClickMyAccountBtn();
		accountLogin = yp.ClickLogInBtn();
		myAccountPage = accountLogin.login("oo7@gmail.com", "PasswordReloaded");
	}

	@Test
	@Severity(SeverityLevel.MINOR)
	public void verifyOnOrderHistoryPage() {

		OrderHistoryPage historyPage = myAccountPage.clickorderHistoryButton();
		Assert.assertEquals(historyPage.OrderHistoryTitleText(), "OrderHistory", "Not on history web page");

	}
// quit method
	@AfterMethod
	public void quitBrowserSession() {
		quitBrowser();
	}

}
