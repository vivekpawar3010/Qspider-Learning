package com.crm.POM;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Register1 {

	
	@FindBy(className = "ico-register")
	private WebElement register_link;
	
	public void registerLink() {
		register_link.click();
	}
	
	
	@FindBy(id = "gender-male")
	private WebElement gender_male;
	private void genderMale() {
		gender_male.click();
	}
	
	@FindBy(id = "gender-female")
	private WebElement gender_female;
	private void genderFemale() {
		gender_female.click();
	}
	
	public void gender(char gen) {
		if(gen == 'm' || gen == 'M') genderMale();
		else if(gen == 'f' || gen == 'F') genderFemale();
		else System.out.println("Wrong input");
	}
	
	@FindBy(id = "FirstName")
	private WebElement first_name;
	public void firstName(String name) {
		first_name.sendKeys(name);
	}
	
	@FindBy(id = "LastName")
	private WebElement last_name;
	public void lastName(String name) {
		last_name.sendKeys(name);
	}
	
	@FindBy(id = "Email")
	private WebElement emailid;
	public void fillEamil(String email) {
		emailid.sendKeys(email);
	}
	
	@FindBy(id = "Password")
	private WebElement password;
	public void fillPass(String pass) {
		password.sendKeys(pass);
	}
	
	@FindBy(id = "ConfirmPassword")
	private WebElement passwordConfirm;
	public void fillPassCon(String passcon) {
		passwordConfirm.sendKeys(passcon);
	}
	
	
	@FindBy(id = "register-button")
	private WebElement register_btn;
	public void registerClick() {
		register_btn.click();
	}
	
	public Register1(WebDriver driver) {
		PageFactory.initElements(driver, this);
	}
}
