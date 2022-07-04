package com.banggood.automation.AppiumDriver.tasks;

import com.banggood.automation.AppiumDriver.Interactions.ExplicitWait;
import com.banggood.automation.AppiumDriver.Interactions.SelectFirstArticle;
import net.serenitybdd.core.steps.Instrumented;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.actions.Click;

import static com.banggood.automation.AppiumDriver.ui.BangGoodFisrtTestUI.*;
import static com.banggood.automation.AppiumDriver.ui.BangGoodFourthTestUI.*;

public class ClearsTheCart implements Task {

    @Override
    public <T extends Actor> void performAs(T actor) {

        actor.attemptsTo(
                ExplicitWait.here(),
                SelectFirstArticle.on()
        );

    }

    public static ClearsTheCart on() {
        return Instrumented.instanceOf(ClearsTheCart.class).withProperties();
    }


}