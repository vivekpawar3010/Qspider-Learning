package WithCollections;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import UtilityClasses.BaseClass;

public class FindElementsMethod extends BaseClass{

	public static void main(String[] args) throws InterruptedException {
		 
		precondition();
		
		// Common Attributes
	
		System.out.println("-------------Common Attributes-----------------------------");
		List<WebElement> polls = driver.findElements(By.name("pollanswers-1"));
		System.out.println(polls.size());
		
		for (WebElement poll : polls) {
			poll.click();
			Thread.sleep(1000);
		}
		
		System.out.println("--------------------------common parent------------------------------------");
		// Traversing from the common parent to the targeted element
		List<WebElement> polls2 = driver.findElements(By.cssSelector(".poll-options>li>input"));
		System.out.println(polls2.size());
		
		for (WebElement poll : polls2) {
			poll.click();
			Thread.sleep(1000);
		}
		
		postCondition();
	}

}
