package com.naveenautomation.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.naveenautomations.base.TestBase;

public class AccountLogin extends TestBase {

	public AccountLogin() {
		PageFactory.initElements(webDriver, this);
	}

	@FindBy(id = "input-email")
	private WebElement inputEmailField;

	@FindBy(id = "input-password")
	private WebElement inputPasswordField;

	@FindBy(css = "input[type=\"submit\"]")
	private WebElement submitBtn;

	public void inputEmails(String email) {
		inputEmailField.sendKeys(email);
	}

	public void inputPasswordField(String password) {
		inputPasswordField.sendKeys(password);
	}

	public MyAccountPage clickSubmitbtn() {
		submitBtn.submit();
		return new MyAccountPage();
	}
	
	public MyAccountPage login(String email, String password) {
		inputEmails(email);
		inputPasswordField(password);
		return clickSubmitbtn();
	}

}
