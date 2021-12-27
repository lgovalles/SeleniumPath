package com.epam.selenium.training.common.steps;


import com.epam.selenium.training.common.pages.MainMenu;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;


public class MainSteps {

    private MainMenu menu;

    public MainSteps() {
        this.menu = new MainMenu();
    }

    @Given("I am the main page")
    public void i_am_the_main_page() {
        menu.NavigateTo();
    }

    @When("I am in the login page")
    public void i_am_in_the_login_page() {
        menu.ClickOnMyAccount();
    }

    @Then("Click on back button")
    public void click_on_back_button() {
        menu.NavigateBack();
    }
}
