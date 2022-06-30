package questions;

import net.serenitybdd.core.pages.WebElementFacade;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Question;


import java.util.List;

import static userinterface.FiberAndTvAppsPage.TXT_DISCOUNT_PRICE;



public class ValidatePriceText implements Question<String> {

    private int index;

    public ValidatePriceText(int index) {
        this.index = index;
    }

    @Override
    public String answeredBy(Actor actor) {
        List<WebElementFacade> planBandWidth = TXT_DISCOUNT_PRICE.resolveAllFor(actor);
        System.out.println(planBandWidth);
        return planBandWidth.get(0).getText();
    }

    public static Question<String> value(int index) {
        return new ValidatePriceText(index);
    }
}
