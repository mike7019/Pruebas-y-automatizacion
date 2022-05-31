package sqa.stepdefinitions;

import cucumber.api.java.Before;
import cucumber.api.java.en.*;
import net.serenitybdd.screenplay.abilities.BrowseTheWeb;
import net.serenitybdd.screenplay.actions.Switch;
import net.serenitybdd.screenplay.actors.OnStage;
import net.serenitybdd.screenplay.actors.OnlineCast;
import net.serenitybdd.screenplay.matchers.WebElementStateMatchers;
import net.serenitybdd.screenplay.questions.WebElementQuestion;
import sqa.drivers.DriverRemoteBrowser;
import sqa.interactions.SwitchToNewTab;
import sqa.questions.UserValidatesData;
import sqa.tasks.UserChoosesPostpagoPlans;
import sqa.tasks.UserGoesToPostpago;


import static net.serenitybdd.screenplay.GivenWhenThen.seeThat;
import static sqa.userinterface.MovistarPortabilidadPospagoPage.TXT_PLAN_VALIDACION;


public class UserChecksPostpagoStepDefinitions {

    //Setting up the stage for the actor
    @Before
    public void setStage() {
        OnStage.setTheStage(new OnlineCast());
    }

    @Given("^that Brandon opens the website (.*) and lists the available plans$")
    public void thatBrandonOpensTheWebsiteAndListsTheAvailablePlans(String website) {

        //here the actor opens the website and clicks on login
        DriverRemoteBrowser.chromeHisBrowserWeb();
        OnStage.theActorCalled("Brandon").can(BrowseTheWeb.with(DriverRemoteBrowser.on(website)));

    }

    @When("^Brandon goes into planes postpago and chooses portabilidad postpago and chooses the (.*) GB plan$")
    public void brandonGoesIntoPlanesPostpagoAndChoosesPortabilidadPostpagoAndChoosesTheCaseGBPlan(String plan) {

        OnStage.theActorInTheSpotlight().attemptsTo(
                UserGoesToPostpago.onThePage(),
                UserChoosesPostpagoPlans.onThePage(plan),
                SwitchToNewTab.change(),
                UserValidatesData.onThepage(),
                Switch.toDefaultContext());

    }

    @Then("^Brandon visualizes the prices on the eShop as shows on the main page (.*) and sees the (.*) GB plan$")
    public void brandonVisualizesThePricesOnTheEShopAsShowsOnTheMainPageWebsiteAndSeesTheCase(String website,String plan) {

        //Website to test
        System.out.println(website);
        System.out.println("plan "+plan+" GB selected");
        OnStage.theActorInTheSpotlight().should(seeThat(WebElementQuestion.the(TXT_PLAN_VALIDACION.of(plan)), WebElementStateMatchers.containsText(plan)));

    }

}
