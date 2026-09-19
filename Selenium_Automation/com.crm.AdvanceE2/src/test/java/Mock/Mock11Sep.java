package Mock;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.Test;

public class Mock11Sep {
	
	
	@Test
	public static void mock() throws InterruptedException {
		
		
		String expected_url = "https://www.makemytrip.com";
		
//	1. open browser
		WebDriver driver = new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		
		//Actions class 
		Actions act = new Actions(driver);
		
//	2. maximize the browser
		driver.manage().window().maximize();
//	3. enter into make my trip
		driver.get(expected_url);
		
		
		Thread.sleep(5000);
//	4. Avoid Popup
//		driver.findElement(By.className("commonModal__close")).click();
		driver.findElement(By.className("imageSlideContainer")).click();
		driver.findElement(By.xpath("//span[@data-cy='closeModal']")).click();
		
		
//	5. Select from location Pune
		driver.findElement(By.id("fromCity")).click();
		Thread.sleep(3000);
		
	//	6. Select to location Jaipur
		driver.findElement(By.xpath("//input[@placeholder='From']")).sendKeys("pune");
		driver.findElement(By.xpath("//span[text()='PNQ']")).click();
		
		
//	7. Select Depature Date today
		driver.findElement(By.id("toCity")).click();
		Thread.sleep(3000);
		driver.findElement(By.xpath("//input[@placeholder='To']")).sendKeys("jaiput");
		driver.findElement(By.xpath("//span[text()='JAI']")).click();
		
		Thread.sleep(3000);	
		
//	8. Select Return Date 120 days after
		
		Thread.sleep(3000);
		driver.close();
		
	}
//	9. Select Travellers Adult 2 and child 2
//	10. Select cabin class business class
//	11. Take screenshot of page
//	12. Click on search
//	13. Avoid popup
//	14. Scroll down and select air india flight with amount 37838
//	15. Click on book now
//	16. Take screenshot of page
//	17. Click on continue
//	18. Click on Book Now
//	19. Take Screen shot of page
//	20. Take Screen shot of logo
//	21. Close the browser
}
 