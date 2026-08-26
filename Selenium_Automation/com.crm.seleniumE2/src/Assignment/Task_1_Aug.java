package Assignment;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class Task_1_Aug {

	public static void main(String[] args) throws InterruptedException {
		ChromeDriver driver = new ChromeDriver();
		
		
		driver.manage().window().maximize();
		
		driver.get("https://demo.automationtesting.in/Register.html");
		Thread.sleep(1000);
	
		
		
		driver.findElement(By.xpath("//*[@id=\"basicBootstrapForm\"]/div[1]/div[1]/input")).sendKeys("Vivek");
		Thread.sleep(400);
		driver.findElement(By.xpath("//*[@id=\"basicBootstrapForm\"]/div[1]/div[2]/input")).sendKeys("Pawar");
		Thread.sleep(400);
		driver.findElement(By.xpath("//*[@id=\"basicBootstrapForm\"]/div[2]/div/textarea")).sendKeys("At Post Jainwadi, Tal. Pandharpur, Maharashtra – 413310, India");
		Thread.sleep(400);
		driver.findElement(By.xpath("//*[@id=\"eid\"]/input")).sendKeys("vivekpawar@gmail.com");
		Thread.sleep(400);
		driver.findElement(By.xpath("//*[@id=\"basicBootstrapForm\"]/div[4]/div/input")).sendKeys("9890528006");  // phone
		Thread.sleep(400);
		driver.findElement(By.xpath("//*[@id=\"basicBootstrapForm\"]/div[5]/div/label[1]/input")).click();
		Thread.sleep(400);
		driver.findElement(By.id("checkbox1")).click();
		Thread.sleep(200);
		driver.findElement(By.id("checkbox2")).click();
//		Thread.sleep(200);
//		driver.findElement(By.id("checkbox3")).click();
		
		Thread.sleep(400);
		
		driver.findElement(By.id("msdd")).click();
		Thread.sleep(400);
		
		driver.findElement(By.xpath("//*[@id=\"msdd\"]/following-sibling::div/ul/li[8]")).click();
		Thread.sleep(400);
//		driver.findElement(By.id("checkbox3")).click();
//		Thread.sleep(200);
		driver.findElement(By.id("checkbox3")).click();
		Thread.sleep(200);
		
		
		driver.findElement(By.id("Skills")).click();
		Thread.sleep(400);
		
		driver.findElement(By.xpath("//*[@id=\"Skills\"]/option[39]")).click();
		
		Thread.sleep(400);
		
		driver.findElement(By.xpath("//*[@id=\"basicBootstrapForm\"]/div[10]/div/span/span[1]/span")).click();
		Thread.sleep(400);
		
		driver.findElement(By.xpath("//*[@id=\"select2-country-results\"]/li[6]")).click();
		Thread.sleep(400);
		
		driver.findElement(By.id("yearbox")).click();
		Thread.sleep(400);	
		driver.findElement(By.xpath("//*[@id=\"yearbox\"]/option[101]")).click();
		Thread.sleep(400);
		driver.findElement(By.xpath("//*[@id=\"basicBootstrapForm\"]/div[11]/div[2]/select")).click();
		Thread.sleep(400);
		driver.findElement(By.xpath("//*[@id=\"basicBootstrapForm\"]/div[11]/div[2]/select/option[9]")).click();
		Thread.sleep(400);
		driver.findElement(By.id("daybox")).click();
		Thread.sleep(400);
		driver.findElement(By.xpath("//*[@id=\"daybox\"]/option[2]")).click();
		Thread.sleep(400);
		
		
		driver.findElement(By.id("firstpassword")).sendKeys("Abc@123");
		Thread.sleep(400);
		
		driver.findElement(By.id("secondpassword")).sendKeys("Abc@123");
		Thread.sleep(400);
		
		
		driver.findElement(By.id("submitbtn")).click();
		Thread.sleep(400);
		System.out.println("task done");

		
		
//		driver.findElement(By.xpath("//*[@id=\"Email\"]")).
//		driver.findElement(By.xpath("//*[@id=\"Password\"]")).sendKeys("King@3010");
//		driver.findElement(By.xpath("/html/body/div[4]/div[1]/div[4]/div[2]/div/div[2]/div[1]/div[2]/div[2]/form/div[5]/input")).click();
		
		Thread.sleep(1000);	
		driver.close();

	}

}
