package Login;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class Bike2 {

	@Test(groups = "bikes")
	public static void trekBikes() {
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.trekbikes.com/in/en_IN/bikes/road-bikes/performance-road-bikes/madone/c/B213/");
		driver.manage().window().maximize();
		
		System.out.println("Task Done ---" + driver.getTitle());
		driver.close();
	}
}
