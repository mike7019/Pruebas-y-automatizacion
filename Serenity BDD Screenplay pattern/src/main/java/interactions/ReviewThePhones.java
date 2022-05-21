package interactions;


import net.serenitybdd.core.steps.Instrumented;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Interaction;



public class ReviewThePhones implements Interaction {


    @Override
    public <T extends Actor> void performAs(T actor) {

        /*
        String currHandle = BrowseTheWeb.as(actor).getDriver().getWindowHandle();

        List<WebElementFacade> buyOnline = MovistarEquiposRenovarPage.BTN_BUY_ONLINE.resolveAllFor(actor);
        List<WebElementFacade> phonePrice = MovistarEquiposRenovarPage.TXT_PRICE.resolveAllFor(actor);
        List<WebElementFacade> phoneName = MovistarEquiposRenovarPage.TXT_PHONE_NAME.resolveAllFor(actor);



        for (int i = 0; i < phonePrice.size(); i++) {

            String currentPrice = phonePrice.get(i).getText();
            String currentPhoneStorage = phoneName.get(i).getText();

            System.out.println("..........." + i + "..............");
            System.out.println(currentPhoneStorage);
            System.out.println(currentPrice);
            System.out.println("..............................");


            actor.attemptsTo(
                    Ensure.that(TXT_PRICE).isDisplayed(),
                    Hit.the(Keys.ENTER).keyIn(buyOnline.get(i)),
                    HoldOnFor.thisSeconds(150),
                    SwitchToNewTab.change(),
                    WaitUntil.the(TXT_E_SHOP_PRICE, isVisible()).forNoMoreThan(150).seconds(),
                    Ensure.that(TXT_E_SHOP_PRICE).text().isEqualTo(currentPrice),
                    HoldOnFor.thisSeconds(150),
                    CloseCurrentTab.on(),
                    HoldOnFor.thisSeconds(150),
                    Switch.toWindow(currHandle),
                    WaitUntil.the(TXT_PRICE, isVisible()).forNoMoreThan(150).seconds()
            );
        }*/
    }


    public static ReviewThePhones onThePage() {
        return Instrumented.instanceOf(ReviewThePhones.class).withProperties();
    }
}