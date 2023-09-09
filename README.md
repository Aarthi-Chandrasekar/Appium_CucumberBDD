**Mobile Automation Framework with Appium and Cucumber**

Appium_CucumberBDD is a mobile testing framework developed in Java. 
Using Appium and UiAutomator2, it supports both native Android apps and mobile web automation. The framework is also integrated with Allure for test reports.

**Core Components:**

1. **Language:** Java.
2. **Mobile Automation:** Appium
3. **Behavior-Driven Approach**: Cucumber BDD
4. **Build Tool**: Maven

**Features**:

1. Supports automation for both Android native apps and Android mobile web.
2. Includes a sample APK for a retail app.
3. Comes with sample tests for native app functionalities as well as mobile web interactions.
4. Incorporates Android's UIAutomator2 for UI interactions and automation.
5. Integrated with Allure for Reporting.

**Setup Instructions:**

**Prerequisites:**
1. Install Java 8 or above.
2. Setup Maven.
   
**Android Studio Installation and setup:**
1. Download and install Android studio (https://developer.android.com/studio)
2. Inside Android studio select Virtual Device Manager and choose device and provide device name.
   
**Appium Setup and uiautomator2 installation:**
1. Install Appium globally using following command: npm install -g Appium
2. Install uiautomator2 using following command: npm install -g appium-uiautomator2-driver
3. Ensure driver installed correctly by executing the command: appium driver list
   
**Android SDK Installation:** 
Ensure Android SDK is installed and ANDROID_HOME and ANDROID_SDK_ROOT environment variables are correctly set (example: C:\Users\Admin\AppData\Local\Android\Sdk).

**Install NodeJS** (https://nodejs.org/en/)

**Allure Setup:** Follow instructions from Allure's official site (https://docs.qameta.io/allure/)

**Framework Configuration:**

**APK File Location**: A sample APK for a retail app is bundled within (inside resources folder). Ensure to modify the path to test a different APK. Update the path in androidappconfig.json.

**ChromeDriver and Device Configuration**: Modify the ChromeDriver file location and device name as per your setup inside browserconfig.json.

**Executing Tests:**

1. Ensure the Appium server is running and the emulator is active before executing tests
2. Input "mvn clean install" in your terminal.
3. Post execution, for an Allure report, run: allure serve allure-results.
