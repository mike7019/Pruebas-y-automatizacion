package testing.sqa.runners;


import cucumber.api.CucumberOptions;
import cucumber.api.SnippetType;
import net.serenitybdd.cucumber.CucumberWithSerenity;
import org.junit.runner.RunWith;

@RunWith(CucumberWithSerenity.class)
@CucumberOptions(features = "src/test/resources/testing.sqa.features/userChecksPospago.feature",
        glue = "testing.sqa.stepdefinitions",
        snippets = SnippetType.CAMELCASE)
public class UserCheckPospagoRunner {
}
