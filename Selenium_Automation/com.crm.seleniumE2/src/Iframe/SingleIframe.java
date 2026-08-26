package Iframe;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class SingleIframe{
	
	public static void main(String[] args) throws InterruptedException {
		ChromeDriver driver = new ChromeDriver();
		
		driver.manage().window().maximize();
		Thread.sleep(2000);
		driver.get("https://demo.automationtesting.in/Frames.html	");
		Thread.sleep(2000);
		
		// we can not directly get the webele when it is in the frames 
//		driver.findElement(By.xpath("/html/body/section/div/div/div/input")).sendKeys("King");
//		System.out.println("Task is done");
		
		
		// we have to switch the frame from root to on which we want to perform opretaions
		// for that we use the method switchTo() with the iframe()
		// there is 3 ways to do it
		
		// 1. with the number or the frame start form 0(zero)
		Thread.sleep(1000);
		driver.switchTo().frame(0);
		driver.findElement(By.xpath("/html/body/section/div/div/div/input")).sendKeys("King");
		
		Thread.sleep(1000);
		Thread.sleep(1000);
		driver.switchTo().parentFrame();
		
		//2 . with the string it can be id or name
		Thread.sleep(1000);
		driver.switchTo().frame("singleframe");
		driver.findElement(By.xpath("/html/body/section/div/div/div/input")).sendKeys("King");
		
		Thread.sleep(1000);
		Thread.sleep(1000);
		driver.switchTo().parentFrame();
		//3. with the webelement which locates to that iframe
		Thread.sleep(1000);
		WebElement singleFrame = driver.findElement(By.id("singleframe"));
		driver.switchTo().frame(singleFrame);
		driver.findElement(By.xpath("/html/body/section/div/div/div/input")).sendKeys("King");
		
		Thread.sleep(1000);
		Thread.sleep(1000);
		driver.switchTo().parentFrame();
		Thread.sleep(1000);
		driver.close();
		
	}

}
