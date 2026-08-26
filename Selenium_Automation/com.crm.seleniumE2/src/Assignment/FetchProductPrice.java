package Assignment;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class FetchProductPrice {

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
		for(int i=1;i<=6;i++) {
			WebElement name=driver.findElement(By.xpath("(//h2[@class='product-title']/a)"+"["+i+"]"));
			WebElement ele=driver.findElement(By.xpath("(//span[@class='price actual-price'])"+"["+i+"]"));
			System.out.println( "Price of "+name.getText()+" is: "+ele.getText());
		}
		driver.findElement(By.className("ico-logout")).click();
		Thread.sleep(2000);
		driver.close();

		
	}

}
