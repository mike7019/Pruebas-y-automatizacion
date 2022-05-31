package tasks;

import interactions.ReviewFirstStepPlans;
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


public class UserReviewsFifthPlan implements Task {

    private int plan;

    public UserReviewsFifthPlan(int plan) {
        this.plan = plan;
    }



    //This is the way to call the task
    public static UserReviewsFifthPlan onThePage(int plan) {
        return Tasks.instrumented(UserReviewsFifthPlan.class, plan);
    }



    //Here is where all the task are performed by the actor

    @Override
    public <T extends Actor> void performAs(T actor) {
        List<WebElementFacade> planGB = BTN_PLAN.resolveAllFor(actor);

            actor.attemptsTo(
                    JavaScriptClick.on(BTN_ELEGIAPPS_TV),
                    WaitUntil.the(BTN_PLAN, isVisible()).forNoMoreThan(150).seconds()
             //       ReviewFirstStepPlans.onThePage()
            );

    }


}
