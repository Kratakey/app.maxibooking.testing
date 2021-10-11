package setup;

import com.codeborne.selenide.Configuration;
import com.codeborne.selenide.logevents.SelenideLogger;
import helpers.Attach;
import io.qameta.allure.selenide.AllureSelenide;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;

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

    @BeforeEach
    public void setupConfig() {
//        Configuration.browser = "chrome";
        SelenideLogger.addListener("AllureSelenide", new AllureSelenide());
        Configuration.headless = true;
//        Configuration.startMaximized = true;
        Configuration.browserSize = "1920x1080";
        Configuration.timeout=8000;
        open(urlBase);
    }

    @AfterEach
    public void refresh() {
        Attach.screenshotAs("Screenshot");
        Attach.pageSource();
        Attach.browserConsoleLogs();
        closeWebDriver();
    }
}