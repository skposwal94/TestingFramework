package com.naveenautomation.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.naveenautomations.base.TestBase;

public class OrderHistoryPage extends TestBase {

	public OrderHistoryPage() {
		PageFactory.initElements(webDriver, this);
	}

	@FindBy(css = "div#content h1")
	private WebElement OrderHistoryTitle;

	public String OrderHistoryTitleText() {
		return OrderHistoryTitle.getText();
	}

}
