package userinterface;

import net.serenitybdd.core.pages.PageObject;
import net.serenitybdd.screenplay.targets.Target;

public class UserInterfacePage1 extends PageObject {

    //h1[@class='tabs-title']");
    //div[@class='slick-slide slick-active']//ancestor::div[contains(@class,'js-plan-header_Modal')])");
    //*[@class='modal-plan__title']//span[contains(text(),'{0}')])[1]");


    public static final Target BTN_ELEGIAPPS_TV = Target.the("Button to choose internet and tvApps").locatedBy("//div[contains(text(), 'ElegiApps')]");
    public static final Target BTN_PLAN = Target.the("btn with the plans").locatedBy("//*[@id='plan']//h2");
    public static final Target TXT_CHOSEN_PLAN = Target.the("Text with the plan chosen").locatedBy("//p[@class='megasElegidas']//span");
    public static final Target TXT_DISCOUNT_PRICE = Target.the("text that shows the current price").locatedBy("//*[@id='plan']//p[@class='plan_price-valor']/strong");
    public static final Target TXT_NORMAL_PRICE = Target.the("text to the previous price").locatedBy("//*[@id=\"plan\"]/div/div[3]//p[contains(text(),'Normal')]");
    public static final Target TXT_TWENTY_DISCOUNT = Target.the("Imagen para plan de 25GB").locatedBy("//*[@id='plan']/div/div[3]//p[contains(text(),'Ahorra 20%')]");
    public static final Target TXT_TWELVE_MONTHS = Target.the("Imagen para plan de 25GB").locatedBy("//*[@id='plan']/div/div[3]//p[contains(text(),'12 meses')]");
    public static final Target TXT_TEXT = Target.the("Imagen para plan de 25GB").locatedBy("//*[@id=\"duo\"]/div[1]/div[1]");


    public static final Target CHK_TV_APP = Target.the("Toogle check button to locate the plans").locatedBy("//div[@class='item']//span[@class='toggle']");




}
