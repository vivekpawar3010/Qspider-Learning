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

public class TestHistory {
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
    public void loggedInUserCanViewTransactionHistory() {
        wait.until(ExpectedConditions.elementToBeClickable(
                By.xpath("//button[normalize-space()='📄 Transaction History']"))).click();

        wait.until(ExpectedConditions.urlContains("/transactions"));
        Assert.assertTrue(wait.until(ExpectedConditions
                .visibilityOfElementLocated(By.xpath("//*[normalize-space()='All Transactions']")))
                .isDisplayed());
        Assert.assertTrue(driver.findElements(By.cssSelector("div[class*='transactionCard']")).size() > 0,
                "Expected seeded transactions to be displayed");
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
