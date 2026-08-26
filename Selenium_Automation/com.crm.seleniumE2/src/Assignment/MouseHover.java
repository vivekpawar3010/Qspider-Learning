package Assignment;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class MouseHover {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		ChromeDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://demoapps.qspiders.com/ui/mouseHover/rating?sublist=2");
		Thread.sleep(2000);
		WebElement ele1=driver.findElement(By.xpath("(//div[@class='flex justify-center pt-2']/label)[1]"));
		WebElement ele2=driver.findElement(By.xpath("(//div[@class='flex justify-center pt-2']/label)[2]"));
		WebElement ele3=driver.findElement(By.xpath("(//div[@class='flex justify-center pt-2']/label)[3]"));
		WebElement ele4=driver.findElement(By.xpath("(//div[@class='flex justify-center pt-2']/label)[4]"));
		Actions ref = new Actions(driver);
		ref.moveToElement(ele4).perform();
		Thread.sleep(2000);
		driver.close();


		

	}

}
