package testing.sqa.tasks;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.Tasks;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.actions.JavaScriptClick;
import net.serenitybdd.screenplay.actions.Scroll;
import net.serenitybdd.screenplay.ensure.Ensure;
import testing.sqa.interactions.HoldOnFor;
import testing.sqa.userinterface.MovistarEquiposRenovarPage;
import testing.sqa.userinterface.MovistarMainPage;

public class GoToOppoPhonePage implements Task {

    private String phoneWebsite;


    public GoToOppoPhonePage(String phoneWebsite) {
        this.phoneWebsite = phoneWebsite;
    }

    @Override
    public <T extends Actor> void performAs(T actor) {

        actor.attemptsTo(
                Click.on(MovistarMainPage.BTN_EQUIPOS),
                Click.on(MovistarMainPage.BTN_CELULARES),
                HoldOnFor.thisSeconds(150),
                Scroll.to(MovistarEquiposRenovarPage.BTN_OPPO_BRAND),
                JavaScriptClick.on(MovistarEquiposRenovarPage.BTN_OPPO_BRAND),
                Ensure.thatTheCurrentPage().currentUrl().contains(phoneWebsite)
        );

    }

    //This is the way to call the task
    public static GoToOppoPhonePage onThePage(String phoneWebsite) {
        return Tasks.instrumented(GoToOppoPhonePage.class, phoneWebsite);
    }
}
