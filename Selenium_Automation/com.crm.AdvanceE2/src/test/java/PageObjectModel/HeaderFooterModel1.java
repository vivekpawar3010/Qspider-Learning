package PageObjectModel;

import org.openqa.selenium.WebDriver;

import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

import com.crm.POM.HeaderFooter1;


public class HeaderFooterModel1 {
	
	
	@Test
	public static void main1() throws InterruptedException {
		WebDriver driver = new ChromeDriver();
		driver.get("https://demowebshop.tricentis.com/");
		driver.manage().window().maximize();
		Thread.sleep(1000);
		
		
//		Actions act = new Actions(driver);
//		WebElement ele = driver.findElement(By.className("footer-poweredby"));
//		act.scrollToElement(ele);
		HeaderFooter1 objhf = new HeaderFooter1(driver);
		
		// first simple 6 in 
		objhf.clickInfo1();
		Thread.sleep(500);
		objhf.goTofooter(driver);
		
		objhf.clickInfo2();
		Thread.sleep(500);
		objhf.goTofooter(driver);
		
		objhf.clickInfo3();
		Thread.sleep(500);
		objhf.goTofooter(driver);
		
		objhf.clickInfo4();
		Thread.sleep(500);
		objhf.goTofooter(driver);
		
		objhf.clickInfo5();
		Thread.sleep(500);
		objhf.goTofooter(driver);
		
		objhf.clickInfo6();
		Thread.sleep(500);
		objhf.goTofooter(driver);
		
		//customer services
		objhf.clickService1();
		Thread.sleep(500);
		objhf.clickService2();
		Thread.sleep(500);
		objhf.clickService3();
		Thread.sleep(500);
		objhf.clickService4();
		Thread.sleep(500);
		objhf.clickService5();
		Thread.sleep(500);
		objhf.clickService6();
		Thread.sleep(500);
		
		//my account
		objhf.clickMyAccount1();
		Thread.sleep(500);
		objhf.clickMyAccount2();
		Thread.sleep(500);
		objhf.clickMyAccount3();
		Thread.sleep(500);
		objhf.clickMyAccount4();
		Thread.sleep(500);
		objhf.clickMyAccount5();
		Thread.sleep(500);
		objhf.clickMyAccount6();
		Thread.sleep(500);
		
		//follow us
		objhf.clickFollow_us1();
		Thread.sleep(500);
		objhf.clickFollow_us2();
		Thread.sleep(500);
		objhf.clickFollow_us3();
		Thread.sleep(500);
		objhf.clickFollow_us4();
		Thread.sleep(500);
		objhf.clickFollow_us5();
		Thread.sleep(500);
		objhf.clickFollow_us6();
		Thread.sleep(500);
		
		
		
		//header
		
		objhf.hearder_log();
		Thread.sleep(500);
		objhf.register();
		Thread.sleep(500);
		objhf.login();
		Thread.sleep(500);
		objhf.cart();
		Thread.sleep(500);
		objhf.wishlist();
		Thread.sleep(500);
		
		
		objhf.searchBar("king");
		Thread.sleep(500);
		objhf.searchButton();
		Thread.sleep(500);
				
		driver.close();
	}
}
