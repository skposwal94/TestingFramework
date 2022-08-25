package com.naveenautomations.Tests;

import org.openqa.selenium.By;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
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
import com.naveenautomation.pages.OrderConfirmationPage;
import com.naveenautomation.pages.YourStorePage;
import com.naveenautomations.base.TestBase;

import io.qameta.allure.Attachment;
import io.qameta.allure.Description;
import io.qameta.allure.Epic;
import io.qameta.allure.Feature;
import io.qameta.allure.Severity;
import io.qameta.allure.SeverityLevel;
import io.qameta.allure.Step;
import io.qameta.allure.Story;
@Listeners({ AllureReportListener.class })
public class OrderConfirmationPageTest extends TestBase {

	YourStorePage yp;
	AccountLogin accountLogin;
	MyAccountPage myAccountPage;
	CameraPurchasePage cameraPage;
	CheckOutPage checkOutPage;

	@BeforeMethod
	public void startBrowserSession() {
		initialization();
		yp = new YourStorePage();
		yp.ClickMyAccountBtn();
		accountLogin = yp.ClickLogInBtn();
		myAccountPage = accountLogin.login("oo7@gmail.com", "PasswordReloaded");
		cameraPage = myAccountPage.clickOnCameraField();
		cameraPage.clickAddtoCart();
		checkOutPage = cameraPage.clickoNCheckOut();
		checkOutPage.fillOutCheckoutDetails();

	}

	@Test(description = "verifty if order confirmed")
	@Description("verifty if order confirmed")
	@Epic("EP001")
	@Feature("Feature1: Order confirmation")
	@Story("Story: Order confirmation")
	@Step("Verify Order confirmation")
	@Severity(SeverityLevel.NORMAL)
	public void OrderConfirmationTest() {
		OrderConfirmationPage orderConfirmationPage = checkOutPage.ContinueCheckoutDetails();
		wait = new WebDriverWait(webDriver, 30);

		wait.until(ExpectedConditions.textToBePresentInElementLocated(By.cssSelector("div#content h1"),
				"Your order has been placed!"));

		Assert.assertEquals(orderConfirmationPage.orderPlacedConfimrationText(),
				"Your order has been successfullyprocessed!", "Order not confirmed");
//		Thread.sleep(5000);

	}

	@AfterMethod
	public void quitBrowserSession() {
		quitBrowser();
	}

}
