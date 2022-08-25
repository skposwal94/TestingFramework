package com.naveenautomation.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.naveenautomations.base.TestBase;

public class OrderConfirmationPage extends TestBase {

	public OrderConfirmationPage() {
		PageFactory.initElements(webDriver, this);
	}

	@FindBy(css = "div#content p")
	private WebElement orderPlacedConfimration;

	public String orderPlacedConfimrationText() {
		return orderPlacedConfimration.getText();
	}
}
