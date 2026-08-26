package Assignment;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class RegisterWithmouseAndKeyBoard {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		ChromeDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://demo.automationtesting.in/Register.html#google_vignette");
		Thread.sleep(2000);
		Actions ref=new Actions(driver);
		WebElement first = driver.findElement(By.xpath("//input[@placeholder='First Name']"));
		WebElement last = driver.findElement(By.xpath("//input[@placeholder='Last Name']"));
		WebElement adress=driver.findElement(By.xpath("//textarea[@ng-model='Adress']"));
		WebElement email=driver.findElement(By.xpath("//input[@ng-model='EmailAdress']"));
		WebElement phone=driver.findElement(By.xpath("//input[@ng-model='Phone']"));
		WebElement gender=driver.findElement(By.xpath("//input[@value='Male']"));
		WebElement hobby=driver.findElement(By.xpath("//input[@value='Cricket']"));
		WebElement langBox=driver.findElement(By.id("msdd"));
		WebElement lan1=driver.findElement(By.xpath("//a[text()='English']"));
		WebElement outerDiv=driver.findElement(By.xpath("//div[@class='row']"));
		WebElement skill=driver.findElement(By.id("Skills"));
		WebElement scroll=driver.findElement(By.id("submitbtn"));
		WebElement country=driver.findElement(By.xpath("//span[@role='combobox']"));
		WebElement year=driver.findElement(By.xpath("//select[@placeholder='Year']"));
		WebElement birth=driver.findElement(By.xpath("//option[@value='2003']"));
		WebElement month=driver.findElement(By.xpath("//select[@placeholder='Month']"));
		WebElement day=driver.findElement(By.xpath("//select[@placeholder='Day']"));
		WebElement  password=driver.findElement(By.id("firstpassword"));
		WebElement  password2=driver.findElement(By.id("secondpassword"));



		ref.click(first).sendKeys("Rishi").perform();
		ref.click(last).sendKeys("Joshi").perform();
		ref.sendKeys(adress, "KarveNagar, lane5, pune").perform();
		ref.sendKeys(email, "joshirishi@gmail.com").perform();
		ref.sendKeys(phone, "9823718109").perform();
		ref.click(gender).perform();
		ref.click(hobby).perform();
		ref.scrollToElement(scroll).perform();
		Thread.sleep(2000);
		ref.click(langBox).perform();
		ref.click(lan1).perform();
		ref.click(outerDiv).perform();
		ref.scrollToElement(scroll).perform();
		ref.click(skill).perform();
		for(int i=0;i<10;i++) {
			ref.keyDown(Keys.ARROW_DOWN).perform();
		}
		Thread.sleep(1000);
		ref.keyDown(Keys.ENTER).perform();
		ref.click(country).perform();
		for(int i=0;i<5;i++) {
			ref.keyDown(Keys.ARROW_DOWN).perform();
		}
		ref.keyDown(Keys.ENTER).perform();
		ref.click(year).perform();
		for(int i=0;i<5;i++) {
			ref.keyDown(Keys.ARROW_DOWN).perform();

		}
		Thread.sleep(1000);
		ref.keyDown(Keys.ENTER).perform();
		ref.click(month).perform();
		for(int i=0;i<5;i++) {
			ref.keyDown(Keys.ARROW_DOWN).perform();

		}
		Thread.sleep(1000);
		ref.keyDown(Keys.ENTER).perform();
		
		ref.click(day).perform();
		for(int i=0;i<5;i++) {
			ref.keyDown(Keys.ARROW_DOWN).perform();

		}
		ref.keyDown(Keys.ENTER).perform();
		ref.sendKeys(password, "Rishi#1234").perform();
		ref.sendKeys(password2, "Rishi#1234").perform();
		
		driver.close();

		

		
		
	}

}
