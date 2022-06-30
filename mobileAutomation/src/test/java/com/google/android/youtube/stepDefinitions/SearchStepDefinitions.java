package com.google.android.youtube.stepDefinitions;

import com.google.android.youtube.driver.AppiumAndroidDriver;
import cucumber.api.java.Before;
import cucumber.api.java.en.*;
import net.serenitybdd.screenplay.abilities.BrowseTheWeb;
import net.serenitybdd.screenplay.actors.OnStage;
import net.serenitybdd.screenplay.actors.OnlineCast;

import java.io.IOException;

public class SearchStepDefinitions {

     public void setStage() throws IOException {
        OnStage.setTheStage(new OnlineCast());
    }

    @Given("^That the user is on the youtube app$")
    public void thatTheUserIsOnTheYoutubeApp() {

        OnStage.theActorCalled("").can(BrowseTheWeb.with(AppiumAndroidDriver.suNavegador().onDriver()));
    }

    @When("^The user wants to see a video$")
    public void theUserWantsToSeeAVideo() {

    }

    @Then("^will use the search bar to locate the video$")
    public void willUseTheSearchBarToLocateTheVideo() {


    }
}
