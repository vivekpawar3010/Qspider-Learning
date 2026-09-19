package com.crm.POM;

//import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class HeaderFooter1 {
	
	//footer

	// for the information 1-6
	@FindBy(xpath = "//div[@class='column information']/ul/li[1]/a")
	private WebElement info1;
	public void clickInfo1() {
		info1.click();
	}
	

	@FindBy(xpath = "//div[@class='column information']/ul/li[2]/a")
	private WebElement info2;
	public void clickInfo2() {
		info2.click();
	}
	

	@FindBy(xpath = "//div[@class='column information']/ul/li[3]/a")
	private WebElement info3;
	public void clickInfo3() {
		info3.click();
	}
	

	@FindBy(xpath = "//div[@class='column information']/ul/li[4]/a")
	private WebElement info4;
	public void clickInfo4() {
		info4.click();
	}
	

	@FindBy(xpath = "//div[@class='column information']/ul/li[5]/a")
	private WebElement info5;
	public void clickInfo5() {
		info5.click();
	}
	
	@FindBy(xpath = "//div[@class='column information']/ul/li[6]/a")
	private WebElement info6;
	public void clickInfo6() {
		info6.click();
	}
	
	
	//customer service
	
	@FindBy(xpath = "//div[@class='column customer-service']/ul/li[1]/a")
	private WebElement cst_ser1;
	public void clickService1() throws InterruptedException {
		cst_ser1.click();
		Thread.sleep(500);
	}
	
	
	@FindBy(xpath = "//div[@class='column customer-service']/ul/li[2]/a")
	private WebElement cst_ser2;
	public void clickService2() throws InterruptedException {
		cst_ser2.click();
		Thread.sleep(500);
	}
	
	@FindBy(xpath = "//div[@class='column customer-service']/ul/li[3]/a")
	private WebElement cst_ser3;
	public void clickService3() throws InterruptedException {
		cst_ser3.click();
		Thread.sleep(500);
	}
	
	@FindBy(xpath = "//div[@class='column customer-service']/ul/li[4]/a")
	private WebElement cst_ser4;
	public void clickService4() throws InterruptedException {
		cst_ser4.click();
		Thread.sleep(500);
	}
	
	@FindBy(xpath = "//div[@class='column customer-service']/ul/li[5]/a")
	private WebElement cst_ser5;
	public void clickService5() throws InterruptedException {
		cst_ser5.click();
		Thread.sleep(500);
	}
	
	@FindBy(xpath = "//div[@class='column customer-service']/ul/li[6]/a")
	private WebElement cst_ser6;
	public void clickService6() throws InterruptedException {
		cst_ser6.click();
		Thread.sleep(500);
	}
	
	
	
//	
//	@FindBy(xpath = "//div[@class='column my-account']/ul/li")
//	private List<WebElement> my_acc;
//	public void clickMyAcc(WebDriver driver) throws InterruptedException {
//		for(WebElement btn:my_acc) {
//			btn.click();
//			Thread.sleep(500);
//			this.goTofooter(driver);
//		}
//	}
//	
	
	//my account
	
		@FindBy(xpath = "//div[@class='column my-account']/ul/li[1]/a")
		private WebElement my_acc1;
		public void clickMyAccount1() throws InterruptedException {			my_acc1.click();
			Thread.sleep(500);
		}
		
		
		@FindBy(xpath = "//div[@class='column my-account']/ul/li[2]/a")
		private WebElement my_acc2;
		public void clickMyAccount2() throws InterruptedException {
			my_acc2.click();
			Thread.sleep(500);
		}
		
		@FindBy(xpath = "//div[@class='column my-account']/ul/li[3]/a")
		private WebElement my_acc3;
		public void clickMyAccount3() throws InterruptedException {
			my_acc3.click();
			Thread.sleep(500);
		}
		
		@FindBy(xpath = "//div[@class='column my-account']/ul/li[4]/a")
		private WebElement my_acc4;
		public void clickMyAccount4() throws InterruptedException {
			my_acc4.click();
			Thread.sleep(500);
		}
		
		@FindBy(xpath = "//div[@class='column my-account']/ul/li[5]/a")
		private WebElement my_acc5;
		public void clickMyAccount5() throws InterruptedException {
			my_acc5.click();
			Thread.sleep(500);
		}
		
		@FindBy(xpath = "//div[@class='column my-account']/ul/li[6]/a")
		private WebElement my_acc6;
		public void clickMyAccount6() throws InterruptedException {
			my_acc6.click();
			Thread.sleep(500);
		}
		
		
