package WithCOnfingrations;
import org.openqa.selenium.By;
import org.testng.annotations.Test;

import Mock.BaseClass;

public class abcd extends BaseClass {
	
	@Test(priority = 0 , groups = "login")
	public void test1() {
		
		System.out.println("tc_001");
		driver.findElement(By.id("small-searchterms")).sendKeys("shoes");
	}
	
	@Test(priority = 1)
	public void test2() {
		System.out.println("tc_002");
		driver.findElement(By.id("small-searchterms")).sendKeys("shoes");
		
	}
	
	

}