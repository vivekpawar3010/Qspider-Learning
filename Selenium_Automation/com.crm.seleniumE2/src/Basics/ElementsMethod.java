package Basics;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class ElementsMethod {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		ChromeDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://demowebshop.tricentis.com/");
		Thread.sleep(2000);
		WebElement ele= driver.findElement(By.id("pollanswers-1"));
		System.out.println(ele.getTagName());
		System.out.println(ele.getAttribute("type"));
		System.out.println(ele.getText());
		System.out.println(ele.isEnabled());
		ele.click();
		Thread.sleep(2000);
		System.out.println(ele.isEnabled());
		System.out.println(ele.isSelected());
		System.out.println(ele.isDisplayed());
		
		

	}

}
