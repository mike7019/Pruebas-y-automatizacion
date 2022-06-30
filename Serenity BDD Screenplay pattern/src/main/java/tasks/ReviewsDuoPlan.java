package tasks;

import interactions.HoldOnFor;
import net.serenitybdd.core.pages.WebElementFacade;
import net.serenitybdd.core.steps.Instrumented;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Performable;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.actions.JavaScriptClick;
import userinterface.FiberAndTvAppsPage;
import userinterface.MedellinOfferPage;

import java.util.List;

import static userinterface.FiberAndTvAppsPage.BTN_ELEGIAPPS_TV;

public class ReviewsDuoPlan implements Task {

    private int plan;

    public ReviewsDuoPlan(int plan) {
        this.plan = plan;
    }

    public static ReviewsDuoPlan onThePage(int plan) {
        return Instrumented.instanceOf(ReviewsDuoPlan.class).withProperties(plan);
    }

    @Override
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(
                JavaScriptClick.on(MedellinOfferPage.BTN_DUO_PLANS),
                HoldOnFor.thisSeconds(32)
        );

        List<WebElementFacade> planGB = MedellinOfferPage.BTN_PLAN.resolveAllFor(actor);
        List<WebElementFacade> discountPrice = MedellinOfferPage.TXT_DISCOUNT_PRICE.resolveAllFor(actor);
        WebElementFacade totalPrice = MedellinOfferPage.TXT_TOTAL_PRICE.resolveFor(actor);



        String currPlan = planGB.get(plan).getText();
        String currDiscountPrice = discountPrice.get(plan).getText();
        String currNormalPrice = totalPrice.getText();


        System.out.println("..........." + currPlan + "..............");
        System.out.println(currNormalPrice);
        System.out.println(currDiscountPrice);
        System.out.println("..............................");

    }
}
