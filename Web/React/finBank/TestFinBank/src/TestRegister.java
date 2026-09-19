import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class TestRegister {
    private WebDriver driver;
    private WebDriverWait wait;

    @BeforeMethod
    public void setUp() {
        driver = new ChromeDriver();
        wait = new WebDriverWait(driver, Duration.ofSeconds(10));
        driver.manage().window().maximize();
        driver.get("http://localhost:5173/register");
    }

    @Test
    public void userCanRegisterAndReceiveAnAccount() {
        String uniqueEmail = "selenium" + System.currentTimeMillis() + "@example.com";

        driver.findElement(By.cssSelector("input[placeholder='Enter your full name']"))
                .sendKeys("Selenium Test User");
        driver.findElement(By.cssSelector("input[placeholder='Enter your phone number']"))
                .sendKeys("9000000000");
        driver.findElement(By.cssSelector("input[placeholder='Enter your email']"))
                .sendKeys(uniqueEmail);
        driver.findElement(By.cssSelector("input[placeholder='Create a strong password']"))
                .sendKeys("Test@12345");
        driver.findElement(By.xpath("//button[@type='submit']")).click();

        wait.until(ExpectedConditions.alertIsPresent()).accept();
        wait.until(ExpectedConditions.urlToBe("http://localhost:5173/"));
        Assert.assertTrue(driver.getCurrentUrl().endsWith("/"));
    }

    @AfterMethod
    public void tearDown() {
        if (driver != null) {
            driver.quit();
        }
    }
}
