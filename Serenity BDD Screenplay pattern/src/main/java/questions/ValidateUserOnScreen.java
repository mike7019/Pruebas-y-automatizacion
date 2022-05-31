package questions;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Question;



public class ValidateUserOnScreen implements Question<String> {

    @Override
    public String answeredBy(Actor actor) {

        return null; //TXT_PRICE.resolveFor(actor).getText() ;
        }

    public static Question<String> value() {
        return new ValidateUserOnScreen();
    }
}
