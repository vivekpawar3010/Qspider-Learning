package Handle_mutiple_Tabs;

import java.time.Duration;
import java.util.Iterator;
import java.util.List;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.Test;

public class ChildBrowserPopUps {
	@Test(enabled = false)
	public void singleChild() throws InterruptedException {
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.get("https://demowebshop.tricentis.com/");
		
		String parent_handle = driver.getWindowHandle();
		System.out.println(parent_handle);
		
		Actions act = new Actions(driver);
		WebElement facebook = driver.findElement(By.xpath("//a[text()='Facebook']"));
		act.scrollToElement(facebook).click(facebook).perform();
		
		Set<String> allHandle = driver.getWindowHandles();
		System.out.println(allHandle); 	
		for (String handle : allHandle) {
			driver.switchTo().window(handle);
			Thread.sleep(1000);
			
		}
		
		driver.findElement(By.xpath("//div[@aria-label='Create new account']")).click();
		
	}
	
	@Test()
	public static void multipleChild() throws InterruptedException {
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.get("https://demowebshop.tricentis.com/");
		String expected_url = "https://www.youtube.com/user/nopCommerce";
		String parent_handle = driver.getWindowHandle();
		System.out.println(parent_handle);
		
		Actions act = new Actions(driver);
		List<WebElement> links = driver.findElements(By.xpath("//a[@target='_blank']"));
		act.keyDown(Keys.PAGE_DOWN).keyDown(Keys.PAGE_DOWN).perform();
		for (WebElement link : links) {
			link.click();
			Thread.sleep(1000);
		}
		
		
		Set<String> allHandle = driver.getWindowHandles();
		System.out.println(allHandle); 	
		for (String handle : allHandle) {
			driver.switchTo().window(handle);
			String actual_url = driver.getCurrentUrl();
			
			if(expected_url.equals(actual_url)) {
				Thread.sleep(1000);
				driver.findElement(By.name("search_query")).sendKeys("mrbeast", Keys.ENTER);
				Thread.sleep(2000);
				break;
			}
			Thread.sleep(2000);
			
		}
		Thread.sleep(2000);
		driver.quit();
	}
}
