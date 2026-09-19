package TestCases;

import java.io.FileInputStream;
import java.util.List;

import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import org.testng.Assert;
import org.testng.ITestListener;
import org.testng.ITestResult;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;

import com.crm.UtilityClass.BaseClass;
import com.crm.UtilityClass.SeleniumUtility;

@Listeners(AddtesngAnnotation.TestListener.class)
public class AddtesngAnnotation extends BaseClass {

    
    // TEST DATA FILE PATH
    

    static String excelPath =
            ".\\src\\test\\resources\\TestData.xlsx";


    
    // BEFORE SUITE
    

    @BeforeSuite
    public void beforeSuite() {

        System.out.println(
                "========== TEST SUITE START =========="
        );
    }


    
    // BEFORE TEST
    

    @BeforeTest
    public void beforeTest() {

        System.out.println(
                "========== TEST START =========="
        );
    }


    
    // BEFORE METHOD
    

    @BeforeMethod
    public void beforeMethod() {

        System.out.println(
                "Opening browser..."
        );

        BaseClass.precondition();
    }


    
    // TC_001
    // VERIFY HOME PAGE URL
    

    @Test(priority = 1)
    public void tc001_verifyHomePage() {

        String expectedUrl =
                "https://demowebshop.tricentis.com/";

        String actualUrl =
                driver.getCurrentUrl();

        System.out.println(
                "Actual URL : " + actualUrl
        );

        Assert.assertEquals(
                actualUrl,
                expectedUrl,
                "Home page URL is incorrect"
        );

        System.out.println(
                "TC_001 PASS"
        );
    }


    
    // TC_002
    // VERIFY REGISTER DISPLAYED
    

    @Test(priority = 2)
    public void tc002_verifyRegisterDisplayed() {

        WebElement register =
                driver.findElement(
                        By.className("ico-register")
                );

        Assert.assertTrue(
                register.isEnabled(),
                "Register element is not present"
        );

        Assert.assertTrue(
                register.isDisplayed(),
                "Register element is not displayed"
        );

        System.out.println(
                "TC_002 PASS"
        );
    }


    
    // TC_003
    // VERIFY LOGIN DISPLAYED
    

    @Test(priority = 3)
    public void tc003_verifyLoginDisplayed() {

        WebElement login =
                driver.findElement(
                        By.className("ico-login")
                );

        Assert.assertTrue(
                login.isEnabled(),
                "Login element is not present"
        );

        Assert.assertTrue(
                login.isDisplayed(),
                "Login element is not displayed"
        );

        System.out.println(
                "TC_003 PASS"
        );
    }


    
    // TC_004
    // VERIFY SHOPPING CART DISPLAYED
    

    @Test(priority = 4)
    public void tc004_verifyShoppingCartDisplayed() {

        List<WebElement> shoppingCart =
                driver.findElements(
                        By.className("cart-label")
                );

        Assert.assertTrue(
                shoppingCart.size() > 0,
                "Shopping Cart element is not present"
        );

        Assert.assertTrue(
                shoppingCart.get(0).isDisplayed(),
                "Shopping Cart is not displayed"
        );

        System.out.println(
                "TC_004 PASS"
        );
    }


    
    // TC_005
    // VERIFY WISH LIST DISPLAYED
    

    @Test(priority = 5)
    public void tc005_verifyWishListDisplayed() {

        List<WebElement> wishList =
                driver.findElements(
                        By.className("cart-label")
                );

        Assert.assertTrue(
                wishList.size() > 1,
                "Wish List element is not present"
        );

        Assert.assertTrue(
                wishList.get(1).isDisplayed(),
                "Wish List is not displayed"
        );

        System.out.println(
                "TC_005 PASS"
        );
    }


    
    // TC_006
    // VERIFY LOGIN ENABLED
    

