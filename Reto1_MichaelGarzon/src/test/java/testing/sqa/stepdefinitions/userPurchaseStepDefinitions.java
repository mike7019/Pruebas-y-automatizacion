package testing.sqa.stepdefinitions;

import cucumber.api.java.Before;
import cucumber.api.java.en.*;
import net.serenitybdd.screenplay.GivenWhenThen;
import net.serenitybdd.screenplay.actors.OnStage;
import net.serenitybdd.screenplay.actors.OnlineCast;
import net.serenitybdd.screenplay.matchers.WebElementStateMatchers;
import net.serenitybdd.screenplay.questions.WebElementQuestion;
import testing.sqa.questions.ValidateUserOnScreen;
import testing.sqa.tasks.UserChoosesLaptop;
import testing.sqa.userinterface.AdvantageLaptopPage;
import testing.sqa.userinterface.OrderPayment;

import static net.serenitybdd.screenplay.GivenWhenThen.seeThat;
import static org.hamcrest.Matchers.equalTo;

public class userPurchaseStepDefinitions {

    //Setting up the stage for the actor
    @Before
    public void setStage() {
        OnStage.setTheStage(new OnlineCast());
    }


    @When("^Brandon logs in and sees (.*) and selects the (.*) and adds it to the shopping cart$")
    public void brandonLogsInAndSeesMikeAndSelectsTheHPENVYTTOUCHAndAddsItToTheShoppingCart(String user, String laptop) {

        System.out.println(user);
        System.out.println(laptop);
        //here the actor visualizes the username displayed on the main page
       // OnStage.theActorInTheSpotlight().should(seeThat(ValidateUserOnScreen.value(), equalTo(user)));

        //here the actor lists the laptops on screen, clicks the third one using an Interaction
        OnStage.theActorInTheSpotlight().attemptsTo(UserChoosesLaptop.onThePage());

        //here the actor validates the third laptop matches with the laptop selected
      //  OnStage.theActorInTheSpotlight().should(GivenWhenThen.seeThat(WebElementQuestion.the(AdvantageLaptopPage.LBL_CHOSEN_LAPTOP), WebElementStateMatchers.containsText(laptop)));


    }

    @Then("^Brandon visualizes the correct laptop was successfully choose and shows the laptop name (.*)$")
    public void brandonVisualizesTheCorrectLaptopWasSuccessfullyChooseAndShowsTheLaptopNameHPENVYTTOUCH(String laptop) {
        //here the actor validates the laptop listed on the website it´s the chosen at the beginning
        OnStage.theActorInTheSpotlight().should(GivenWhenThen.seeThat(WebElementQuestion.the(OrderPayment.LBL_LAPTOP), WebElementStateMatchers.containsText(laptop)));

    }

}
