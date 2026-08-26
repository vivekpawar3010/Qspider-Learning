package TestCases;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import UtilityClasses.BaseClass;
import UtilityClasses.SeleniumUtility;

public class Login7 extends BaseClass {
    public static void main(String[] args) throws Exception {
    	
        String expected_url="https://demowebshop.tricentis.com/login";
        String expected_message="Login was unsuccessful. Please correct the errors and try again.";
        
        BaseClass.precondition();
        
        driver.findElement(By.className("ico-login")).click();
        
        driver.findElement(By.id("Email")).sendKeys("vivekWrong@gmail.com");
        driver.findElement(By.name("Password")).sendKeys("VivekWrongPass");
        
        driver.findElement(By.cssSelector(".button-1.login-button")).click();
        
        String actual_url = driver.getCurrentUrl();
        
        if(expected_url.equals(actual_url)) {
            System.out.println("login is unsuccessfull because of invalid credential");
            
            WebElement errorMessage = driver.findElement(By.cssSelector(".message-error"));
            
            String actual_message = errorMessage.getText();
            System.out.println(actual_message);
            
            if(actual_message.contains(expected_message)) {
                System.out.println("Proper Error Message is Displayed and Tc_007 is pass");
            }
            else {
                SeleniumUtility.webPageScreenshot(driver, actual_url);
                postCondition();
                throw new Exception("Proper Error Message is not Displayed and Tc_007 is fail");
            }
        }
        else {
            SeleniumUtility.webPageScreenshot(driver, actual_url);
            postCondition();
            throw new Exception("login is successfull with invalid credential and Tc_007 is fail ");
        }
        postCondition();
        
    }
}