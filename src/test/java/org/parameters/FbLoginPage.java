package org.parameters;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.sample.BaseClass;

public class FbLoginPage extends BaseClass {
	public FbLoginPage() {
		PageFactory.initElements(driver, this);
	}
	@FindBy(id="email")
	private WebElement username;
	@FindBy(id="pass")
	private WebElement password;
	@FindBy(id="u_0_d")
	private WebElement btnclick;
	/**
	 * @return the username
	 */
	public WebElement getUsername() {
		return username;
	}
	/**
	 * @return the password
	 */
	public WebElement getPassword() {
		return password;
	}
	/**
	 * @return the btnclick
	 */
	
	public WebElement getBtnclick() {
		return btnclick;
	}

}
