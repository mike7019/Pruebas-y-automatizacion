package com.banggood.test.stepdefinitions;
import com.banggood.automation.AppiumDriver.exceptions.RecordException;
import com.banggood.automation.AppiumDriver.exceptions.ValidationHome;
import com.banggood.automation.AppiumDriver.tasks.SearchByBar;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import net.serenitybdd.screenplay.GivenWhenThen;
import net.serenitybdd.screenplay.actors.OnStage;
import net.serenitybdd.screenplay.matchers.WebElementStateMatchers;
import net.serenitybdd.screenplay.questions.WebElementQuestion;

import static com.banggood.automation.AppiumDriver.ui.BangGoodFisrtTestUI.LBL_VALIDATION;

public class BangGoodSearchItemOnBarStepDefinitions {


    @When("^Brandon selects inflating bump item$")
    public void BrandonSelectsInflatingBumpItem() {
        OnStage.theActorInTheSpotlight().attemptsTo(SearchByBar.on());

    }

    @Then("^He sees the (.*) word after choosing the element$")
    public void HeSeesTheItemWordAfterChoosingTheElement(String Valide) {


        OnStage.theActorInTheSpotlight().attemptsTo(RecordException.go());
        OnStage.theActorInTheSpotlight().should(GivenWhenThen.seeThat(WebElementQuestion.the(LBL_VALIDATION.of(Valide)), WebElementStateMatchers.containsText(ValidationHome.validation)));


    }








}
