package Assignment;

public class Test {

}
package Assignments;

import java.lang.module.FindException;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Assignment_7 {

	public static void main(String[] args) throws InterruptedException {
		
		
		ChromeDriver driver = new ChromeDriver(); 
		
		driver.manage().window().maximize();
		
		Thread.sleep(1000);
		
		driver.get("https://demoapps.qspiders.com/");
		
		Thread.sleep(1000);
		
		
	
		// drag drop 
		
		driver.findElement(By.xpath("//main[@data-aos=\"zoom-in\"]")).click();
		
		Thread.sleep(1000);
		
		driver.findElement(By.xpath("(//section[@class=\"poppins text-[15px]\"])[8]")).click();
		
		Thread.sleep(1000);
		
		
		driver.findElement(By.xpath("//section[@class=\"poppins text-[14px]\"]")).click();

		Thread.sleep(1000);
//	
		WebElement drag = driver.findElement(By.xpath("//div[text()='Drag Me']"));
//
		Actions act = new Actions(driver);
//
		act.dragAndDropBy(drag, 200, 100).perform();
		act.dragAndDropBy(drag, -400, 20).perform();
		act.dragAndDropBy(drag, -400, -200).perform();
		act.dragAndDropBy(drag, 400, -200).perform();
		
//		----------------------------------------------------------------------------------------------------------------
		
		// multiple select and drag elements 
		
		driver.findElement(By.xpath("//a[text()='Drag Multiple']")).click();
//		
		Thread.sleep(1000);
//
//		
		WebElement source = driver.findElement(By.xpath("//div[@id=\"dragElement1\"]"));
//		
		Thread.sleep(1000);
//		
		WebElement source1 = driver.findElement(By.xpath("//div[@id=\"dragElement3\"]"));
//
		Thread.sleep(1000);
//
//
//		
		WebElement desti = driver.findElement(By.xpath("//div[@id=\"dropZone2\"]"));
//
		Thread.sleep(1000);
//
		act.click(source).click(source1).dragAndDrop(source, desti).perform();
//		
		act.perform();
		act.dragAndDrop(source1, desti).perform();
//
		Thread.sleep(1000);

		
//		----------------------------------------------------------------------
		
		// hover rating star 
		
		
		
		driver.findElement(By.xpath("//section[text()='Mouse Hover']")).click();
//	
		Thread.sleep(1000);
//		
		Actions hover = new Actions(driver);
//	
		driver.findElement(By.xpath("//a[text()='Ratings']")).click();
//		
		Thread.sleep(2000);
		WebElement rating1 =driver.findElement(By.xpath("(//label)[1]"));
//		
		WebElement rating2 =driver.findElement(By.xpath("(//label)[2]"));
//		
		WebElement rating3 =driver.findElement(By.xpath("(//label)[3]"));
//
		WebElement rating4 =driver.findElement(By.xpath("(//label)[4]"));
//	
		Thread.sleep(2000);
//
		hover.moveToElement(rating1).moveToElement(rating2).moveToElement(rating3).moveToElement(rating4).perform();
//	
//		
		
//		-------------------------------------------------------------------------
// click and hold 
		
		
		driver.findElement(By.xpath("//section[text()='Click & Hold']")).click();
		
		Thread.sleep(1000);
		
		WebElement hold = driver.findElement(By.xpath("//div[@id=\"circle\"]"));
		
		Thread.sleep(1000);
		
		Actions ele = new Actions(driver);
		
		Thread.sleep(1000);
		
		ele.clickAndHold(hold).perform();
		

		Thread.sleep(2000);
		
		ele.release(hold).perform();
		
		Thread.sleep(2000);
		
		driver.close();
		
		
	}

}