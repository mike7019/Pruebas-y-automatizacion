package com.banggood.test.stepdefinitions;

import com.banggood.automation.AppiumDriver.driver.AppiumAndroidDriver;
import com.banggood.automation.AppiumDriver.exceptions.RecordException;
import com.banggood.automation.AppiumDriver.exceptions.ValidationHome;
import com.banggood.automation.AppiumDriver.tasks.CategoriesSelection;
import cucumber.api.java.Before;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import net.serenitybdd.screenplay.GivenWhenThen;
import net.serenitybdd.screenplay.abilities.BrowseTheWeb;
import net.serenitybdd.screenplay.actors.OnStage;
import net.serenitybdd.screenplay.actors.OnlineCast;
import net.serenitybdd.screenplay.matchers.WebElementStateMatchers;
import net.serenitybdd.screenplay.questions.WebElementQuestion;

import java.io.IOException;

import static com.banggood.automation.AppiumDriver.ui.BangGoodFisrtTestUI.LBL_VALIDATION;

public class BangGoodCategoriesItemStepDefinitions {

    @Before
    public void before() throws IOException {
        OnStage.setTheStage(new OnlineCast());
    }

    @Given("^That Brandon opens the app BangGood categories$")
    public void thatBrandonOpensTheAppBangGoodCategories() {

        OnStage.theActorCalled("").can(BrowseTheWeb.with(AppiumAndroidDriver.yourBrowser().onDriver()));

    }

    @When("^Brandon selects a category and goes to electric saw to purchase$")
    public void brandonSelectsACategoryAndGoesToWaterSportsToPurchaseAPairOfFins() {

        OnStage.theActorInTheSpotlight().attemptsTo(CategoriesSelection.on());

    }

    @Then("^Validates the (.*) on the cart list$")
    public void validateSeesOnTheCartListHot(String items) {

        OnStage.theActorInTheSpotlight().attemptsTo(RecordException.go());
        OnStage.theActorInTheSpotlight().should(GivenWhenThen.seeThat(WebElementQuestion.the(LBL_VALIDATION.of(items)), WebElementStateMatchers.containsText(ValidationHome.validation)));


    }


}
