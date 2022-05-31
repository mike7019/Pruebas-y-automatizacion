package tasks;

import net.serenitybdd.core.pages.WebElementFacade;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.Tasks;
import net.serenitybdd.screenplay.actions.JavaScriptClick;
import net.serenitybdd.screenplay.waits.WaitUntil;

import java.util.List;

import static net.serenitybdd.screenplay.matchers.WebElementStateMatchers.isVisible;
import static userinterface.UserInterfacePage1.BTN_ELEGIAPPS_TV;
import static userinterface.UserInterfacePage1.BTN_PLAN;


public class UserReviewsSecondPlan implements Task {

    private int plan;

    public UserReviewsSecondPlan(int plan) {
        this.plan = plan;
    }

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
    public static UserReviewsSecondPlan onThePage(int plan) {
        return Tasks.instrumented(UserReviewsSecondPlan.class, plan);
    }



    //Here is where all the task are performed by the actor

    @Override
    public <T extends Actor> void performAs(T actor) {
        List<WebElementFacade> planGB = BTN_PLAN.resolveAllFor(actor);
        System.out.println(planGB);

            actor.attemptsTo(
                    JavaScriptClick.on(BTN_ELEGIAPPS_TV),
                    WaitUntil.the(BTN_PLAN, isVisible()).forNoMoreThan(150).seconds(),
                    JavaScriptClick.on(BTN_PLAN)
              //      ReviewFirstStepPlans.onThePage()
            );

    }


}
