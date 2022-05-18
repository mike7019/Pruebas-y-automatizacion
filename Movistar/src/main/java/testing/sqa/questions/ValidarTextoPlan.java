package testing.sqa.questions;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Question;

import static testing.sqa.userinterface.MovistarEquiposRenovarPage.*;


public class ValidarTextoPlan  implements Question<String> {

    @Override
    public String answeredBy(Actor actor) {
        return TXT_PRICE.resolveFor(actor).getAttribute("href");
    }

    public static Question<String> value() {
        return new ValidarTextoPlan();
    }


}
