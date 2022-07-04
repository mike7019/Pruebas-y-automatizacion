package com.banggood.automation.AppiumDriver.tasks;

import net.serenitybdd.core.steps.Instrumented;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.actions.Click;
import static com.banggood.automation.AppiumDriver.ui.BangGoodFisrtTestUI.*;

public class GoBack implements Task {

    @Override
    public <T extends Actor> void performAs(T actor) {

        actor.attemptsTo(
        Click.on(BTN_BACK_ITEM),
            Click.on(BTN_BACK_CART),
            Click.on(BTN_BACK_SHOP)
        );

    }

    public static GoBack on(){
        return Instrumented.instanceOf(GoBack.class).withProperties();
    }
}
