package com.crm.UtilityClass;
import java.io.File;

import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.io.FileHandler;

public class SeleniumUtility {

    public static void webPageScreenshot(
            WebDriver driver,
            String name) {

        TakesScreenshot ts =
                (TakesScreenshot) driver;

        try {

            Thread.sleep(1000);

            File from =
                    ts.getScreenshotAs(OutputType.FILE);

            File to = new File(
                    ".\\" +
                    name + ".png"
            );

            FileHandler.copy(from, to);

            System.out.println(
                    "Screenshot captured: " + name
            );

        } catch (Exception e) {

            System.out.println(
                    "Screenshot failed: " + e.getMessage()
            );
        }
    }
}