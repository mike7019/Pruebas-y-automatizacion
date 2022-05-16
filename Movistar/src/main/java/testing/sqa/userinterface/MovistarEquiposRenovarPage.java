package testing.sqa.userinterface;

import net.serenitybdd.core.pages.PageObject;
import net.serenitybdd.screenplay.targets.Target;

public class MovistarEquiposRenovarPage extends PageObject {


    public static final Target TXT_PRICE = Target.the("precio del equipo").locatedBy("//section[@class='c-content-phone active']//p[@class='t-left c-phone__price color-darkBlue']//b");
    public static final Target TXT_PHONE_NAME = Target.the("nombre del equipo y capacidad").locatedBy("//section[@class='c-content-phone active']//p[@class='t-left c-phone__title color-darkBlue']");
    public static final Target BTN_BUY_ONLINE = Target.the("boton para comprar en linea").locatedBy("//section[@class='c-content-phone active']//a[@class='buttom-dft c-phone__btn border t-center color-darkBlue bg-white js-GTMGlobal']");
    public static final Target TXT_E_SHOP_PRICE = Target.the("Precio en la eShop").locatedBy("//span[contains(@class,'row price text-newtitle text-center ng-binding text-gre')]");
}

