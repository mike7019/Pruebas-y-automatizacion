package testing.sqa.runners.phonerunners.alcatelrunners;

import cucumber.api.CucumberOptions;
import cucumber.api.SnippetType;
import net.serenitybdd.cucumber.CucumberWithSerenity;
import org.junit.runner.RunWith;

@RunWith(CucumberWithSerenity.class)
@CucumberOptions(features = "src/test/resources/testing.sqa.features/phones.features/testphonesalcatel/mobileAlcatelPrices.feature",
        glue = "testing.sqa.stepdefinitions.phonesstepdefinitions.alcatelstepdefinitions",
        snippets = SnippetType.CAMELCASE)

public class AlcatelPriceRunner {


}
