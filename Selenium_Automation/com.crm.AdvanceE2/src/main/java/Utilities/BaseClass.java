package Utilities;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;

public class BaseClass {
	public static WebDriver driver = null;
	public static ChromeOptions options;

	// @Parameters({"browser", "url"})
	@BeforeMethod
	public static void setUp() throws InterruptedException {
		preconditions("chrome", "https://demowebshop.tricentis.com/");
	}

	public static void preconditions(String choise, String url) throws InterruptedException {
		options = new ChromeOptions();
		options.addArguments("--incognito");
		String browser = choise;
		if (url.isEmpty() == true)
			url = "https://demowebshop.tricentis.com/";
		if (browser.equalsIgnoreCase("chrome")) {
			driver = new ChromeDriver(options);

		}

		else if (browser.equalsIgnoreCase("Firefox")) {
			driver = new FirefoxDriver();

		}

		else {
			driver = new ChromeDriver(options);
		}
		Thread.sleep(1000);
		driver.manage().window().maximize();
		Thread.sleep(1000);

		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));
		Thread.sleep(1000);
		driver.get(url);

	}

	public static void login(String Username, String password) {
		driver.findElement(By.className("ico-login")).click();
		driver.findElement(By.id("Email")).sendKeys(Username);
		driver.findElement(By.name("Password")).sendKeys(password);

		driver.findElement(By.cssSelector(".button-1.login-button")).click();
	}

	public static void logout() {
		if (driver != null && !driver.findElements(By.xpath("//a[text()='Log out']")).isEmpty()) {
			driver.findElement(By.xpath("//a[text()='Log out']")).click();
		}
	}

	@AfterMethod
	public void postcondition() {
		if (driver != null) {
			driver.quit();
			driver = null;
		}
		System.out.println();
	}
}