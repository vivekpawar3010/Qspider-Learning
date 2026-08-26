package ElementMethods;

import java.sql.Driver;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class WebScrapping {

	public static void main(String[] args) throws InterruptedException {
		ChromeDriver driver = new ChromeDriver();
		
		driver.manage().window().maximize();
		
		driver.get("https://demowebshop.tricentis.com/");
		Thread.sleep(2000);
		
		driver.findElement(By.xpath("/html/body/div[4]/div[1]/div[4]/div[2]/div[2]/div[1]/strong"));
		System.out.println("Element Found");
		
//		WebElement byxpath = driver.findElement(By.xpath("/html/body/div[4]/div[1]/div[4]/div[2]/div[2]/div[1]/strong"));
//		System.out.println(byxpath.getText());
//			
//		WebElement bylinkTest = driver.findElement(By.linkText("Tricentis"));
//		System.out.println(bylinkTest.getText());
//	
		
		

	}

}
