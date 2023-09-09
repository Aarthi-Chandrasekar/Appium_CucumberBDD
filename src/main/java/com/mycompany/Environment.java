package com.mycompany;

import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.service.local.AppiumDriverLocalService;
import io.appium.java_client.service.local.AppiumServiceBuilder;
import org.json.JSONObject;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.remote.DesiredCapabilities;

import java.net.URL;
import java.nio.file.Files;
import java.nio.file.Paths;

public class Environment {

    public static final String BASE_URL = "https://www.saucedemo.com";
    public static final String USER_NAME = "standard_user";
    public static final String PASSWORD = "secret_sauce";
    public static final int EXPLICIT_WAIT = 10;

    private static AppiumDriverLocalService service;


    public static WebDriver initializeDriver() {
        try {
            //start();
            URL jsonResource = Environment.class.getClassLoader().getResource("browserConfig.json");
            String content = new String(Files.readAllBytes(Paths.get(jsonResource.toURI())));
            DesiredCapabilities capabilities = new DesiredCapabilities();
            JSONObject jsonCapabilities = new JSONObject(content);
            // Iterate over the keys in the JSON and set the capabilities
            for (String key : jsonCapabilities.keySet()) {
                capabilities.setCapability(key, jsonCapabilities.getString(key));
            }
            WebDriver driver = new AndroidDriver(new URL("http://localhost:4723/"), capabilities);
            return driver;

        } catch (Exception e) {
            e.printStackTrace();
        }

        return null;
    }

    public static AndroidDriver initializeAndroidDriver() {
        try {

            DesiredCapabilities capabilities = new DesiredCapabilities();
            URL jsonResource = Environment.class.getClassLoader().getResource("androidAppConfig.json");
            String content = new String(Files.readAllBytes(Paths.get(jsonResource.toURI())));
            // Set capabilities from JSON
            JSONObject jsonCapabilities = new JSONObject(content);
            // Iterate over the keys in the JSON and set the capabilities
            for (String key : jsonCapabilities.keySet()) {
                capabilities.setCapability(key, jsonCapabilities.getString(key));
            }
            AndroidDriver driver = new AndroidDriver(new URL("http://localhost:4723/"), capabilities);
            return driver;

        } catch (Exception e) {
            e.printStackTrace();
        }

        return null;
    }


    public static void start() {
        service = AppiumDriverLocalService.buildService(new AppiumServiceBuilder()
                .usingPort(4723)); // Use any free port. You can specify a port if needed.
        service.start();
    }

    public static void stop() {
        if (service != null && service.isRunning()) {
            service.stop();
        }
    }
}

