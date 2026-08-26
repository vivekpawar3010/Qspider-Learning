package Assignment;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class AddDigitalDownloadProducts {

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
		driver.findElement(By.xpath("//div[@class='header-menu']/ul/li[5]/a")).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("(//input[@value='Add to cart'])[1]")).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("(//input[@value='Add to cart'])[2]")).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("(//input[@value='Add to cart'])[3]")).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("//span[contains(text(), 'Shopping cart')]")).click();
		Thread.sleep(2000);
//		driver.findElement(By.xpath("(//input[@name='removefromcart'])[1]")).click();
//		Thread.sleep(2000);
//		driver.findElement(By.xpath("(//input[@name='removefromcart'])[2]")).click();
//		Thread.sleep(2000);
//		driver.findElement(By.xpath("(//input[@name='removefromcart'])[3]")).click();
//		Thread.sleep(2000);
		for(int i=1; i<=3; i++)
		{
			driver.findElement(By.xpath("//input[@name='removefromcart']")).click();
			driver.findElement(By.xpath("//input[@name='updatecart']")).click();
		}
//		driver.findElement(By.xpath("//input[@name='updatecart']")).click();
		Thread.sleep(2000);
		driver.findElement(By.className("ico-logout")).click();
		Thread.sleep(2000);
		driver.close();




	}

}
