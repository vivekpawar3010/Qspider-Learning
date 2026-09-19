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

public class TestTransfer {
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
    public void userCanTransferFundsToAnotherAccount() {
        driver.findElement(By.xpath("//button[normalize-space()='💸 Money Transfer']")).click();
        wait.until(ExpectedConditions.urlContains("/moneyTransfer"));

        driver.findElement(By.cssSelector("input[placeholder='Enter recipient account number']"))
                .sendKeys("8292549978628560");
        driver.findElement(By.cssSelector("input[placeholder='Enter transfer amount']"))
                .sendKeys("1");
        driver.findElement(By.cssSelector("input[placeholder*='Rent']"))
                .sendKeys("Selenium transfer");
        driver.findElement(By.xpath("//button[normalize-space()='Transfer Funds']")).click();

        Assert.assertTrue(wait.until(ExpectedConditions
                .visibilityOfElementLocated(By.xpath("//*[contains(normalize-space(), 'transfer successful')]")))
                .isDisplayed());
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