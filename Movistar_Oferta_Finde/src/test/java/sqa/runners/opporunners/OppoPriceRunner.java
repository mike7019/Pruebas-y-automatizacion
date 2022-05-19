package sqa.runners.opporunners;

import cucumber.api.CucumberOptions;
import cucumber.api.SnippetType;
import net.serenitybdd.cucumber.CucumberWithSerenity;
import org.junit.runner.RunWith;

@RunWith(CucumberWithSerenity.class)
@CucumberOptions(features = "src/test/resources/testing.sqa.features/testphoneoppo/mobileOppoPrices.feature",
        glue = "testing.sqa.stepdefinitions.oppostepdefinitions",
        snippets = SnippetType.CAMELCASE)

public class OppoPriceRunner {

}
