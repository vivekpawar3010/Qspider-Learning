package MouseActionKeyBoard;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class RightClick {
	public static void main(String[] args) throws InterruptedException {
		ChromeDriver driver = new ChromeDriver();
		
		driver.manage().window().maximize();
		
		driver.get("https://demo.guru99.com/test/simple_context_menu.html");
		
		Actions act = new Actions(driver);
		Thread.sleep(200);
			
		WebElement ele = driver.findElement(By.xpath("//*[@id=\"authentication\"]/span"));
		act.contextClick(ele).perform();
		
		WebElement ele2 = driver.findElement(By.xpath("//*[@id=\"authentication\"]/ul/li[3]/span"));
		ele2.click();
		System.out.println("this is done");
//		WebElement eel2 = driver.findElement(By.xpath("//span[text()='copy']")).click();
		Thread.sleep(1000);
		
		driver.close();	
	}
}
