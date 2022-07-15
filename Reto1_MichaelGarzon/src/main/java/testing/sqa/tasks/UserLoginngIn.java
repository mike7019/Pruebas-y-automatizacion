package testing.sqa.tasks;


import net.serenitybdd.screenplay.Actor;

import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.Tasks;
import net.serenitybdd.screenplay.actions.Enter;
import net.serenitybdd.screenplay.actions.Hit;
import net.serenitybdd.screenplay.waits.WaitUntil;
import org.openqa.selenium.Keys;
import testing.sqa.interactions.HoldOnFor;

import static net.serenitybdd.screenplay.matchers.WebElementStateMatchers.isVisible;
import static testing.sqa.userinterface.AdvantageLoginPage.*;
import static testing.sqa.userinterface.AdvantageMainPage.LBL_USERNAME_LOGGED;


public class UserLoginngIn implements Task {

    private String username;
    private String pass;
    //This is the way to call the task
    public static UserLoginngIn onThePage() {
        return Tasks.instrumented(UserLoginngIn.class);
    }

    //Here is where all the task are performed by the actor
    @Override
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(
                Enter.theValue(username).into(TXT_USERNAME),
                Enter.theValue(pass).into(TXT_PASSWORD),
                Hit.the(Keys.ENTER).keyIn(BTN_LOGIN),
                WaitUntil.the(LBL_USERNAME_LOGGED, isVisible()).forNoMoreThan(80).seconds()
        );

    }

    public UserLoginngIn username(String username) {
        this.username = username;
        return this;
    }

    public UserLoginngIn pass(String pass) {
        this.pass = pass;
        return this;
    }
}
