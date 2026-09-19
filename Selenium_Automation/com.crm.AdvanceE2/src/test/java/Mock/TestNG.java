package Mock;

import java.util.ArrayList;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.WindowType;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.Test;

import io.opentelemetry.exporter.logging.SystemOutLogRecordExporter;

public class TestNG extends BaseClass{

	
	@Test(priority = 0, enabled = true)
	public void Task1() throws InterruptedException{
		preCondition();
		Thread.sleep(1000);
		login();
		Thread.sleep(1000);
		/////////////////////////////////////////////////////////////////////////////////////////////////////////////

		
		Actions act = new Actions(driver);
		WebElement card = driver.findElement(By.linkText("$25 Virtual Gift Card"));
		act.scrollToElement(card).perform();
		card.click();
		
		driver.findElement(By.id("giftcard_2_RecipientName")).sendKeys("king");
		Thread.sleep(500);
		driver.findElement(By.id("giftcard_2_RecipientEmail")).sendKeys("king@gmail.com");
		
		Thread.sleep(500);
		
		driver.findElement(By.id("giftcard_2_Message")).sendKeys("this is text msg!");
		Thread.sleep(500);
		
		driver.findElement(By.id("addtocart_2_EnteredQuantity")).clear();
		driver.findElement(By.id("addtocart_2_EnteredQuantity")).sendKeys("2");
		Thread.sleep(500);
		driver.findElement(By.id("add-to-cart-button-2")).click();
		
		Thread.sleep(3000);
		
		System.out.println("Element Succces fully added");
		
		// going to the cart page
		driver.findElement(By.xpath("//span[text()='Shopping cart']")).click();
		Thread.sleep(1000);
		boolean check = driver.findElement(By.linkText("$25 Virtual Gift Card")).isEnabled();
		
		System.out.println(check? "Product added Succesfully":"Product not present");
		
		
		
		
		
		/////////////////////////////////////////////////////////////////////////////////////////////////////////////
		
		
		
		logout();
		Thread.sleep(1000);
		postCondition();
	}
	@Test(priority = 1, enabled = false)
	public void Task2() throws InterruptedException{
		preCondition();
		Thread.sleep(1000);
		login();
		Thread.sleep(1000);
		Actions act = new Actions(driver);
		WebElement facebook =  driver.findElement(By.linkText("Facebook"));
		act.scrollToElement(facebook).perform();
		Thread.sleep(3000);
		facebook.click();
		Thread.sleep(3000);
		driver.switchTo().newWindow(WindowType.TAB);
		Thread.sleep(3000);
		WebElement createNew = driver.findElement(By.xpath("//*[@id=\"login_popup_cta_form\"]/div/div/div/div[9]/div/div/div[1]/div/span/span"));
		createNew.click();
		Thread.sleep(3000);
		logout();
		Thread.sleep(1000);
		postCondition();
	}


	@Test(priority = 2, enabled = true)
	public void Task3() throws InterruptedException{
		preCondition();
		Thread.sleep(1000);
		login();
		Thread.sleep(1000);
		
		/////////////////////////////////////////////////////////////////////////////////////////////////////////////

		// go ot digital download
		driver.findElement(By.partialLinkText("Digital downloads")).click();
		
		Thread.sleep(3000);
		List<WebElement> productList = driver.findElements(By.className("item-box"));
		
		System.out.println(productList.size());
		double maxPrice = 0;
		for(int i = 1; i <= productList.size(); i++) {
			driver.findElement(By.xpath("//div[@class='product-grid']/div["+ i +  "]/div/div[2]/div[3]/div[2]/input")).click();
			Thread.sleep(1000);
			double price = Double.parseDouble(driver.findElement(By.xpath("//div[@class='product-grid']/div[" + i + "]/div/div[2]/div[3]/div[1]/span")).getText());
			System.out.println(price);
			if(price > maxPrice) {
				maxPrice = price;
			}
			System.out.println( i + "Elemtn added Suscefully");
		}
		
		System.out.print(maxPrice);
		// going to the cart page
		driver.findElement(By.xpath("//span[text()='Shopping cart']")).click();
		int noRows = productList.size();
		for(int i = 1; i <= noRows; i++) {
			double curr = Double.parseDouble(driver.findElement(By.xpath("//table[@class='cart']/tbody/tr[" + i + "]/td[4]/span[2]")).getText());
			if(curr == maxPrice) {
				driver.findElement(By.xpath("//table[@class='cart']/tbody/tr[" + i + "]/td[1]/input")).click();
				System.out.println("max price product found");
				driver.findElement(By.xpath("/html/body/div[4]/div[1]/div[4]/div/div/div[2]/div/form/div[1]/div/input[1]")).click();
				System.out.println("dupating the cart");
			}
		}
		
		
		
		
		/////////////////////////////////////////////////////////////////////////////////////////////////////////////
		
		logout();
		Thread.sleep(1000);
		postCondition();
	}
	
	
	
