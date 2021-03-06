package testing.sqa.runners;

import cucumber.api.CucumberOptions;
import cucumber.api.SnippetType;
import net.serenitybdd.cucumber.CucumberWithSerenity;
import org.junit.runner.RunWith;

//Setting up annotations to use Cucumber Framework
@RunWith(CucumberWithSerenity.class)
@CucumberOptions(features = "src/test/resources/testing.sqa.features/userChecksPostpago.feature",
        glue = "testing.sqa.stepdefinitions",
        snippets = SnippetType.CAMELCASE)

public class UserChecksPostpagoRunner {

}
