package testing.sqa.runners.samsungrunners;

import cucumber.api.CucumberOptions;
import cucumber.api.SnippetType;
import net.serenitybdd.cucumber.CucumberWithSerenity;
import org.junit.runner.RunWith;

@RunWith(CucumberWithSerenity.class)
@CucumberOptions(features = "src/test/resources/testing.sqa.features/testphonessamsung/mobileSamsungPrices.feature",
        glue = "testing.sqa.stepdefinitions.samsungstepdefinitions",
        snippets = SnippetType.CAMELCASE)

public class SamsungPriceRunner {

}
