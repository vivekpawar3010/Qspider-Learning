package UtilityClasses;
import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

//import Uitility.DynamicName;

public class Assignment {

	public static void main(String[] args) throws InterruptedException {
		// enter to tyeh agodha application
		// provide todays date
		// in departure sectioon
		// provides 120 days pulise date in reseturn days sesciont 
		//clso broser
		// make the script dynamic

		WebDriver driver =  new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.agoda.com/en-in/?cid=1922885&tag=6f147157-60b8-459f-af1a-9935d44970e9&gclid=CjwKCAjwhZDUBhBGEiwAbi5bjgsarqTRWRW-s4qA5zLkG5OBFV8GcKZAcH-klSrhE8pY1LhK_lxlBhoCYZsQAvD_BwE&ds=Vkw070r6geA4vHx8");
//		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));

		driver.findElement(By.id("check-in-box")).click();

		String today = DynamicName.todayDate("MMM dd yyyy");
		String next = DynamicName.plusDate("MMM dd yyyy", 120);
		System.out.println(today);
		System.out.println(next);
		Thread.sleep(1000);
		
		driver.findElement(By.xpath("//div[contains(@aria-label,'"+today+"')]")).click();
		
		for(; ;)
		{
			try
			{
				driver.findElement(By.xpath("//div[contains(@aria-label,'"+next+"')]")).click();
				break;
			}
			catch (Exception e) {
				driver.findElement(By.xpath("//button[contains(@aria-label , 'Next Month')]")).click();
			}
		}
		
		Thread.sleep(3000);	
		
		driver.close();
	}

}