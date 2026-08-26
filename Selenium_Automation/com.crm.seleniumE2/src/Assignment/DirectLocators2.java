package Assignment;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class DirectLocators2 {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://demowebshop.tricentis.com/");
		Thread.sleep(2000);
//		driver.findElement(By.name("q")).sendKeys("laptop");
//		Thread.sleep(2000);
//		driver.findElement(By.className("button-1")).click();
//		Thread.sleep(1000);
//		driver.navigate().back();
//		Thread.sleep(1000);
//		driver.findElement(By.id("pollanswers-1")).click();
//		Thread.sleep(2000);
//		driver.findElement(By.linkText("Digital downloads")).click();
//		Thread.sleep(2000);
//		driver.findElement(By.partialLinkText("Jew")).click();
//		Thread.sleep(2000);
		
//		driver.findElement(By.cssSelector("input[value='Search']")).click();
//		Thread.sleep(2000);
		driver.findElement(By.cssSelector("#small-searchterms")).sendKeys("Watches");
		Thread.sleep(2000);
		driver.findElement(By.cssSelector(".button-1.search-box-button")).click();
		Thread.sleep(2000);

		driver.close();		

	}

}
