	package UtilityClasses;
	
	import java.time.Duration;
	
	import org.openqa.selenium.By;
	import org.openqa.selenium.WebDriver;
	import org.openqa.selenium.chrome.ChromeDriver;
	import org.openqa.selenium.edge.EdgeDriver;
	import org.openqa.selenium.firefox.FirefoxDriver;
	
	public class BaseClass {
		
		public static WebDriver driver = null;
		public static void precondition() {
			String url = "https://demowebshop.tricentis.com/";
			precondition(url);
		}
		public static void precondition(String url) {
			
			
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
			
	//		driver.get("file:///C:/.Qspider-Learning/Selenium_Automation/TestingFileDemos/demo.html");
			driver.get(url);
			System.out.println("precondtitons");
			
		}
		
		public static void login() {
			driver.findElement(By.className("ico-login")).click();
			driver.findElement(By.id("Email")).sendKeys("vivekpawar@gmail.com");
			
			driver.findElement(By.name("Password")).sendKeys("King@3010");
			driver.findElement(By.cssSelector(".button-1.login-button")).click();
			System.out.println("login");
		}
		
		public static void logout() {
			driver.findElement(By.xpath("//a[text()='Log out']")).click();
			System.out.println("Log Out");
		}
		
		public static void postCondition() {
			driver.quit();
			System.out.println("post Condition");
		}
	
	}
