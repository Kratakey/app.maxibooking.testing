package booking;

import io.qameta.allure.*;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import pageObjects.Booking;
import pageObjects.LogIn;
import pageObjects.ServicePublish;

import static com.codeborne.selenide.Selectors.byText;
import static com.codeborne.selenide.Selenide.*;

public class PositiveTests extends setup.TestBase {
    Booking act = new Booking();
    LogIn log = new LogIn();

    @Test
    @Feature("Booking")
    @Owner("Egor Khlebnikov")
    @Story("Service booking")
    @Severity(SeverityLevel.BLOCKER)
    @DisplayName("Basic booking")
    void basicPositiveBooking() {
        log.popupSelect();
        log.account5();
        log.langEN();
        act.clickSearch();
        act.findService(service3Name);
        act.verifyServiceSearch(user3FirstName, user3LastName, service3Specialization, service3Name, service3Price, service3Address, service3City, service3Country);
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
