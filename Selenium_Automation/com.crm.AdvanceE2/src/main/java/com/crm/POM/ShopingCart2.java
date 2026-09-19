package com.crm.POM;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;

public class ShopingCart2 {

    @FindBy(className = "ico-cart")
    private WebElement cartIcon;

    @FindBy(xpath = "//td[@class='product']/a")
    private List<WebElement> productNames;

    @FindBy(name = "continueshopping")
    private WebElement continueShoppingButton;

    @FindBy(name = "applydiscountcouponcode")
    private WebElement applyCouponButton;

    @FindBy(name = "discountcouponcode")
    private WebElement couponCodeField;

    @FindBy(name = "giftcardcouponcode")
    private WebElement giftCardCodeField;

    @FindBy(name = "applygiftcardcouponcode")
    private WebElement applyGiftCardButton;

    @FindBy(css = ".country-input")
    private WebElement countryDropdown;

    @FindBy(id = "termsofservice")
    private WebElement termsAgreement;

    @FindBy(id = "checkout")
    private WebElement checkoutButton;


    public ShopingCart2(WebDriver driver) {
        PageFactory.initElements(driver, this);
    }


    public void clickCartIcon() {
        cartIcon.click();
    }


    public void removeProduct(String productToRemove) {

        for (WebElement product : productNames) {

            String productName = product.getText();

            if (productName.contains(productToRemove)) {

                WebElement removeCheckbox =
                        product.findElement(
                                By.xpath("./ancestor::tr//input[@type='checkbox']")
                        );

                removeCheckbox.click();

                product.findElement(
                        By.xpath("//input[@name=\"updatecart\"]")
                ).click();

                break;
            }
        }
    }


    public void changeProductQuantity(String productToChange, String quantity) {

        for (WebElement product : productNames) {

            String productName = product.getText();

            if (productName.contains(productToChange)) {

                WebElement quantityField =
                        product.findElement(
                                By.xpath("./ancestor::tr//input[@type='text']")
                        );

                quantityField.clear();
                quantityField.sendKeys(quantity);

                break;
            }
        }
    }


    public void clickContinueShopping() {
        continueShoppingButton.click();
    }


    public void applyCoupon(String couponValue) {
        couponCodeField.sendKeys(couponValue);
        applyCouponButton.click();
    }


    public void applyGiftCard(String giftCardValue) {
        giftCardCodeField.sendKeys(giftCardValue);
        applyGiftCardButton.click();
    }


    public void selectCountry(String countryName) {
        Select selectCountry = new Select(countryDropdown);
        selectCountry.selectByVisibleText(countryName);
    }


    public void acceptTermsAndConditions() {
        termsAgreement.click();
    }


    public void clickCheckout() {
        checkoutButton.click();
    }
}