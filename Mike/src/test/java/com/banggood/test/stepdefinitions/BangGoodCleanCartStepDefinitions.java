package com.banggood.test.stepdefinitions;

import com.banggood.automation.AppiumDriver.Interactions.SelectFirstArticle;
import com.banggood.automation.AppiumDriver.tasks.ClearsTheCart;
import com.banggood.automation.AppiumDriver.tasks.GoToSeeTheShoppingCart;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.actors.OnStage;

import static com.banggood.automation.AppiumDriver.ui.BangGoodFourthTestUI.BTN_DELETE_ALL;

public class BangGoodCleanCartStepDefinitions {




    @When("^He goes to home and clicks on the shopping cart$")
    public void HeGoesToHomeAndClicksOnTheShoppingCart() {
        OnStage.theActorInTheSpotlight().attemptsTo(GoToSeeTheShoppingCart.on());
    }


    @Then("^Brandon will be able to clean the shopping cart$")
    public void deleteAnyElements() {
        OnStage.theActorInTheSpotlight().attemptsTo(ClearsTheCart.on());

    }





}
