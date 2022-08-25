package com.naveenautomation.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.naveenautomations.base.TestBase;

public class MyAccountPage extends TestBase {

	public MyAccountPage() {
		PageFactory.initElements(webDriver, this);
	}

	@FindBy(css = "div#content h2")
	public WebElement myAccountText;

	@FindBy(css = "a[href=\"https://naveenautomationlabs.com/opencart/index.php?route=product/category&path=33\"]")
	public WebElement cameraField;

	@FindBy(css = "div.list-group a:nth-of-type(3)")
	public WebElement changePasswordButton;

	@FindBy(css = "div.list-group a:nth-of-type(6)")
	public WebElement orderHistoryButton;

	public String getTextFromMyAccount() {
		return myAccountText.getText();
	}

	public CameraPurchasePage clickOnCameraField() {
		cameraField.click();
		return new CameraPurchasePage();
	}

	public ChangePasswordField clickOnchangePasswordButton() {
		changePasswordButton.click();
		return new ChangePasswordField();
	}

	public OrderHistoryPage clickorderHistoryButton() {
		orderHistoryButton.click();
		return new OrderHistoryPage();
	}

}
