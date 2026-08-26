package Assignment;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class RegisterForm {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		ChromeDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://demowebshop.tricentis.com/");
		Thread.sleep(2000);
		driver.findElement(By.className("ico-register")).click();
		Thread.sleep(2000);
		driver.findElement(By.id("gender-male")).click();
		Thread.sleep(2000);
		driver.findElement(By.cssSelector("#FirstName")).sendKeys("Rishi");
		Thread.sleep(2000);
		driver.findElement(By.cssSelector("#LastName")).sendKeys("Joshi");
		Thread.sleep(2000);
		driver.findElement(By.cssSelector("#Email")).sendKeys("rishijoshi19122003@gmail.com");
		Thread.sleep(2000);
		driver.findElement(By.id("Password")).sendKeys("Rishi#1234");
		Thread.sleep(2000);
		driver.findElement(By.id("ConfirmPassword")).sendKeys("Rishi#1234");
		Thread.sleep(2000);
		driver.findElement(By.cssSelector("input[name='register-button']")).click();
		Thread.sleep(2000);
		driver.close();		
		
		
	}

}
