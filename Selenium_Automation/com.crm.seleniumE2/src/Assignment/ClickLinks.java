package Assignment;

import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;


public class ClickLinks {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		WebDriver driver= new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://demowebshop.tricentis.com/");
		Thread.sleep(2000);
		driver.findElement(By.className("ico-register")).click();
		Thread.sleep(1000);
		driver.findElement(By.className("ico-login")).click();
		Thread.sleep(1000);
		driver.findElement(By.className("cart-label")).click();
		Thread.sleep(1000);
		driver.findElement(By.className("ico-wishlist")).click();
		Thread.sleep(1000);
		driver.close();		
		

	}

}
