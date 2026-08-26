package ElementMethods;

import java.lang.module.FindException;
import java.sql.Driver;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;


public class DynamicTextElement {
	
	public static void main(String[] args) throws InterruptedException {
		ChromeDriver driver = new ChromeDriver();
		
		driver.manage().window().maximize();
		
		driver.get("https://demowebshop.tricentis.com/");
		Thread.sleep(2000);
		
		driver.findElement(By.xpath("/html/body/div[4]/div[1]/div[2]/ul[1]/li[5]/a")).click();
		WebElement bydependentpath = driver.findElement(By.xpath("//a[text()='3rd Album']/../following-sibling::div[3]/div/span"));
		Thread.sleep(2000);
		System.out.println(bydependentpath.getText());
		
		WebElement bydependentpath2 = driver.findElement(By.xpath("//a[text()='3rd Album']/../../../../following-sibling::div/div/div[1]/div[3]/div/span"));
		Thread.sleep(2000);
		System.out.println(bydependentpath2.getText());
		
		WebElement bydependentpath3 = driver.findElement(By.xpath("//a[text()='Music 2']/../following-sibling::div[3]/div/span"));
		Thread.sleep(2000);
		System.out.println(bydependentpath3.getText());
		
		
		driver.close();
	}
}
