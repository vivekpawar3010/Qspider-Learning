package WithCollections;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class DemoTask {

	public static void main(String[] args) throws InterruptedException {
ChromeDriver driver = new ChromeDriver();
		
		driver.get("https://demowebshop.tricentis.com/");
		driver.manage().window().maximize();
		
		Thread.sleep(1000);
		
		driver.findElement(By.partialLinkText("Digital")).click();
		
		WebElement single = driver.findElement(By.id("products-orderby"));
		
		Select demo = new Select(single);

		 List<WebElement> opt =demo.getOptions();
		
		 System.out.println(opt.size());
	 	 
		 for(int i= 0;i<opt.size();i++)
		 {
			 single = driver.findElement(By.id("products-orderby"));  // reinnitialize when the paeg get reload 
			 demo = new Select(single);

			 
			 demo.selectByIndex(i);
			 System.out.println(i + 1);
			 
			 Thread.sleep(2000);

		 }
	}

}