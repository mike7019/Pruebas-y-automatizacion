package testing.sqa.userinterface;

import net.serenitybdd.core.pages.PageObject;
import net.serenitybdd.screenplay.targets.Target;
import org.openqa.selenium.By;

public class AdvantageMainPage extends PageObject {

    public static final Target BTN_USER_LINK = Target.the("This is the user login link").located(By.id("menuUserLink"));
    public static final Target BTN_LAPTOP = Target.the("This is the Laptop Button").located(By.id("laptopsImg"));
    public static final Target LBL_USERNAME_LOGGED = Target.the("This is where the username appears ").locatedBy("//*[@id=\"menuUserLink\"]/span");

}
