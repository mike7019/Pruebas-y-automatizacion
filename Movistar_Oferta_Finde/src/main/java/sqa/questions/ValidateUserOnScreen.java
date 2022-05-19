package sqa.questions;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Question;

import static testing.sqa.userinterface.MovistarEquiposRenovarPage.TXT_PRICE;

public class ValidateUserOnScreen implements Question<String> {

    @Override
    public String answeredBy(Actor actor) {

        return TXT_PRICE.resolveFor(actor).getText() ;   }

    public static Question<String> value() {
        return new ValidateUserOnScreen();
    }
}
