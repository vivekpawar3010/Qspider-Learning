package Basics;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;


public class RelativeXpath {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		ChromeDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://demowebshop.tricentis.com/");
		Thread.sleep(2000);	
		driver.findElement(By.xpath("//div[@class='header-links']/ul/li/a"));
		System.out.println("Element Found");
		WebElement ele=driver.findElement(By.className("ico-register"));
		System.out.println(ele.getText());
	}

}
