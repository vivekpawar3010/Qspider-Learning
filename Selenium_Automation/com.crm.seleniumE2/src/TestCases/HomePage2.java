package TestCases; 

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import UtilityClasses.BaseClass;
import UtilityClasses.SeleniumUtility;

public class HomePage2 extends BaseClass {
    
    public static void main(String[] args) throws Exception {
        precondition();
        
        
            List<WebElement> register = driver.findElements(By.className("ico-register"));
            
            if (register.size() > 0) {
                System.out.println("Element is present");
                
                if (register.get(0).isDisplayed()) {
                    System.out.println("Register is Displayed and Tc_002 is pass");
                } else {
                    SeleniumUtility.webPageScreenshot(driver, "Tc_002");
                    throw new Exception("WebElement is not visible and Tc_002 fail");
                }
            } else {
                SeleniumUtility.webPageScreenshot(driver, "Tc_002");
                throw new Exception("Element is not present then element is not visible and Testcase fail");
            }
        
            postCondition();
        
    }
}