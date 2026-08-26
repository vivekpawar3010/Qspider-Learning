package Assignment;

import org.openqa.selenium.chrome.ChromeDriver;

public class RedBusNavigation {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		ChromeDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.redbus.in/");
		Thread.sleep(3000);
		driver.navigate().to("https://www.chennaisuperkings.com/");
		Thread.sleep(3000);
		driver.navigate().refresh();
		Thread.sleep(2000);
		driver.navigate().back();
		Thread.sleep(2000);
		driver.navigate().forward();
		Thread.sleep(2000);
		driver.navigate().refresh();
		Thread.sleep(1000);
		driver.quit();
	}

}
