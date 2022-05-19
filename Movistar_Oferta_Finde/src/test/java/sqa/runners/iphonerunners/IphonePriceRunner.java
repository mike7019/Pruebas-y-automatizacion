package sqa.runners.iphonerunners;

import cucumber.api.CucumberOptions;
import cucumber.api.SnippetType;
import net.serenitybdd.cucumber.CucumberWithSerenity;
import org.junit.runner.RunWith;

@RunWith(CucumberWithSerenity.class)
@CucumberOptions(features = "src/test/resources/testing.sqa.features/testphonesiphone/mobileIphonePrices.feature",
        glue = "testing.sqa.stepdefinitions.iphonestepdefinitions",
        snippets = SnippetType.CAMELCASE)

public class IphonePriceRunner {
}
