package Utilities;

import java.io.File;
import java.io.IOException;

import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.io.FileHandler;

public class Screenshot {

    // Screenshot folder inside project
    private static final String SCREENSHOT_DIR =
            "Screenshots" + File.separator;

    public static void webPageScreenShot(
            WebDriver driver,
            String name) {

        // Convert WebDriver into TakesScreenshot
        TakesScreenshot ts =
                (TakesScreenshot) driver;

        // Generate dynamic screenshot name
        String dynamicName =
                JavaUtility.dynamicNameWithDateTime(name);

        // Capture screenshot
        File from =
                ts.getScreenshotAs(OutputType.FILE);

        // Create Screenshot folder
        File destDir =
                new File(SCREENSHOT_DIR);

        if (!destDir.exists()) {
            destDir.mkdirs();
        }

        // Destination file
        File to =
                new File(
                        destDir,
                        dynamicName + ".png"
                );

        try {

            FileHandler.copy(from, to);

            System.out.println(
                    "Screenshot saved successfully: "
                    + to.getAbsolutePath()
            );

        } catch (IOException e) {

            System.err.println(
                    "Failed to save screenshot: "
                    + e.getMessage()
            );

            e.printStackTrace();
        }
    }
}