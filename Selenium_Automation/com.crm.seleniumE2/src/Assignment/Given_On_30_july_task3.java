package Assignment;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Given_On_30_july_task3 {

	public static void main(String[] args) throws InterruptedException {
//		Write the script for fetching the price in home page 
		ChromeDriver driver = new ChromeDriver();
		
		
//		1. Open 
//		2. Maximize
		driver.manage().window().maximize();
		
		driver.get("https://demowebshop.tricentis.com/");
		Thread.sleep(1000);
		
//		3. perform login
		driver.findElement(By.linkText("Log in")).click();
		driver.findElement(By.xpath("//*[@id=\"Email\"]")).sendKeys("vivekpawar@gmail.com");
		driver.findElement(By.xpath("//*[@id=\"Password\"]")).sendKeys("King@3010");
		driver.findElement(By.xpath("/html/body/div[4]/div[1]/div[4]/div[2]/div/div[2]/div[1]/div[2]/div[2]/form/div[5]/input")).click();
		

//		5. Fetch all product price  one by one from the home page 
		int i = 1;
		while(i<=6)
		{
		WebElement price = driver.findElement(By.xpath("(//span[@class=\"price actual-price\"])"+"["+i+"]"));
		System.out.println("price "+i+" product "+price.getText());
		i++;
		Thread.sleep(1000);
		}
		
//		6. Logout 
		Thread.sleep(2000);
		driver.findElement(By.linkText("Log out")).click();
		
		
		Thread.sleep(2000);
//	Close
		driver.close();

	}

}