package sqa.runners.xiaomirunners;

import cucumber.api.CucumberOptions;
import cucumber.api.SnippetType;
import net.serenitybdd.cucumber.CucumberWithSerenity;
import org.junit.runner.RunWith;

@RunWith(CucumberWithSerenity.class)
@CucumberOptions(features = "src/test/resources/testing.sqa.features/testphonesxiaomi/mobileXiaomiPrices.feature",
        glue = "testing.sqa.stepdefinitions.xiaomistepdefinitions",
        snippets = SnippetType.CAMELCASE)

public class XiaomiPriceRunner {

}
