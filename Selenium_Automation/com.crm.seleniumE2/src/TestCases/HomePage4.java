package TestCases; 

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import UtilityClasses.BaseClass;
import UtilityClasses.SeleniumUtility;

public class HomePage4 extends BaseClass {
    
    public static void main(String[] args) throws Exception {
        precondition();
        
        
            
            List<WebElement> shopingCart = driver.findElements(By.className("cart-label"));
            
            if (shopingCart.size() > 0) {
                System.out.println("Element is present");
                
                if (shopingCart.get(0).isDisplayed()) {
                    System.out.println("Shoping cart is Displayed and Tc_004 is pass");
                } else {
                    SeleniumUtility.webPageScreenshot(driver, "Tc_004");
                    throw new Exception("WebElement is not visible and Tc_004 fail");
                }
            } else {
                SeleniumUtility.webPageScreenshot(driver, "Tc_004");
                throw new Exception("Element is not present then element is not visible and Testcase fail");
            }
         postCondition();
        
    }
}