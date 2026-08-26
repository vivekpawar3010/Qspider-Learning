package Assignment;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class ClickAndHold {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		ChromeDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://demoapps.qspiders.com/ui/clickHold?sublist=0");
		Thread.sleep(2000);
		WebElement target=driver.findElement(By.id("circle"));
		Actions ref=new Actions(driver);
		ref.clickAndHold(target).perform();
		Thread.sleep(2000);
		ref.release(target).perform();
		Thread.sleep(2000);
		driver.close();
	}

}
