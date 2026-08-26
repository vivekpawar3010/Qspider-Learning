package UtilityClasses;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxBinary;
import org.openqa.selenium.firefox.FirefoxDriver;

public class CrossBrowserTesting {

	public static void main(String[] args) {
		WebDriver driver = null;
		
		String browser = "chr";
		
		if(browser.equalsIgnoreCase("chrome")) {
			driver = new ChromeDriver();
		}else if(browser.equalsIgnoreCase("Firefox")) {
			driver = new FirefoxDriver();
		}else if(browser.equalsIgnoreCase("edge")) {
			driver = new EdgeDriver();
		}else {
			driver = new ChromeDriver();
		}
		
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		
		driver.get("https://www.easymytrip.com/");
		
		
		driver.close();

	}

}
