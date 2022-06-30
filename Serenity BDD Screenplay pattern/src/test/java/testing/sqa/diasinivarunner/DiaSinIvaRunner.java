package testing.sqa.diasinivarunner;

import cucumber.api.CucumberOptions;
import cucumber.api.SnippetType;
import net.serenitybdd.cucumber.CucumberWithSerenity;
import org.junit.runner.RunWith;

@RunWith(CucumberWithSerenity.class)

@CucumberOptions(features = "src/test/resources/testing.sqa.features/diaSinIva/diaSinIva.feature",
        glue = "testing.sqa.stepdefinitions.diasinivastepdefinitions",
        snippets = SnippetType.CAMELCASE)

public class DiaSinIvaRunner {
}
