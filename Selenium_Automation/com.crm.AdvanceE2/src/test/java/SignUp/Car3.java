package SignUp;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class Car3 {

	@Test(groups = "smock")
	public static void test() {
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.tatamotors.com/");
		driver.manage().window().maximize();
		
		System.out.println("Task Done ---" + driver.getTitle());
		driver.close();
	}
}
