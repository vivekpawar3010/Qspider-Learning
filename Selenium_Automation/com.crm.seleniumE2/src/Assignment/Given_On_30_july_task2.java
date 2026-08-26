package Assignment;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class Given_On_30_july_task2 {
	public static void main(String[] args) throws InterruptedException {
		
//		
//		Write the script for adding digital download product to the shopping cart 
		ChromeDriver driver = new ChromeDriver();
		
		
//		1. Open 
//		2. Maximize
		driver.manage().window().maximize();
		
		driver.get("https://demowebshop.tricentis.com/");
		Thread.sleep(1000);
		
//		3. perform login
		driver.findElement(By. ("Log in")).click();
		driver.findElement(By.xpath("//*[@id=\"Email\"]")).sendKeys("vivekpawar@gmail.com");
		driver.findElement(By.xpath("//*[@id=\"Password\"]")).sendKeys("King@3010");
		driver.findElement(By.xpath("/html/body/div[4]/div[1]/div[4]/div[2]/div/div[2]/div[1]/div[2]/div[2]/form/div[5]/input")).click();
		

//		5. Click digital download page section 
		
		driver.findElement(By.linkText("")).click();
		
//		6. Add all 3 product to the shopping cart 
		for(int i = 1; i < 4; i++) {
			driver.findElement(By.xpath("//input[@value = 'Add to cart']["+ i	 + "]")).click();
		}
//		7. After adding remove the shopping cart 
		
		
//		8. Perform log out 
		driver.findElement(By.linkText("Log out")).click();
		
//		9. Close 
		driver.close();
	}
}
