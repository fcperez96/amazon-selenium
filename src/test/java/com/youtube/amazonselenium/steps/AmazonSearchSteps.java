package com.youtube.amazonselenium.steps;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

import static com.youtube.amazonselenium.steps.HookStep.*;
import static org.assertj.core.api.Assertions.assertThat;

public class AmazonSearchSteps {
    @Given("I am on the Amazon home page")
    public void iAmOnTheAmazonHomePage() {
        driver.get("https://www.amazon.com/");
    }

    @When("I search for {string}")
    public void iSearchFor(String product) {
        homePage.searchProduct(product);
    }

    @And("I select the first result")
    public void iSelectTheFirstResult() {
        resultsPage.selectFirstProduct();
    }

    @And("I add the product to the cart")
    public void iAddTheProductToTheCart() {
        resultsPage.addToCart();
    }

    @Then("I should see the product in the cart")
    public void iShouldSeeTheProductInTheCart() {
        assertThat(resultsPage.getCartCounter()).isEqualTo("1");
        assertThat(resultsPage.getVisibilityOfProceedCheckoutButton()).isTrue();
    }
}
