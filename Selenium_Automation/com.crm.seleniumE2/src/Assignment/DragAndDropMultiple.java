package Assignment;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class DragAndDropMultiple {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		ChromeDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://demoapps.qspiders.com/ui/dragDrop/dragToMultiple?sublist=3");
		Thread.sleep(2000);
		Actions ref = new Actions(driver);
		WebElement src1= driver.findElement(By.xpath("//div[text()='Mobile Charger']"));
		WebElement dest1= driver.findElement(By.xpath("(//div[contains(@class, 'drop-column')])[1]"));
		WebElement dest2= driver.findElement(By.xpath("(//div[contains(@class, 'drop-column')])[2]"));
		WebElement src2= driver.findElement(By.xpath("//div[text()='Laptop Charger']"));
		WebElement src3= driver.findElement(By.xpath("//div[text()='Mobile Cover']"));
		WebElement src4= driver.findElement(By.xpath("//div[text()='Laptop Cover']"));
//		src1.click();
//		Thread.sleep(1000);
//		src3.click();
//		Thread.sleep(1000);
//		ref.dragAndDrop(src1,dest1).perform();
		
		ref.click(src1).click(src3).dragAndDrop(src1, dest1).perform();
		Thread.sleep(2000);
		ref.click(src2).click(src4).dragAndDrop(src2,dest2).perform();
		driver.close();

	}

}
