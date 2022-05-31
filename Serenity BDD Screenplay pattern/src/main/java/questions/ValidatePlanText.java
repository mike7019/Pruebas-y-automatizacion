package questions;

import net.serenitybdd.core.pages.WebElementFacade;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Question;

import java.util.List;

import static userinterface.UserInterfacePage1.BTN_PLAN;


public class ValidatePlanText implements Question<String> {

    @Override
    public String answeredBy(Actor actor) {

        List<WebElementFacade> buttonPlan = BTN_PLAN.resolveAllFor(actor);
        for (WebElementFacade pointer:buttonPlan) {

            System.out.println(pointer);


        }
        return buttonPlan.get(0).getText();
    }

    public static ValidatePlanText value() {
        return new ValidatePlanText();
    }


}
