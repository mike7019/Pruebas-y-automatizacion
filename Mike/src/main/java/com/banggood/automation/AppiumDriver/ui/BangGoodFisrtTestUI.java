package com.banggood.automation.AppiumDriver.ui;

import net.serenitybdd.screenplay.targets.Target;

public class BangGoodFisrtTestUI {

    public static final Target BTN_NEW_USER_BENEFICTS = Target.the("button that chooses the list of products with beneficts").locatedBy("//android.widget.ImageView[@resource-id='com.banggood.client:id/iv_product']");
    public static final Target BTN_SCREWERS = Target.the("button to choose the screwers").locatedBy("//android.view.View[2]/android.view.View[2]/android.widget.ListView/android.view.View[1]");
    public static final Target BTN_ADD_TO_CART_ONE = Target.the("the first add to cart button").locatedBy("//android.widget.Button[@resource-id='com.banggood.client:id/btn_slide_cart']");
    public static final Target BTN_ADD_TO_CART_FINAL = Target.the("the final button to add the product to the cart").locatedBy("//*[contains(@text,'Add to Cart')]");
    public static final Target TXT_SCREWERS_VALIDATION = Target.the("product screwers").locatedBy("//*[@text='SAFETYON 4 Pieces Drill Brush Attachment Electric Drill Brushes for Cleaning Pool Tile Flooring Brick Ceramic Marble Grout Bathroom Car']");
    public static final Target BTN_CHECK_CART = Target.the("button to check the cart products").locatedBy("//android.widget.ImageView[@resource-id='com.banggood.client:id/menu_cart_icon']");
    public static final Target BTN_BACK_ITEM = Target.the("button to check the cart products").locatedBy("//android.widget.ImageButton[@resource-id='com.banggood.client:id/btn_navigate_back']");
    public static final Target BTN_BACK_CART = Target.the("button to check the cart products").locatedBy("//android.view.ViewGroup/android.widget.ImageButton");
    public static final Target BTN_BACK_SHOP = Target.the("button to check the cart products").locatedBy("//android.view.ViewGroup/android.widget.ImageButton");



    public static final Target LBL_VALIDATION = Target.the("Validate home").locatedBy("//androidx.appcompat.app.ActionBar.b[@content-desc=\"Hot\"]/android.widget.TextView\n");

}
