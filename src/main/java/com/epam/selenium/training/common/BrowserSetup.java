package com.epam.selenium.training.common;

import io.cucumber.java.After;
import io.cucumber.java.Before;
import io.cucumber.java.BeforeAll;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

import java.time.Duration;

public class BrowserSetup extends BaseClass {

    @BeforeAll
    public static void setupDriver(){
        WebDriverManager.chromedriver().setup();
        WebDriverManager.firefoxdriver().setup();
    }

    @Before
    public void initDriver(){
        browser = System.getProperty("browser", "chrome");
        switch(browser) {
            case "firefox":
                System.out.println("Firefox--------");
                driver = new FirefoxDriver();
                break;
            case "chrome":
                System.out.println("Chrome--------");
                driver = new ChromeDriver();
                break;
            default:
                throw new RuntimeException("Unsupported webdriver: " + browser);
        }

        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));


    }

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
    @After
    public void teardown(){
        driver.quit();
    }
}
