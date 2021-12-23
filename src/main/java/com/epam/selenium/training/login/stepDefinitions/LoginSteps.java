package com.epam.selenium.training.login.stepDefinitions;

import com.epam.selenium.training.common.BaseClass;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;
import org.openqa.selenium.By;

public class LoginSteps extends BaseClass {

    /**
     *
     */
    @When("I am in the login page")
    public void i_am_in_the_login_page() {

        String testshop = driver.findElement(By.id("menu-item-40")).getText();

        System.out.println("Given" + testshop);
    }

    @And("Type my user and my pass")
    public void type_my_user_and_my_pass(io.cucumber.datatable.DataTable dataTable) {
        System.out.println("When");
    }

    @Then("The main page should be open")
    public void the_main_page_should_be_open() {
        System.out.println("Then");
        Assert.assertTrue(true == true);
    }

    /**
     *
     * @param user
     * @param pass
     */
    @And("Type the user {string} and the pass {string}")
    public void type_the_user_and_the_pass(String user, String pass) {
        System.out.println(String.format("User %s %s", user, pass) );
    }
    @Then("The system should show the error {string}")
    public void the_system_should_show_the_error(String error) {
        System.out.println(String.format("Error %s", error) );
    }

    /***
     *
     * @param pass
     */

    @When("Type my password {string}")
    public void type_my_password(String pass) {
        System.out.println(String.format("Pass : %s",pass));
    }
    @Then("The system should masked it")
    public void the_system_should_masked_it() {

    }

    /**
     *
     */
    @When("I am login in my account")
    public void i_am_login_in_my_account() {

    }
    @When("Click on Sign out")
    public void click_on_sign_out() {

    }
    @Then("If i click on back button should redirect to general page")
    public void if_i_click_on_back_button_should_redirect_to_general_page() {

    }
}
