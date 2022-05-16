package testing.sqa.questions;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Question;
import testing.sqa.interactions.SwitchToFrame;

import static testing.sqa.userinterface.MovistarPortabilidadPospagoPage.*;

public class ValidarTextoPlan  implements Question<String> {

    @Override
    public String answeredBy(Actor actor) {
        return LBL_PLAN_POSPAGO_VALIDAR.of().resolveFor(actor).getText();
    }

    public static Question<String> value() {
        return new ValidarTextoPlan();
    }


}
