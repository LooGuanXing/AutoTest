package com.course.testng;

import io.appium.java_client.MobileElement;
import io.appium.java_client.android.AndroidDriver;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.remote.DesiredCapabilities;

import java.net.MalformedURLException;
import java.net.URL;
import java.util.concurrent.TimeUnit;

/**
 * @Classname TestXueQiuDemo
 * @Description TODO
 * @Date 2021/1/24 8:07 下午
 * @Created by longnight
 */
public class TestXueQiuDemo {
    private AndroidDriver driver;

    @Before
    public void setUp() throws MalformedURLException {
        DesiredCapabilities desiredCapablilities = new DesiredCapabilities();
        desiredCapablilities.setCapability("platformName", "android");
        desiredCapablilities.setCapability("deviceName", "xx");
        desiredCapablilities.setCapability("appPackage", "com.xueqiu.trade.android");
        desiredCapablilities.setCapability("appActivity", ".view.WelcomeActivityAlias");

        desiredCapablilities.setCapability("noReset", "false");
        desiredCapablilities.setCapability("fullReset", "true");



        URL remoteUrl = new URL("http://127.0.0.1:4723/wd/hub");

        driver = new AndroidDriver(remoteUrl, desiredCapablilities);
        driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
    }

    @Test
    public void sampleTest() {
        MobileElement el1 = (MobileElement) driver.findElementById("com.xueqiu.trade.android:id/open");
        el1.click();
        MobileElement el2 = (MobileElement) driver.findElementById("com.android.permissioncontroller:id/permission_allow_button");
        el2.click();
        MobileElement el3 = (MobileElement) driver.findElementById("com.android.permissioncontroller:id/permission_allow_button");
        el3.click();

    }

    @After
    public void tearDown() {
        driver.quit();
    }
}
