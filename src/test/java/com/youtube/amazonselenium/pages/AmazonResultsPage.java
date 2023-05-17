package com.youtube.amazonselenium.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import java.util.List;

public class AmazonResultsPage {
    @FindBy(xpath = "//div[@data-component-type='s-search-result']//div[@class='aok-relative']")
    private List<WebElement> products;
    @FindBy(id = "add-to-cart-button")
    private WebElement addToCartButton;
    @FindBy(id = "nav-cart-count")
    private WebElement cartCounter;
    @FindBy(name = "proceedToRetailCheckout")
    private WebElement proceedToRetailCheckoutButton;

    public AmazonResultsPage(WebDriver driver) {
        PageFactory.initElements(driver, this);
    }

    public void selectFirstProduct() {
        products.get(0).click();
    }

    public void addToCart() {
        addToCartButton.click();
    }

    public String getCartCounter() {
        return cartCounter.getText();
    }

    public boolean getVisibilityOfProceedCheckoutButton() {
        return proceedToRetailCheckoutButton.isDisplayed();
    }
}
