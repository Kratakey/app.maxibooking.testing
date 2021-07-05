package servicePublish;

import io.qameta.allure.*;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import pageObjects.Variables;
import pageObjects.ServicePublish;


public class PositiveTests extends setup.TestBase {


    ServicePublish act = new ServicePublish();
    Variables get = new Variables();

    @Test
    @Feature("Service Publish")
    @Owner("Egor Khlebnikov")
    @Story("Minimal service publication")
    @Severity(SeverityLevel.BLOCKER)
    @DisplayName("Basic Positive Service Registration service location: Online")
    void basicPositiveServiceRegistrationOnline() {

        act.openPage(get.url);

        act.chooseCategory();
        act.chooseSubcategory();
        act.clickFirstStep();

        act.enterServiceName(get.serviceName);
        act.enterServiceDescription(get.serviceDescription);
        act.setDuration(get.serviceDurationDays, get.serviceDurationHours, get.serviceDurationMinutes);
        act.setPrice(get.servicePrice);
        act.scrollDown();
        act.selectServiceLocationOnline();
        act.clickSecondStep();

        act.clickThirdStep();

        act.clickFifthStep();

        act.fillSpecialization(get.serviceSpecialization);
        act.clickSixthStep();

        act.fillSchedule();
        act.confirmInstantBooking();
        act.selectPaymentByCash();
        act.selectOnlinePayment();
        act.clickSeventhStep();

        act.checkPublishFormOnline(get.serviceName, get.servicePrice, get.serviceTotalDuration, get.serviceDescription);
    }

    @Test
    @Feature("Service Publish")
    @Owner("Egor Khlebnikov")
    @Story("Minimal service publication")
    @Severity(SeverityLevel.BLOCKER)
    @DisplayName("Basic Positive Service Registration service location: Client's place")
    void basicPositiveServiceRegistrationClient() {

        act.openPage(get.url);

        act.chooseCategory();
        act.chooseSubcategory();
        act.clickFirstStep();

        act.enterServiceName(get.serviceName);
        act.enterServiceDescription(get.serviceDescription);
        act.setDuration(get.serviceDurationDays, get.serviceDurationHours, get.serviceDurationMinutes);
        act.setPrice(get.servicePrice);
        act.scrollDown();
        act.selectServiceLocationClient();
        act.clickSecondStep();

        act.clickThirdStep();

        act.clickFifthStep();

        act.fillSpecialization(get.serviceSpecialization);
        act.clickSixthStep();

        act.fillSchedule();
        act.confirmInstantBooking();
        act.fillServiceGeo(get.serviceCountry, get.serviceCity, get.serviceAddress);
        act.fillServiceDistance(get.serviceDistance);
        act.scrollDown2();
        act.selectPaymentByCash();
        act.selectOnlinePayment();
        act.clickSeventhStep();

        act.checkPublishFormClient(get.serviceName, get.servicePrice, get.serviceTotalDuration, get.serviceDescription, get.serviceCountry, get.serviceCity, get.serviceAddress);
    }

    @Test
    @Feature("Service Publish")
    @Owner("Egor Khlebnikov")
    @Story("Minimal service publication")
    @Severity(SeverityLevel.BLOCKER)
    @DisplayName("Basic Positive Service Registration service location: Professional's place")
    void basicPositiveServiceRegistrationMaster() {

        act.openPage(get.url);

        act.chooseCategory();
        act.chooseSubcategory();
        act.clickFirstStep();

        act.enterServiceName(get.serviceName);
        act.enterServiceDescription(get.serviceDescription);
        act.setDuration(get.serviceDurationDays, get.serviceDurationHours, get.serviceDurationMinutes);
        act.setPrice(get.servicePrice);
        act.scrollDown();
        act.selectServiceLocationMaster();
        act.clickSecondStep();

        act.clickThirdStep();

        act.clickFifthStep();

        act.fillSpecialization(get.serviceSpecialization);
        act.clickSixthStep();

        act.fillSchedule();
        act.confirmInstantBooking();
        act.fillServiceGeo(get.serviceCountry, get.serviceCity, get.serviceAddress);
        act.scrollDown2();
        act.selectPaymentByCash();
        act.selectOnlinePayment();
        act.clickSeventhStep();

        act.checkPublishFormClient(get.serviceName, get.servicePrice, get.serviceTotalDuration, get.serviceDescription, get.serviceCountry, get.serviceCity, get.serviceAddress);
    }
}
