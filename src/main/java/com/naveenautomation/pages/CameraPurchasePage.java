package com.naveenautomation.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.BeforeMethod;

import com.naveenautomations.base.TestBase;

public class CameraPurchasePage extends TestBase {

	public CameraPurchasePage() {
		PageFactory.initElements(webDriver, this);
	}

	@FindBy(css = "button[onclick=\"cart.add('31', '1');\"]")
	private WebElement nikonD300;

	@FindBy(css = "div.alert.alert-success  a:nth-of-type(1)")
	private WebElement addedToCartMessage;

	@FindBy(css = "ul.list-inline a[title=\"Checkout\"] i.fa ")
	private WebElement checkOutButton;

	public void clickAddtoCart() {
		nikonD300.click();
	}

	public String returnaddedToCartMessage() {
		return addedToCartMessage.getText();
	}

	public CheckOutPage clickoNCheckOut() {
		checkOutButton.click();
		return new CheckOutPage();
	}

}
