package com.banggood.automation.AppiumDriver.Interactions;

import com.banggood.automation.AppiumDriver.driver.AppiumAndroidDriver;
import io.appium.java_client.MobileBy;
import net.serenitybdd.core.steps.Instrumented;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Interaction;

public class DropDrownListSelector implements Interaction {
    @Override
    public <T extends Actor> void performAs(T actor) {

        AppiumAndroidDriver.driver.findElement(MobileBy.AndroidUIAutomator("new UiSelector().text(\"Python\")")).click();

    }

    public static DropDrownListSelector on(){
        return Instrumented.instanceOf(DropDrownListSelector.class).withProperties();
    }
}
