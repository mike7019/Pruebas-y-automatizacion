package questions;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.Tasks;

public class UserValidatesData implements Task {




    @Override
    public <T extends Actor> void performAs(T actor) {

    }

    //This is the way to call the task
    public static UserValidatesData onThepage() {
        return Tasks.instrumented(UserValidatesData.class);
    }
}
