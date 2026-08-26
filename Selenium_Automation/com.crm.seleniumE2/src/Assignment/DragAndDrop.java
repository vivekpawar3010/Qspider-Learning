package Assignment;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class DragAndDrop {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		ChromeDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://demoapps.qspiders.com/ui/dragDrop/dragToCorrect?sublist=2");
		Thread.sleep(2000);
		Actions ref = new Actions(driver);
		WebElement src1= driver.findElement(By.xpath("//div[text()='Mobile Charger']"));
		WebElement dest1= driver.findElement(By.xpath("(//div[contains(@class, 'drop-column')])[1]"));
		WebElement dest2= driver.findElement(By.xpath("(//div[contains(@class, 'drop-column')])[2]"));
		WebElement src2= driver.findElement(By.xpath("//div[text()='Laptop Charger']"));
		WebElement src3= driver.findElement(By.xpath("//div[text()='Mobile Cover']"));
		WebElement src4= driver.findElement(By.xpath("//div[text()='Laptop Cover']"));
		
		ref.dragAndDrop(src1, dest1).perform();
		Thread.sleep(2000);
		ref.dragAndDrop(src3, dest1).perform();
		Thread.sleep(2000);
		ref.dragAndDrop(src2, dest2).perform();
		Thread.sleep(2000);
		ref.dragAndDrop(src4, dest2).perform();
		Thread.sleep(1000);
		driver.close();

		
		
	}

}
