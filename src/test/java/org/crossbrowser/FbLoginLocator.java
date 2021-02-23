package org.crossbrowser;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.sample.BaseClass;

public class FbLoginLocator extends BaseClass {
	public FbLoginLocator() {
		PageFactory.initElements(driver, this);
		
	}
	@FindBy(id="email")
	private WebElement userName;
	@FindBy(id="pass")
	private WebElement password;
	@FindBy(id="u_0_d_g5")
	private WebElement btnLogin;
	/**
	 * @return the userName
	 */
	public WebElement getUserName() {
		return userName;
	}
	/**
	 * @return the password
	 */
	public WebElement getPassword() {
		return password;
	}
	/**
	 * @return the btnLogin
	 */
	public WebElement getBtnLogin() {
		return btnLogin;
	}


}
