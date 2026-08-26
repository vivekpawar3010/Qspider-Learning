package MouseActionKeyBoard;


import java.awt.dnd.DropTargetAdapter;

import javax.swing.text.html.HTML.Tag;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class MoverHover {

	
	public static void main(String[] args) throws InterruptedException {
		
		ChromeDriver driver = new ChromeDriver();
		
		driver.manage().window().maximize();
		
		driver.get("https://www.myntra.com/");
		
		Actions act = new Actions(driver);
		Thread.sleep(2000);
		
		WebElement target = driver.findElement(By.cssSelector("a[data-group='genz']"));
				
		WebElement tshirt = driver.findElement(By.linkText("T-shirts Under ₹299"));
//		act.moveToElement(target).delayVivek(target).click(tshirt);
		Thread.sleep(2000);	
		tshirt.click();
		Thread.sleep(2000);
		driver.close();

	}
	
//	public static WebElement delayVivek(WebElement ele) throws InterruptedException {
//		Thread.sleep(2000);
//		return ele;
//	}

}
