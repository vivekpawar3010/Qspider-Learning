package SignUp;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Optional;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class Car12 {

	@Test(priority = 1, groups = "smock")
	public static void BMW() {
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.bmw.in/");
		driver.manage().window().maximize();
		
		System.out.println("Task Done ---" + driver.getTitle());
		driver.close();
	}
	
	@Parameters("url")
	@Test
	public static void readXML(@Optional("https://github.com") String url) {
		WebDriver driver = new ChromeDriver();
		driver.get(url);
		driver.manage().window().maximize();
		
		System.out.println("Task Done ---" + driver.getTitle());
		driver.close();
	}
	
	@Test(groups = "smock")
	public static void Ford() {
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.india.ford.com/");
		driver.manage().window().maximize();
		
		System.out.println("Task Done ---" + driver.getTitle());
		driver.close();
	}
}
	
	
