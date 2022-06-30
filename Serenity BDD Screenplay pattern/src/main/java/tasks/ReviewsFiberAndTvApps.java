package tasks;

import net.serenitybdd.core.pages.WebElementFacade;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.Tasks;
import net.serenitybdd.screenplay.actions.JavaScriptClick;
import net.serenitybdd.screenplay.ensure.Ensure;
import net.serenitybdd.screenplay.waits.WaitUntil;
import userinterface.FiberAndTvAppsPage;
import utils.ExcelDataTable;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;

import static net.serenitybdd.screenplay.matchers.WebElementStateMatchers.isVisible;
import static userinterface.FiberAndTvAppsPage.*;

public class ReviewsFiberAndTvApps implements Task {

    private int plan;

    public ReviewsFiberAndTvApps(int plan) {
        this.plan = plan;
    }


    @Override
    public <T extends Actor> void performAs(T actor) {

        actor.attemptsTo(
                JavaScriptClick.on(BTN_ELEGIAPPS_TV)
        );


        List<WebElementFacade> plansGB = FiberAndTvAppsPage.BTN_PLAN.resolveAllFor(actor);
        List<WebElementFacade> normalPrice = FiberAndTvAppsPage.TXT_NORMAL_PRICE.resolveAllFor(actor);
        List<WebElementFacade> discountPrice = FiberAndTvAppsPage.TXT_DISCOUNT_PRICE.resolveAllFor(actor);



        String currPlan = plansGB.get(plan).getText();
        String currNormalPrice = normalPrice.get(plan).getText();
        String currDiscountPrice = discountPrice.get(plan).getText();


        System.out.println("..........." + currPlan + "..............");
        System.out.println(currNormalPrice);
        System.out.println(currDiscountPrice);
        System.out.println("..............................");


        ArrayList<Map<String, String>> excelDataTable = null;
        try {
            excelDataTable = ExcelDataTable.leerDatosDeHojaDeExcel("Data.xlsx", "info");
        } catch (IOException e) {
            e.printStackTrace();
        }
        System.out.println("Velocidad: " + excelDataTable.get(plan).get("Velocidad"));
        System.out.println("Precio con descuento" + excelDataTable.get(plan).get("valor online 20% dto"));
        System.out.println("Precio normal" + excelDataTable.get(plan).get("Tarifa actual plan"));
        System.out.println("Precio con 2 Apps" + excelDataTable.get(plan).get("valor con 1 +o 2 Elegiapps 25%"));
        System.out.println("Precio con 4 apps" + excelDataTable.get(plan).get("3-4 ElegiApps (30%dcto)"));

        try {
            actor.attemptsTo(
               //     WaitUntil.the(MODAL_BANNER, isVisible()).forNoMoreThan(150).seconds(),
               //     JavaScriptClick.on(MODAL_BANNER),
                    WaitUntil.the(BTN_PLAN, isVisible()).forNoMoreThan(150).seconds(),
                    JavaScriptClick.on(plansGB.get(plan)),
                    Ensure.that(TXT_CHOSEN_PLAN).text().isEqualTo(excelDataTable.get(plan).get("Velocidad")),
                    Ensure.that(TXT_TOTAL_PRICE).text().isEqualTo(excelDataTable.get(plan).get("valor online 20% dto").replace("$ ", "$"))
//                    Ensure.that(TXT_NORMAL_PRICE).text().isEqualTo(excelDataTable.get(plan).get("Tarifa actual plan").replace("$ ", "$"))
         //           Ensure.that(TXT_TOTAL_PRICE).text().isEqualTo(excelDataTable.get(plan).get("valor con 1 +o 2 Elegiapps 25%").replace("$ ", "$"))

            );
         //   plan++;


        } catch (Exception e) {
            e.printStackTrace();
        }

    }

    public static ReviewsFiberAndTvApps onThePage(int plan) {
        return Tasks.instrumented(ReviewsFiberAndTvApps.class, plan);
    }

}
