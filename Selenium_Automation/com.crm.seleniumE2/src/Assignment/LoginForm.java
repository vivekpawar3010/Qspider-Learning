package Assignment;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class LoginForm {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		ChromeDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://demowebshop.tricentis.com/");
		Thread.sleep(2000);
		driver.findElement(By.linkText("Log in")).click();
		Thread.sleep(2000);
		driver.findElement(By.id("Email")).sendKeys("rishijoshi19122003@gmail.com");
		Thread.sleep(2000);
		driver.findElement(By.id("Password")).sendKeys("Rishi#1234");
		Thread.sleep(2000);
		driver.findElement(By.id("RememberMe")).click();
		Thread.sleep(2000);
		driver.findElement(By.cssSelector("input[value='Log in']")).click();
		Thread.sleep(2000);
		driver.close();
		

	}

}
