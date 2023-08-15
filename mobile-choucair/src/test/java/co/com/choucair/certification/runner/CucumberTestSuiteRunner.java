package co.com.choucair.certification.runner;

import io.cucumber.junit.CucumberOptions;
import net.serenitybdd.cucumber.CucumberWithSerenity;
import org.junit.runner.RunWith;

@RunWith(CucumberWithSerenity.class)
@CucumberOptions(
        features = "src/test/resources/features",
        plugin = {"pretty", "html:target/cucumber", "json:target/runnertest.login.RunnerTestLoginUser.json"},
        glue = {"co.com.choucair.certification.stepdefinitions"},
        snippets = CucumberOptions.SnippetType.CAMELCASE
)
public class CucumberTestSuiteRunner {
}