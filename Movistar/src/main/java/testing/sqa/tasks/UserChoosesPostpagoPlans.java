package testing.sqa.tasks;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.Tasks;

import net.serenitybdd.screenplay.actions.JavaScriptClick;

import testing.sqa.interactions.HoldOnFor;


import static testing.sqa.userinterface.MovistarPortabilidadPospagoPage.*;

public class UserChoosesPostpagoPlans implements Task {

    private String plan;

    public UserChoosesPostpagoPlans(String plan) {
        this.plan = plan;
    }

    @Override
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(
                JavaScriptClick.on(IMG_PLAN_GB.of(plan)),
                HoldOnFor.thisSeconds(3)
        );

    }

    //This is the way to call the task
    public static UserChoosesPostpagoPlans onThePage(String plan) {
        return Tasks.instrumented(UserChoosesPostpagoPlans.class,plan);
    }
}
