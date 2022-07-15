package testing.sqa.tasks;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.Tasks;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.ensure.Ensure;
import net.serenitybdd.screenplay.waits.WaitUntil;
import testing.sqa.interactions.ChooseListThird;
import testing.sqa.interactions.HoldOnFor;
import testing.sqa.interactions.ScrollTo;

import static net.serenitybdd.screenplay.matchers.WebElementStateMatchers.isVisible;
import static testing.sqa.userinterface.AdvantageLaptopPage.*;
import static testing.sqa.userinterface.AdvantageMainPage.*;


public class UserChoosesLaptop implements Task {


    //This is the way to call the task
    public static UserChoosesLaptop onThePage() {
        return Tasks.instrumented(UserChoosesLaptop.class);
    }

    private String user;
    private String laptop;

    public UserChoosesLaptop user(String user) {
        this.user = user;
        return this;
    }

    public UserChoosesLaptop laptop(String laptop) {
        this.laptop = laptop;
        return this;
    }


    //Here is where all the task are performed by the actor
    @Override
    public <T extends Actor> void performAs(T actor) {

        actor.attemptsTo(
                Ensure.that(BTN_USER_LINK).isDisplayed(),
                WaitUntil.the(BTN_LAPTOP, isVisible()).forNoMoreThan(80).seconds(),
                Click.on(BTN_LAPTOP),
                WaitUntil.the(BTN_THIRD_LAPTOP, isVisible()).forNoMoreThan(80).seconds(),
                ScrollTo.to(),
                ChooseListThird.on(),
                Click.on(BTN_CARTLOAD),
                WaitUntil.the(BTN_CHECKOUT, isVisible()).forNoMoreThan(80).seconds(),
                Click.on(BTN_CHECKOUT),
                HoldOnFor.thisSeconds(3)

        );
    }

}
