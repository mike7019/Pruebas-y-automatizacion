package sqa.stepdefinitions.realmestepdefinitions;

import cucumber.api.java.Before;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import net.serenitybdd.screenplay.abilities.BrowseTheWeb;
import net.serenitybdd.screenplay.actors.OnStage;
import net.serenitybdd.screenplay.actors.OnlineCast;
import testing.sqa.drivers.DriverRemoteBrowser;
import testing.sqa.interactions.ReviewThePhones;
import testing.sqa.tasks.GoToOppoPhonePage;
import testing.sqa.tasks.GoToRealmePhonePage;

public class RealmePricesStepDefinitions {

    @Before
    public void setStage() {
        OnStage.setTheStage(new OnlineCast());
    }


    @Given("^that Brandon goes to (.*)$")
    public void thatBrandonGoesToMainWebSite(String mainWebSite) {

        DriverRemoteBrowser.chromeHisBrowserWeb();
        OnStage.theActorCalled("Brandon").can(BrowseTheWeb.with(DriverRemoteBrowser.on(mainWebSite)));

    }

    @When("^Brandon clicks on (.*) validates the correct site, selects Realme and clicks Online Purchase botton$")
    public void brandonClicksOnHttpsMovistarComCoCelularesCellRealmeValidatesTheCorrectSiteSelectsNokiaAndClicksOnlinePurchaseBotton(String phoneWebsite) {

        OnStage.theActorInTheSpotlight().attemptsTo(
                GoToRealmePhonePage.onThePage(phoneWebsite)
        );


    }

    @Then("^Brandon visualize the Realme price on the eShop matches with price checked on the price$")
    public void brandonVisualizeTheRealmePriceOnTheEShopMatchesWithPriceCheckedOnThePrice() {

        OnStage.theActorInTheSpotlight()
                .attemptsTo(
                        ReviewThePhones.onThePage()
                );
    }


}
