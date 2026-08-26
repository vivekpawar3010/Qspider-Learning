package TestCases;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import UtilityClasses.BaseClass;
import UtilityClasses.SeleniumUtility;

public class Login8 extends BaseClass {
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
        Thread.sleep(3000);
        postCondition();
    }
}