package Assignment;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class ClickDwsFooterLink {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		ChromeDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://demowebshop.tricentis.com/");
		Thread.sleep(1000);
		driver.findElement(By.xpath("//a[text()='Facebook']")).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("//a[text()='Twitter']")).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("//a[text()='RSS']")).click();
		driver.navigate().back();
		
		Thread.sleep(2000);
		driver.findElement(By.xpath("//a[text()='YouTube']")).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("//a[text()='Google+']")).click();
		Thread.sleep(2000);
		driver.quit();


		
		

	}

}
