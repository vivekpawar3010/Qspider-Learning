package Assert_Codes;

import static org.testng.Assert.assertEquals;
import static org.testng.Assert.assertNotNull;
import static org.testng.Assert.assertNull;
import static org.testng.Assert.assertTrue;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

public class HardAndSoftAssert {
	@Test
	public void hardAssert() throws InterruptedException{
		String expected_url = "https://demowebshop.tricentis.com";
		ChromeDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
		
		driver.get(expected_url);
		String actual_url = driver.getCurrentUrl();
		soft.assertEquals(actual_url,  expected_url, "i am not dws");
		System.out.println("i am in dws");
		
		int a = 20, b = 1;
		
		soft.assertEquals(a,  b, "A and B is equals");
		System.out.println("A and B is Not Equala");
		
		int expected_count = 15;
		List<WebElement> tags = driver.findElements(By.xpath("//input"));
		int actual_count = tags.size();
		
		soft.assertTrue(actual_count == expected_count, "Count is not Equals");
		System.out.println("Count is eqals");;
		
		WebElement register = driver.findElement(By.className("ico-register"));
		soft.assertTrue(register.isEnabled(), "Not Enabled");
		System.out.println("Enabled");
		
		
		String contaier = null;
		
		soft.assertNotNull(contaier, "null");
		System.out.println("Not Null");
		
		soft.assertNull(contaier, "not null");
		System.out.println("null");
		
		soft.
		driver.close();
	}
}
