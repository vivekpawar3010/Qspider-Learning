package Basics;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class DynamicTextElement {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		ChromeDriver driver= new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://demowebshop.tricentis.com/");
		Thread.sleep(2000);
		driver.findElement(By.xpath("//a[contains(text(),'Digital downloads')]")).click();
		Thread.sleep(2000);
		WebElement ele=driver.findElement(By.xpath("//a[text()='3rd Album']/../following-sibling::div[3]/div/span"));
		System.out.println(ele.getText());
		Thread.sleep(2000);
		WebElement ele2=driver.findElement(By.xpath("//a[text()='Music 2']/../following-sibling::div[3]/div/span"));
		System.out.println(ele2.getText());
		Thread.sleep(2000);
		WebElement ele3=driver.findElement(By.xpath("(//a[text()='Music 2'])[2]/../following-sibling::div[3]/div/span"));
		System.out.println(ele3.getText());

		
		
	}

}
