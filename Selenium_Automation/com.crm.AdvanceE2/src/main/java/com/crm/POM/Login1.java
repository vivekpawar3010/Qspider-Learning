package com.crm.POM;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Login1 {
	
	
	
	// to search and store the web element with the TestNG Annotation
	@FindBy(className = "ico-login")
	private WebElement login_link;
	
	@FindBy(id = "Email")
	private WebElement email;
	
	
	@FindBy(name = "Password")
	private WebElement password;
	
	@FindBy(css = ".button-1.login-button")
	private WebElement login_button;
	
	public Login1(WebDriver driver) {
		PageFactory.initElements(driver, this);
	}
	
//	// If we keep the variables public then it can be updated by unauthorised person so make them private and give the only getter methods
//	public WebElement loginLink() {
//		return login_link;			
//	}
//	
//	public WebElement loginButton() {
//		return login_button;
//	}
//	public WebElement Email() {
//		return email;			
//	}
//	public WebElement Password() {
//		return password;			
//	}
	
	//instead of just returning it directly we can perform the actions
	public void loginLink() {
		login_link.click();
	}
	
	
	public void loginButtom() {
		login_button.click();
	}	
	
	public void emailsend(String value) {
		email.sendKeys(value);
		
	}
	
	public void password(String pass) {
		password.sendKeys(pass);
	}
}
