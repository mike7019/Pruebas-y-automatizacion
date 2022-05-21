package testing.sqa.runners.opticfiberrunners;


import cucumber.api.CucumberOptions;
import cucumber.api.SnippetType;
import net.serenitybdd.cucumber.CucumberWithSerenity;
import org.junit.runner.RunWith;

@RunWith(CucumberWithSerenity.class)
@CucumberOptions(features = "src/test/resources/testing.sqa.features/opticfiber.features/opticFiber.feature",
        glue = "testing.sqa.stepdefinitions.opticfiberstepdefinitions",
        snippets = SnippetType.CAMELCASE)
public class UserChecksOpticFiberRunner {
}
