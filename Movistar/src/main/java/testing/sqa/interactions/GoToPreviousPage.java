package testing.sqa.interactions;

import net.serenitybdd.core.steps.Instrumented;
import net.serenitybdd.screenplay.*;
import net.serenitybdd.screenplay.abilities.BrowseTheWeb;
import org.openqa.selenium.WebDriver;

public class GoToPreviousPage implements Interaction {

    private int index;

    public GoToPreviousPage(int index) {
        this.index = index;
    }

    WebDriver driver;

    public static GoToPreviousPage onThePage(int index) {

        return Tasks.instrumented(GoToPreviousPage.class, index);
    }

    @Override
    public <T extends Actor> void performAs(T actor) {

        BrowseTheWeb.as(actor).getDriver().navigate().back();

    }

//    public static GoToPreviousPage onThePage(){
//
//        return Instrumented.instanceOf(GoToPreviousPage.class).withProperties();
//
//    }
}
