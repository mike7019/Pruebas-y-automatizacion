package testing.sqa.stepdefinitions.phonesstepdefinitions.iphonestepdefinitions;

import cucumber.api.java.Before;
import cucumber.api.java.en.*;
import net.serenitybdd.screenplay.abilities.BrowseTheWeb;
import net.serenitybdd.screenplay.actors.OnStage;
import net.serenitybdd.screenplay.actors.OnlineCast;
import testing.sqa.drivers.DriverRemoteBrowser;
import testing.sqa.interactions.ReviewThePhones;
import testing.sqa.tasks.GoToPhonePage;

public class IphonePricesStepDefinitions {

    @Before
    public void setStage() {
        OnStage.setTheStage(new OnlineCast());
    }


    @Given("^that Brandon goes to (.*)$")
    public void thatBrandonGoesToMainWebSite(String mainWebSite) {

        DriverRemoteBrowser.chromeHisBrowserWeb();
        OnStage.theActorCalled("Brandon").can(BrowseTheWeb.with(DriverRemoteBrowser.on(mainWebSite)));

    }

    @When("^Brandon clicks on (.*) validates the correct site and clicks Online Purchase botton$")
    public void brandonClicksOnPhoneWebSiteAndClicksOnlinePurchaseBotton(String phoneWebsite) {

        OnStage.theActorInTheSpotlight().attemptsTo(GoToPhonePage.onThePage(phoneWebsite));


    }

    @Then("^Brandon visualize the price on the eShop matches with price checked on the price$")
    public void brandonVisualizeThePriceOnTheEShopMatchesWithPriceCheckedOnTheHttpsMovistarComCoCelulares() {

        OnStage.theActorInTheSpotlight()
                .attemptsTo(
                        ReviewThePhones.onThePage()
                );
    }


}
