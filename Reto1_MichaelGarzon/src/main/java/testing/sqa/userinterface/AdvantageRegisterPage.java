package testing.sqa.userinterface;

import net.serenitybdd.core.pages.PageObject;
import net.serenitybdd.screenplay.targets.Target;
import org.openqa.selenium.By;

public class AdvantageRegisterPage extends PageObject {

    public static final Target USERNAME_INPUT = Target.the("This is the username text field").located(By.cssSelector("input[name='usernameRegisterPage']"));
    public static final Target EMAIL_INPUT = Target.the("This is the email text field").located(By.cssSelector("input[name='emailRegisterPage']"));
    public static final Target PASSWORD_INPUT = Target.the("This is the password text field").located(By.cssSelector("input[name='passwordRegisterPage']"));
    public static final Target CONFIRM_PASSWORD_INPUT = Target.the("This is the confirmation password field").located(By.cssSelector("input[name='confirm_passwordRegisterPage']"));
    public static final Target CHK_BUTTON = Target.the("This is the check button to accept terms").located(By.cssSelector("input[name='i_agree']"));
    public static final Target BTN_REGISTER_LINK = Target.the("This is the register button to create account").located(By.cssSelector("#register_btnundefined"));

}
