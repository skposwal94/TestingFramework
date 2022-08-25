package com.naveenautomations.Tests;

import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;

import com.naveenautomation.Reports.AllureReportListener;
import com.naveenautomation.pages.AccountLogin;
import com.naveenautomation.pages.CameraPurchasePage;
import com.naveenautomation.pages.CheckOutPage;
import com.naveenautomation.pages.MyAccountPage;
import com.naveenautomation.pages.YourStorePage;
import com.naveenautomations.base.TestBase;

import io.qameta.allure.Description;
import io.qameta.allure.Epic;
import io.qameta.allure.Feature;
import io.qameta.allure.Severity;
import io.qameta.allure.SeverityLevel;
import io.qameta.allure.Step;
import io.qameta.allure.Story;
@Listeners({ AllureReportListener.class })
public class CheckOutPageTest extends TestBase {

	YourStorePage yp;
	AccountLogin accountLogin;
	MyAccountPage myAccountPage;
	CameraPurchasePage cameraPage;

	@BeforeMethod
	public void startBrowserSession() {
		initialization();
		yp = new YourStorePage();
		yp.ClickMyAccountBtn();
		accountLogin = yp.ClickLogInBtn();
		myAccountPage = accountLogin.login("oo7@gmail.com", "PasswordReloaded");
		cameraPage = myAccountPage.clickOnCameraField();
	}

	@Test
	@Description("verifty if checkout  done")
	@Epic("EP001")
	@Feature("Feature1: checkout  done")
	@Story("Story: checkout  done")
	@Step("Verify checkout confirmation")
	@Severity(SeverityLevel.TRIVIAL)
	public void CheckOutPageTest() throws InterruptedException {
		CheckOutPage checkOutPage = cameraPage.clickoNCheckOut();
		Assert.assertEquals(checkOutPage.checkOutScreenMessageText(), "Checkout", "Not on checkout page");
		checkOutPage.fillOutCheckoutDetails();
		Thread.sleep(5000);

	}
	
	@AfterMethod
	public void quitBrowserSession() {
		quitBrowser();
	}
}
