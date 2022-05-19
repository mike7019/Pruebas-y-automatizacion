package sqa.questions;

import net.serenitybdd.core.pages.WebElementFacade;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Question;
import testing.sqa.userinterface.MovistarEquiposRenovarPage;

import java.util.List;


public class ValidatePriceText implements Question<String> {

    private int index = 0;

    public ValidatePriceText(int index) {
        this.index = index;
    }

    @Override
    public String answeredBy(Actor actor) {
        List<WebElementFacade> phonePrice = MovistarEquiposRenovarPage.TXT_PRICE.resolveAllFor(actor);
        System.out.println(phonePrice);
        return phonePrice.get(index).getText();
    }

    public static Question<String> value(int index) {
        return new ValidatePriceText(index);
    }
}
