package testing.sqa.userinterface;

import net.serenitybdd.core.pages.PageObject;
import net.serenitybdd.screenplay.targets.Target;

public class MovistarEquiposRenovarPage extends PageObject {


    public static final Target BTN_XIAOMI_BRAND = Target.the("button to choose xiaomi brand").locatedBy("//div[contains(@class,'link-marca cursor') and @data-marca-id='xiaomi']");
    public static final Target BTN_ALCATEL_BRAND = Target.the("button to choose alcatel brand").locatedBy("//div[contains(@class,'link-marca cursor') and @data-marca-id='alcatel']");
    public static final Target BTN_TCL_BRAND = Target.the("Button to choose tcl brand").locatedBy("//div[contains(@class,'link-marca cursor') and @data-marca-id='tcl']");
    public static final Target BTN_REALME_BRAND = Target.the("button to choose realme brand").locatedBy("//div[contains(@class,'link-marca cursor') and @data-marca-id='realme']");
    public static final Target BTN_OPPO_BRAND = Target.the("button to choose oppo brand").locatedBy("//div[contains(@class,'link-marca cursor') and @data-marca-id='oppo']");
    public static final Target BTN_SAMSUNG_BRAND = Target.the("button to choose samsung brand").locatedBy("//div[contains(@class,'link-marca cursor') and @data-marca-id='samsung']");
    public static final Target BTN_MOTO_BRAND = Target.the("Button to choose motorola brand").locatedBy("//div[contains(@class,'link-marca cursor') and @data-marca-id='motorola']");
    public static final Target BTN_HONOR_BRAND = Target.the("button to choose honor brand").locatedBy("//div[contains(@class,'link-marca cursor') and @data-marca-id='honor']");
    public static final Target BTN_NOKIA_BRAND = Target.the("Button to choose nokia brand").locatedBy("//div[contains(@class,'link-marca cursor') and @data-marca-id='nokia']");
    public static final Target BTN_VIVO_BRAND = Target.the("button to choose vivo brand").locatedBy("//div[contains(@class,'link-marca cursor') and @data-marca-id='vivo']");
    public static final Target BTN_HUAWEI_BRAND = Target.the("Button to choose huawei brand").locatedBy("//div[contains(@class,'link-marca cursor') and @data-marca-id='huawei']");
    public static final Target TXT_PRICE = Target.the("precio del equipo").locatedBy("//section[@class='c-content-phone active']//p[@class='t-left c-phone__price color-darkBlue']//b");
    public static final Target TXT_PHONE_NAME = Target.the("nombre del equipo y capacidad").locatedBy("//section[@class='c-content-phone active']//p[@class='t-left c-phone__title color-darkBlue']");
    public static final Target BTN_BUY_ONLINE = Target.the("boton para comprar en linea").locatedBy("//section[@class='c-content-phone active']//a[@class='buttom-dft c-phone__btn border t-center color-darkBlue bg-white js-GTMGlobal']");
    public static final Target TXT_E_SHOP_PRICE = Target.the("Precio en la eShop").locatedBy("//span[contains(@class,'row price text-newtitle text-center ng-binding text-gre')]");
}

