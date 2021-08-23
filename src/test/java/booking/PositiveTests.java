package booking;

import io.qameta.allure.*;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import pageObjects.Booking;
import pageObjects.LogIn;
import pageObjects.ServicePublish;

import static com.codeborne.selenide.Selectors.byText;
import static com.codeborne.selenide.Selectors.byXpath;
import static com.codeborne.selenide.Selenide.*;

public class PositiveTests extends setup.TestBase {
    Booking act = new Booking();
    LogIn log = new LogIn();

    @Test
    void LogIntoAccount() {
        log.popupSkip();
        log.account5();

        log.langEN();
    }


    @Test
    @Feature("Booking")
    @Owner("Egor Khlebnikov")
    @Story("Service booking")
    @Severity(SeverityLevel.BLOCKER)
    @DisplayName("Basic booking online")
    void basicPositiveBookingOnline() {
        log.popupSkip();
        log.account5();

        log.clickSideMenuFromProfile();
        act.clickSearch();

        act.closeFilters();
        act.findService(service1Name);
        act.verifyServiceSearch(user1FirstName, user1LastName, service1Specialization, service1Name, service1Price);
        act.chooseService();
        act.verifyServiceBase(service1Name, service1Price, service1TotalDuration, user1FirstName, user1LastName, service1Specialization, service1Description);
        act.verifyServiceLocation("Online");
        act.verifyServicePaymentCash();
        act.verifyServicePaymentOnline();
        act.verifyInstantBooking();
        act.clickDate();
        act.clickNextDay();
        act.scrollDown();
        act.bookTime();
        act.clickForward();
        act.bookForMe();
        act.placeOrder();
        act.verifyOrderDetails();
    }

    @Test
    @Feature("Booking")
    @Owner("Egor Khlebnikov")
    @Story("Service booking")
    @Severity(SeverityLevel.BLOCKER)
    @DisplayName("Basic booking client's place")
    void basicPositiveBookingClient() {
        log.popupSkip();
        log.account5();

        log.clickSideMenuFromProfile();
        act.clickSearch();

        act.closeFilters();
        act.findService(service2Name);
        act.verifyServiceSearch(user2FirstName, user2LastName, service2Specialization, service2Name, service2Price);
        act.chooseService();
        act.verifyServiceBase(service2Name, service2Price, service2TotalDuration, user2FirstName, user2LastName, service2Specialization, service2Description);
        act.verifyServiceLocation("Client's place");
        act.verifyServiceGeo(service2Country, service2City, service2Address);
        act.verifyServicePaymentCash();
        act.verifyServicePaymentOnline();
        act.verifyInstantBooking();
        act.clickDate();
        act.clickNextDay();
        act.scrollDown();
        act.bookTime();
        act.clickForward();
        act.bookForMe();
        act.chooseServiceLocation();
        act.placeOrder();
        act.verifyOrderDetails();
    }

    @Test
    @Feature("Booking")
    @Owner("Egor Khlebnikov")
    @Story("Service booking")
    @Severity(SeverityLevel.BLOCKER)
    @DisplayName("Basic booking master's place")
    void basicPositiveBookingMaster() {
        log.popupSkip();
        log.account5();

        log.clickSideMenuFromProfile();
        act.clickSearch();

        act.closeFilters();
        act.findService(service3Name);
        act.verifyServiceSearch(user3FirstName, user3LastName, service3Specialization, service3Name, service3Price);
        act.chooseService();
        act.verifyServiceBase(service3Name, service3Price, service3TotalDuration, user3FirstName, user3LastName, service3Specialization, service3Description);
        act.verifyServiceLocation("Professional's place");
        act.verifyServiceGeo(service3Country, service3City, service3Address);
        act.verifyServicePaymentCash();
        act.verifyServicePaymentOnline();
        act.verifyInstantBooking();
        act.clickDate();
        act.clickNextDay();
        act.scrollDown();
        act.bookTime();
        act.clickForward();
        act.bookForMe();
        act.chooseServiceLocation();
        act.placeOrder();
        act.verifyOrderDetails();
    }
}
