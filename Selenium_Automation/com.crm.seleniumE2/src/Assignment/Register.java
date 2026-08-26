package Assignment;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class Register {

	public static void main(String[] args) throws InterruptedException {
		
		ChromeDriver driver = new ChromeDriver();
		
		
//		1. Open 
//		2. Maximize
		driver.manage().window().maximize();
		
		driver.get("https://demowebshop.tricentis.com/");
		Thread.sleep(1000);
		
//		3. perform login
		driver.findElement(By.linkText("Register")).click();
		driver.findElement(By.id("gender-male")).click();
		driver.findElement(By.xpath("//*[@id=\"FirstName\"]")).sendKeys("Vivek");
		driver.findElement(By.xpath("//*[@id=\"LastName\"]")).sendKeys("Pawar");
		driver.findElement(By.xpath("//*[@id=\"Email\"]")).sendKeys("vivekpawar@gmail.com");
		driver.findElement(By.xpath("//*[@id=\"Password\"]")).sendKeys("King@3010");
		driver.findElement(By.xpath("//*[@id=\"ConfirmPassword\"]")).sendKeys("King@3010");
		driver.findElement(By.xpath("//*[@id=\"register-button\"]")).sendKeys("Vivek Pawar");
		//*[@id="register-button"]
		
		
		Thread.sleep(10000);
		
		driver.close();
		
		
		

	}

}
