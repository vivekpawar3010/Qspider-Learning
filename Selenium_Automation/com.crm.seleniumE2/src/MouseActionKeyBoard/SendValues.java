package MouseActionKeyBoard;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class SendValues {

	public static void main(String[] args) throws InterruptedException {
		ChromeDriver driver = new ChromeDriver();
		
		driver.manage().window().maximize();
		
		driver.get("https://demowebshop.tricentis.com/");
		Thread.sleep(2000);
		
		Actions act = new Actions(driver);
		
		WebElement serchIP = driver.findElement(By.id("small-searchterms"));
		
		act.sendKeys(serchIP, "computer").perform();
		Thread.sleep(2000);
		
		act.sendKeys(Keys.ARROW_DOWN).sendKeys(Keys.ARROW_DOWN).sendKeys(Keys.ENTER).perform();
		int n = 6;
		for(int i = 1; i <= n; i++) {
			act.sendKeys(Keys.TAB).perform();
			Thread.sleep(100);
		}
		act.sendKeys("computer");
		act.sendKeys(Keys.ARROW_DOWN).sendKeys(Keys.ARROW_DOWN).sendKeys(Keys.ENTER).perform();
		Thread.sleep(2000);
		driver.close();

	}

}
