package sqa.runners.huaweirunners;

import cucumber.api.CucumberOptions;
import cucumber.api.SnippetType;
import net.serenitybdd.cucumber.CucumberWithSerenity;
import org.junit.runner.RunWith;

@RunWith(CucumberWithSerenity.class)
@CucumberOptions(features = "src/test/resources/testing.sqa.features/testphonehuawei/mobileHuaweiPrices.feature",
        glue = "testing.sqa.stepdefinitions.huaweistepdefinitions",
        snippets = SnippetType.CAMELCASE)

public class HuaweiPriceRunner {

}
