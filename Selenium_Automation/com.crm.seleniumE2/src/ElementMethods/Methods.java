package ElementMethods;

import java.lang.reflect.Executable;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Methods {
	public static void main(String[] args) throws InterruptedException {
		ChromeDriver driver = new ChromeDriver();
		
		driver.manage().window().maximize();
		
		driver.get("https://demowebshop.tricentis.com/");
		Thread.sleep(2000);
		
		
		WebElement excellent = driver.findElement(By.id("pollanswers-1"));
		
		System.out.println("Tag of element : " + excellent.getTagName());
		System.out.println("Attribute of element : " + excellent.getAttribute("value"));
		System.out.println("Text of element : " + excellent.getText());
		
		
		System.out.println("Check the enability : " + excellent.isEnabled());
		
		excellent.click();
		Thread.sleep(2000);
		System.out.println("Check Visibility : " + excellent.isDisplayed());
		System.out.println("Check is selected: " + excellent.isSelected());
		
		driver.close();
	}
}	
