package testing.sqa.stepdefinitions;

import cucumber.api.java.Before;
import cucumber.api.java.en.*;
import net.serenitybdd.screenplay.abilities.BrowseTheWeb;
import net.serenitybdd.screenplay.actors.OnStage;
import net.serenitybdd.screenplay.actors.OnlineCast;
import testing.sqa.drivers.DriverRemoteBrowser;
import testing.sqa.models.LoginData;
import testing.sqa.questions.ValidateUserOnScreen;
import testing.sqa.tasks.UserLoginngIn;
import testing.sqa.tasks.UserOpenLogin;

import java.util.List;

import static net.serenitybdd.screenplay.GivenWhenThen.seeThat;
import static org.hamcrest.Matchers.equalTo;

public class userLoginStepDefinitions {

    //Setting up the stage for the actor
    @Before
    public void setStage() {
        OnStage.setTheStage(new OnlineCast());
    }

    @Given("^That Brandon logs in successfully and purchased a new laptop$")
    public void thatBrandonLogsInSuccessfullyAndPurchasedANewLaptop() {

        //here the actor opens the website and clicks on login
        DriverRemoteBrowser.chromeHisBrowserWeb();
        OnStage.theActorCalled("Brandon").can(BrowseTheWeb.with(DriverRemoteBrowser.on("https://www.advantageonlineshopping.com/#/")));
        OnStage.theActorInTheSpotlight().wasAbleTo(UserOpenLogin.onThePage());

    }

    @When("^Brandon logins on the web site with the following information$")
    public void brandonLoginsOnTheWebSiteWithTheFollowingInformation(List<LoginData> loginDataList) {

        //here the actor inputs the registered information on the text fields
        OnStage.theActorInTheSpotlight().attemptsTo(UserLoginngIn.onThePage().username(loginDataList.get(0).getUser()).pass(loginDataList.get(0).getPassword()));

    }



    @Then("^Brandon visualizes the following user name (.*) on the website$")
    public void brandonVisualizesTheFollowingUserNameMikeOnTheWebsite(String user) {

        //here the actor validates the laptop listed on the website it´s the chosen at the beginning
        OnStage.theActorInTheSpotlight().should(seeThat(ValidateUserOnScreen.value(), equalTo(user)));

    }
}
