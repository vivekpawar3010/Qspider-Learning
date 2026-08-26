package Iframe;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class NestedIframe {
	
public static void main(String[] args) throws InterruptedException {
		
		ChromeDriver driver = new ChromeDriver();
		
		driver.manage().window().maximize();
		
		driver.get("https://demoapps.qspiders.com/ui/frames/nested?sublist=1");
		Thread.sleep(2000);
		
		
		driver.switchTo().frame(0);
		Thread.sleep(2000);
		
		driver.switchTo().frame(0);
		Thread.sleep(2000);
		
		
		driver.findElement(By.id("email")).sendKeys("aniketrane2302@gmail.com");
		Thread.sleep(2000);
		
		
		driver.findElement(By.id("password")).sendKeys("Aniket@232004");
		Thread.sleep(2000);
		
		
		
		driver.findElement(By.id("confirm-password")).sendKeys("Aniket@232004");
		Thread.sleep(2000);
		
		

		driver.findElement(By.id("submitButton")).click();
		Thread.sleep(2000);
		
		driver.close();
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
     }
}
