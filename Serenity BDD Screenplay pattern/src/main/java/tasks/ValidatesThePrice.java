package tasks;

import net.serenitybdd.core.steps.Instrumented;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.ensure.Ensure;
import net.serenitybdd.screenplay.waits.WaitUntil;
import utils.ExcelDataTable;
import utils.ReadExcelData;

import java.io.IOException;
import java.util.ArrayList;
import java.util.Map;

import static net.serenitybdd.screenplay.matchers.WebElementStateMatchers.isVisible;
import static userinterface.DiaSinIvaPage.*;

public class ValidatesThePrice implements Task {

    private int price;

    public ValidatesThePrice(int price) {
        this.price = price;
    }

    @Override
    public <T extends Actor> void performAs(T actor) {

        ArrayList<Map<String, String>> excelDataTable = null;
        try {
            excelDataTable = ExcelDataTable.leerDatosDeHojaDeExcel("Data.xlsx", "info");
        } catch (IOException e) {
            e.printStackTrace();
        }

        for (int i = 0; i < excelDataTable.size(); i++) {

        }

        actor.attemptsTo(
                WaitUntil.the(TXT_PRICE, isVisible()).forNoMoreThan(150).seconds(),
                Ensure.that(TXT_PRICE).text().isEqualTo(excelDataTable.get(price).get("PricesWithoutIva").replace("$ ", "$"))
        );

    }

    public static ValidatesThePrice on(){
        return Instrumented.instanceOf(ValidatesThePrice.class).withProperties();
    }
}
