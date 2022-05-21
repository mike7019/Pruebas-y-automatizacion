package testing.sqa.stepdefinitions.weekendaccesoriesstepdefinitions;

import cucumber.api.java.Before;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import net.serenitybdd.screenplay.abilities.BrowseTheWeb;
import net.serenitybdd.screenplay.actors.OnStage;
import net.serenitybdd.screenplay.actors.OnlineCast;
import testing.sqa.drivers.DriverRemoteBrowser;
import testing.sqa.interactions.ReviewTheAccesories;

public class UserChecksWeekendAccesoriesStepDefinitions {

    @Before
    public void setStage() {
        OnStage.setTheStage(new OnlineCast());
    }

    @Given("^That Brandon goes to the (.*) and reviews all the accesories$")
    public void thatBrandonGoesToTheHttpsMovistarComCoAccesoriosCellAccesoriosHuaweiAndReviewsAllTheAccesories(String webSite) {
        //here the actor opens the website and clicks on login
        DriverRemoteBrowser.chromeHisBrowserWeb();
        OnStage.theActorCalled("Brandon").can(BrowseTheWeb.with(DriverRemoteBrowser.on(webSite)));

    }

    @When("^Brandon lists all the accesories and compares them with the data provided$")
    public void brandonListsAllTheAccesoriesAndComparesThemWithTheDataProvided() {
        System.out.println("is on the when step");
        OnStage.theActorInTheSpotlight().attemptsTo(ReviewTheAccesories.onThePage());


    }

    @Then("^Brandon validates all the prices were successfully updated$")
    public void brandonValidatesAllThePricesWereSuccessfullyUpdated() {



    }

}
