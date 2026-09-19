package HomePage;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;

@Listeners(com.crm.Listeners.Example.class)
public class CricketTeams {

	@Test(groups = "regrassion")
	public static void rcb() {
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.royalchallengers.com/");
		
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		System.out.println("Task Done ---" + driver.getTitle());
		driver.close();
	}
	
		

	@Test(groups = "regrassion")
	public static void mi() {
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.mumbaiindi`dans.com/");
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		
		System.out.println("Task Done ---" + driver.getTitle());
		driver.close();
	}
	@Test(groups = "regrassion")
	public static void csk() {
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.chennaisuperkings.com/");
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		
		System.out.println("Task Done ---" + driver.getTitle());
		driver.close();
	}
	
}
