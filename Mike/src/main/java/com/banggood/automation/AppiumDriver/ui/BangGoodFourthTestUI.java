package com.banggood.automation.AppiumDriver.ui;

import net.serenitybdd.screenplay.targets.Target;

public class BangGoodFourthTestUI {

    public static final Target BTN_DELETE_DUMP = Target.the("button with dump can").locatedBy("//android.widget.ImageButton[@resource-id='com.banggood.client:id/btn_delete']");
    public static final Target BTN_DELETE_ALL = Target.the("button to delete all items").locatedBy("//android.widget.Button[@resource-id='com.banggood.client:id/btn_ok']");

}
