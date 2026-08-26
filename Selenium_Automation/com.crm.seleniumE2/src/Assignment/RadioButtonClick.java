package Assignment;

import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class RadioButtonClick {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://demowebshop.tricentis.com/");
		Thread.sleep(2000);
		driver.findElement(By.id("pollanswers-1")).click();
		Thread.sleep(2000);
		driver.findElement(By.id("pollanswers-2")).click();
		Thread.sleep(2000);
		driver.findElement(By.id("pollanswers-3")).click();
		Thread.sleep(2000);
		driver.findElement(By.id("pollanswers-4")).click();
		Thread.sleep(2000);
		driver.close();
		

	}

}
