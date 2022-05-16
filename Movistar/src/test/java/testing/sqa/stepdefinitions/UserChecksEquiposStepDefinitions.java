package testing.sqa.stepdefinitions;

import cucumber.api.java.Before;
import cucumber.api.java.en.*;
import net.serenitybdd.screenplay.abilities.BrowseTheWeb;
import net.serenitybdd.screenplay.actors.OnStage;
import net.serenitybdd.screenplay.actors.OnlineCast;
import testing.sqa.drivers.DriverRemoteBrowser;
import testing.sqa.interactions.ReviewThePhones;
import testing.sqa.tasks.GoToPhonePage;

import static net.serenitybdd.screenplay.GivenWhenThen.seeThat;

public class UserChecksEquiposStepDefinitions {

    //Setting up the stage for the actor
    @Before
    public void setStage() {
        OnStage.setTheStage(new OnlineCast());
    }


    @Given("^that Brandon opens the website (.*) and lists phones availables for each manufacturer$")
    public void thatBrandonOpensTheWebsiteAndListsPhonesAvailablesForEachManufacturer(String website) {

        //here the actor opens the website and clicks on login
        DriverRemoteBrowser.chromeHisBrowserWeb();
        OnStage.theActorCalled("Brandon").can(BrowseTheWeb.with(DriverRemoteBrowser.on(website)));


    }


    @When("^Brandon goes into (.*) and chooses renovar equipos and interacts with each phones from trademark$")
    public void brandonGoesIntoCelularesAndChoosesRenovarEquiposAndInteractsWithEachPhonesFromIphone(String phoneWebsite) {

        OnStage.theActorInTheSpotlight().attemptsTo(GoToPhonePage.onThePage(phoneWebsite),
                ReviewThePhones.onThePage());

//        OnStage.theActorInTheSpotlight().attemptsTo(
//                UserChoosePhones.onThePage(),
//                NavigateToNewTab.change()
//        );
    }

    @Then("^Brandon visualizes the prices on the eShop the prices previosly checked on the (.*)$")
    public void brandonVisualizesThePricesOnTheEShopThePricesPrevioslyCheckedOnThe(String website) {

//        OnStage.theActorInTheSpotlight().should(seeThat(WebElementQuestion.the(TXT_PRECIO_E_SHOP), WebElementStateMatchers.isVisible()));
//        OnStage.theActorInTheSpotlight().attemptsTo(
//                Switch.toDefaultContext(),
//                HoldOnFor.thisSeconds(3),
//                WaitUntil.the(TXT_MARCAS_VALIDACION, isVisible()).forNoMoreThan(3).seconds()
//        );




    }


}
