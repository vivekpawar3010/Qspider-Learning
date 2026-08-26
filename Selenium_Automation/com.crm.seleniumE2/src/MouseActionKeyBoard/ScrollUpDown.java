package MouseActionKeyBoard;

import java.security.Key;

import org.bouncycastle.crypto.prng.ThreadedSeedGenerator;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class ScrollUpDown {

	public static void main(String[] args) throws InterruptedException {
		ChromeDriver driver = new ChromeDriver();
		
		driver.manage().window().maximize();
		
		driver.get("https://demowebshop.tricentis.com/");
		Thread.sleep(2000);
		
		Actions act = new Actions(driver);
		
//		WebElement facebook = driver.findElement(By.xpath("//a[text()='Facebook']"));
//		WebElement vote = driver.findElement(By.id("vote-poll-1"));
//		act.scrollToElement(facebook).perform();
//		Thread.sleep(2000);
//		act.scrollToElement(vote).perform();
//		Thread.sleep(2000);
//		
//		act.scrollByAmount(0, 500).perform();
//		Thread.sleep(2000);
//		
//		act.scrollByAmount(0, -100).perform();
//		Thread.sleep(2000);
//		
//		act.scrollByAmount(300, 0).perform();
//		Thread.sleep(2000);
//		
//		act.scrollByAmount(-200, 500).perform();
//		Thread.sleep(2000);
		
		
		
		// this is the keyboard functions
		act.keyDown(Keys.PAGE_DOWN).perform();
		Thread.sleep(2000);
		
		act.keyDown(Keys.PAGE_UP).perform();
		Thread.sleep(2000);
		
		
		
		
		driver.close();
		
		

	}

}
