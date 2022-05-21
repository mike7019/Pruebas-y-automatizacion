package testing.sqa.runners.phonerunners.realmerunners;

import cucumber.api.CucumberOptions;
import cucumber.api.SnippetType;
import net.serenitybdd.cucumber.CucumberWithSerenity;
import org.junit.runner.RunWith;

@RunWith(CucumberWithSerenity.class)
@CucumberOptions(features = "src/test/resources/testing.sqa.features/phones.features/testphonerealme/mobileRealmePrices.feature",
        glue = "testing.sqa.stepdefinitions.phonesstepdefinitions.realmestepdefinitions",
        snippets = SnippetType.CAMELCASE)

public class RealmePriceRunner {

}
