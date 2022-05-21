package testing.sqa.runners.phonerunners.huaweirunners;

import cucumber.api.CucumberOptions;
import cucumber.api.SnippetType;
import net.serenitybdd.cucumber.CucumberWithSerenity;
import org.junit.runner.RunWith;

@RunWith(CucumberWithSerenity.class)
@CucumberOptions(features = "src/test/resources/testing.sqa.features/phones.features/testphonehuawei/mobileHuaweiPrices.feature",
        glue = "testing.sqa.stepdefinitions.phonesstepdefinitions.huaweistepdefinitions",
        snippets = SnippetType.CAMELCASE)

public class HuaweiPriceRunner {

}
