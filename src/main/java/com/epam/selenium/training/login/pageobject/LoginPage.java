package com.epam.selenium.training.login.pageobject;

import com.epam.selenium.training.common.BaseClass;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.pagefactory.AjaxElementLocatorFactory;

public class LoginPage<Accaunt> extends BaseClass {

    // Login Elements
    @FindBy(how = How.CSS,using = "form.login")
    private WebElement loginForm;

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

    @FindBy(how = How.CSS, using = "a[href$='customer-logout/']:first-child")
    private WebElement signOutlink;

    //Register Elements
    @FindBy(how = How.ID,using = "reg_email")
    private WebElement regEmailField;

    @FindBy(how = How.ID,using = "reg_password")
    private WebElement regPasswordField;

    @FindBy(how = How.CSS,using = "input[name='register']")
    private WebElement registerButton;

    // message
    @FindBy(how = How.CSS, using = ".woocommerce-error li")
    private WebElement errorMessage;

    @FindBy(how = How.CSS, using = ".woocommerce-MyAccount-content p")
    private WebElement myAccauntMessage;

    public LoginPage() {
        PageFactory.initElements(new AjaxElementLocatorFactory(driver,30),this);
    }

    /**
     * Use this method to process the login in the application. This method requires two parameters
     * @param user = The email of user
     * @param pass = The password of the user
     */
    public void singIn(String user, String pass){
        usernameField.sendKeys(user);
        passwordField.sendKeys(pass);
        loginButton.click();
    }

    /**
     * Use this method to create a new account in the system. This method requires two parameters
     * @param email = A valid email to create the user
     * @param pass = A password for the account
     */
    public void registerUser(String email,String pass){
        regEmailField.sendKeys(email);
        regPasswordField.sendKeys(pass);
        registerButton.click();
    }

    /**
     * Get the response in case the system shows an error en the login o Register process
     * @return = return a message the system shows
     */
    public String getErrorMessage(){
        return errorMessage.getText();
    }

    public String getMessage(){
        return myAccauntMessage.getText();
    }

    public boolean getAttribute(){
        return passwordField.getAttribute("type").equals("password");
    }

    public void ClickOnSingOn(){
        signOutlink.click();
    }

    public Object getLoginForm(){
        return loginForm;
    }
}
