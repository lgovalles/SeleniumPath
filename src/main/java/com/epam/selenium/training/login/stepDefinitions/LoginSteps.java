package com.epam.selenium.training.login.stepDefinitions;


import com.epam.selenium.training.login.pageobject.LoginPage;
import io.cucumber.datatable.DataTable;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;

import java.util.List;

public class LoginSteps {

    private LoginPage login;

    public LoginSteps() {
        this.login = new LoginPage();
    }

    @And("Type my user and my pass")
    public void type_my_user_and_my_pass(DataTable dataTable) {
        List<String> dataUser = dataTable.asList(String.class);
        login.singIn(dataUser.get(0),dataUser.get(1));
    }

    @Then("The main page should be open")
    public void the_main_page_should_be_open() {
        String message = "Hello Testusername (not Testusername? Sign out)";
        Assert.assertEquals(message,login.getMessage());
    }

    @And("Type the user {string} and the pass {string}")
    public void type_the_user_and_the_pass(String user, String pass) {
        login.singIn(user,pass);
    }

    @Then("The system should show the error {string}")
    public void
    the_system_should_show_the_error(String error) {
        Assert.assertEquals(error,login.getErrorMessage());
    }

    @When("Type my password {string}")
    public void type_my_password(String pass) {
        login.singIn("",pass);
    }
    @Then("The system should masked it")
    public void the_system_should_masked_it() {
        Assert.assertTrue(login.getAttribute());
    }

    @And("Click on Sign out")
    public void  click_on_sign_out() {
        login.ClickOnSingOn();
    }
    @Then("should redirect to login page")
    public void should_redirect_to_login_page() {
        Assert.assertNotNull(login.getLoginForm());
    }

}
