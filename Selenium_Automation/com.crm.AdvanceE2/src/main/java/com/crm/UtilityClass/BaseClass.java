package com.crm.UtilityClass;



import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class BaseClass {

    public static WebDriver driver = null;

    // Default precondition
    public static void precondition() {

        String url = "https://demowebshop.tricentis.com/";

        precondition(url);
    }

    // Precondition with URL
    public static void precondition(String url) {

        String browser = "chr";

        if (browser.equalsIgnoreCase("chrome")) {

            driver = new ChromeDriver();

        } else if (browser.equalsIgnoreCase("Firefox")) {

            driver = new FirefoxDriver();

        } else if (browser.equalsIgnoreCase("edge")) {

            driver = new EdgeDriver();

        } else {

            driver = new ChromeDriver();
        }

        driver.manage().window().maximize();

        driver.manage().timeouts()
              .implicitlyWait(Duration.ofSeconds(10));

        driver.get(url);

        System.out.println("Precondition completed");
    }

    // Login
    public static void login() {

        driver.findElement(By.className("ico-login")).click();

        driver.findElement(By.id("Email"))
              .sendKeys("vivekpawar@gmail.com");

        driver.findElement(By.name("Password"))
              .sendKeys("King@3010");

        driver.findElement(
                By.cssSelector(".button-1.login-button"))
              .click();

        System.out.println("Login completed");
    }

    // Logout
    public static void logout() {

        driver.findElement(
                By.xpath("//a[text()='Log out']"))
              .click();

        System.out.println("Logout completed");
    }

    // Postcondition
    public static void postCondition() {

        if (driver != null) {

            driver.quit();

            System.out.println("Postcondition completed");
        }
    }
}