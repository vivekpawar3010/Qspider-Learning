package Iframe;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class MultiFrame {
	
	public static void main(String[] args) throws InterruptedException {
		
		ChromeDriver driver = new ChromeDriver();
		
		driver.manage().window().maximize();
		
		driver.get("https://demo.automationtesting.in/Frames.html");
		
		driver.findElement(By.linkText("Iframe with in an Iframe")).click();
		
		driver.switchTo().frame(1);
		Thread.sleep(1000);
		
		driver.switchTo().frame(0);
		Thread.sleep(1000);
		
		 driver.findElement(By.xpath("//input[@type='text']")).sendKeys("Aniket");
			Thread.sleep(1000);
			
			driver.switchTo().defaultContent();
			Thread.sleep(1000);
			
		    driver.findElement(By.xpath("//a[text()='Home']")).click();
			
			
			
		
		
	}

}
