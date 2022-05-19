package sqa.runners.realmerunners;

import cucumber.api.CucumberOptions;
import cucumber.api.SnippetType;
import net.serenitybdd.cucumber.CucumberWithSerenity;
import org.junit.runner.RunWith;

@RunWith(CucumberWithSerenity.class)
@CucumberOptions(features = "src/test/resources/testing.sqa.features/testphonerealme/mobileRealmePrices.feature",
        glue = "testing.sqa.stepdefinitions.realmestepdefinitions",
        snippets = SnippetType.CAMELCASE)

public class RealmePriceRunner {

}
