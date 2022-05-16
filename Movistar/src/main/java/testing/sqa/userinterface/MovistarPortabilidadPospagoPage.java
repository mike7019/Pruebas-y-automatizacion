package testing.sqa.userinterface;

import net.serenitybdd.core.pages.PageObject;
import net.serenitybdd.screenplay.targets.Target;

public class MovistarPortabilidadPospagoPage extends PageObject {

    public static final Target LBL_PLAN_POSPAGO_VALIDAR = Target.the("texto de validacion plan pospago").locatedBy("//h1[@class='tabs-title']");
    public static final Target IMG_PLAN_GB = Target.the("Imagen para plan de 25GB").locatedBy("(//span[contains(text(),'{0}')]//ancestor::div[contains(@class,'js-plan-header_Modal')])[1]");
    public static final Target TXT_PLAN_VALIDACION = Target.the("Imagen para plan de 25GB").locatedBy("(//*[@class='modal-plan__title']//span[contains(text(),'{0}')])[1]");






}
