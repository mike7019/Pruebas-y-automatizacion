package testing.sqa.runners.phonerunners.nokiarunners;

import cucumber.api.CucumberOptions;
import cucumber.api.SnippetType;
import net.serenitybdd.cucumber.CucumberWithSerenity;
import org.junit.runner.RunWith;

@RunWith(CucumberWithSerenity.class)
@CucumberOptions(features = "src/test/resources/testing.sqa.features/phones.features/testphonesnokia/mobileNokiaPrices.feature",
        glue = "testing.sqa.stepdefinitions.phonesstepdefinitions.nokiastepdefinitions",
        snippets = SnippetType.CAMELCASE)

public class NokiaPriceRunner {

}
