package testing.sqa.userinterface;

import net.serenitybdd.core.pages.PageObject;
import net.serenitybdd.screenplay.targets.Target;
import org.openqa.selenium.By;

public class AdvantageLaptopPage extends PageObject {


    public static final Target BTN_THIRD_LAPTOP = Target.the("This is the HP ENVY 17T Laptop button").located(By.xpath("//li[@ng-repeat='product in [] | productsFilterForCategoriesProduct:searchResult:minPriceToFilter:maxPriceToFilter:productsInclude']"));
    public static final Target LBL_CHOSEN_LAPTOP = Target.the("This is the text to validate").located(By.xpath("//h1[@class='roboto-regular screen768 ng-binding']"));
    public static final Target BTN_CARTLOAD = Target.the("This is the add to cart button").located(By.cssSelector("button[name='save_to_cart']"));
    public static final Target BTN_CHECKOUT = Target.the("This is the button to checkout").located(By.id("checkOutPopUp"));


}
