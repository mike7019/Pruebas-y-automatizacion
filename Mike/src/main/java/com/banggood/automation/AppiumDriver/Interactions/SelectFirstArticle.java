package com.banggood.automation.AppiumDriver.Interactions;

import net.serenitybdd.core.pages.WebElementFacade;
import net.serenitybdd.core.steps.Instrumented;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Interaction;
import net.serenitybdd.screenplay.Performable;

import java.util.List;

import static com.banggood.automation.AppiumDriver.ui.BangGoodUISecondTestUI.BTN_HOME;

public class SelectFirstArticle implements Interaction {

    @Override
    public <T extends Actor> void performAs(T actor) {

        List<WebElementFacade> list;
        list = BTN_HOME.resolveAllFor(actor);
        try {Thread.sleep(5000);} catch (InterruptedException e) {throw new RuntimeException(e);}
        list.get(0).click();

    }
    public static Performable on(){
        return Instrumented.instanceOf(SelectFirstArticle.class).withProperties();
    }
}
