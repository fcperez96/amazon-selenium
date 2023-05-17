package com.youtube.amazonselenium.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class AmazonHomePage {
    @FindBy(id = "twotabsearchtextbox")
    private WebElement searchBox;
    @FindBy(id = "nav-search-submit-button")
    private WebElement searchButton;

    public AmazonHomePage(WebDriver driver) {
        PageFactory.initElements(driver, this);
    }

    public void searchProduct(String product) {
        searchBox.sendKeys(product);
        searchButton.click();
    }
}
