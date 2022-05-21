package testing.sqa.runners.phonerunners.tclrunners;

import cucumber.api.CucumberOptions;
import cucumber.api.SnippetType;
import net.serenitybdd.cucumber.CucumberWithSerenity;
import org.junit.runner.RunWith;

@RunWith(CucumberWithSerenity.class)
@CucumberOptions(features = "src/test/resources/testing.sqa.features/phones.features/testphonetcl/mobileTclPrices.feature",
        glue = "testing.sqa.stepdefinitions.phonesstepdefinitions.tclstepdefinitions",
        snippets = SnippetType.CAMELCASE)

public class TclPriceRunner {

}
