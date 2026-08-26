package Assignment;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class AutomationDemoSite {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		ChromeDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://demo.automationtesting.in/Register.html");
		driver.findElement(By.xpath("//input[@placeholder='First Name']")).sendKeys("Rishi");
		driver.findElement(By.xpath("//input[@placeholder='Last Name']")).sendKeys("Joshi");
		driver.findElement(By.xpath("//textarea[@ng-model='Adress']")).sendKeys("Deccan GymKhana America");
		driver.findElement(By.xpath("//input[@ng-model='EmailAdress']")).sendKeys("rishi@gmail.com");
		driver.findElement(By.xpath("//input[@ng-model='Phone']")).sendKeys("9823718009");
		driver.findElement(By.xpath("(//input[@ng-model='radiovalue'])[1]")).click();
		driver.findElement(By.xpath("//input[@id='checkbox1']")).click();
		driver.findElement(By.xpath("//div[@id='msdd']")).click();
		driver.findElement(By.xpath("//ul[contains(@class, 'ui-autocomplete')]/li[3]")).click();
		driver.findElement(By.xpath("//ul[contains(@class, 'ui-autocomplete')]/li[5]")).click();
		driver.findElement(By.xpath("(//div[@class='row'])[1]")).click();	
		driver.findElement(By.xpath("//select[@ng-model='Skill']")).click();
		driver.findElement(By.xpath("//option[@value='Java']")).click();
		driver.findElement(By.xpath("//select[@id='countries']")).click();
		driver.findElement(By.xpath("//select[@id='countries']/option")).click();
		driver.findElement(By.xpath("//span[@role='combobox']")).click();
		//input[@class='select2-search__field']
		driver.findElement(By.xpath("//input[@class='select2-search__field']")).sendKeys("India");
		driver.findElement(By.xpath("//span[@class='select2-results']/ul/li[6]")).click();
		driver.findElement(By.xpath("//select[@placeholder='Year']")).click();
		driver.findElement(By.xpath("//option[@value='2003']")).click();
		driver.findElement(By.xpath("//select[@placeholder='Month']")).click();
		driver.findElement(By.xpath("//option[@value='December']")).click();
		driver.findElement(By.xpath("//select[@placeholder='Day']")).click();
		driver.findElement(By.xpath("//option[@value='19']")).click();
		driver.findElement(By.xpath("//input[@id='firstpassword']")).sendKeys("Rishi#1234");
		driver.findElement(By.xpath("//input[@id='secondpassword']")).sendKeys("Rishi#1234");



		

		

		

		
		}

}
