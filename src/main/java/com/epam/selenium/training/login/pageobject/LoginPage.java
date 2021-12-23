package com.epam.selenium.training.login.pageobject;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;

public class LoginPage {

    // Login Elements
    @FindBy(how = How.ID, using = "username")
    private WebElement usernameField;

    @FindBy(how = How.ID, using = "password")
    private WebElement passwordField;

    @FindBy(how = How.CSS, using = "input[name='login']")
    private WebElement loginButton;

    @FindBy(how = How.ID, using = "rememberme")
    private WebElement rememberCheckbox;

    @FindBy(how = How.CLASS_NAME,using = ".lost_password")
    private WebElement lossPasswordLink;

    //Register Elements
    @FindBy(how = How.ID,using = "reg_email")
    private WebElement regEmailField;

    @FindBy(how = How.ID,using = "reg_password")
    private WebElement regPasswordField;

    @FindBy(how = How.CSS,using = "input[name='register']")
    private WebElement registerButton;

}
