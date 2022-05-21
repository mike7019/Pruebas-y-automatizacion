package testing.sqa.runners.phonerunners.vivorunners;

import cucumber.api.CucumberOptions;
import cucumber.api.SnippetType;
import net.serenitybdd.cucumber.CucumberWithSerenity;
import org.junit.runner.RunWith;

@RunWith(CucumberWithSerenity.class)
@CucumberOptions(features = "src/test/resources/testing.sqa.features/phones.features/testphonesvivo/mobileVivoPrices.feature",
        glue = "testing.sqa.stepdefinitions.phonesstepdefinitions.vivostepdefinitions",
        snippets = SnippetType.CAMELCASE)

public class VivoPriceRunner {

}
