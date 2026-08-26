package MouseActionKeyBoard;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class DoubleClick {

	public static void main(String[] args) throws InterruptedException {
		ChromeDriver driver = new ChromeDriver();
		
		driver.manage().window().maximize();
		
		driver.get("https://demo.guru99.com/test/simple_context_menu.html");
		
		Actions act = new Actions(driver);
		Thread.sleep(200);
			
		WebElement ele = driver.findElement(By.xpath("//*[@id=\"authentication\"]/button"));
		ele.click();
		act.doubleClick(ele).perform();
		
		System.out.println("Task is done");
		
		Thread.sleep(1000);
		Thread.sleep(1000);
		Thread.sleep(1000);
		driver.close();
		driver.close();
	}

}
