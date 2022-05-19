package sqa.stepdefinitions.honorstepdefinitions;

import cucumber.api.java.Before;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import net.serenitybdd.screenplay.abilities.BrowseTheWeb;
import net.serenitybdd.screenplay.actors.OnStage;
import net.serenitybdd.screenplay.actors.OnlineCast;
import testing.sqa.drivers.DriverRemoteBrowser;
import testing.sqa.interactions.ReviewThePhones;
import testing.sqa.tasks.GoToHonorPhonePage;
import testing.sqa.tasks.GoToMotorolaPhonePage;

public class HonorPricesStepDefinitions {

    @Before
    public void setStage() {
        OnStage.setTheStage(new OnlineCast());
    }


    @Given("^that Brandon goes to (.*)$")
    public void thatBrandonGoesToMainWebSite(String mainWebSite) {

        DriverRemoteBrowser.chromeHisBrowserWeb();
        OnStage.theActorCalled("Brandon").can(BrowseTheWeb.with(DriverRemoteBrowser.on(mainWebSite)));

    }

    @When("^Brandon clicks on (.*) validates the correct site, selects Honor and clicks Online Purchase botton$")
    public void brandonClicksOnPhoneWebSiteValidatesTheCorrectSiteSelectsHonorAndClicksOnlinePurchaseBotton(String phoneWebsite) {

        OnStage.theActorInTheSpotlight().attemptsTo(
                GoToHonorPhonePage.onThePage(phoneWebsite)
        );


    }

    @Then("^Brandon visualize the Honor price on the eShop matches with price checked on the price$")
    public void brandonVisualizeTheHonorPriceOnTheEShopMatchesWithPriceCheckedOnThePrice() {

        OnStage.theActorInTheSpotlight()
                .attemptsTo(
                        ReviewThePhones.onThePage()
                );
    }


}
