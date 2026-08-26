package Assignment;
import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class VirtualGiftCard {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		ChromeDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://demowebshop.tricentis.com/");
		Thread.sleep(2000);
		driver.findElement(By.xpath("(//input[@value='Add to cart'])[1]")).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("//input[@class='recipient-name']")).sendKeys("Rishi");
		Thread.sleep(2000);
		driver.findElement(By.xpath("//input[@class='recipient-email']")).sendKeys("rishi@gmail.com");
		Thread.sleep(2000);
		driver.findElement(By.xpath("//input[@class='sender-name']")).sendKeys("Rishi Joshi");
		Thread.sleep(2000);
		driver.findElement(By.xpath("//input[@id='giftcard_2_SenderEmail']")).sendKeys("joshirrishi@gmail.com");
		Thread.sleep(2000);
		driver.findElement(By.xpath("//input[@class='qty-input']")).clear();
		Thread.sleep(2000);
		driver.findElement(By.xpath("//input[@class='qty-input']")).sendKeys("2");
		Thread.sleep(2000);
		driver.findElement(By.xpath("//input[@id='add-to-cart-button-2']")).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("(//a[@class='ico-cart'])[1]")).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("(//input[@name='removefromcart'])")).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("//input[@value='Update shopping cart']")).click();
		Thread.sleep(2000);
		driver.close();

		

		
		

	}

}
