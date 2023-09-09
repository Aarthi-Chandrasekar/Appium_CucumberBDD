package stepdefinition;


import org.junit.runner.RunWith;
import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;

@RunWith(Cucumber.class)
@CucumberOptions(monochrome = true, strict = true, plugin = {"pretty", "io.qameta.allure.cucumber5jvm.AllureCucumber5Jvm"}, features = "src/test/java/features", glue = "stepdefinition",
//Enable Below tag  to run Native app automation in Android Device(inside Emulator)
tags = { "@Android_NativeApp" })
// Enable Below tag to run sample web automation in Android Device(inside Emulator)
        //tags = {"@Android_Web_ChromeBrowser"})
public class TestRunner {

}