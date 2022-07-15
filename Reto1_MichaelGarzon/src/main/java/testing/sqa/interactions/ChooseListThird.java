package testing.sqa.interactions;

import net.serenitybdd.core.pages.WebElementFacade;
import net.serenitybdd.core.steps.Instrumented;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Interaction;
import net.serenitybdd.screenplay.actions.JavaScriptClick;
import org.openqa.selenium.Keys;

import java.util.List;

import static testing.sqa.userinterface.AdvantageLaptopPage.*;

public class ChooseListThird implements Interaction {


    @Override
    public <T extends Actor> void performAs(T actor) {

        List<WebElementFacade> laptopList = BTN_THIRD_LAPTOP.resolveAllFor(actor);
        actor.attemptsTo(JavaScriptClick.on(laptopList.get(2)));
      //  laptopList.get(2).click();
        HoldOnFor.thisSeconds(3);

    }

    public static ChooseListThird on() {
        return Instrumented.instanceOf(ChooseListThird.class).withProperties();
    }
}
