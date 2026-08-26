package WithCollections;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;

import UtilityClasses.BaseClass;

public class TaskWithoutSelectClass extends BaseClass{

	public static void main(String[] args) throws InterruptedException {
		
		
		precondition("file:///C:/.Qspider-Learning/Selenium_Automation/TestingFileDemos/demo.html");
		
		
		List<WebElement> options = driver.findElements(By.cssSelector("#standard_cars>option"));
		System.out.println(options.size());
		for (WebElement option : options) {
			option.click();
			Thread.sleep(1000);
		}
		
		WebElement sct = driver.findElement(By.id("standard_cars"));
		Select sel = new Select(sct);
//		int i = 0;
		List<WebElement> options2 = sel.getOptions();
		for (int i = 0; i < options2.size(); i++) {
			sel.selectByIndex(i);;
			Thread.sleep(1000);
		}
		Thread.sleep(1000);
		postCondition();

	}

}
