package HomePage;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Optional;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class MultiplePara {
	
	public static WebDriver driver = null;
	
	@Parameters({"borwser","url", "username", "password"})
	@Test
	public static void testing(@Optional("chrome") String browser, String url, String user,String pass) {
		if(browser.equalsIgnoreCase("chrome")) {
			driver = new ChromeDriver();
		}else if(browser.equalsIgnoreCase("firefox")) {
			driver = new ChromeDriver();
		}else if(browser.equalsIgnoreCase("edge")) {
			driver = new ChromeDriver();
		}else {
			driver = new ChromeDriver();
		}
		
		driver.manage().window().maximize();
		
		driver.get(url);
		
		driver.findElement(By.className("ioc-login")).click();
		driver.findElement(By.id("Email")).sendKeys(user);
		driver.findElement(By.name("Password")).sendKeys(pass);
		
		driver.close();
		
	}
}
