package co.com.choucair.certification.runner;


import io.cucumber.junit.CucumberOptions;
import net.serenitybdd.cucumber.CucumberWithSerenity;
import org.junit.runner.RunWith;

@RunWith(CucumberWithSerenity.class)
@CucumberOptions(
        glue = {"co/com/choucair/certification/stepdefinitions"},
        features = {"src/test/resources/features/login.feature"},
        tags = "@smoke",
        snippets = CucumberOptions.SnippetType.CAMELCASE
)
public class RunnerTestLoginUser {
}