package testing.sqa.interactions;

import net.serenitybdd.core.steps.Instrumented;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Interaction;
import net.serenitybdd.screenplay.abilities.BrowseTheWeb;

public class GoToPreviousPage implements Interaction {


    @Override
    public <T extends Actor> void performAs(T actor) {

        BrowseTheWeb.as(actor).getDriver().navigate().back();

    }

    public static GoToPreviousPage onThePage(){

        return Instrumented.instanceOf(GoToPreviousPage.class).withProperties();

    }
}
