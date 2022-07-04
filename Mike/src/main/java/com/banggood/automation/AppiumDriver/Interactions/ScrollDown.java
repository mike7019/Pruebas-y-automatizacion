package com.banggood.automation.AppiumDriver.Interactions;

import io.appium.java_client.MobileBy;
import net.serenitybdd.core.steps.Instrumented;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Interaction;

import static com.banggood.automation.AppiumDriver.driver.AppiumAndroidDriver.driver;

public class ScrollDown implements Interaction {

        @Override
        public <T extends Actor> void performAs(T actor) {
            driver.findElement(MobileBy.AndroidUIAutomator("new UiScrollable(new UiSelector().scrollable(true)).scrollToEnd(1)"));
        }

        public static ScrollDown on(){
            return Instrumented.instanceOf(ScrollDown.class).withProperties();
        }
}
