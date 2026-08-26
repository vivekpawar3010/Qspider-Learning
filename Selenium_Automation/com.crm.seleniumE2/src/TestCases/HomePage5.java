package TestCases; 

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import UtilityClasses.BaseClass;
import UtilityClasses.SeleniumUtility;

public class HomePage5 extends BaseClass {
    
    public static void main(String[] args) throws Exception {
        precondition();
        
        
            
            List<WebElement> wishList = driver.findElements(By.className("cart-label"));
            
            if (wishList.size() > 0) {
                System.out.println("Element is present");
                
                if (wishList.get(1).isDisplayed()) {
                    System.out.println("Wish List is Displayed and Tc_005 is pass");
                } else {
                    SeleniumUtility.webPageScreenshot(driver, "Tc_005");
                    throw new Exception("WebElement is not visible and Tc_005 fail");
                }
            } else {
                SeleniumUtility.webPageScreenshot(driver, "Tc_005");
                throw new Exception("Element is not present then element is not visible and Testcase fail");
            }
         postCondition();
        
    }
}