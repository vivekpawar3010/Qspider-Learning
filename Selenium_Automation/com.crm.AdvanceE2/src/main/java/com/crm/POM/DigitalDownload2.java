
package com.crm.POM;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;

public class DigitalDownload2 {

    @FindBy(xpath = "(//div[@class='header-menu']/ul/li/a)[5]")
    private WebElement digitalDownloadButton;

    @FindBy(id = "products-orderby")
    private WebElement sortByDropdown;

    @FindBy(id = "products-pagesize")
    private WebElement pageSizeDropdown;

    @FindBy(id = "products-viewmode")
    private WebElement viewModeDropdown;


    // Constructor
    public DigitalDownload2(WebDriver driver) {
        PageFactory.initElements(driver, this);
    }


    // Click Digital Download
    public void clickDigitalDownload() {
        digitalDownloadButton.click();
    }


    // Sort Products
    public void sortBy(String value) {
        Select select = new Select(sortByDropdown);
        select.selectByVisibleText(value);
    }


    // Change Page Size
    public void display(String value) {
        Select select = new Select(pageSizeDropdown);
        select.selectByVisibleText(value);
    }


    // Change View Mode
    public void viewAs(String value) {
        Select select = new Select(viewModeDropdown);
        select.selectByVisibleText(value);
    }
}
