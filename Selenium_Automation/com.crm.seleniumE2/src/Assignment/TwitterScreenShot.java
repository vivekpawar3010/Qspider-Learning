package Assignment;

import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class TwitterScreenShot {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://x.com/home");
		driver.findElement(By.xpath("//input[@role='combobox']")).sendKeys("vijay");
		Thread.sleep(2000);
		

	}

}