    @Test(priority = 6)
    public void tc006_verifyLoginEnabled() {

        List<WebElement> login =
                driver.findElements(
                        By.className("ico-login")
                );

        Assert.assertTrue(
                login.size() > 0,
                "Login element is not present"
        );

        Assert.assertTrue(
                login.get(0).isDisplayed(),
                "Login is not displayed"
        );

        Assert.assertTrue(
                login.get(0).isEnabled(),
                "Login is not enabled"
        );

        System.out.println(
                "TC_006 PASS"
        );
    }


    
    // TC_007
    // INVALID LOGIN
    // DATA PROVIDER USED
    

    @Test(
            priority = 7,
            dataProvider = "invalidLoginData"
    )
    public void tc007_invalidLogin(
            String email,
            String password,
            String expectedMessage) {

        driver.findElement(
                By.className("ico-login")
        ).click();

        driver.findElement(
                By.id("Email")
        ).sendKeys(email);

        driver.findElement(
                By.name("Password")
        ).sendKeys(password);

        driver.findElement(
                By.cssSelector(".button-1.login-button")
        ).click();

        String expectedUrl =
                "https://demowebshop.tricentis.com/login";

        String actualUrl =
                driver.getCurrentUrl();

        Assert.assertEquals(
                actualUrl,
                expectedUrl,
                "User unexpectedly logged in"
        );

        WebElement errorMessage =
                driver.findElement(
                        By.cssSelector(".message-error")
                );

        String actualMessage =
                errorMessage.getText();

        System.out.println(
                "Actual Error Message: " +
                actualMessage
        );

        Assert.assertTrue(
                actualMessage.contains(expectedMessage),
                "Expected error message is not displayed"
        );

        System.out.println(
                "TC_007 PASS"
        );
    }


    
    // TC_008
    // VALID LOGIN
    // DATA PROVIDER USED
    

    @Test(
            priority = 8,
            dataProvider = "validLoginData"
    )
    public void tc008_validLogin(
            String email,
            String password,
            String expectedEmail) {

        driver.findElement(
                By.className("ico-login")
        ).click();

        driver.findElement(
                By.id("Email")
        ).sendKeys(email);

        driver.findElement(
                By.name("Password")
        ).sendKeys(password);

        driver.findElement(
                By.cssSelector(".button-1.login-button")
        ).click();

        String expectedUrl =
                "https://demowebshop.tricentis.com/";

        String actualUrl =
                driver.getCurrentUrl();

        Assert.assertEquals(
                actualUrl,
                expectedUrl,
                "Login was not successful"
        );

        WebElement account =
                driver.findElement(
                        By.className("account")
                );

        String actualEmail =
                account.getText();

        System.out.println(
                "Logged-in Account: " +
                actualEmail
        );

        Assert.assertTrue(
                actualEmail.contains(expectedEmail),
                "Expected account email is not displayed"
        );

        System.out.println(
                "TC_008 PASS"
        );
    }


    
    // TC_009
    // ADD PRODUCT TO SHOPPING CART
    

    @Test(
            priority = 9,
            dataProvider = "productData"
    )
    public void tc009_addProductToCart(
            String productName) {

        // Login
        BaseClass.login();

        // Open product
        driver.findElement(
                By.linkText(productName)
        ).click();

        // Add to cart
        driver.findElement(
                By.id("add-to-cart-button-31")
        ).click();

        List<WebElement> shoppingCart =
                driver.findElements(
                        By.className("ico-cart")
                );

        Assert.assertTrue(
                shoppingCart.size() > 0,
                "Shopping cart icon is not present"
        );

        shoppingCart.get(0).click();

        // Verify product
        WebElement product =
                driver.findElement(
                        By.linkText(productName)
                );

        String actualProduct =
                product.getText();

        System.out.println(
                "Actual Product: " +
                actualProduct
        );

        Assert.assertTrue(
                actualProduct.contains(productName),
                "Product is not present in shopping cart"
        );

        System.out.println(
                "TC_009 PASS"
        );
    }


    
    // TC_010
    // REMOVE PRODUCT FROM SHOPPING CART
    

