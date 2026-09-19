package com.crm.POM;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class TestExistingChrome {

    public static void main(String[] args) {

        ChromeOptions options = new ChromeOptions();

        options.setExperimentalOption(
                "debuggerAddress",
                "127.0.0.1:9222"
        );

        WebDriver driver = new ChromeDriver(options);

        System.out.println("Connected!");

        // Go to Google
        driver.get("https://www.google.com");

        System.out.println(driver.getTitle());
    }
}