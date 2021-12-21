package com.epam.selenium.training.login.runners;

import org.junit.runner.RunWith;
import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;

@RunWith(Cucumber.class)
@CucumberOptions(features = {"src/main/resources/features/login"}, glue = {"com.epam.selenium.training.login.stepDefinitions","com.epam.selenium.training.common"})
public class Runner {
    
}
