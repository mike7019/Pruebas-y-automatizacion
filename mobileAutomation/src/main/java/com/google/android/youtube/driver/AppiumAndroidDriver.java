package com.google.android.youtube.driver;
import io.appium.java_client.AppiumDriver;
import io.appium.java_client.MobileElement;
import org.openqa.selenium.remote.DesiredCapabilities;

import java.net.MalformedURLException;
import java.net.URL;

public class AppiumAndroidDriver {

    public static AppiumDriver<MobileElement> driver;

    public static AppiumAndroidDriver suNavegador(){
        try {
            DesiredCapabilities capabilities = new DesiredCapabilities();
            capabilities.setCapability("deviceName","sdk_gphone_x86");
            capabilities.setCapability("udid","emulator-5554");
            capabilities.setCapability("platformName","Android");
            capabilities.setCapability("appPackage","com.google.android.youtube");
            capabilities.setCapability("appActivity","com.google.android.apps.youtube.app.WatchWhileActivity");
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
