package PageObjectModel;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;


import com.crm.POM.Register1;

public class RegisterModel1 {
		
	@Test
	public static void main1() throws InterruptedException {
		WebDriver driver = new ChromeDriver();
		driver.get("https://demowebshop.tricentis.com/");
		driver.manage().window().maximize();
		Thread.sleep(1000);
			
		Register1 register = new Register1(driver);
		
		register.registerLink();
		register.gender('m');
		register.firstName("Vivek ");
		register.lastName("Pawar");
		register.fillEamil("vivek@gmail.com");
		register.fillPass("king");
		register.fillPassCon("king");
		register.registerClick();
		driver.close();
	}
}
