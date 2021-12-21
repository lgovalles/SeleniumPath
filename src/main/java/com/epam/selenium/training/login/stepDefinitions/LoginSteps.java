package com.epam.selenium.training.login.stepDefinitions;

import com.epam.selenium.training.common.BaseClass;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;
import org.openqa.selenium.By;

public class LoginSteps extends BaseClass {

    @Given("I am in the login page")
    public void i_am_in_the_login_page() {

        String testshop = driver.findElement(By.id("menu-item-40")).getText();

        System.out.println("Given" + testshop);
    }

    @When("Type my user and my pass")
    public void type_my_user_and_my_pass(io.cucumber.datatable.DataTable dataTable) {
        System.out.println("When");
    }
    @Then("The main page should be open")
    public void the_main_page_should_be_open() {
        System.out.println("Then");
        Assert.assertTrue(true == true);
    }
}
