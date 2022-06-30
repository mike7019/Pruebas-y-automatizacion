package userinterface;

import net.serenitybdd.core.pages.PageObject;
import net.serenitybdd.screenplay.targets.Target;

public class MedellinOfferPage extends PageObject {


    public static final Target BTN_DUO_PLANS = Target.the("button to choose duo plan").locatedBy("//div[contains(text(), 'Internet + Telefo')]");
    public static final Target BTN_PLAN = Target.the("text to choose the GB plan").locatedBy("//div[@class='plan pospago']//p[@class='velocidad-bajada velocidad-subida d-none']");
    public static final Target TXT_DISCOUNT_PRICE = Target.the("text with the discount").locatedBy("//*[@id='plan']//p[@class='plan_price-valor']/strong");
    public static final Target TXT_TOTAL_PRICE = Target.the("text with the discount").locatedBy("//div[@class='precioTotal']//span");
    public static final Target CHK_TV_APP = Target.the("toggle boton to choose tvApp").locatedBy("//div[@class='item']//span[@class='toggle']");
    public static final Target TXT_CHOSEN_PLAN = Target.the("text with the plan selected").locatedBy("//p[@class='megasElegidas']//span");


}

