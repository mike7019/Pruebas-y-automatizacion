package testing.sqa.tasks;

import net.serenitybdd.core.steps.Instrumented;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.actions.Enter;
import net.serenitybdd.screenplay.actions.Hit;
import net.serenitybdd.screenplay.waits.WaitUntil;
import org.openqa.selenium.Keys;
import testing.sqa.interactions.HoldOnFor;
import testing.sqa.userinterface.AdvantageLoginPage;

import static net.serenitybdd.screenplay.matchers.WebElementStateMatchers.isVisible;
import static testing.sqa.userinterface.AdvantageMainPage.LBL_USERNAME_LOGGED;
import static testing.sqa.userinterface.AdvantageRegisterPage.*;

public class UserMakesRegistration implements Task {

    private String user;
    private String email;
    private String password;
    private String confPass;



    @Override
    public <T extends Actor> void performAs(T actor) {

       actor.attemptsTo(
               Hit.the(Keys.ENTER).keyIn(AdvantageLoginPage.BTN_CREATE_ACC),
               Enter.theValue(user).into(USERNAME_INPUT),
               Enter.theValue(email).into(EMAIL_INPUT),
               Enter.theValue(password).into(PASSWORD_INPUT),
               Enter.theValue(confPass).into(CONFIRM_PASSWORD_INPUT),
               HoldOnFor.thisSeconds(3),
               Click.on(CHK_BUTTON),
               Click.on(BTN_REGISTER_LINK),
               WaitUntil.the(LBL_USERNAME_LOGGED, isVisible()).forNoMoreThan(3).seconds()
       );
    }

    public static UserMakesRegistration onThePage() {
        return Instrumented.instanceOf(UserMakesRegistration.class).withProperties();
    }

    public UserMakesRegistration user(String user) {
        this.user = user;
        return this;
    }

    public UserMakesRegistration email (String email) {
        this.email = email;
        return this;
    }

    public UserMakesRegistration password (String password) {
        this.password = password;
        return this;
    }

    public UserMakesRegistration confPass (String confPass) {
        this.confPass = confPass;
        return this;
    }
}
