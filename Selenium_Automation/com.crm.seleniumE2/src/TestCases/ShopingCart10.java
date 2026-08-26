package TestCases;

import java.awt.image.DirectColorModel;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import UtilityClasses.BaseClass;
import UtilityClasses.SeleniumUtility;

public class ShopingCart10 extends BaseClass {
    public static void main(String[] args) throws Exception {
    	
        String expected_url="https://demowebshop.tricentis.com/";
        String expected_email = "vivekpawar@gmail.com";
        BaseClass.precondition();
        
        driver.findElement(By.className("ico-login")).click();
        
        driver.findElement(By.id("Email")).sendKeys("vivekpawar@gmail.com");
        driver.findElement(By.name("Password")).sendKeys("King@3010");
        
        driver.findElement(By.cssSelector(".button-1.login-button")).click();
        
        String actual_url = driver.getCurrentUrl();
        
        if(expected_url.equals(actual_url)) {
            System.out.println("login is Successful because of valid credential");
            
            WebElement email = driver.findElement(By.className("account"));
            
            String actual_email = email.getText();
            System.out.println(actual_email);
            
            if(actual_email.contains(expected_email)) {
                System.out.println("Proper Login Account is Displayed and Tc_008 is pass");
            }
            else {
                SeleniumUtility.webPageScreenshot(driver, actual_url);
                postCondition();
                throw new Exception("Proper Login Account is not Displayed and Tc_008 is fail");
            }	
        }
        else {
            SeleniumUtility.webPageScreenshot(driver, actual_url);
            postCondition();
            throw new Exception("login is unsuccessfull with valid credential and Tc_008 is fail ");
        }
        
        System.out.println("--------------------------------------------------------------------------");
        System.out.println("Stated Process adding 14.1-inch Laptop to Shopping Cart");
        
        driver.findElement(By.linkText("14.1-inch Laptop")).click();
        driver.findElement(By.id("add-to-cart-button-31")).click();
        List<WebElement> shopingCart = driver.findElements(By.className("ico-cart"));
        
        shopingCart.get(0).click();
        
        String expected_product = "14.1-inch Laptop";
        WebElement product = driver.findElement(By.linkText("14.1-inch Laptop"));
        
        String actual_product = product.getText();
        System.out.println(actual_product);
        
        if(actual_product.contains(expected_product)) {
            System.out.println("Proper Requied Prodect is Displayed and Tc_009 is pass");
        }
        else {
            SeleniumUtility.webPageScreenshot(driver, actual_url);
            postCondition();
            throw new Exception("Proper Requied Product is not Displayed and Tc_009 is fail");
        }	
        
        System.out.println("--------------------------------------------------------------------------");
        
        System.out.println("Starting the process of removing the product from the cart");
        
        driver.findElement(By.name("removefromcart")).click();
        
        driver.findElement(By.name("updatecart")).click();
        
        String expected_msg = "Your Shopping Cart is empty!";
        WebElement msgs = driver.findElement(By.className("order-summary-content"));
        
        String actual_msg = msgs.getText();
        System.out.println(actual_msg);
        
        if(actual_msg.contains(expected_msg)) {
            System.out.println("Proper Added Product Removed is Displayed and Tc_010 is pass");
        }
        else {
            SeleniumUtility.webPageScreenshot(driver, actual_url);
            postCondition();
            throw new Exception("Proper Added Product Removed is not Displayed and Tc_010 is fail");
        }
        
        Thread.sleep(3000);
        postCondition();
        
        
        
        
    }
}