package com.crm.POM;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class ConnectExistingChrome {

    public static void main(String[] args) {

        ChromeOptions options = new ChromeOptions();

        // Connect to the already-running Chrome
        options.setExperimentalOption(
            "debuggerAddress",
            "127.0.0.1:9222"
        );

        WebDriver driver = new ChromeDriver(options);

        System.out.println("Connected!");

        System.out.println("Current URL: " + driver.getCurrentUrl());
        System.out.println("Title: " + driver.getTitle());
    }
}