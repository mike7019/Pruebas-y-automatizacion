package interactions;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Interaction;
import net.serenitybdd.screenplay.Tasks;


public class ReviewFirstStepPlans implements Interaction {





    //Here is where all the task are performed by the actor
    @Override
    public <T extends Actor> void performAs(T actor) {

//        List<WebElementFacade> buyOnline = MovistarEquiposRenovarPage.BTN_BUY_ONLINE.resolveAllFor(actor);
//        List<WebElementFacade> phonePrice = MovistarEquiposRenovarPage.TXT_PRICE.resolveAllFor(actor);
//        List<WebElementFacade> phoneName = MovistarEquiposRenovarPage.TXT_PHONE_NAME.resolveAllFor(actor);



    }

    //This is the way to call the task
    public static ReviewFirstStepPlans onThePage(int plan) {
        return Tasks.instrumented(ReviewFirstStepPlans.class, plan);
    }


}
