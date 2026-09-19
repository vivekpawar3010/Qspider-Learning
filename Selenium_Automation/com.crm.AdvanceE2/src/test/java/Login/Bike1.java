package Login;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class Bike1 {

	@Test(groups = "bikes")
	public static void xpluse() {
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.heromotocorp.com/en-in/motorcycles/xpulse-200-4v.html");
		driver.manage().window().maximize();
		
		System.out.println("Task Done ---" + driver.getTitle());
		driver.close();
	}
	
}
