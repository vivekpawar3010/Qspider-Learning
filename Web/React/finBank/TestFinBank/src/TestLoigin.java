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

public class TestLoigin {
    private WebDriver driver;
    private WebDriverWait wait;

    @BeforeMethod
    public void setUp() {
        driver = new ChromeDriver();
        wait = new WebDriverWait(driver, Duration.ofSeconds(10));
        driver.manage().window().maximize();
        driver.get("http://localhost:5173/");
    }

    @Test
    public void userCanLoginWithValidCredentials() {
        driver.findElement(By.cssSelector("input[placeholder='Enter Mail']"))
                .sendKeys("mihir@gmail.com");
        driver.findElement(By.cssSelector("input[placeholder='Enter Password']"))
                .sendKeys("Mihir@435");
        driver.findElement(By.xpath("//button[normalize-space()='Login']")).click();

        wait.until(ExpectedConditions.urlContains("/dashboard"));
        Assert.assertTrue(driver.getCurrentUrl().contains("/dashboard"));
        Assert.assertTrue(wait.until(ExpectedConditions
                .visibilityOfElementLocated(By.xpath("//*[contains(normalize-space(), 'Welcome back')]")))
                .isDisplayed());
    }

    @Test
    public void invalidLoginStaysOnLoginPage() {
        driver.findElement(By.cssSelector("input[placeholder='Enter Mail']"))
                .sendKeys("wrong@example.com");
        driver.findElement(By.cssSelector("input[placeholder='Enter Password']"))
                .sendKeys("wrong-password");
        driver.findElement(By.xpath("//button[normalize-space()='Login']")).click();

        Assert.assertTrue(wait.until(ExpectedConditions
                .visibilityOfElementLocated(By.xpath("//*[contains(normalize-space(), 'Invalid credentials')]")))
                .isDisplayed());
        Assert.assertTrue(driver.getCurrentUrl().endsWith("/"));
    }

    @AfterMethod
    public void tearDown() {
        if (driver != null) {
            driver.quit();
        }
    }
}