//		
//		
//		@FindBy(xpath = "//div[@class='column my-account']/ul/li")
//		private List<WebElement> my_acc;
//		public void clickMyAcc(WebDriver driver) throws InterruptedException {
//			for(WebElement btn:my_acc) {
//				btn.click();
//				Thread.sleep(500);
//				this.goTofooter(driver);
//			}
//		}
		
		
	//follow us
		
		//customer service
		
		@FindBy(xpath = "//div[@class='column follow-us']/ul/li[1]/a")
		private WebElement follow_us1;
		public void clickFollow_us1() throws InterruptedException {
			follow_us1.click();
			Thread.sleep(500);
		}
		
		
		@FindBy(xpath = "//div[@class='column follow-us']/ul/li[2]/a")
		private WebElement follow_us2;
		public void clickFollow_us2() throws InterruptedException {
			follow_us2.click();
			Thread.sleep(500);
		}
		
		@FindBy(xpath = "//div[@class='column follow-us']/ul/li[3]/a")
		private WebElement follow_us3;
		public void clickFollow_us3() throws InterruptedException {
			follow_us3.click();
			Thread.sleep(500);
		}
		
		@FindBy(xpath = "//div[@class='column follow-us']/ul/li[4]/a")
		private WebElement follow_us4;
		public void clickFollow_us4() throws InterruptedException {
			follow_us4.click();
			Thread.sleep(500);
		}
		
		@FindBy(xpath = "//div[@class='column follow-us']/ul/li[5]/a")
		private WebElement follow_us5;
		public void clickFollow_us5() throws InterruptedException {
			follow_us5.click();
			Thread.sleep(500);
		}
		
		@FindBy(xpath = "//div[@class='column follow-us']/ul/li[6]/a")
		private WebElement follow_us6;
		public void clickFollow_us6() throws InterruptedException {
			follow_us6.click();
			Thread.sleep(500);
		}
		
		
		
		
//		@FindBy(xpath = "//div[@class='column my-account']/ul/li")
//		private List<WebElement> my_acc;
//		public void clickMyAcc(WebDriver driver) throws InterruptedException {
//			for(WebElement btn:my_acc) {
//				btn.click();
//				Thread.sleep(500);
//				this.goTofooter(driver);
//			}
//		}
		
//	@FindBy(xpath = "//div[@class='column follow-us']/ul/li")
//	private List<WebElement> follow_on;
//	public void clickFollowOn(WebDriver driver) throws InterruptedException {
//		for(WebElement btn:follow_on) {
//			btn.click();
//			Thread.sleep(500);
//			this.goTofooter(driver);
//		}
//	}
	
	public void goTofooter(WebDriver driver) {
		Actions act = new Actions(driver);
		WebElement ele = driver.findElement(By.className("footer-poweredby"));
		act.scrollToElement(ele);
	}
	
	public HeaderFooter1(WebDriver driver) {
		PageFactory.initElements(driver, this);
	}

	

	//header

	@FindBy(xpath = "//img[@alt='Tricentis Demo Web Shop']")
	private WebElement header_logo;
	public void hearder_log(){
		header_logo.click();
	}
	
	@FindBy(className = "ico-register")
	private WebElement register;
	public void register(){
		register.click();
	}
	
	@FindBy(className = "ico-login")
	private WebElement login;
	public void login(){
		login.click();
	}
	
	@FindBy(className = "ico-cart")
	private WebElement cart;
	public void cart(){
		cart.click();
	}
	
	
	@FindBy(className = "ico-wishlist")
	private WebElement wishlist;
	public void wishlist(){
		wishlist.click();
	}
	
	@FindBy(id = "small-searchterms")
	private WebElement searchBar;
	public void searchBar(String value){
		searchBar.sendKeys(value);
	}
	
	@FindBy(xpath = "//input[@value='Search']")
	private WebElement searchButton;
	public void searchButton(){
		searchButton.click();
	}
	
	
	
	
	
}
