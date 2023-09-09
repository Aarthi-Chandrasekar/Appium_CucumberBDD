**Mobile Automation Framework with Appium and Cucumber**

Appium_CucumberBDD is a mobile testing framework developed in Java. 
Using Appium and UiAutomator2, it supports both native Android apps and mobile web automation. The framework is also integrated with Allure for test reports.

**Core Components:**

**Language**: Java.
**Mobile Automation**: Appium
**Behavior-Driven Approach**: Cucumber BDD
**Build Tool**: Maven

**Features**:
Supports automation for both Android native apps and Android mobile web.
Includes a sample APK for a retail app.
Comes with sample tests for native app functionalities as well as mobile web interactions.
Incorporates Android's UIAutomator2 for UI interactions and automation.
Integrated with Allure for Reporting.

**Setup Instructions:**

**Prerequisites:**
Install Java 8 or above.
Setup Maven.
Android Studio Installation and setup:
Download and install Android studio (https://developer.android.com/studio)
Inside Android studio select Virtual Device Manager and choose device and provide device name.
Appium Setup and uiautomator2 installation:
Install Appium globally using following command: npm install -g Appium
Install uiautomator2 using following command: npm install -g appium-uiautomator2-driver
Ensure driver installed correctly by executing the command: appium driver list
Android SDK Installation: Ensure Android SDK is installed and ANDROID_HOME and ANDROID_SDK_ROOT environment variables are correctly set (example: C:\Users\Admin\AppData\Local\Android\Sdk).
Install NodeJS (https://nodejs.org/en/)
Allure Setup: Follow instructions from Allure's official site (https://docs.qameta.io/allure/)

**Framework Configuration:**

**APK File Location**: A sample APK for a retail app is bundled within (inside resources folder). Ensure to modify the path to test a different APK. Update the path in androidappconfig.json.
**ChromeDriver and Device Configuration**: Modify the ChromeDriver file location and device name as per your setup inside browserconfig.json.

**Executing Tests:**

Ensure the Appium server is running and the emulator is active before executing tests
Input "mvn clean install" in your terminal.
Post execution, for an Allure report, run: allure serve allure-results.