    @Test(
            priority = 10,
            dependsOnMethods = "tc009_addProductToCart",
            dataProvider = "productData"
    )
    public void tc010_removeProductFromCart(
            String productName) {

        // Login
        BaseClass.login();

        // Open product
        driver.findElement(
                By.linkText(productName)
        ).click();

        // Add product
        driver.findElement(
                By.id("add-to-cart-button-31")
        ).click();

        // Open cart
        driver.findElement(
                By.className("ico-cart")
        ).click();

        // Remove product
        driver.findElement(
                By.name("removefromcart")
        ).click();

        // Update cart
        driver.findElement(
                By.name("updatecart")
        ).click();

        String expectedMessage =
                "Your Shopping Cart is empty!";

        WebElement message =
                driver.findElement(
                        By.className(
                                "order-summary-content"
                        )
                );

        String actualMessage =
                message.getText();

        System.out.println(
                "Actual Message: " +
                actualMessage
        );

        Assert.assertTrue(
                actualMessage.contains(expectedMessage),
                "Shopping Cart is not empty"
        );

        System.out.println(
                "TC_010 PASS"
        );
    }


    
    // DATA PROVIDER - INVALID LOGIN
    

    @DataProvider(name = "invalidLoginData")
    public Object[][] invalidLoginData()
            throws Exception {

        return readExcelData(
                "InvalidLogin"
        );
    }


    
    // DATA PROVIDER - VALID LOGIN
    

    @DataProvider(name = "validLoginData")
    public Object[][] validLoginData()
            throws Exception {

        return readExcelData(
                "ValidLogin"
        );
    }


    
    // DATA PROVIDER - PRODUCT
    

    @DataProvider(name = "productData")
    public Object[][] productData()
            throws Exception {

        return readExcelData(
                "Product"
        );
    }


    
    // EXCEL READER
    

    public Object[][] readExcelData(
            String sheetName)
            throws Exception {

        FileInputStream fis =
                new FileInputStream(excelPath);

        Workbook workbook =
                new XSSFWorkbook(fis);

        Sheet sheet =
                workbook.getSheet(sheetName);

        int rows =
                sheet.getPhysicalNumberOfRows();

        int columns =
                sheet.getRow(0)
                     .getPhysicalNumberOfCells();

        Object[][] data =
                new Object[rows - 1][columns];

        for (int i = 1; i < rows; i++) {

            Row row =
                    sheet.getRow(i);

            for (int j = 0; j < columns; j++) {

                data[i - 1][j] =
                        row.getCell(j)
                           .toString();
            }
        }

        workbook.close();

        fis.close();

        return data;
    }


    
    // AFTER METHOD
    

    @AfterMethod
    public void afterMethod(
            ITestResult result) {

        if (result.getStatus() ==
                ITestResult.FAILURE) {

            String testName =
                    result.getName();

            System.out.println(
                    "Test failed: " + testName
            );

            SeleniumUtility.webPageScreenshot(
                    driver,
                    testName
            );
        }

        BaseClass.postCondition();
    }


    
    // AFTER TEST
    

    @AfterTest
    public void afterTest() {

        System.out.println(
                "========== TEST END =========="
        );
    }


    
    // AFTER SUITE
    

    @AfterSuite
    public void afterSuite() {

        System.out.println(
                "========== TEST SUITE END =========="
        );
    }


    
    // TESTNG LISTENER
    

    public static class TestListener
            implements ITestListener {

        @Override
        public void onTestStart(
                ITestResult result) {

            System.out.println(
                    "STARTED: " +
                    result.getName()
            );
        }

        @Override
        public void onTestSuccess(
                ITestResult result) {

            System.out.println(
                    "PASSED: " +
                    result.getName()
            );
        }

        @Override
        public void onTestFailure(
                ITestResult result) {

            System.out.println(
                    "FAILED: " +
                    result.getName()
            );
        }

        @Override
        public void onTestSkipped(
                ITestResult result) {

            System.out.println(
                    "SKIPPED: " +
                    result.getName()
            );
        }
    }
}