package testing.sqa.stepdefinitions;

import cucumber.api.java.Before;
import cucumber.api.java.en.*;

import net.serenitybdd.screenplay.GivenWhenThen;
import net.serenitybdd.screenplay.abilities.BrowseTheWeb;
import net.serenitybdd.screenplay.actors.OnStage;
import net.serenitybdd.screenplay.actors.OnlineCast;
import net.serenitybdd.screenplay.ensure.Ensure;
import net.serenitybdd.screenplay.matchers.WebElementStateMatchers;
import net.serenitybdd.screenplay.questions.WebElementQuestion;

import testing.sqa.drivers.DriverRemoteBrowser;
import testing.sqa.models.UserData;
import testing.sqa.questions.ValidateUserOnScreen;
import testing.sqa.tasks.*;
import testing.sqa.userinterface.AdvantageMainPage;

import java.util.List;

import static net.serenitybdd.screenplay.GivenWhenThen.*;
import static org.hamcrest.Matchers.*;
import static testing.sqa.userinterface.AdvantageMainPage.*;


public class userRegisterStepDefinitions {

    //Setting up the stage for the actor
    @Before
    public void setStage() {
        OnStage.setTheStage(new OnlineCast());
    }

    @Given("^That Brandon registered successfully on the (.*) and attempts to log in$")
    public void thatBrandonRegisteredSuccessfullyOnTheWebsiteAndAttemptsToLogIn(String webSite) {

        //Here the actor opens up the website and clicks on the login link
        DriverRemoteBrowser.chromeHisBrowserWeb();
        OnStage.theActorCalled("Brandon").can(BrowseTheWeb.with(DriverRemoteBrowser.on(webSite)));
        OnStage.theActorInTheSpotlight().wasAbleTo(UserOpenLogin.onThePage());

    }


    @When("^Brandon clicks on User and types the info to register a new account$")
    public void brandonClicksOnUserAndTypesTheInfoToRegisterANewAccount(List<UserData> userDataList) {

        // The list "UserData" is the model we use to pass the data through the data table on the feature
        OnStage.theActorInTheSpotlight().attemptsTo(UserMakesRegistration.onThePage()
                .user(userDataList.get(0).getUser())
                .email(userDataList.get(0).getEmail())
                .password(userDataList.get(0).getPassword())
                .confPass(userDataList.get(0).getConfPass()));
    }

    @Then("^Brandon validates the registry was successfully done showing the user name displayed as (.*)$")
    public void brandonValidatesTheRegistryWasSuccessfullyDoneShowingTheUserNameDisplayedsAsTrue(String user) {

        //Here the actor should see the text of the username registered at the top and compares it with the expected result
        OnStage.theActorInTheSpotlight().should(seeThat(ValidateUserOnScreen.value(), equalTo(user)));
        Ensure.that(LBL_USERNAME_LOGGED).text().isEqualTo(user);
        OnStage.theActorInTheSpotlight().should(GivenWhenThen.seeThat(WebElementQuestion.the(AdvantageMainPage.LBL_USERNAME_LOGGED.toString()), WebElementStateMatchers.containsText(user)));

    }
}




