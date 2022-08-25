package com.naveenautomations.Tests;

import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Listeners;

import com.naveenautomation.Reports.AllureReportListener;
import com.naveenautomation.pages.AccountLogin;
import com.naveenautomation.pages.ChangePasswordField;
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
public class ChangePasswordPageTest extends TestBase {

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

	@org.testng.annotations.Test(priority = 1)
	@Severity(SeverityLevel.CRITICAL)

	public void verifyOnChangePasswordPage() throws InterruptedException {
		passwordPage = myAccountPage.clickOnchangePasswordButton();
		Assert.assertEquals(passwordPage.getTextchangePasswordTitle(), "ChangePassword", "Not on passowrd page");
	}

	@org.testng.annotations.Test(priority = 2)
	@Severity(SeverityLevel.CRITICAL)

	public void confrmPassowrdChangedSuccessfuly() throws InterruptedException {

		passwordPage = myAccountPage.clickOnchangePasswordButton();

		passwordPage.enterNewPassword();
		passwordPage.enterConfirmNewPassword();
		passwordPage.clickOnsubmitPasswordChange();
	}

	@AfterMethod
	public void quitBrowserSession() {
		quitBrowser();
	}

}
