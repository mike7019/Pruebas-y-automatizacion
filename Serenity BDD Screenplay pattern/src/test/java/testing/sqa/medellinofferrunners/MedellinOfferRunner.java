package testing.sqa.medellinofferrunners;


import cucumber.api.CucumberOptions;
import cucumber.api.SnippetType;
import net.serenitybdd.cucumber.CucumberWithSerenity;
import org.junit.runner.RunWith;

@RunWith(CucumberWithSerenity.class)

@CucumberOptions(features = "src/test/resources/testing.sqa.features/medellinOffer.features/medellinOffer.feature",
        glue = "testing.sqa.stepdefinitions.medellinofferstepdefinitions",
        snippets = SnippetType.CAMELCASE)
public class MedellinOfferRunner {
}
