package co.com.choucair.certification.runner;

import io.cucumber.junit.CucumberOptions;
import net.serenitybdd.cucumber.CucumberWithSerenity;
import org.junit.runner.RunWith;

@RunWith(CucumberWithSerenity.class)
@CucumberOptions(
        features = "src/test/resources/features",
        glue = {"co.com.choucair.certification.stepdefinitions"},
        snippets = CucumberOptions.SnippetType.CAMELCASE
)
public class CucumberTestSuiteRunner {
}