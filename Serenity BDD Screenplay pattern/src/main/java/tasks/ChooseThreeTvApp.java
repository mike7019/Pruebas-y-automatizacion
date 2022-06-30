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

import static userinterface.FiberAndTvAppsPage.CHK_TV_APP;
import static userinterface.FiberAndTvAppsPage.TXT_TOTAL_PRICE;

public class ChooseThreeTvApp implements Task {

    private int disneyStar;
    private int plan;

    public ChooseThreeTvApp(int disneyStar, int plan) {

        this.disneyStar = disneyStar;
        this.plan = plan;
    }

    @Override
    public <T extends Actor> void performAs(T actor) {

        List<WebElementFacade> tvApps = CHK_TV_APP.resolveAllFor(actor);
        ArrayList<Map<String, String>> excelDataTable = null;
        try {
            excelDataTable = ExcelDataTable.leerDatosDeHojaDeExcel("Data.xlsx","info");
        } catch (IOException e) {
            e.printStackTrace();
        }


        actor.attemptsTo(

              //  Ensure.that(TXT_TOTAL_PRICE).text().isEqualTo(excelDataTable.get(plan).get("valor online 20% dto").replace("$ ","$")),
                JavaScriptClick.on(tvApps.get(disneyStar)),
                Ensure.that(TXT_TOTAL_PRICE).text().isEqualTo(excelDataTable.get(plan).get("3-4 ElegiApps (30%dcto)").replace("$ ","$"))

        );

    }

    public static ChooseThreeTvApp onThePage(int disneyStar,  int plan){
        return Instrumented.instanceOf(ChooseThreeTvApp.class).withProperties(disneyStar, plan);
    }
}
