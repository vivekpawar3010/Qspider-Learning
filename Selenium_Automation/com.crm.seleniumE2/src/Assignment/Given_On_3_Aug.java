package Assignment;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Given_On_3_Aug {

	public static void main(String[] args) throws InterruptedException {


		
	ChromeDriver driver = new ChromeDriver();
	
	driver.manage().window().maximize();
	
	driver.get("https://demoapps.qspiders.com/ui/");  // go to the ui page directly
	
	
	
	Actions act = new Actions(driver);
	Thread.sleep(1000);
	System.out.println("Doing Perrequisite actions");
	// open the drag and drop
	driver.findElement(By.xpath("//section[text()='Mouse Actions']")).click();
	Thread.sleep(1000);
	driver.findElement(By.xpath("//section[text()='Drag & Drop']")).click();
	Thread.sleep(2000);
	driver.findElement(By.xpath("//a[text()='Drag Position']")).click();
	Thread.sleep(2000);
	
	System.out.println("Starting with Task 1.2");
	Thread.sleep(2000);
	
	WebElement srcMobileCh = driver.findElement(By.xpath("//div[text()='Mobile Charger']"));
	WebElement srcMobileCo = driver.findElement(By.xpath("//div[text()='Mobile Cover']"));
	
	WebElement srcLaptopCh = driver.findElement(By.xpath("//div[text()='Laptop Charger']"));
	WebElement srcLaptopCo = driver.findElement(By.xpath("//div[text()='Laptop Cover']"));
	
	WebElement trgMobile = driver.findElement(By.xpath("//div[text()='Mobile Accessories']/.."));
	WebElement trgLaptop = driver.findElement(By.xpath("//div[text()='Laptop Accessories']/.."));
	
	act.dragAndDrop(srcLaptopCh, trgLaptop).perform();
	Thread.sleep(200);
	act.dragAndDrop(srcLaptopCo, trgLaptop).perform();
	Thread.sleep(200);
	act.dragAndDrop(srcMobileCh, trgMobile).perform();
	Thread.sleep(200);
	act.dragAndDrop(srcMobileCo, trgMobile).perform();
	Thread.sleep(200);
	System.out.println("Task 1.1 done");
	
	// multiple select and drag elements 
	
	System.out.println("Task 1.2 Start");
	
	driver.findElement(By.xpath("//a[text()='Drag Multiple']")).click();

	Thread.sleep(1000);

	WebElement source = driver.findElement(By.xpath("//div[@id=\"dragElement1\"]"));

	Thread.sleep(1000);
	
	WebElement source1 = driver.findElement(By.xpath("//div[@id=\"dragElement3\"]"));

	Thread.sleep(1000);

	
	WebElement desti = driver.findElement(By.xpath("//div[@id=\"dropZone2\"]"));

	Thread.sleep(1000);
	act.click(source).click(source1).dragAndDrop(source, desti).perform();

	act.perform();
	act.dragAndDrop(source1, desti).perform();

	Thread.sleep(1000);

	

	
	
	System.out.println("Task 1.1 Start");
	driver.findElement(By.xpath("//section[text()='Mouse Hover']")).click();
	Thread.sleep(1000);
	
	Actions hover = new Actions(driver);

	driver.findElement(By.xpath("//a[text()='Ratings']")).click();

	Thread.sleep(2000);
	WebElement rating1 =driver.findElement(By.xpath("(//label)[1]"));
	Thread.sleep(200);
	WebElement rating2 =driver.findElement(By.xpath("(//label)[2]"));
	Thread.sleep(200);
	WebElement rating3 =driver.findElement(By.xpath("(//label)[3]"));
	Thread.sleep(200);
	WebElement rating4 =driver.findElement(By.xpath("(//label)[4]"));

	Thread.sleep(2000);

	hover.moveToElement(rating1).moveToElement(rating2).moveToElement(rating3).moveToElement(rating4).perform();


	System.out.println("Task 2 done");

	
	System.out.println("Task 3 start");
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
