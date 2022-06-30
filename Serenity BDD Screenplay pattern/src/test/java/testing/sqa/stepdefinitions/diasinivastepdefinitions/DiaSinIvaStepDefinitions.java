package testing.sqa.stepdefinitions.diasinivastepdefinitions;

import cucumber.api.java.Before;
import cucumber.api.java.en.*;
import drivers.DriverRemoteBrowser;
import net.serenitybdd.screenplay.abilities.BrowseTheWeb;
import net.serenitybdd.screenplay.actors.OnStage;
import net.serenitybdd.screenplay.actors.OnlineCast;
import tasks.ValidatesThePrice;

public class DiaSinIvaStepDefinitions {

    @Before
    public void setStage() {
        OnStage.setTheStage(new OnlineCast());
    }

    @Given("^That Brandon visit the (.*)$")
    public void thatBrandonVisitTheWebsite(String site) {

        DriverRemoteBrowser.chromeHisBrowserWeb();
        OnStage.theActorCalled("Brandon").can(BrowseTheWeb.with(DriverRemoteBrowser.on(site)));

    }

    @When("^Brandon clicks on the link and sees the price on the site$")
    public void brandonClicksOnTheLinkAndSeesThePriceOnTheSite() {
        OnStage.theActorInTheSpotlight().attemptsTo(
                ValidatesThePrice.on()
        );

    }

    @Then("^Validates that the price matches with the data provided$")
    public void validatesThatThePriceMatchesWithTheDataProvided() {

    }


}
