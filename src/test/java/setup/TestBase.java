package setup;

import com.codeborne.selenide.Configuration;
import com.codeborne.selenide.logevents.SelenideLogger;
import helpers.Attach;
import io.qameta.allure.selenide.AllureSelenide;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.BeforeEach;
import org.openqa.selenium.remote.DesiredCapabilities;

import static com.codeborne.selenide.Selenide.closeWebDriver;
import static com.codeborne.selenide.Selenide.open;

public class TestBase extends TestData{
    public String
            urlBase = "https://app.maxibooking.ru/",
            urlLogin = urlBase + "/auth/login",
            urlLogOut = urlBase + "/auth/login?logout=",
            urlServicePublish = urlBase + "/service/publish",
            urlOrders = urlBase + "/my-orders/inbox",
            urlUserRegistration = urlBase + "/auth/registration";
    @BeforeAll
    public static void init() {
        SelenideLogger.addListener("AllureSelenide", new AllureSelenide());

        DesiredCapabilities capabilities = new DesiredCapabilities();
        capabilities.setCapability("enableVNC", true);
        capabilities.setCapability("enableVideo", true);

//        Configuration.browser = "chrome";
//        Configuration.startMaximized = true;
        Configuration.browserSize = "1920x1080";
        Configuration.timeout=8000;
        Configuration.headless = true;
        Configuration.browserCapabilities = capabilities;
//        Configuration.remote = "https://user1:1234@selenoid.autotests.cloud/wd/hub/";
    }


    @BeforeEach
    public void setupConfig() {
        open(urlBase);
    }

    @AfterEach
    public void tearDown() {
        Attach.screenshotAs("Screenshot");
        Attach.pageSource();
        Attach.browserConsoleLogs();
        Attach.addVideo();
        closeWebDriver();
    }
}