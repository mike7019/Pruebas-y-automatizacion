package com.banggood.automation.AppiumDriver.tasks;

import static com.banggood.automation.AppiumDriver.ui.BangGoodFisrtTestUI.*;
import static net.serenitybdd.screenplay.matchers.WebElementStateMatchers.isVisible;

import com.banggood.automation.AppiumDriver.Interactions.ExplicitWait;
import net.serenitybdd.core.steps.Instrumented;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.waits.WaitUntil;

public class RecomendedItemPurchase implements Task {

    @Override
    public <T extends Actor> void performAs(T actor) {


        actor.attemptsTo(
                ExplicitWait.here(),
                WaitUntil.the(BTN_NEW_USER_BENEFICTS, isVisible()).forNoMoreThan(10).seconds(),
                Click.on(BTN_NEW_USER_BENEFICTS),
                WaitUntil.the(BTN_SCREWERS, isVisible()).forNoMoreThan(30).seconds(),
                Click.on(BTN_SCREWERS),
                WaitUntil.the(BTN_ADD_TO_CART_ONE, isVisible()).forNoMoreThan(10).seconds(),
                Click.on(BTN_ADD_TO_CART_ONE),
                Click.on(BTN_ADD_TO_CART_FINAL),
                WaitUntil.the(BTN_CHECK_CART, isVisible()).forNoMoreThan(50).seconds(),
                Click.on(BTN_CHECK_CART)

        );

    }

    public static RecomendedItemPurchase on(){
        return Instrumented.instanceOf(RecomendedItemPurchase.class).withProperties();
    }
}
