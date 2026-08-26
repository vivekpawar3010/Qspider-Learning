package TestCases; 

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import UtilityClasses.BaseClass;
import UtilityClasses.SeleniumUtility;

public class HomePage3 extends BaseClass {
    
    public static void main(String[] args) throws Exception {
        precondition();
        
        
            List<WebElement> login = driver.findElements(By.className("ico-login"));
            
            if (login.size() > 0) {
                System.out.println("Element is present");
                
                if (login.get(0).isDisplayed()) {
                    System.out.println("Login is Displayed and Tc_003 is pass");
                } else {
                    SeleniumUtility.webPageScreenshot(driver, "Tc_003");
                    throw new Exception("WebElement is not visible and Tc_003 fail");
                }
            } else {
                SeleniumUtility.webPageScreenshot(driver, "Tc_003	");
                throw new Exception("Element is not present then element is not visible and Testcase fail");
            }
       
            postCondition();
        
    }
}