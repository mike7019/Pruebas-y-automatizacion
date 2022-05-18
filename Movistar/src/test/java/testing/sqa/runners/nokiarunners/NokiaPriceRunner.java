package testing.sqa.runners.nokiarunners;

import cucumber.api.CucumberOptions;
import cucumber.api.SnippetType;
import net.serenitybdd.cucumber.CucumberWithSerenity;
import org.junit.runner.RunWith;

@RunWith(CucumberWithSerenity.class)
@CucumberOptions(features = "src/test/resources/testing.sqa.features/testphonesnokia/mobilenokiaPrices.feature",
        glue = "testing.sqa.stepdefinitions.nokiastepdefinitions",
        snippets = SnippetType.CAMELCASE)

public class NokiaPriceRunner {

}
