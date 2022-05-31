package tasks;

import net.serenitybdd.core.pages.WebElementFacade;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Performable;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.Tasks;
import net.serenitybdd.screenplay.actions.JavaScriptClick;
import net.serenitybdd.screenplay.ensure.Ensure;
import net.serenitybdd.screenplay.waits.WaitUntil;
import userinterface.UserInterfacePage1;
import utils.ExcelDataTable;

import java.io.IOException;
import java.util.List;

import static net.serenitybdd.screenplay.matchers.WebElementStateMatchers.isVisible;
import static userinterface.UserInterfacePage1.*;

public class ReviewsFirstPlan implements Task {

    private int plan;
    public ReviewsFirstPlan(int plan) {
        this.plan = plan;
    }


    @Override
    public <T extends Actor> void performAs(T actor) {

        ExcelDataTable pointer = new ExcelDataTable();
        List<WebElementFacade> plans = UserInterfacePage1.BTN_PLAN.resolveAllFor(actor);
        List<WebElementFacade> choosenPlan = UserInterfacePage1.TXT_CHOSEN_PLAN.resolveAllFor(actor);
        List<WebElementFacade> normalPrice = UserInterfacePage1.TXT_NORMAL_PRICE.resolveAllFor(actor);
        List<WebElementFacade> discount = UserInterfacePage1.TXT_TWENTY_DISCOUNT.resolveAllFor(actor);
        List<WebElementFacade> planPrice = UserInterfacePage1.TXT_CURRENT_PRICE.resolveAllFor(actor);




            String planPrices = planPrice.get(plan).getText();
            String currentPrice = planPrice.get(plan).getText();
            String currNormalPrice = normalPrice.get(plan).getText();
            String currDiscount = discount.get(plan).getText();
            String currPlan = plans.get(plan).getText();
            String currChosenPlan = choosenPlan.get(plan).getText();


            System.out.println("..........." + currPlan + "..............");
            System.out.println(planPrices);
            System.out.println(currNormalPrice);
            System.out.println(currDiscount);
            System.out.println("..............................");

        try {
            actor.attemptsTo(
                    JavaScriptClick.on(BTN_ELEGIAPPS_TV),
                    WaitUntil.the(BTN_PLAN, isVisible()).forNoMoreThan(150).seconds(),
                    JavaScriptClick.on(BTN_PLAN),
                        Ensure.that(TXT_CHOSEN_PLAN).text().isEqualTo(pointer.ReadDataSheet("info","Data.xlsx",0,0))
    //                                    Ensure.that(TXT_CURRENT_PRICE).text().isEqualTo(pointer.ReadDataSheet("info","Data.xlsx",1,1))
    //                                    Ensure.that(TXT_NORMAL_PRICE).text().isEqualTo(currNormalPrice),
    //                                    Ensure.that(TXT_TWENTY_DISCOUNT).text().isEqualTo(currDiscount)
            );
        } catch (IOException e) {
            e.printStackTrace();
        }

    }

    public static ReviewsFirstPlan onThePage(int plan) {
        return Tasks.instrumented(ReviewsFirstPlan.class, plan);
    }

}
