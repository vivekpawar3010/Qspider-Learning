package PopUps;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;

import org.bouncycastle.jcajce.provider.asymmetric.EC;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class Calender {
	public static void main(String[] args) {
		
		
		 LocalDate todayDate = LocalDate.now();
	        System.out.println("today : " + todayDate);

	        LocalDate plusDate = todayDate.plusDays(120);
	        System.out.println("120 days : " + plusDate);

	        System.out.println("**************** after format**************");

	        DateTimeFormatter formatter =
	                DateTimeFormatter.ofPattern("dd/MM/yyyy");

	        String today = todayDate.format(formatter);
	        String plus120 = plusDate.format(formatter);

	        System.out.println("today :" + today);
	        System.out.println("plus120 :" + plus120);


	        ChromeOptions options = new ChromeOptions();
	        options.addArguments("--disable-notifications");

	        WebDriver driver = new ChromeDriver(options);

	        driver.manage().window().maximize();

	        driver.get("https://www.easemytrip.com/");

	        driver.findElement(By.id("ddate")).click();

	        driver.findElement(
	            By.xpath("//li[contains(@id, '" + today + "')]")
	        ).click();

	        driver.findElement(By.id("divRtnCal")).click();
	        
	        for(;;) {
	        	try {
	        		driver.findElement(By.xpath("//li[contains(@id, '" + plus120  + "')]"));
	        		break;
	        	} catch (Exception e){
	        		driver.findElement(By.id("img2Nex")).click();
	        	}
	        }
	        
	        driver.close();
		
	}
}
