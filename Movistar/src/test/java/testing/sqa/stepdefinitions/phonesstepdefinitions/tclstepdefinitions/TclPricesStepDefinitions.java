package testing.sqa.stepdefinitions.phonesstepdefinitions.tclstepdefinitions;

import cucumber.api.java.Before;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import net.serenitybdd.screenplay.abilities.BrowseTheWeb;
import net.serenitybdd.screenplay.actors.OnStage;
import net.serenitybdd.screenplay.actors.OnlineCast;
import testing.sqa.drivers.DriverRemoteBrowser;
import testing.sqa.interactions.ReviewThePhones;
import testing.sqa.tasks.GoToRealmePhonePage;
import testing.sqa.tasks.GoToTclPhonePage;

public class TclPricesStepDefinitions {

    @Before
    public void setStage() {
        OnStage.setTheStage(new OnlineCast());
    }


    @Given("^that Brandon goes to (.*)$")
    public void thatBrandonGoesToMainWebSite(String mainWebSite) {

        DriverRemoteBrowser.chromeHisBrowserWeb();
        OnStage.theActorCalled("Brandon").can(BrowseTheWeb.with(DriverRemoteBrowser.on(mainWebSite)));

    }

    @When("^Brandon clicks on (.*) validates the correct site, selects TCL and clicks Online Purchase botton$")
    public void brandonClicksOnPhoneWebSiteValidatesTheCorrectSiteSelectsTCLAndClicksOnlinePurchaseBotton(String phoneWebsite) {
        OnStage.theActorInTheSpotlight().attemptsTo(
                GoToTclPhonePage.onThePage(phoneWebsite)
        );


    }

    @Then("^Brandon visualize the TCL price on the eShop matches with price checked on the price$")
    public void brandonVisualizeTheTCLPriceOnTheEShopMatchesWithPriceCheckedOnThePrice() {

        OnStage.theActorInTheSpotlight()
                .attemptsTo(
                        ReviewThePhones.onThePage()
                );
    }

}
