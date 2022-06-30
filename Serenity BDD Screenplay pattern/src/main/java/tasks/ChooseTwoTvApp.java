package tasks;

import net.serenitybdd.core.pages.WebElementFacade;
import net.serenitybdd.core.steps.Instrumented;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.actions.JavaScriptClick;
import net.serenitybdd.screenplay.ensure.Ensure;
import utils.ExcelDataTable;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;

import static userinterface.FiberAndTvAppsPage.*;

public class ChooseTwoTvApp implements Task {

    private int netflix;
    private int primevideo;
    private int plan;

    public ChooseTwoTvApp(int netflix, int primevideo, int plan) {
        this.netflix = netflix;
        this.primevideo = primevideo;
        this.plan = plan;
    }

    @Override
    public <T extends Actor> void performAs(T actor) {

        List<WebElementFacade> tvApps = CHK_TV_APP.resolveAllFor(actor);
        ArrayList<Map<String, String>> excelDataTable = null;
        try {
            excelDataTable = ExcelDataTable.leerDatosDeHojaDeExcel("Data.xlsx", "info");
        } catch (IOException e) {
            e.printStackTrace();
        }


        actor.attemptsTo(
//                Ensure.that(TXT_CHOSEN_PLAN).text().isEqualTo(excelDataTable.get(plan).get("Velocidad")),
//                Ensure.that(TXT_DISCOUNT_PRICE).text().isEqualTo(excelDataTable.get(plan).get("valor online 20% dto").replace("$ ", "$")),
//                Ensure.that(TXT_NORMAL_PRICE).text().isEqualTo(excelDataTable.get(plan).get("Tarifa actual plan").replace("$ ", "$")),
                JavaScriptClick.on(tvApps.get(netflix)),
                JavaScriptClick.on(tvApps.get(primevideo)),
                Ensure.that(TXT_TOTAL_PRICE).text().isEqualTo(excelDataTable.get(plan).get("valor con 1 +o 2 Elegiapps 25%").replace("$ ", "$"))

        );
    }

    public static ChooseTwoTvApp onThePage(int netflix, int primeVideo, int plan) {

        return Instrumented.instanceOf(ChooseTwoTvApp.class).withProperties(netflix, primeVideo, plan);
    }
}