	@Test(priority = 3, enabled = true)
	public void Task4() throws InterruptedException{
		preCondition();
		Thread.sleep(1000);
		login();
		Thread.sleep(1000);
		///////////////////////////////////////////////////////////////////////////////////////////////

		driver.findElement(By.linkText("Digital downloads")).click();

		System.out.println("For the First Sort By-------------------------------------------------");
        WebElement orderby = driver.findElement(By.id("products-orderby"));
        System.out.println("orderby Enabled: " + orderby.isEnabled());
        Select sort = new Select(orderby);
        List<WebElement> sortOptions = sort.getOptions();
        List<String> sortText = new ArrayList<String>();

        for(WebElement option : sortOptions) {
            sortText.add(option.getText());
        }

        for(String text : sortText) {
            System.out.println("sorting by" + text);
            new Select(driver.findElement(By.id("products-orderby"))).selectByVisibleText(text);
        }
        
        
        System.out.println("For the Second Display -------------------------------------------------");
        WebElement pagesize = driver.findElement(By.id("products-pagesize"));
        System.out.println("Pagesize Enabled: " + pagesize.isEnabled());
       
       

        
        Select page = new Select(driver.findElement(By.id("products-pagesize")));
        List<WebElement> displayOptions = page.getOptions();
        List<String> displayText = new ArrayList<String>();

        for(WebElement option : displayOptions) {
            displayText.add(option.getText());
        }

        for(String text : displayText) {
            System.out.println("Display: " + text);
            new Select(driver.findElement(By.id("products-pagesize"))).selectByVisibleText(text);
        }

        
        System.out.println("For the View Mode-------------------------------------------------");
        WebElement viewmode = driver.findElement(By.id("products-viewmode"));
        System.out.println("View Mode Enabled:-" + viewmode.isEnabled());
        Select view = new Select(driver.findElement(By.id("products-viewmode")));
        List<WebElement> viewOptions = view.getOptions();
        List<String> viewText = new ArrayList<String>();

        for(WebElement option : viewOptions) {
            viewText.add(option.getText());
        }

        for(String text : viewText) {
            System.out.println("View As: " + text);
            new Select(driver.findElement(By.id("products-viewmode"))).selectByVisibleText(text);
        }

        
      

		
		///////////////////////////////////////////////////////////////////////////////////////////////
		logout();
		Thread.sleep(1000);
		postCondition();
	}
	@Test(priority = 4, enabled = false)
	public void Task5() throws InterruptedException{
		preCondition();
		Thread.sleep(1000);
		login();
		Thread.sleep(1000);
		logout();
		Thread.sleep(1000);
		postCondition();
	}
	@Test(priority = 5, enabled = false)
	public void Task6() throws InterruptedException{
		preCondition();
		Thread.sleep(1000);
		login();
		Thread.sleep(1000);
		logout();
		Thread.sleep(1000);
		postCondition();
	}
	@Test(priority =6, enabled = false)
	public void Task7() throws InterruptedException{
		preCondition();
		Thread.sleep(1000);
		login();
		Thread.sleep(1000);
		logout();
		Thread.sleep(1000);
		postCondition();
	}

}
