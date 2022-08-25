package com.naveenautomation.Reports;

import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.testng.ITestListener;
import org.testng.ITestResult;

import com.naveenautomations.base.TestBase;

import io.qameta.allure.Attachment;

public class AllureReportListener extends TestBase implements ITestListener {

	@Override
	public void onTestFailure(ITestResult result) {
		saveScreenshotOnFailure(webDriver);
		saveLogs(result.getMethod().getConstructorOrMethod().getName());
	}

	@Attachment(value = "Screenshot", type = "image/png")
	public byte[] saveScreenshotOnFailure(org.openqa.selenium.WebDriver driver) {
		return ((TakesScreenshot) driver).getScreenshotAs(OutputType.BYTES);
	}

	@Attachment(value = "Stacktrace ", type = "text/plain")
	public static String saveLogs(String message) {
		return message;
	}

}
