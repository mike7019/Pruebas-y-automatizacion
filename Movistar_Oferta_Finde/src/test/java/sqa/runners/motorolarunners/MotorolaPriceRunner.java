package sqa.runners.motorolarunners;

import cucumber.api.CucumberOptions;
import cucumber.api.SnippetType;
import net.serenitybdd.cucumber.CucumberWithSerenity;
import org.junit.runner.RunWith;

@RunWith(CucumberWithSerenity.class)
@CucumberOptions(features = "src/test/resources/testing.sqa.features/testphonesmotorola/mobileMotorolaPrices.feature",
        glue = "testing.sqa.stepdefinitions.motorolastepdefinitions",
        snippets = SnippetType.CAMELCASE)

public class MotorolaPriceRunner {

    String name;
    Double price;
    Integer quantity;

    public MotorolaPriceRunner(String name, Double price, Integer quantity) {
        this.name = name;
        this.price = price;
        this.quantity = quantity;
    }
}
