package com.google.android.youtube.runners;

import cucumber.api.CucumberOptions;
import cucumber.api.SnippetType;
import net.serenitybdd.cucumber.CucumberWithSerenity;
import org.junit.runner.RunWith;

@RunWith(CucumberWithSerenity.class)
@CucumberOptions(features = "src/test/resources/features/youtube.feature",
glue = "com.google.android.youtube.stepDefinitions",
snippets = SnippetType.CAMELCASE)


public class SearchRunner {
}
