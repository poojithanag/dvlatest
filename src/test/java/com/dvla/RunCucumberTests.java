package com.dvla;

import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;
import org.junit.runner.RunWith;

@RunWith(Cucumber.class)
@CucumberOptions(features = "src/test/resources/features", strict = true, tags = {"@dvla"}, format = {"pretty", "html:target/reports/cucumber/html"}, plugin = {"json:target/cucumber.json"})
public class RunCucumberTests {
}
