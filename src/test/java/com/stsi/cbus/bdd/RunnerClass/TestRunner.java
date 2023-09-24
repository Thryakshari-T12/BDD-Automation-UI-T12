package com.stsi.cbus.bdd.RunnerClass;


import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;
import org.junit.runner.RunWith;

@RunWith(Cucumber.class)
@CucumberOptions(
        features =  "src/test/java/com/stsi/cbus/bdd/Features",
        glue = {"com/stsi/cbus/bdd/StepDefs"},
        dryRun = false,
        monochrome = true,
        plugin = {
                "json:target/cucumber-reports/AutomationReport.json",
                "json:target/cucumber-reports/cucumber.runtime.formatter.JSONFormatter",
                "pretty", "html:target/cucumber-reports/AutomationReport.html"
        })

public class TestRunner {


}
