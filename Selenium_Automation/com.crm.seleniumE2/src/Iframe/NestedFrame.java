package Iframe;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class NestedFrame {

	public static void main(String[] args) throws InterruptedException {
		ChromeDriver driver = new ChromeDriver();
		
		driver.manage().window().maximize();
		Thread.sleep(2000);
		driver.get("https://demo.automationtesting.in/Frames.html	");
		Thread.sleep(2000);

		
		driver.findElement(By.linkText("Iframe with in an Iframe")).click();
		// to go in the nested iframe
		Thread.sleep(1000);
		driver.switchTo().frame(1);
		driver.switchTo().frame(0);
		driver.findElement(By.xpath("/html/body/section/div/div/div/input")).sendKeys("King");
		
//		Thread.sleep(1000);
//		Thread.sleep(1000);
//		driver.switchTo().parentFrame();
//		
//		Thread.sleep(1000);
//		Thread.sleep(1000);
//		driver.switchTo().parentFrame();

		
		Thread.sleep(1000);
		Thread.sleep(1000);
		driver.switchTo().defaultContent();  // directly go to the main page we started
		driver.findElement(By.linkText("Home")).click();


	}

}
