package WithCollections;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;

import UtilityClasses.BaseClass;

public class DemoNavbar extends BaseClass{

	public static void main(String[] args) throws InterruptedException {
		
		precondition();
		
		WebElement single = driver.findElement(By.cssSelector(".header-links"));
//		single.click();
		
//		Thread.sleep(10000);''
		Select demo = new Select(single);

		 List<WebElement> opt =demo.getOptions();
		
		 System.out.println(opt.size());
	 	 
		 for(int i= 0;i<opt.size();i++)
		 {
			 single = driver.findElement(By.cssSelector(".header-links"));  // reinnitialize when the paeg get reload 
			 demo = new Select(single);

			 
			 demo.selectByIndex(i);
			 System.out.println(i + 1);
			 
			 Thread.sleep(2000);

		 }
		
		Thread.sleep(1000);
		postCondition();

	}

}
