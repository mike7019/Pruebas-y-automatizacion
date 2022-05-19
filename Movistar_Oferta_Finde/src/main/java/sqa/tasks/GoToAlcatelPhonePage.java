package sqa.tasks;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.Tasks;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.actions.JavaScriptClick;
import net.serenitybdd.screenplay.actions.Scroll;
import net.serenitybdd.screenplay.ensure.Ensure;
import testing.sqa.interactions.HoldOnFor;
import testing.sqa.questions.ValidarTextoPlan;
import testing.sqa.userinterface.MovistarEquiposRenovarPage;
import testing.sqa.userinterface.MovistarMainPage;

public class GoToAlcatelPhonePage implements Task {

    private String phoneWebsite;


    public GoToAlcatelPhonePage(String phoneWebsite) {
        this.phoneWebsite = phoneWebsite;
    }

    @Override
    public <T extends Actor> void performAs(T actor) {
        System.out.println(ValidarTextoPlan.value());

        actor.attemptsTo(
                Click.on(MovistarMainPage.BTN_EQUIPOS),
                Click.on(MovistarMainPage.BTN_CELULARES),
                HoldOnFor.thisSeconds(150),
                Scroll.to(MovistarEquiposRenovarPage.BTN_ALCATEL_BRAND),
                JavaScriptClick.on(MovistarEquiposRenovarPage.BTN_ALCATEL_BRAND),
                Ensure.thatTheCurrentPage().currentUrl().contains(phoneWebsite)
        );

    }

    //This is the way to call the task
    public static GoToAlcatelPhonePage onThePage(String phoneWebsite) {
        return Tasks.instrumented(GoToAlcatelPhonePage.class, phoneWebsite);
    }
}
