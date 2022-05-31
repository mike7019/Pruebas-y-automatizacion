package interactions;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.Tasks;
import net.serenitybdd.screenplay.actions.Open;
import utils.ExcelDataTable;

import java.io.IOException;

public class BringDataFromExcel implements Task {

    private int rowValue;
    private int cellValue;

    public BringDataFromExcel(int rowValue, int cellValue) {
        this.rowValue = rowValue;
        this.cellValue = cellValue;
    }


    ExcelDataTable data = new ExcelDataTable();

        public static BringDataFromExcel openWebSite(){
            return Tasks.instrumented(BringDataFromExcel.class);
        }

    @Override
    public <T extends Actor> void performAs(T actor) {

        try {
            actor.attemptsTo(Open.url(data.ReadDataSheet("info", "Data.xlsx", 1, 1)));
        }
        catch (IOException e) {
            e.printStackTrace();
        }

    }

    public int getRowValue() {
        return rowValue;
    }

    public void setRowValue(int rowValue) {
        this.rowValue = rowValue;
    }

    public int getCellValue() {
        return cellValue;
    }

    public void setCellValue(int cellValue) {
        this.cellValue = cellValue;
    }
}

