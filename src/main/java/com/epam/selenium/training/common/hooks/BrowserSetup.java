package com.epam.selenium.training.common.hooks;

import com.epam.selenium.training.common.BaseClass;
import io.cucumber.java.After;
import io.cucumber.java.Before;
import io.cucumber.java.BeforeAll;
import io.cucumber.java.Scenario;
import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
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

    @After
    public void teardown(Scenario scenario){
        try{
            String screenshotName = scenario.getName().replaceAll(" ","");
            if(scenario.isFailed()){
                scenario.log("This is my failure message");
                TakesScreenshot ts = (TakesScreenshot)driver;
                byte[] screenshot = ts.getScreenshotAs(OutputType.BYTES);
                scenario.attach(screenshot,"image/png",screenshotName);
            }
        }catch (Exception e){
            e.printStackTrace();
        }
        driver.quit();
    }
}
