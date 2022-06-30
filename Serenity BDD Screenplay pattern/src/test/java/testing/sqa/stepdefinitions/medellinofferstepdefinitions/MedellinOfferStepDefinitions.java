package testing.sqa.stepdefinitions.medellinofferstepdefinitions;

import cucumber.api.java.Before;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import drivers.DriverRemoteBrowser;
import net.serenitybdd.screenplay.abilities.BrowseTheWeb;
import net.serenitybdd.screenplay.actors.OnStage;
import net.serenitybdd.screenplay.actors.OnlineCast;
import tasks.ChooseThreeTvApp;
import tasks.ChooseTwoTvApp;
import tasks.ReviewFiberAndTelephone;
import tasks.ReviewFiberTvApps;


public class MedellinOfferStepDefinitions {

    @Before
    public void setStage() {
        OnStage.setTheStage(new OnlineCast());
    }

    @Given("^that Brandon opens the site (.*) and opens the duo plans$")
    public void thatBrandonOpensTheSiteHttpsDescubreMovistarCoOfertasFibraExclusivaMedellinAndOpensTheDuoPlans(String site) {

        DriverRemoteBrowser.chromeHisBrowserWeb();
        OnStage.theActorCalled("Brandon").can(BrowseTheWeb.with(DriverRemoteBrowser.on(site)));

    }

    @When("^Brandon chooses the (.*) and stares the price$")
    public void brandonChoosesTheAndStaresThePrice(int plan) {

        OnStage.theActorInTheSpotlight().attemptsTo(ReviewFiberAndTelephone.onMovistar(plan));


    }

    @Then("^Brandon choose each (.*) and select tvApps like (.*) (.*) and (.*)$")
    public void brandonChooseEachAndSelectTvAppsLikeAnd(int plan, int netflix, int primeVideo, int disneyStar) {



    }

   /* @Given("^that Brandon opens the site (.*) and lists the available plans$")
    public void thatBrandonOpensTheSiteHttpsMovistarcoDesaTelefonicawebsitesCoPruBFBrAndListsTheAvailablePlans(String site) {



    }

    @When("^Brandon chooses the (.*) and sees the price$")
    public void brandonChoosesTheAndSeesThePrice(int plan) {
        OnStage.theActorInTheSpotlight().attemptsTo(ReviewFiberTvApps.onMovistar(plan));

    }

    @Then("^Brandon can sort the (.*) and tvApps first with (.*) (.*) and (.*)$")
    public void brandonCanSortTheTvAppsFirstWithNetflixAndPrimeVideo(int plan, int netflix, int primeVideo, int disneyStar) {

        OnStage.theActorInTheSpotlight().attemptsTo(ChooseTwoTvApp.onThePage(netflix,primeVideo, plan));
        OnStage.theActorInTheSpotlight().attemptsTo(ChooseThreeTvApp.onThePage(disneyStar, plan));
    }*/

}
