package com.banggood.automation.AppiumDriver.ui;

import net.serenitybdd.screenplay.targets.Target;

public class BangGoodUISecondTestUI {

    public static final Target BTN_CATEGORIES = Target.the("button to select categories").locatedBy("//android.view.ViewGroup[@resource-id='com.banggood.client:id/main_tab_category']");
    public static final Target BTN_ELECTRIC_TOOLS = Target.the("button to select electric toolscategory").locatedBy("//*[contains(@text,'Tools, Industrial & Scientific')]");
    public static final Target BTN_LASER_SIGHT = Target.the("button to select the laser sight").locatedBy("//androidx.recyclerview.widget.RecyclerView[2]/android.widget.LinearLayout[1]/androidx.recyclerview.widget.RecyclerView/android.widget.FrameLayout[2]/android.widget.LinearLayout/android.widget.TextView");
    public static final Target BTN_ADD_CART_ONE = Target.the("button to add the cart first time").locatedBy("//android.widget.FrameLayout[2]/android.view.ViewGroup/android.widget.ImageView");
    public static final Target BTN_ADD_CART_FINAL = Target.the("button to select the diving fins").locatedBy("//*[contains(@text,'Add to Cart')]");
    public static final Target BTN_GO_BACK_ON_CATEGORY = Target.the("arrow to go back").locatedBy("//*[contains(@text,'Add to Cart')]");
    public static final Target BTN_GO_BACK_ = Target.the("arrow to go back").locatedBy("//android.view.ViewGroup/android.widget.ImageButton");
    public static final Target BTN_GO_BACK_RESOURCE = Target.the("arrow to go back").locatedBy("//android.widget.ImageButton[@resource-id='com.banggood.client:id/btn_navigate_back']");
    public static final Target BTN_HOME = Target.the("arrow to go back").locatedBy("//android.widget.TextView[@resource-id='com.banggood.client:id/tab_text']");

}
