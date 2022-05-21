package testing.sqa.runners.phonerunners.xiaomirunners;

import cucumber.api.CucumberOptions;
import cucumber.api.SnippetType;
import net.serenitybdd.cucumber.CucumberWithSerenity;
import org.junit.runner.RunWith;

@RunWith(CucumberWithSerenity.class)
@CucumberOptions(features = "src/test/resources/testing.sqa.features/phones.features/testphonesxiaomi/mobileXiaomiPrices.feature",
        glue = "testing.sqa.stepdefinitions.phonesstepdefinitions.xiaomistepdefinitions",
        snippets = SnippetType.CAMELCASE)

public class XiaomiPriceRunner {

}
