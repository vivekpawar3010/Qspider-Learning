package TestCases;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import Utilities.BaseClass;

public class AllinOne extends BaseClass {
//    @BeforeMethod(alwaysRun = true)
//    @Override
//    public void setUp() throws InterruptedException {
//        super.setUp();
//    }

    @Test(alwaysRun = true)
    public void test1() throws Exception {
        String expected_Url = "https://demowebshop.tricentis.com/";
        String actual = driver.getCurrentUrl();
        if (expected_Url.equals(actual)) {
            System.out.println("page loaded successully and testcase passed");
        } else {
            throw new Exception("page is not loaded succesfully and testcase fail");
        }
    }

    @Test(alwaysRun = true)
    public void test2() throws Exception {
        List<WebElement> register = driver.findElements(By.className("ico-register"));

        if (register.size() > 0) {
            System.out.println("Element is present");

            if (register.get(0).isDisplayed()) {
                System.out.println("Register is Displayed and Tc_002 is pass");
            } else {
                throw new Exception("WebElement is not visible and Tc_002 fail");
            }
        } else {
            throw new Exception("Element is not present then element is not visible and Testcase fail");
        }
    }

    @Test(alwaysRun = true)
    public void test3() throws Exception {
        List<WebElement> login = driver.findElements(By.className("ico-login"));

        if (login.size() > 0) {
            System.out.println("Element is present");
            if (login.get(0).isDisplayed()) {
                System.out.println("Login is Displayed and Tc_003 is pass");
            } else {
                throw new Exception("WebElement is not visible and Tc_003 fail");
            }
        } else {
            throw new Exception("Element is not present then element is not visible and Testcase fail");
        }
    }

    @Test(alwaysRun = true)
    public void test4() throws Exception {
        List<WebElement> shoppingCart = driver.findElements(By.className("cart-label"));

        if (shoppingCart.size() > 0) {
            System.out.println("Element is present");
            if (shoppingCart.get(0).isDisplayed()) {
                System.out.println("Shopping cart is Displayed and Tc_004 is pass");
            } else {
                throw new Exception("WebElement is not visible and Tc_004 fail");
            }
        } else {
            throw new Exception("Element is not present then element is not visible and Testcase fail");
        }
    }

    @Test(alwaysRun = true)
    public void test5() throws Exception {
        List<WebElement> wishList = driver.findElements(By.className("ico-wishlist"));

        if (wishList.size() > 0) {
            System.out.println("Element is present");
            if (wishList.get(0).isDisplayed()) {
                System.out.println("Wish List is Displayed and Tc_005 is pass");
            } else {
                throw new Exception("WebElement is not visible and Tc_005 fail");
            }
        } else {
            throw new Exception("Element is not present then element is not visible and Testcase fail");
        }
    }

    @Test(alwaysRun = true)
    public void test6() throws Exception {
        List<WebElement> login = driver.findElements(By.className("ico-login"));

        if (login.size() > 0) {
            System.out.println("Element is Enabled");
            if (login.get(0).isDisplayed()) {
                System.out.println("Login is Displayed");
                if (login.get(0).isEnabled()) {
                    System.out.println("Login is Enabled and Tc_006 is pass");
                } else {
                    throw new Exception("WebElement is not Enabled and Tc_006 fail");
                }
            } else {
                throw new Exception("WebElement is not visible, So Not Enabled and Tc_006 fail");
            }
        } else {
            throw new Exception("Element is not present then element is not Enabled and Testcase fail");
        }
    }

    @Test(alwaysRun = true)
    public void test7() throws Exception {
        String expectedUrl = "https://demowebshop.tricentis.com/login";
        String expectedMessage = "Login was unsuccessful. Please correct the errors and try again.";

        driver.findElement(By.className("ico-login")).click();
        driver.findElement(By.id("Email")).sendKeys("vivekWrong@gmail.com");
        driver.findElement(By.name("Password")).sendKeys("VivekWrongPass");
        driver.findElement(By.cssSelector(".button-1.login-button")).click();

        String actualUrl = driver.getCurrentUrl();
        if (!expectedUrl.equals(actualUrl)) {
            throw new Exception("login is successfull with invalid credential and Tc_007 is fail");
        }

        String actualMessage = driver.findElement(By.cssSelector(".message-error")).getText();
        if (actualMessage.contains(expectedMessage)) {
            System.out.println("Proper Error Message is Displayed and Tc_007 is pass");
        } else {
            throw new Exception("Proper Error Message is not Displayed and Tc_007 is fail");
        }
    }

    @Test(alwaysRun = true)
    public void test8() throws Exception {
        String expectedUrl = "https://demowebshop.tricentis.com/";
        String expectedEmail = "vivekpawar@gmail.com";

        login("vivekpawar@gmail.com", "King@3010");

        String actualUrl = driver.getCurrentUrl();
        if (!expectedUrl.equals(actualUrl)) {
            throw new Exception("login is unsuccessfull with valid credential and Tc_008 is fail");
        }

        String actualEmail = driver.findElement(By.className("account")).getText();
        if (actualEmail.contains(expectedEmail)) {
            System.out.println("Proper Login Account is Displayed and Tc_008 is pass");
        } else {
            throw new Exception("Proper Login Account is not Displayed and Tc_008 is fail");
        }
    }

    @Test(alwaysRun = true)
    public void test9() throws Exception {
        login("vivekpawar@gmail.com", "King@3010");

        driver.findElement(By.linkText("14.1-inch Laptop")).click();
        driver.findElement(By.id("add-to-cart-button-31")).click();
        driver.findElement(By.className("ico-cart")).click();

        String actualProduct = driver.findElement(By.linkText("14.1-inch Laptop")).getText();
        if (actualProduct.contains("14.1-inch Laptop")) {
            System.out.println("Proper Required Product is Displayed and Tc_009 is pass");
        } else {
            throw new Exception("Proper Required Product is not Displayed and Tc_009 is fail");
        }
    }

    @Test(alwaysRun = true)
    public void test10() throws Exception {
        login("vivekpawar@gmail.com", "King@3010");

        driver.findElement(By.linkText("14.1-inch Laptop")).click();
        driver.findElement(By.id("add-to-cart-button-31")).click();
        driver.findElement(By.className("ico-cart")).click();
        WebElement removeProduct = driver.findElement(By.name("removefromcart"));
        if (!removeProduct.isSelected()) {
            removeProduct.click();
        }
        driver.findElement(By.name("updatecart")).click();

        String actualMessage = driver.findElement(By.className("order-summary-content")).getText();
        if (actualMessage.toLowerCase().contains("empty")) {
            System.out.println("Proper Added Product Removed is Displayed and Tc_010 is pass");
        } else {
            throw new Exception("Proper Added Product Removed is not Displayed and Tc_010 is fail");
        }
    }
}
