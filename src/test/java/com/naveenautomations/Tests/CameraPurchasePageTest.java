package com.naveenautomations.Tests;

import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;

import com.naveenautomation.Reports.AllureReportListener;
import com.naveenautomation.pages.AccountLogin;
import com.naveenautomation.pages.CameraPurchasePage;
import com.naveenautomation.pages.MyAccountPage;
import com.naveenautomation.pages.YourStorePage;
import com.naveenautomations.base.TestBase;

import io.qameta.allure.Severity;
import io.qameta.allure.SeverityLevel;

@Listeners({ AllureReportListener.class })
public class CameraPurchasePageTest extends TestBase {

	YourStorePage yp;
	AccountLogin accountLogin;
	MyAccountPage myAccountPage;

	@BeforeMethod
	public void startBrowserSession() {
		initialization();
		yp = new YourStorePage();
		yp.ClickMyAccountBtn();
		accountLogin = yp.ClickLogInBtn();
		myAccountPage = accountLogin.login("oo7@gmail.com", "PasswordReloaded");

	}
// test
	@Test
	@Severity(SeverityLevel.BLOCKER)

	public void addedToCartTest() {

		CameraPurchasePage cameraPage = myAccountPage.clickOnCameraField();
		cameraPage.clickAddtoCart();
		Assert.assertEquals(cameraPage.returnaddedToCartMessage(), "Nikon D300", "Not added to cart");
	}

	@AfterMethod
	public void quitBrowserSession() {
		quitBrowser();
	}

}
