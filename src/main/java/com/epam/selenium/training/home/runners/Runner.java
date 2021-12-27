package com.epam.selenium.training.home.runners;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;
import org.junit.runner.RunWith;

@RunWith(Cucumber.class)
@CucumberOptions(
                features = {"src/main/resources/features/HomePage"},
                glue = {"com.epam.selenium.training.home.stepDefinitions","com.epam.selenium.training.common"},
                plugin = {"com.aventstack.extentreports.cucumber.adapter.ExtentCucumberAdapter:"}
)
public class Runner {
}
