package testing.sqa.stepdefinitions.opticfiberstepdefinitions;

import cucumber.api.java.Before;
import cucumber.api.java.en.*;
import net.serenitybdd.screenplay.abilities.BrowseTheWeb;
import net.serenitybdd.screenplay.actors.OnStage;
import net.serenitybdd.screenplay.actors.OnlineCast;
import testing.sqa.drivers.DriverRemoteBrowser;

public class UserChecksOpticFiberStepDefinitions {

    @Before
    public void setStage() {
        OnStage.setTheStage(new OnlineCast());
    }

    @Given("^That Brandon access successfully to the (.*)$")
    public void thatBrandonAccessSuccessfullyToTheHttpsMovistarComCo(String website) {

        //here the actor opens the website and clicks on login
        DriverRemoteBrowser.chromeHisBrowserWeb();
        OnStage.theActorCalled("Brandon").can(BrowseTheWeb.with(DriverRemoteBrowser.on(website)));

    }


    @When("^Brandon goes to (.*) lists and interacts with the present fiber plans$")
    public void brandonGoesToFiberWebsiteListsAndInteractsWithThePresentFiberPlans(String fiberWebsite) {


    }

    @Then("^Brandon validates the (.*) successfully$")
    public void brandonValidatesTheHttpsWwwMovistarComCoHogarPlanesInternetFibraOpticaSuccessfully(String plans) {



    }


}
