package com.naveenautomations.Tests;

import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;

import com.naveenautomation.Reports.AllureReportListener;
import com.naveenautomation.pages.AccountLogin;
import com.naveenautomation.pages.MyAccountPage;
import com.naveenautomation.pages.YourStorePage;
import com.naveenautomations.base.TestBase;

import io.qameta.allure.Severity;
import io.qameta.allure.SeverityLevel;

@Listeners({ AllureReportListener.class })
public class AccountLoginTest extends TestBase {

	YourStorePage yp;
	AccountLogin accountLogin;

	@BeforeMethod
	public void startBrowserSession() {
		initialization();
		yp = new YourStorePage();
		yp.ClickMyAccountBtn();
		accountLogin = yp.ClickLogInBtn();
	}

	@Test
	@Severity(SeverityLevel.CRITICAL)
	public void verifyLogin() {
		MyAccountPage myAccountage = accountLogin.login("oo7@gmail.com", "PasswordReloaded");
		Assert.assertEquals(myAccountage.getTextFromMyAccount(), "My Account", "Not logged in");
	}

	@AfterMethod
	public void quitBrowserSession() {
		quitBrowser();
	}

}
