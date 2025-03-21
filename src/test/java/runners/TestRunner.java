package runners;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;
import org.junit.runner.RunWith;

@RunWith(Cucumber.class)
@CucumberOptions(
        features = {"src/test/java/features"},
        glue = {"stepdefinitions"},
      // dryRun = true,
        plugin = {"pretty",
                "html:target/Cucmber_reports/cucumber-pretty.html",
                "json:target/Cucmber_reports/CucumberTestReport.json",
                "junit:target/Cucmber_reports/cucumber-pretty-Junit",
        },
        monochrome = true,
        tags = "@P500"
)
public class TestRunner {

}
