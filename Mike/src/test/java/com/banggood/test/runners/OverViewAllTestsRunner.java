package com.banggood.test.runners;

import cucumber.api.CucumberOptions;
import cucumber.api.SnippetType;
import net.serenitybdd.cucumber.CucumberWithSerenity;
import org.junit.runner.RunWith;

@RunWith(CucumberWithSerenity.class)
@CucumberOptions(
        features = "src/test/resources/features",
        glue ="com.banggood.test/stepdefinitions",
        snippets = SnippetType.CAMELCASE,
        tags= {"@SmokeTest"}

)
public class OverViewAllTestsRunner {

}
