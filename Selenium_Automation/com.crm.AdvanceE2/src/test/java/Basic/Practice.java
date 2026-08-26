package Basic;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class Practice {
	@Test
	public static void leetcodeLogin() throws InterruptedException {
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://leetcode.com");
		Thread.sleep (1000);

		driver.findElement(By.xpath("//a/span[text()='Sign in']")).click();

		Thread.sleep(1000);

		driver.findElement(By.id("id_login")).sendKeys("vivekpawar932564@gmail.com");
		Thread.sleep(1000);
		driver.findElement(By.id("id_password")).sendKeys("King@3010");
		Thread.sleep(1000);
		driver.findElement(By.id("signin_btn")).click();
		Thread.sleep(1000);

		driver.close();

	}
}
