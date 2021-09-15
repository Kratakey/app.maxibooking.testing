package booking;

import io.qameta.allure.*;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import pageObjects.Booking;
import pageObjects.LogIn;

import static com.codeborne.selenide.Selenide.open;
import static com.codeborne.selenide.Selenide.sleep;

public class PositiveTests extends setup.TestBase {
    Booking act = new Booking();
    LogIn log = new LogIn();

    @Test
    @Feature("Booking")
    @Owner("Egor Khlebnikov")
    @Story("Service booking")
    @Severity(SeverityLevel.BLOCKER)
    @DisplayName("Basic booking online")
    void t001() {
        log.popupSkip();
        log.account5();
        log.langEN();

        log.clickSideMenu();
        act.clickSearchEN();

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
    void t002() {
        log.popupSkip();
        log.account5();

        log.clickSideMenuFromProfile();
        act.clickSearchEN();

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
    void t003() {
        log.popupSkip();
        log.account5();

        log.clickSideMenuFromProfile();
        act.clickSearchEN();

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

    @Test
    @Feature("Booking")
    @Owner("Egor Khlebnikov")
    @Story("Service booking")
    @Severity(SeverityLevel.BLOCKER)
    @DisplayName("Basic booking online(3)")
    void t004() {
        log.popupSkip();
        log.account6();

        log.clickSideMenuFromProfile();
        act.clickSearchEN();

        act.closeFilters();
        act.findService(service7Name);
        act.verifyServiceSearch(user7FirstName, user7LastName, service7Specialization, service7Name, service7Price);
        act.chooseService();
        act.verifyServiceBase(service7Name, service7Price, service7TotalDuration, user7FirstName, user7LastName, service7Specialization, service7Description);
        act.verifyServiceLocation("Online");
        act.verifyServicePaymentCash();
        act.verifyServicePaymentOnline();
        act.verifyInstantBooking();
        act.clickDate();
        act.clickNextDay();
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
    @DisplayName("Basic booking online(2)")
    void t005() {
        log.popupSkip();
        log.account6();

        log.clickSideMenuFromProfile();
        act.clickSearchEN();

        act.closeFilters();
        act.findService(service4Name);
        act.verifyServiceSearch(user4FirstName, user4LastName, service4Specialization, service4Name, service4Price);
        act.chooseService();
        act.verifyServiceBase(service4Name, service4Price, service4TotalDuration, user4FirstName, user4LastName, service4Specialization, service4Description);
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
}
