package com.epam.selenium.training.common;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.openqa.selenium.By;

public class Preconditions extends BaseClass{
    @Given("I am the main page")
    public void i_am_the_main_page() {
        driver.get(this.baseURL);
    }
    @When("Navigate to My Account page")
    public void navigate_to_my_account_page() {
        driver.findElement(By.id("menu-item-50")).click();
    }
    @Then("I should see the Login form")
    public void i_should_see_the_login_form() {
        boolean isLogin = driver.findElement(By.cssSelector("form.login")).isDisplayed();
    }
}
