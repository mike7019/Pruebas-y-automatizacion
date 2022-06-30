package testing.sqa.runners.weekendaccesoriesrunners;


import cucumber.api.CucumberOptions;
import cucumber.api.SnippetType;
import net.serenitybdd.cucumber.CucumberWithSerenity;
import org.junit.runner.RunWith;

@RunWith(CucumberWithSerenity.class)
@CucumberOptions(features = "src/test/resources/testing.sqa.features/weekendaccesories.features/userChecksAccesories.feature",
        glue = "testing.sqa.stepdefinitions.weekendaccesoriesstepdefinitions",
        snippets = SnippetType.CAMELCASE)
public class UserChecksWeekendAccesoriesRunner {
}
