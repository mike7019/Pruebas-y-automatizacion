package com.banggood.automation.AppiumDriver.Interactions;

import net.serenitybdd.core.pages.WebElementFacade;
import net.serenitybdd.core.steps.Instrumented;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Interaction;
import net.serenitybdd.screenplay.Performable;

import java.util.List;

import static com.banggood.automation.AppiumDriver.ui.BangGoodUISecondTestUI.BTN_HOME;


public class CartHome implements Interaction {



    @Override
    public <T extends Actor> void performAs(T actor) {

        List<WebElementFacade> list;
        list = BTN_HOME.resolveAllFor(actor);

        list.get(2).click();

    }
    public static Performable on(){
        return Instrumented.instanceOf(CartHome.class).withProperties();
    }
}
