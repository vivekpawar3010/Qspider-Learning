package PageObjectModel;

import java.sql.Driver;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

import com.crm.POM.Login1;

public class LoginModel1 {
	
	@Test
	public static void main1() throws InterruptedException {
		WebDriver driver = new ChromeDriver();
		driver.get("https://demowebshop.tricentis.com/");
		driver.manage().window().maximize();
		Thread.sleep(1000);
		
		Login1 log = new Login1(driver);
		
//		log.login_link = // it can be updated by any one so make the private and give only get method with the data hiding
//		log.login_link.click();
//		log.email.sendKeys("vivekpawar@gmail.com");
//		log.password.sendKeys("King@3010");
//		log.login_button.click();
		
//		log.login_link = // now it can not be update 
		// we update it again to directly perform the actions
		log.loginLink();
		log.emailsend("vivekpawar@gmail.com");
		log.password("King@3010");
		log.loginButtom();
		
		
		driver.close();
	}
}
