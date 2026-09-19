import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class TestTransactions {
    private WebDriver driver;
    private WebDriverWait wait;

    @BeforeMethod
    public void setUp() {
        driver = new ChromeDriver();
        wait = new WebDriverWait(driver, Duration.ofSeconds(10));
        driver.manage().window().maximize();
        driver.get("http://localhost:5173/");
        login();
    }

    @Test
    public void userCanAddCreditTransaction() {
        driver.findElement(By.xpath("//button[normalize-space()='➕ Add Transaction']")).click();
        wait.until(ExpectedConditions.urlContains("/doTransaction"));

        driver.findElement(By.cssSelector("input[type='number']")).clear();
        driver.findElement(By.cssSelector("input[type='number']")).sendKeys("100");
        new Select(driver.findElement(By.cssSelector("select"))).selectByVisibleText("Credit");
        driver.findElement(By.cssSelector("input[type='text']")).sendKeys("Selenium test credit");
        driver.findElement(By.xpath("//button[normalize-space()='Submit']")).click();

        wait.until(ExpectedConditions.urlContains("/transactions"));
        Assert.assertTrue(driver.getPageSource().contains("Selenium test credit"));
    }

    private void login() {
        driver.findElement(By.cssSelector("input[placeholder='Enter Mail']"))
                .sendKeys("mihir@gmail.com");
        driver.findElement(By.cssSelector("input[placeholder='Enter Password']"))
                .sendKeys("Mihir@435");
        driver.findElement(By.xpath("//button[normalize-space()='Login']")).click();
        wait.until(ExpectedConditions.urlContains("/dashboard"));
    }

    @AfterMethod
    public void tearDown() {
        if (driver != null) {
            driver.quit();
        }
    }
}
