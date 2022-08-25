package com.naveenautomation.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;

import com.naveenautomations.base.TestBase;

public class CheckOutPage extends TestBase {

	Select sel;

	public CheckOutPage() {
		PageFactory.initElements(webDriver, this);
	}

	@FindBy(css = "div#content h1")
	private WebElement checkOutScreenMessage;

	public String checkOutScreenMessageText() {
		return checkOutScreenMessage.getText();
	}

	@FindBy(css = "input#button-payment-address")
	private WebElement continueBtn1;

	@FindBy(css = "input#button-shipping-address")
	private WebElement continueBtn2;

	@FindBy(css = "input#button-shipping-method")
	private WebElement continueBtn3;

	@FindBy(css = "input[type=\"checkbox\"]")
	private WebElement privacyCheckBox;

	@FindBy(css = "input#button-payment-method")
	private WebElement continueBtn4;

	@FindBy(css = "input#button-confirm")
	private WebElement confirmOrder;

	public void fillOutCheckoutDetails() {

		continueBtn1.click();
		continueBtn2.click();
		continueBtn3.click();
		privacyCheckBox.click();
		continueBtn4.click();

	}

	public OrderConfirmationPage ContinueCheckoutDetails() {
		confirmOrder.click();
		return new OrderConfirmationPage();
	}

}
