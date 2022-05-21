package testing.sqa.runners.phonerunners.samsungrunners;

import cucumber.api.CucumberOptions;
import cucumber.api.SnippetType;
import net.serenitybdd.cucumber.CucumberWithSerenity;
import org.junit.runner.RunWith;

@RunWith(CucumberWithSerenity.class)
@CucumberOptions(features = "src/test/resources/testing.sqa.features/phones.features/testphonessamsung/mobileSamsungPrices.feature",
        glue = "testing.sqa.stepdefinitions.phonesstepdefinitions.samsungstepdefinitions",
        snippets = SnippetType.CAMELCASE)

public class SamsungPriceRunner {

}
