package testing.sqa.userinterface;

import net.serenitybdd.core.pages.PageObject;
import net.serenitybdd.screenplay.targets.Target;
import org.openqa.selenium.By;

public class OrderPayment extends PageObject {

    public static final Target LBL_LAPTOP = Target.the("This is the Laptop text to validate").located(By.xpath("//*[@id=\"product\"]/td[2]/a/h3"));
}
