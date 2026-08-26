package Assignment;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class CheapComputer {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		ChromeDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://demowebshop.tricentis.com/");
		Thread.sleep(2000);
		driver.findElement(By.xpath("//a[@class='ico-login']")).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("//input[@class='email']")).sendKeys("rishijoshi19122003@gmail.com");
		Thread.sleep(2000);
		driver.findElement(By.xpath("//input[@class='password']")).sendKeys("Rishi#1234");
		Thread.sleep(2000);
		driver.findElement(By.xpath("//input[@class='button-1 login-button']")).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("(//input[@class='button-2 product-box-add-to-cart-button'])[3]")).click();
		Thread.sleep(2000);
		driver.findElement(By.id("product_attribute_72_5_18_65")).click();
		Thread.sleep(2000);
		driver.findElement(By.id("product_attribute_72_6_19_91")).click();
		Thread.sleep(2000);
		driver.findElement(By.id("product_attribute_72_3_20_58")).click();
		Thread.sleep(2000);
		driver.findElement(By.id("product_attribute_72_8_30_94")).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("//div[@class='add-to-cart-panel']/input[2]")).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("//div[@class='header-links']/ul/li[3]/a")).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("//input[@name='removefromcart']")).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("//input[@name='updatecart']")).click();
		Thread.sleep(2000);
		driver.findElement(By.className("ico-logout")).click();
		Thread.sleep(2000);
		driver.close();
		
	
	}

}
