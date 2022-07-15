package com.banggood.automation.AppiumDriver.tasks;

import com.banggood.automation.AppiumDriver.Interactions.ExplicitWait;
import com.banggood.automation.AppiumDriver.Interactions.ScrollDown;
import com.banggood.automation.AppiumDriver.Interactions.SelectFirstArticle;
import net.serenitybdd.core.steps.Instrumented;
import net.serenitybdd.screenplay.Actor;

import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.waits.WaitUntil;

import static com.banggood.automation.AppiumDriver.ui.BangGoodUISecondTestUI.*;
import static net.serenitybdd.screenplay.matchers.WebElementStateMatchers.isVisible;

public class CategoriesSelection implements Task {


    @Override
    public <T extends Actor> void performAs(T actor) {

        actor.attemptsTo(
                ExplicitWait.here(3),
                WaitUntil.the(BTN_CATEGORIES, isVisible()).forNoMoreThan(120).seconds(),
                Click.on(BTN_CATEGORIES),
                Click.on(BTN_ELECTRIC_TOOLS),
                ScrollDown.on(),
                Click.on(BTN_LASER_SIGHT),
                Click.on(BTN_ADD_CART_ONE),
                Click.on(BTN_ADD_CART_FINAL),
                Click.on(BTN_GO_BACK_ON_CATEGORY),
                Click.on(BTN_GO_BACK_),
                Click.on(BTN_GO_BACK_RESOURCE),
                SelectFirstArticle.on()


        );

        try {Thread.sleep(5000);} catch (InterruptedException e) {throw new RuntimeException(e);}

    }

    public static CategoriesSelection on() {
        return Instrumented.instanceOf(CategoriesSelection.class).withProperties();
    }
}
