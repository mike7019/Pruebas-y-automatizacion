package com.banggood.automation.AppiumDriver.tasks;

import com.banggood.automation.AppiumDriver.Interactions.CartHome;
import com.banggood.automation.AppiumDriver.Interactions.ExplicitWait;
import net.serenitybdd.core.steps.Instrumented;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.actions.Click;

import static com.banggood.automation.AppiumDriver.ui.BangGoodFourthTestUI.*;

public class GoToSeeTheShoppingCart implements Task {


    @Override
    public <T extends Actor> void performAs(T actor) {


        actor.attemptsTo(
                ExplicitWait.here(3),
                CartHome.on(),
                Click.on(BTN_DELETE_DUMP),
                Click.on(BTN_DELETE_ALL)
        );

    }

    public static GoToSeeTheShoppingCart on(){
        return Instrumented.instanceOf(GoToSeeTheShoppingCart.class).withProperties();
    }
}
