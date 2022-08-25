package com.naveenautomations.Utils;

import org.testng.ITestListener;
import org.testng.ITestResult;

import com.naveenautomations.base.TestBase;

public class CustomListener extends TestBase implements ITestListener {

	@Override
	public void onTestStart(ITestResult result) {
		logger.info("Test execution has started ......." + result.getMethod().getMethodName());
	}

	@Override
	public void onTestSuccess(ITestResult result) {
		logger.info("Test execution has passed successfully ......." + result.getMethod().getMethodName());

	}

	@Override
	public void onTestFailure(ITestResult result) {
		logger.info("Test execution has failed and taking screenshot ......." + result.getMethod().getMethodName());
		Utils.takeFailedScreenshots(result.getMethod().getMethodName());
	}

	@Override

	public void onTestSkipped(ITestResult result) {
		logger.info("Test execution has skipped ......." + result.getMethod().getMethodName());

	}

}
