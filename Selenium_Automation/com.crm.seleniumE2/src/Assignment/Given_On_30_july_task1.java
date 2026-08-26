package Assignment;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class Given_On_30_july_task1 {

	public static void main(String[] args) throws InterruptedException {
		ChromeDriver driver
		= new ChromeDriver();
		
		
//		1. Open 
//		2. Maximize
		driver.manage().window().maximize();
		
		driver.get("https://demowebshop.tricentis.com/");
		Thread.sleep(1000);
		
//		3. perform login
		driver.findElement(By.linkText("Log in")).click();
		driver.findElement(By.	("//*[@id=\"Email\"]")).sendKeys("vivekpawar@gmail.com");
		driver.findElement(By.xpath("//*[@id=\"Password\"]")).sendKeys("King@3010");
		driver.findElement(By.xpath("/html/body/div[4]/div[1]/div[4]/div[2]/div/div[2]/div[1]/div[2]/div[2]/form/div[5]/input")).click();
		Thread.sleep(4000);
		//*[@id="Email"]
		//*[@id="Password"]
		driver.findElement(By.)
		//*[@id="register-button"]
		
		
		
		
//		4. Add your old cheep computer product from the home page to the shopping cart
//		driver.findElement(By.xpath("//a[text()='Build your own cheap computer']/../following-sibling::div[3]/div[2]/input")).click();
		driver.findElement(By.linkText("Build your own cheap computer")).click();

//		5. Configure with high feature then add into shopping cart 
		driver.findElement(By.id("product_attribute_72_5_18_65")).click();
		driver.findElement(By.id("product_attribute_72_6_19_91")).click();
		driver.findElement(By.id("product_attribute_72_3_20_58")).click();
		driver.findElement(By.id("product_attribute_72_8_30_93")).click();
		driver.findElement(By.id("product_attribute_72_8_30_94")).click();
		driver.findElement(By.id("product_attribute_72_8_30_95")).click();
		
		Thread.sleep(4000);
		// adding to the cart
		driver.findElement(By.id("add-to-cart-button-72")).click();
		
		Thread.sleep(4000);
		//*[@id="product-details-form"]/div/div[1]/div[2]/div[6]/dl/dd[1]/ul/li[3]/label
//		6. After adding the product remove the product from the shopping cart 
		driver.findElement(By.xpath("//*[@id=\"topcartlink\"]/a")).click();
		driver.findElement(By.xpath("//span[text()='Remove:']/../input")).click();
		driver.findElement(By.xpath("/html/body/div[4]/div[1]/div[4]/div/div/div[2]/div/form/div[1]/div/input[1]")).click	();
		
		Thread.sleep(4000);
//		7. Perform log out 
		driver.findElement(By.linkText("Log out")).click();
		
		

		
		Thread.sleep(4000);
		
//		8. Close the browser
		driver.close();

	}

}
