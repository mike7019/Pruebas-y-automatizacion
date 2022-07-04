package com.banggood.automation.AppiumDriver.driver;

import io.appium.java_client.AppiumDriver;
import io.appium.java_client.MobileElement;
import org.openqa.selenium.remote.DesiredCapabilities;

import java.net.MalformedURLException;
import java.net.URL;

public class AppiumAndroidDriver {

    public static AppiumDriver<MobileElement> driver;

    public static AppiumAndroidDriver yourBrowser(){
        try {
            DesiredCapabilities capabilities = new DesiredCapabilities();
            capabilities.setCapability("deviceName","moto_g_9__play");
            capabilities.setCapability("udid","ZY32CLR3L9");
            capabilities.setCapability("platformName","Android");
            capabilities.setCapability("appPackage","com.banggood.client");
            capabilities.setCapability("appActivity","com.banggood.client.module.home.MainActivity");
            capabilities.setCapability("noReset","true");
            capabilities.setCapability("platformVersion","11");

            driver = new AppiumDriver(new URL("http://127.0.0.1:4723/wd/hub"), capabilities);

        } catch (MalformedURLException e) {
            e.printStackTrace();
        }
        return new AppiumAndroidDriver();
    }

    public io.appium.java_client.AppiumDriver<MobileElement> onDriver(){
        return driver;
    }

}
