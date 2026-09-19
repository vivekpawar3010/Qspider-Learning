package Mock;


import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class BaseClass {
	
	public static void main(String[] args) throws InterruptedException {
		preCondition();
		Thread.sleep(1000);
		login();
		Thread.sleep(1000);
		logout();
		Thread.sleep(1000);
		postCondition();
	}

	public static WebDriver driver;

	public static void preCondition() {

		String browser = "chrome";

		if (browser.equalsIgnoreCase("chrome")) {
			driver = new ChromeDriver();
		} else if (browser.equalsIgnoreCase("firefox")) {
			driver = new FirefoxDriver();
		} else if (browser.equalsIgnoreCase("edge")) {
			driver = new EdgeDriver();
		}

		driver.manage().window().maximize();

		

		driver.get("https://demowebshop.tricentis.com/");

	}

	public static void login() {

		driver.findElement(org.openqa.selenium.By.linkText("Log in")).click();

		driver.findElement(org.openqa.selenium.By.id("Email")).sendKeys("vivekpawar@gmail.com");

		driver.findElement(org.openqa.selenium.By.id("Password")).sendKeys("King@3010");

		driver.findElement(org.openqa.selenium.By.cssSelector("input[value='Log in']")).click();
	}

	public static void logout() {

		driver.findElement(org.openqa.selenium.By.linkText("Log out")).click();
	}


	public static void postCondition() {

		driver.quit();

	}
}