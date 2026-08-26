package Basic;

import static org.testng.Assert.fail;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class Launch {
	@Test(priority = 0)
	public void leetcode() {
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		
		driver.get("https://leetcode.com");
		
		driver.close();
		
		fail("It's ok let run the next");

	}

	@Test(priority = 1)
	public void linkedin() {
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		
		driver.get("https://linkedin.com");

		driver.close();
		fail("It's ok let run the next");
	}

	@Test(priority = 3,enabled = true, alwaysRun = true, dependsOnGroups = {"leetcode", "linkedin"})
	public void github() {
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		
		driver.get("https://github.com");

		driver.close();
		fail("It's ok let run the next");
	}

	
}
