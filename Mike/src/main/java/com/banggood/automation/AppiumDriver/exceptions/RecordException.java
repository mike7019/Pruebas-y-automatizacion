package com.banggood.automation.AppiumDriver.exceptions;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.Tasks;
import net.serenitybdd.screenplay.matchers.WebElementStateMatchers;
import net.serenitybdd.screenplay.waits.WaitUntil;

import static com.banggood.automation.AppiumDriver.ui.BangGoodFisrtTestUI.LBL_VALIDATION;

public class RecordException implements Task {


        @Override
        public <T extends Actor> void performAs(T actor) {
            actor.attemptsTo(
                    WaitUntil.the(LBL_VALIDATION, WebElementStateMatchers.isVisible()).forNoMoreThan(60).seconds()
            );
            ValidationHome.validation= LBL_VALIDATION.resolveFor(actor).getText();
        }
        public static RecordException go() {
            return Tasks.instrumented(RecordException.class);
        }
    }

