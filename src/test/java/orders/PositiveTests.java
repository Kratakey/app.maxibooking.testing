package orders;

import io.qameta.allure.*;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import pageObjects.Booking;
import pageObjects.LogIn;
import pageObjects.Orders;
import pageObjects.ServicePublish;

public class PositiveTests extends setup.TestBase {

    Orders act = new Orders();
    ServicePublish srv = new ServicePublish();
    Booking bkn = new Booking();
    LogIn log = new LogIn();

    @Test
    @Feature("Orders")
    @Owner("Egor Khlebnikov")
    @Story("Order check")
    @Severity(SeverityLevel.BLOCKER)
    @DisplayName("Check orders from user side")
    void t001() {
        log.popupSkip();
        log.account5();

        act.openOrderPageTopEN();
        act.checkOrderOutbox(user1FirstName, service1Name, service1Price, service1TotalDuration);
        act.checkOrderOutbox(user2FirstName, service2Name, service2Price, service2TotalDuration);
        act.checkOrderOutbox(user3FirstName, service3Name, service3Price, service3TotalDuration);

    }

    @Test
    @Feature("Orders")
    @Owner("Egor Khlebnikov")
    @Story("Order check")
    @Severity(SeverityLevel.BLOCKER)
    @DisplayName("Master completes order: online")
    void t002() {
        log.popupSkip();
        log.account1();

        act.openOrderPageTopEN();
        act.tabCurrentOrdersInbox();
        act.checkOrderInbox(user5FirstName, service1Price, service1TotalDuration);
        act.completeOrder();
    }

    @Test
    @Feature("Orders")
    @Owner("Egor Khlebnikov")
    @Story("Order check")
    @Severity(SeverityLevel.BLOCKER)
    @DisplayName("Master completes order: client's place")
    void t003() {
        log.popupSkip();
        log.account2();

        act.openOrderPageTopEN();
        act.tabCurrentOrdersInbox();
        act.checkOrderInbox(user5FirstName, service2Price, service2TotalDuration);
        act.completeOrder();
    }

    @Test
    @Feature("Orders")
    @Owner("Egor Khlebnikov")
    @Story("Order check")
    @Severity(SeverityLevel.BLOCKER)
    @DisplayName("Master completes order: master's place")
    void t004() {
        log.popupSkip();
        log.account3();

        act.openOrderPageTopEN();
        act.tabCurrentOrdersInbox();
        act.checkOrderInbox(user5FirstName, service3Price, service3TotalDuration);
        act.completeOrder();
    }

    @Test
    @Feature("Orders")
    @Owner("Egor Khlebnikov")
    @Story("Order cancel")
    @Severity(SeverityLevel.BLOCKER)
    @DisplayName("Client side order cancel")
    void t005() {
        log.popupSkip();
        log.account6();

        act.openOrderPageTopEN();
        act.checkOrderOutbox(user4FirstName, service4Name, service4Price, service4TotalDuration);
        act.discardOrderClient("I don't like the service");
        act.checkDiscardOrderOutbox(user4FirstName, service4Name, service4Price, service4TotalDuration);
    }

    @Test
    @Feature("Orders")
    @Owner("Egor Khlebnikov")
    @Story("Order cancel")
    @Severity(SeverityLevel.BLOCKER)
    @DisplayName("Master side order cancel")
    void t006() {
        log.popupSkip();
        log.account7();

        act.openOrderPageTopEN();
        act.tabCurrentOrdersInbox();
        act.checkOrderInbox(user6FirstName, service7Price, service7TotalDuration);
        act.discardOrder();
        act.checkDiscardOrderInbox(user6FirstName, service7Price, service7TotalDuration);
    }
}
