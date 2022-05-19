package sqa.userinterface;

import net.serenitybdd.core.pages.PageObject;
import net.serenitybdd.screenplay.targets.Target;

public class MovistarMainPage extends PageObject {


    public static final Target BTN_PLANES_MOVILES = Target.the("boton de menu de planes moviles").locatedBy("//a[text()[contains(.,'Planes móviles')]]");
    public static final Target BTN_POSPAGO = Target.the("boton de sub-menu pospago").locatedBy(".c-submenu__link.i-after-chevron-right.i-phone.js-btn-third-menu.js-GTMGlobal[gtm-category='submenú planes móviles']");
    public static final Target BTN_PORTABILIDAD_POSPAGO = Target.the("boton de sub-menu portabilidad pospago").locatedBy("//a[text()[contains(.,'Portabilidad Pospago')]]");

    public static final Target BTN_EQUIPOS = Target.the("boton de menu de equipos").locatedBy("(//a[text()[contains(.,'Equipos')]])[1]");
    public static final Target BTN_CELULARES = Target.the("boton de sub-menu celulares").locatedBy("//a[@class='c-submenu__link i-phone js-btn-third-menu js-GTMGlobal']");



}
