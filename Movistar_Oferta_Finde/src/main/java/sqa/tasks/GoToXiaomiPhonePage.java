package sqa.tasks;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.Tasks;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.actions.JavaScriptClick;
import net.serenitybdd.screenplay.actions.Scroll;
import net.serenitybdd.screenplay.ensure.Ensure;
import sqa.interactions.HoldOnFor;
import sqa.userinterface.MovistarEquiposRenovarPage;
import sqa.userinterface.MovistarMainPage;


public class GoToXiaomiPhonePage implements Task {

    private String phoneWebsite;


    public GoToXiaomiPhonePage(String phoneWebsite) {
        this.phoneWebsite = phoneWebsite;
    }

    @Override
    public <T extends Actor> void performAs(T actor) {

        actor.attemptsTo(
                Click.on(MovistarMainPage.BTN_EQUIPOS),
                Click.on(MovistarMainPage.BTN_CELULARES),
                HoldOnFor.thisSeconds(150),
                Scroll.to(MovistarEquiposRenovarPage.BTN_XIAOMI_BRAND),
                JavaScriptClick.on(MovistarEquiposRenovarPage.BTN_XIAOMI_BRAND),
                Ensure.thatTheCurrentPage().currentUrl().contains(phoneWebsite)
        );

    }

    //This is the way to call the task
    public static GoToXiaomiPhonePage onThePage(String phoneWebsite) {
        return Tasks.instrumented(GoToXiaomiPhonePage.class, phoneWebsite);
    }
}
