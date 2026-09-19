package com.crm.POM;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class WhatsAppAutomation {

    public static void main(String[] args) {

        // ==========================================
        // 1. Chrome options
        // ==========================================

        ChromeOptions options = new ChromeOptions();

        // Connect to the Chrome window already running
        options.setExperimentalOption(
                "debuggerAddress",
                "127.0.0.1:9222"
        );


        // ==========================================
        // 2. Create WebDriver
        // ==========================================

        WebDriver driver = new ChromeDriver(options);

        WebDriverWait wait =
                new WebDriverWait(driver, Duration.ofSeconds(30));


        // ==========================================
        // 3. Open WhatsApp Web
        // ==========================================

        driver.get("https://web.whatsapp.com/");

        System.out.println("Opening WhatsApp...");


        // ==========================================
        // 4. Wait for WhatsApp to load
        // ==========================================

        wait.until(
                ExpectedConditions.presenceOfElementLocated(
                        By.xpath("//div[@contenteditable='true']")
                )
        );

        System.out.println("WhatsApp loaded!");


        // ==========================================
        // 5. Friend name
        // ==========================================

        String friendName = "Friend Name";


        // ==========================================
        // 6. Message
        // ==========================================

        String message =
                "Hey bro! How are you?";


        // ==========================================
        // 7. Find WhatsApp search box
        // ==========================================

        WebElement searchBox = wait.until(
                ExpectedConditions.elementToBeClickable(
                        By.xpath(
                            "//div[@contenteditable='true']" +
                            "[@data-tab='3']"
                        )
                )
        );


        // ==========================================
        // 8. Search friend's name
        // ==========================================

        searchBox.click();

        searchBox.sendKeys(friendName);

        System.out.println("Searching for: " + friendName);


        // ==========================================
        // 9. Wait for friend's chat
        // ==========================================

        WebElement friendChat = wait.until(
                ExpectedConditions.elementToBeClickable(
                        By.xpath(
                            "//span[@title='" +
                            friendName +
                            "']"
                        )
                )
        );


        // ==========================================
        // 10. Open friend's chat
        // ==========================================

        friendChat.click();

        System.out.println("Chat opened!");


        // ==========================================
        // 11. Find message box
        // ==========================================

        WebElement messageBox = wait.until(
                ExpectedConditions.elementToBeClickable(
                        By.xpath(
                            "//div[@contenteditable='true']" +
                            "[@data-tab='10']"
                        )
                )
        );


        // ==========================================
        // 12. Type message
        // ==========================================

        messageBox.click();

        messageBox.sendKeys(message);

        System.out.println("Message typed!");


        // ==========================================
        // 13. Send message
        // ==========================================

        messageBox.sendKeys(Keys.ENTER);

        System.out.println("Message sent!");


        // ==========================================
        // 14. Keep browser open
        // ==========================================

        // Do NOT use driver.quit()
        // because you want to keep the existing
        // Chrome/WhatsApp session open.

    }
}