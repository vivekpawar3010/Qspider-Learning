package Assignment;



import java.io.File;
import java.io.IOException;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.io.FileHandler;

public class RedBusScreenShot {

	public static void main(String[] args) throws InterruptedException, IOException {
		// TODO Auto-generated method stub
		WebDriver driver= new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.redbus.in/");
		driver.findElement(By.id("srcinput")).sendKeys("Pune");
		Thread.sleep(2000);
		Actions ref= new Actions(driver);
		for(int i=0;i<3;i++) {
		ref.keyDown(Keys.ARROW_DOWN).perform();

		}
		ref.keyDown(Keys.ENTER).perform();
		
		WebElement dest=driver.findElement(By.id("destinput"));
		ref.sendKeys(dest, "Mumbai").perform();
		Thread.sleep(2000);
		for(int i=0;i<3;i++) {
			ref.keyDown(Keys.ARROW_DOWN).perform();

			}
		ref.keyDown(Keys.ENTER).perform();
		Thread.sleep(2000);
		driver.findElement(By.xpath("//button[@aria-label='Search buses']")).click();
		Thread.sleep(2000);
		
		TakesScreenshot ts=(TakesScreenshot) driver;
		File screenshot=ts.getScreenshotAs(OutputType.FILE);
		File location=new File("D:\\Automation\\com.crm.seleniumE2\\src\\Assignment\\redbus.png");
		FileHandler.copy(screenshot, location);
		Thread.sleep(1000);
		driver.close();
		
		

		
		
		
		
		}
	
		

}
