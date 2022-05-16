package testing.sqa.tasks;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.Tasks;
import net.serenitybdd.screenplay.actions.JavaScriptClick;
import testing.sqa.interactions.HoldOnFor;
import testing.sqa.interactions.SwitchToNewTab;

import static testing.sqa.userinterface.MovistarEquiposRenovarPage.*;

public class UserChoosePhones implements Task {

    @Override
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(
                JavaScriptClick.on(BTN_BUY_ONLINE),
                HoldOnFor.thisSeconds(3),
                SwitchToNewTab.change()
        );

    }

    //This is the way to call the task
    public static UserChoosePhones onThePage() {
        return Tasks.instrumented(UserChoosePhones.class);
    }
}
