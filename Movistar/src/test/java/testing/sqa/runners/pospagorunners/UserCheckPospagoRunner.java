package testing.sqa.runners.pospagorunners;


import cucumber.api.CucumberOptions;
import cucumber.api.SnippetType;
import net.serenitybdd.cucumber.CucumberWithSerenity;
import org.junit.runner.RunWith;

@RunWith(CucumberWithSerenity.class)


@CucumberOptions(features = "src/test/resources/testing.sqa.features/pospago.features/userChecksPospago.feature",
        glue = "testing.sqa.stepdefinitions.usercheckspospagostepdefinitions",
        snippets = SnippetType.CAMELCASE)
public class UserCheckPospagoRunner {
}
