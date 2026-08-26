package MouseActionKeyBoard;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class DragAndDrop {

	public static void main(String[] args) throws InterruptedException {
		
		
			
		ChromeDriver driver = new ChromeDriver();
		
		driver.manage().window().maximize();
		
		driver.get("https://demo.automationtesting.in/Dynamic.html");
		
		Actions act = new Actions(driver);
		Thread.sleep(2000);
		
		WebElement source1 = driver.findElement(By.id("angular"));
		WebElement target = driver.findElement(By.id("droparea"));
		
//		act.dragAndDrop(source1, target).perform();
////		Thread.sleep(2000);
////		Thread.sleep(2000);
//		Thread.sleep(200);
//		WebElement source2 = driver.findElement(By.id("mongo"));
//		WebElement source3	 = driver.findElement(By.id("mode"));
//		act.dragAndDrop(source2, target).perform();
//		Thread.sleep(200);
////		Thread.sleep(2000);
////		Thread.sleep(2000);
//		act.dragAndDrop(source3, target).perform();
////		Thread.sleep(2000);
////		Thread.sleep(2000);
//		Thread.sleep(200);
		
		act.
		System.out.println("Task done");
		driver.close();

	}

}
