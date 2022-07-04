package com.banggood.automation.AppiumDriver.ui;

import net.serenitybdd.screenplay.targets.Target;

public class BangGoodUIThirdTestUI {


    public static final Target BTN_SEARCH_BAR = Target.the("field to write on the search bar").locatedBy("//android.view.ViewGroup[@resource-id='com.banggood.client:id/search_box_view']");
    public static final Target BTN_SEARCH_EDIT = Target.the("field to edit text").locatedBy("//android.widget.EditText[@resource-id='com.banggood.client:id/edt_search']");
    public static final Target BTN_NEOPRENE = Target.the("button for the item").locatedBy("//androidx.recyclerview.widget.RecyclerView/android.widget.TextView[1]");
    public static final Target BTN_ADD_TO_CART = Target.the("button to add to cart").locatedBy("//android.widget.FrameLayout[2]/android.view.ViewGroup/android.widget.ImageView");
    public static final Target BTN_BACK_SPACE = Target.the("arrow to go back").locatedBy("//android.view.ViewGroup/android.widget.ImageButton");

}
