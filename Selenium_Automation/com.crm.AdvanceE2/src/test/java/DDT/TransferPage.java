package DDT;

import java.time.Duration;
import java.util.List;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.Test;

public class TransferPage {

	@Test
	public static void task() throws InterruptedException {
		WebDriver driver = new ChromeDriver();

		driver.manage().window().maximize();

		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));

		driver.get("https://demowebshop.tricentis.com/");


		Actions act = new Actions(driver);
		
		WebElement facebook = driver.findElement(By.xpath("//a[text()='Facebook']"));
		act.scrollToElement(facebook).perform();
		facebook.click();
		Thread.sleep(1000);
		
		
		WebElement x = driver.findElement(By.xpath("//a[text()='Twitter']"));
		x.click();
		Thread.sleep(1000);
		
		
		WebElement youtube = driver.findElement(By.xpath("//a[text()='YouTube']"));
		youtube.click();
		Thread.sleep(1000);
		
		
		WebElement google = driver.findElement(By.xpath("//a[text()='Google+']"));
		google.click();
		Thread.sleep(1000);


		Set<String> tabs = driver.getWindowHandles();
		String youtubr_url = "https://www.youtube.com/user/nopCommerce";
		String facebook_url = "https://www.facebook.com/nopCommerce";
		String twitter_url = "https://x.com/nopCommerce";
		String google_url = "https://workspaceupdates.googleblog.com/2023/04/new-community-features-for-google-chat-and-an-update-currents%20.html";

		for (String tab : tabs) {
			driver.switchTo().window(tab);
			String actaul_url = driver.getCurrentUrl();
			System.out.println(actaul_url);

			if (youtubr_url.equals(actaul_url)) {
				
				Thread.sleep(1000);
				driver.findElement(By.name("search_query")).sendKeys("my beast", Keys.ENTER);
				Thread.sleep(1000);
				System.out.println("task done:- Youtube");
			} else if (facebook_url.equals(actaul_url)) {
				
				driver.findElement(By.xpath("(//input[@name='email'])[2]")).sendKeys("faceBook@gmail.com");
				Thread.sleep(1000);
				driver.findElement(By.xpath("(//input[@type='password'])[2]")).sendKeys("facebookpass@1212");
				Thread.sleep(1000);
				driver.findElement(By.xpath("//div[@aria-label='Log in to Facebook']")).click();
				Thread.sleep(1000);
				System.out.println("task done:- Facebook");
			} else if (twitter_url.equals(actaul_url)) {

				driver.findElement(By.linkText("Continue to X")).click();
				Thread.sleep(1000);
				driver.findElement(By.xpath("//input[@autocomplete='username webauthn']")).sendKeys("x@gmail.com");
				System.out.println("task done - twitter");
			} else if (google_url.equals(actaul_url)) {
				
				driver.findElement(By.className("header__search")).sendKeys("King", Keys.ENTER);
				Thread.sleep(1000);
				System.out.println("task done:- Google");
			}

			Thread.sleep(1000);
		}

		Thread.sleep(1000);
		driver.quit();
	}
}
