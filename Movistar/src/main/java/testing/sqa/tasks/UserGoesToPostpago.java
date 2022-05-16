package testing.sqa.tasks;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Interaction;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.Tasks;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.ensure.Ensure;

import testing.sqa.userinterface.MovistarMainPage;


import static testing.sqa.userinterface.MovistarPortabilidadPospagoPage.LBL_PLAN_POSPAGO_VALIDAR;


public class UserGoesToPostpago implements Task {

    private String user;
    private String email;
    private String password;
    private String confPass;


    //This is the way to call the task
    public static UserGoesToPostpago onThePage() {
        return Tasks.instrumented(UserGoesToPostpago.class);
    }


    //Here is where all the task are performed by the actor
    @Override
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(
                Click.on(MovistarMainPage.BTN_PLANES_MOVILES),
                Click.on(MovistarMainPage.BTN_POSPAGO),
                Click.on(MovistarMainPage.BTN_PORTABILIDAD_POSPAGO),
                Ensure.that(LBL_PLAN_POSPAGO_VALIDAR).isDisplayed()
        );

    }



}
