package com.banggood.automation.AppiumDriver.Questions;

import com.banggood.automation.AppiumDriver.ui.BangGoodFisrtTestUI;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Question;

public class ValidateTheProduct implements Question<String> {



    @Override
    public String answeredBy(Actor actor) {
        return BangGoodFisrtTestUI.TXT_SCREWERS_VALIDATION.resolveFor(actor).getText();
    }

    public static Question<String> value() {
        return new ValidateTheProduct();
    }
}
