package interactions;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Interaction;
import net.serenitybdd.screenplay.Tasks;
import net.serenitybdd.screenplay.waits.Wait;
import net.serenitybdd.screenplay.waits.WaitUntil;
import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.support.ui.ExpectedConditions;

import static drivers.DriverRemoteBrowser.*;

public class InteractWithAlert implements Interaction {


    @Override
    public <T extends Actor> void performAs(T actor) {

    }

    public static InteractWithAlert onThePage(){
        return Tasks.instrumented(InteractWithAlert.class);
    }
}
