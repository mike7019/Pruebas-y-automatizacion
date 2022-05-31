package questions;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Question;



public class ValidarPlanesPospago implements Question<String> {

    private String plan;

    public ValidarPlanesPospago(String plan) {
        this.plan = plan;
    }

    @Override
    public String answeredBy(Actor actor) {

        return null;
    }

    public static Question<String> value(String plan) {
        return new ValidarPlanesPospago(plan);
    }
}
