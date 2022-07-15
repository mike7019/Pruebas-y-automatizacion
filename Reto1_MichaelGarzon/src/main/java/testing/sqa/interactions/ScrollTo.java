package testing.sqa.interactions;

import net.serenitybdd.core.pages.WebElementFacade;
import net.serenitybdd.core.steps.Instrumented;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Interaction;
import org.openqa.selenium.JavascriptExecutor;

import static testing.sqa.drivers.DriverRemoteBrowser.driver;
import static testing.sqa.userinterface.AdvantageLaptopPage.BTN_THIRD_LAPTOP;


public class ScrollTo implements Interaction {
    @Override
    public <T extends Actor> void performAs(T actor) {

        JavascriptExecutor js = (JavascriptExecutor) driver;
        WebElementFacade element = BTN_THIRD_LAPTOP.resolveFor(actor);
        js.executeScript("arguments[0].scrollIntoView();", element);

    }

    public static ScrollTo to(){
        return Instrumented.instanceOf(ScrollTo.class).withProperties();
    }
}
