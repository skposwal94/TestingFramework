package com.naveenautomations.Utils;

import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.events.WebDriverEventListener;

import com.naveenautomations.base.TestBase;

public class WebdriverEvents extends TestBase implements WebDriverEventListener {

	@Override
	public void beforeAlertAccept(org.openqa.selenium.WebDriver driver) {
		logger.info("about to accept alert on " + driver.getCurrentUrl());

	}

	@Override
	public void afterAlertAccept(org.openqa.selenium.WebDriver driver) {
		logger.info("Accepeted alert on " + driver.getCurrentUrl());

	}

	@Override
	public void afterAlertDismiss(org.openqa.selenium.WebDriver driver) {
		// TODO Auto-generated method stub

	}

	@Override
	public void beforeAlertDismiss(org.openqa.selenium.WebDriver driver) {
		// TODO Auto-generated method stub

	}

	@Override
	public void beforeNavigateTo(String url, org.openqa.selenium.WebDriver driver) {
		logger.info("Navigating to URL " + driver.getCurrentUrl());
	}

	@Override
	public void afterNavigateTo(String url, org.openqa.selenium.WebDriver driver) {
		logger.info("Navigated to URL " + driver.getCurrentUrl());

	}

	@Override
	public void beforeNavigateBack(org.openqa.selenium.WebDriver driver) {
		// TODO Auto-generated method stub

	}

	@Override
	public void afterNavigateBack(org.openqa.selenium.WebDriver driver) {
		// TODO Auto-generated method stub

	}

	@Override
	public void beforeNavigateForward(org.openqa.selenium.WebDriver driver) {
		// TODO Auto-generated method stub

	}

	@Override
	public void afterNavigateForward(org.openqa.selenium.WebDriver driver) {

	}

	@Override
	public void beforeNavigateRefresh(org.openqa.selenium.WebDriver driver) {
		logger.info("Refreshing ..." + driver.getCurrentUrl());

	}

	@Override
	public void afterNavigateRefresh(org.openqa.selenium.WebDriver driver) {
		logger.info("Refreshed.... " + driver.getCurrentUrl());

	}

	@Override
	public void beforeFindBy(By by, WebElement element, org.openqa.selenium.WebDriver driver) {
		logger.info("Finding element " + element);

	}

	@Override
	public void afterFindBy(By by, WebElement element, org.openqa.selenium.WebDriver driver) {
		logger.info("Webelement found " + element);

	}

	@Override
	public void beforeClickOn(WebElement element, org.openqa.selenium.WebDriver driver) {
		logger.info("Clicking Webelement " + element);

	}

	@Override
	public void afterClickOn(WebElement element, org.openqa.selenium.WebDriver driver) {
		logger.info("Clicked Webelement " + element);

	}

	@Override
	public void beforeChangeValueOf(WebElement element, org.openqa.selenium.WebDriver driver,
			CharSequence[] keysToSend) {
		// TODO Auto-generated method stub

	}

	@Override
	public void afterChangeValueOf(WebElement element, org.openqa.selenium.WebDriver driver,
			CharSequence[] keysToSend) {
		// TODO Auto-generated method stub

	}

	@Override
	public void beforeScript(String script, org.openqa.selenium.WebDriver driver) {
		// TODO Auto-generated method stub

	}

	@Override
	public void afterScript(String script, org.openqa.selenium.WebDriver driver) {
		// TODO Auto-generated method stub

	}

	@Override
	public void beforeSwitchToWindow(String windowName, org.openqa.selenium.WebDriver driver) {
		logger.info("Switching to window " + windowName);

	}

	@Override
	public void afterSwitchToWindow(String windowName, org.openqa.selenium.WebDriver driver) {
		logger.info("Switched to window " + windowName);

	}

	@Override
	public void onException(Throwable throwable, org.openqa.selenium.WebDriver driver) {
		logger.info("Exception ecounterd " + throwable);

	}

	@Override
	public <X> void beforeGetScreenshotAs(OutputType<X> target) {
		// TODO Auto-generated method stub

	}

	@Override
	public <X> void afterGetScreenshotAs(OutputType<X> target, X screenshot) {
		// TODO Auto-generated method stub

	}

	@Override
	public void beforeGetText(WebElement element, org.openqa.selenium.WebDriver driver) {
		logger.info("Getting text from " + element);

	}

	@Override
	public void afterGetText(WebElement element, org.openqa.selenium.WebDriver driver, String text) {
		logger.info("Got text from: " + element +  " " + text);

	}

}
