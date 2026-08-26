package Iframe;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class Default {
	
public static void main(String[] args) throws InterruptedException {
		
		ChromeDriver driver = new ChromeDriver();
		
		driver.manage().window().maximize();
		
		driver.get("https://demoapps.qspiders.com/ui/frames?sublist=0&scenario=2");
		Thread.sleep(2000);
		
		driver.switchTo().frame(0);
		Thread.sleep(1000);
		
		
		driver.findElement(By.id("username")).sendKeys("Aniket");
		Thread.sleep(1000);
		
		
		driver.findElement(By.id("password")).sendKeys("Aniket@2302");
		Thread.sleep(1000);
		
		driver.findElement(By.id("submitButton")).click();
		Thread.sleep(1000);
		
		driver.close();
		
}
		
		
		
		
		
		
		

}
