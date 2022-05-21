package tasks;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.Tasks;



public class UserDoThisTask implements Task {

//            JavaScriptClick.on(IMG_PLAN_GB.of(plan)),
//            Click.on(MovistarMainPage.BTN_PLANES_MOVILES),
//            Click.on(MovistarMainPage.BTN_POSPAGO),
//            Click.on(MovistarMainPage.BTN_PORTABILIDAD_POSPAGO),
//            Ensure.that(LBL_PLAN_POSPAGO_VALIDAR).isDisplayed()
//            Scroll.to(MovistarEquiposRenovarPage.BTN_MOTO_BRAND),
//            JavaScriptClick.on(MovistarEquiposRenovarPage.BTN_MOTO_BRAND),
////            Ensure.thatTheCurrentPage().currentUrl().contains(phoneWebsite)
//    SwitchToNewTab.change()
//    Switch.toDefaultContext());


    //This is the way to call the task
    public static UserDoThisTask onThePage() {
        return Tasks.instrumented(UserDoThisTask.class);
    }


    //Here is where all the task are performed by the actor
    @Override
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(

                //heres the task the actor performs

        );

    }


}
