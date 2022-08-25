package com.naveenautomation.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.naveenautomations.base.TestBase;

public class ChangePasswordField extends TestBase {

	public ChangePasswordField() {
		PageFactory.initElements(webDriver, this);
	}

	@FindBy(css = "div#content h1")
	public WebElement changePasswordTitle;

	@FindBy(css = "div.col-sm-10 #input-password")
	public WebElement currentPasswordField;

	@FindBy(css = "div.col-sm-10  #input-confirm")
	public WebElement confirmPasswordField;

	@FindBy(css = "div.buttons div.pull-right input")
	public WebElement submitPasswordChange;
	

	public String getTextchangePasswordTitle() {
		return changePasswordTitle.getText();
	}

	public void enterNewPassword() {
		currentPasswordField.sendKeys("PasswordReloaded");
	}

	public void enterConfirmNewPassword() {
		confirmPasswordField.sendKeys("PasswordReloaded");
	}

	public void clickOnsubmitPasswordChange() {
		submitPasswordChange.click();
	}

}
