package testing.sqa.userinterface;

import net.serenitybdd.core.pages.PageObject;
import net.serenitybdd.screenplay.targets.Target;
import org.openqa.selenium.By;


public class AdvantageLoginPage extends PageObject {

    public static final Target TXT_USERNAME = Target.the("This is the username input field").located(By.xpath("//input[@name='username']"));
    public static final Target TXT_PASSWORD = Target.the("This is the password input field").located(By.cssSelector("input[name='password']"));
    public static final Target BTN_LOGIN = Target.the("This is the button to login").located(By.cssSelector("#sign_in_btnundefined"));
    public static final Target BTN_CREATE_ACC = Target.the("This is the Create account link").located(By.xpath("//a[normalize-space()='CREATE NEW ACCOUNT']"));

}
