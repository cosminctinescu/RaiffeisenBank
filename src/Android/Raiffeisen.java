package Android;

import io.appium.java_client.android.AndroidDriver;
import java.net.URL;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.testng.annotations.Test;
import java.io.File;
import java.net.MalformedURLException;


import io.appium.java_client.android.AndroidDriver;

public class Raiffeisen {


    AndroidDriver driver;
    @Test
    public void Test() throws MalformedURLException, InterruptedException {
        //definirea path apk
        File appDir = new File(System.getProperty("user.dir") + "/app/");
        File app = new File(appDir, "RaiffeisenBank-1.apk");

        //declarare proprietati platforma android
        DesiredCapabilities capability = new DesiredCapabilities();
        capability.setCapability("deviceName", "SM-G906S");
        capability.setCapability("platformName", "Android");
        capability.setCapability("platformVersion", "6.0.1");
        capability.setCapability("appPackage", "com.advantage.RaiffeisenBank");
        capability.setCapability("appActivity", "com.thinkdesquared.banking.LoginActivity");

        //instantierea driverului android
        driver = new AndroidDriver(new URL("http://127.0.0.1:4723/wd/hub"), capability);

        //actiuni
        driver.unlockDevice();
        driver.findElementById("com.advantage.RaiffeisenBank:id/view_demo_version").click();
        driver.findElementById("com.advantage.RaiffeisenBank:id/private_individual_button").click();
        driver.findElementByName("Open drawer").click();
        driver.findElementByName("Tip plata").click();
        driver.findElementById("com.advantage.RaiffeisenBank:id/bill_payment_title_textview").click();
        driver.findElementById("com.advantage.RaiffeisenBank:id/search_company_button").click();
        driver.findElementById("com.advantage.RaiffeisenBank:id/searchField").sendKeys("enel");
        driver.hideKeyboard();
        driver.findElementByName("ENEL ENERGIE SA-plata facturi").click();
        driver.findElementById("com.advantage.RaiffeisenBank:id/amount_button").click();
        driver.findElementById("com.advantage.RaiffeisenBank:id/button1").click();
        driver.findElementById("com.advantage.RaiffeisenBank:id/button2").click();
        driver.findElementById("com.advantage.RaiffeisenBank:id/button3").click();
        driver.findElementById("com.advantage.RaiffeisenBank:id/button4").click();
        driver.findElementById("com.advantage.RaiffeisenBank:id/actionbar_done").click();
        driver.findElementById("com.advantage.RaiffeisenBank:id/variable_field_0").sendKeys("Test");
        driver.hideKeyboard();
        driver.findElementById("com.advantage.RaiffeisenBank:id/variable_field_1").sendKeys("12345cod");
        driver.hideKeyboard();
        driver.findElementById("com.advantage.RaiffeisenBank:id/variable_field_2").sendKeys("12345id");
        driver.hideKeyboard();
        driver.findElementById("com.advantage.RaiffeisenBank:id/variable_field_3").sendKeys("041016");
        driver.hideKeyboard();
        driver.findElementById("com.advantage.RaiffeisenBank:id/submit_button").click();

        driver.swipe();

        if driver.findElementById("com.advantage.RaiffeisenBank:id/verify_button").isEnabled()
        {
            System.out.print("elementul nu exista");
            driver.findElementById("com.advantage.RaiffeisenBank:id/verify_button").click();
        }
        driver.findElementById("com.advantage.RaiffeisenBank:id/templateNameEditText").sendKeys("plata lumina");
        driver.hideKeyboard();
        driver.closeApp();
        driver.quit();
        //definire timeout
        //Thread.sleep(10000);//wait before closing the app

    }

}