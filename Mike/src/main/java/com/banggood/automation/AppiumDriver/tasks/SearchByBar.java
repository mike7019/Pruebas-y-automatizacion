package com.banggood.automation.AppiumDriver.tasks;

import net.serenitybdd.core.steps.Instrumented;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.actions.Enter;

import static com.banggood.automation.AppiumDriver.ui.BangGoodUISecondTestUI.*;
import static com.banggood.automation.AppiumDriver.ui.BangGoodUIThirdTestUI.*;

public class SearchByBar implements Task {


    @Override
    public <T extends Actor> void performAs(T actor) {

        actor.attemptsTo(
               Click.on(BTN_SEARCH_BAR),
                Enter.theValue("scuba").into(BTN_SEARCH_EDIT),
                Click.on(BTN_NEOPRENE),
                Click.on(BTN_ADD_TO_CART),
                Click.on(BTN_ADD_CART_FINAL),
                Click.on(BTN_GO_BACK_ON_CATEGORY),
                Click.on(BTN_BACK_SPACE),
                Click.on(BTN_GO_BACK_RESOURCE)

        );
    }

    public static SearchByBar on(){
        return Instrumented.instanceOf(SearchByBar.class).withProperties();
    }
}
