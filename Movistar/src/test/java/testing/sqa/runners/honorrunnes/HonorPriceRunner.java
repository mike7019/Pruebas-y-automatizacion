package testing.sqa.runners.honorrunnes;

import cucumber.api.CucumberOptions;
import cucumber.api.SnippetType;
import net.serenitybdd.cucumber.CucumberWithSerenity;
import org.junit.runner.RunWith;

@RunWith(CucumberWithSerenity.class)
@CucumberOptions(features = "src/test/resources/testing.sqa.features/testphoneshonor/mobileHonorPrices.feature",
        glue = "testing.sqa.stepdefinitions.honorstepdefinitions",
        snippets = SnippetType.CAMELCASE)

public class HonorPriceRunner {

}
