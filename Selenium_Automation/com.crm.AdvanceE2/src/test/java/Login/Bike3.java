package Login;

import java.awt.image.DirectColorModel;

import org.checkerframework.common.reflection.qual.GetClass;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class Bike3 {

	@Test(groups = "bikes")
	public static void royalEnfileds() {
		WebDriver driver = new ChromeDriver();
		driver.get("https://royalenfield.com/in/en/");
		driver.manage().window().maximize();
		
		System.out.println("Task Done ---" + driver.getCurrentUrl());
		driver.close();
	}
}
