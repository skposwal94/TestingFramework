package com.naveenautomation.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.naveenautomations.base.TestBase;

public class YourStorePage extends TestBase {

	public YourStorePage() {
		PageFactory.initElements(webDriver, this);
	}

	@FindBy(css = "i[class=\"fa fa-user\"]")
	private WebElement myAccountBtn;

	@FindBy(css = "#top-links ul.dropdown-menu li:last-of-type")
	private WebElement logInBtn;

	public void ClickMyAccountBtn() {
		myAccountBtn.click();
	}

	public AccountLogin ClickLogInBtn() {
		logInBtn.click();
		return new AccountLogin();
	}

}
