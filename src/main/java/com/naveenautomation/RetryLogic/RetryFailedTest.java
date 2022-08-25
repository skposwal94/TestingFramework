package com.naveenautomation.RetryLogic;

import org.testng.IRetryAnalyzer;
import org.testng.ITestResult;

import com.naveenautomations.base.TestBase;

public class RetryFailedTest extends TestBase implements IRetryAnalyzer {

	int counter = 0;
	int maxRetries = 1;

	@Override
	public boolean retry(ITestResult result) {
		logger.info("Test has failed.... retrying again " + result.getMethod().getMethodName());
		if (counter < maxRetries) {
			counter++;
			return true;
		}
		return false;
	}

}
