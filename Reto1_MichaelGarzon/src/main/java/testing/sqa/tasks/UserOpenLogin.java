package testing.sqa.tasks;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Interaction;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.Tasks;
import net.serenitybdd.screenplay.actions.Hit;
import org.openqa.selenium.Keys;

import testing.sqa.userinterface.AdvantageMainPage;


public class UserOpenLogin implements Task, Interaction {


    //This is the way to call the task
    public static UserOpenLogin onThePage() {
        return Tasks.instrumented(UserOpenLogin.class);
    }


    //Here is where all the task are performed by the actor
    @Override
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(

                Hit.the(Keys.ENTER).keyIn(AdvantageMainPage.BTN_USER_LINK)

        );

    }


}
