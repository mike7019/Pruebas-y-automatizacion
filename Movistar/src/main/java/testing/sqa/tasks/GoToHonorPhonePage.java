package testing.sqa.tasks;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.Tasks;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.actions.JavaScriptClick;
import net.serenitybdd.screenplay.actions.Scroll;
import net.serenitybdd.screenplay.ensure.Ensure;
import net.serenitybdd.screenplay.waits.WaitUntil;
import testing.sqa.interactions.HoldOnFor;
import testing.sqa.userinterface.MovistarEquiposRenovarPage;
import testing.sqa.userinterface.MovistarMainPage;

import static net.serenitybdd.screenplay.matchers.WebElementStateMatchers.isVisible;

public class GoToHonorPhonePage implements Task {

    private String phoneWebsite;
    public GoToHonorPhonePage(String phoneWebsite) {
        this.phoneWebsite = phoneWebsite;
    }

    @Override
    public <T extends Actor> void performAs(T actor) {

        actor.attemptsTo(
                Click.on(MovistarMainPage.BTN_EQUIPOS),
                Click.on(MovistarMainPage.BTN_CELULARES),
                WaitUntil.the(MovistarEquiposRenovarPage.BTN_HONOR_BRAND, isVisible()).forNoMoreThan(150).seconds(),
                HoldOnFor.thisSeconds(150),
                Scroll.to(MovistarEquiposRenovarPage.BTN_HONOR_BRAND),
                JavaScriptClick.on(MovistarEquiposRenovarPage.BTN_HONOR_BRAND),
                Ensure.thatTheCurrentPage().currentUrl().contains(phoneWebsite)
        );

    }

    //This is the way to call the task
    public static GoToHonorPhonePage onThePage(String phoneWebsite) {
        return Tasks.instrumented(GoToHonorPhonePage.class, phoneWebsite);
    }
}
