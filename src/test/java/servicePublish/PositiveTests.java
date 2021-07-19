package servicePublish;

import io.qameta.allure.*;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import pageObjects.LogIn;
import pageObjects.ServicePublish;


public class PositiveTests extends setup.TestBase {


    ServicePublish act = new ServicePublish();
    LogIn log = new LogIn();

    @Test
    @Feature("Service Publish")
    @Owner("Egor Khlebnikov")
    @Story("Minimal service publication")
    @Severity(SeverityLevel.BLOCKER)
    @DisplayName("Basic Positive Service Registration, service location: Online")
    void basicPositiveServiceRegistrationOnline() {

        log.account1();
        log.langEN();

        act.openPage(urlServicePublish);

        act.chooseCategory();
        act.chooseSubcategory();
        act.clickFirstStep();

        act.enterServiceName(serviceName);
        act.enterServiceDescription(serviceDescription);
        act.setDuration(serviceDurationDays, serviceDurationHours, serviceDurationMinutes);
        act.setPrice(servicePrice);
        act.scrollDown();
        act.selectServiceLocationOnline();
        act.clickSecondStep();

        act.clickThirdStep();

        act.clickFifthStep();

        act.fillSpecialization(serviceSpecialization);
        act.clickSixthStep();

        act.fillSchedule();
        act.confirmInstantBooking();
        act.selectPaymentByCash();
        act.selectOnlinePayment();
        act.clickSeventhStep();

        act.checkPublishFormOnline(serviceName, servicePrice, serviceTotalDuration, serviceDescription);
    }

    @Test
    @Feature("Service Publish")
    @Owner("Egor Khlebnikov")
    @Story("Minimal service publication")
    @Severity(SeverityLevel.BLOCKER)
    @DisplayName("Basic Positive Service Registration, service location: Client's place")
    void basicPositiveServiceRegistrationClient() {

        log.account1();
        log.langEN();

        act.openPage(urlServicePublish);

        act.chooseCategory();
        act.chooseSubcategory();
        act.clickFirstStep();

        act.enterServiceName(serviceName);
        act.enterServiceDescription(serviceDescription);
        act.setDuration(serviceDurationDays, serviceDurationHours, serviceDurationMinutes);
        act.setPrice(servicePrice);
        act.scrollDown();
        act.selectServiceLocationClient();
        act.clickSecondStep();

        act.clickThirdStep();

        act.clickFifthStep();

        act.fillSpecialization(serviceSpecialization);
        act.clickSixthStep();

        act.fillSchedule();
        act.confirmInstantBooking();
        act.fillServiceGeo(serviceCountry, serviceCity, serviceAddress);
        act.fillServiceDistance(serviceDistance);
        act.scrollDown2();
        act.selectPaymentByCash();
        act.selectOnlinePayment();
        act.clickSeventhStep();

        act.checkPublishFormClient(serviceName, servicePrice, serviceTotalDuration, serviceDescription, serviceCountry, serviceCity, serviceAddress);
    }

    @Test
    @Feature("Service Publish")
    @Owner("Egor Khlebnikov")
    @Story("Minimal service publication")
    @Severity(SeverityLevel.BLOCKER)
    @DisplayName("Basic Positive Service Registration, service location: Professional's place")
    void basicPositiveServiceRegistrationMaster() {

        log.account1();
        log.langEN();

        act.openPage(urlServicePublish);

        act.chooseCategory();
        act.chooseSubcategory();
        act.clickFirstStep();

        act.enterServiceName(serviceName);
        act.enterServiceDescription(serviceDescription);
        act.setDuration(serviceDurationDays, serviceDurationHours, serviceDurationMinutes);
        act.setPrice(servicePrice);
        act.scrollDown();
        act.selectServiceLocationMaster();
        act.clickSecondStep();

        act.clickThirdStep();

        act.clickFifthStep();

        act.fillSpecialization(serviceSpecialization);
        act.clickSixthStep();

        act.fillSchedule();
        act.confirmInstantBooking();
        act.fillServiceGeo(serviceCountry, serviceCity, serviceAddress);
        act.scrollDown2();
        act.selectPaymentByCash();
        act.selectOnlinePayment();
        act.clickSeventhStep();

        act.checkPublishFormClient(serviceName, servicePrice, serviceTotalDuration, serviceDescription, serviceCountry, serviceCity, serviceAddress);
    }

    @Test
    @Feature("Service Publish")
    @Owner("Egor Khlebnikov")
    @Story("Minimal service publication")
    @Severity(SeverityLevel.BLOCKER)
    @DisplayName("Basic Positive Service Registration with no account, service location: Online")
    void basicPositiveServiceRegistrationWithoutAccount() {

        act.openPage(urlServicePublish);

        act.chooseCategory();
        act.chooseSubcategory();
        act.clickFirstStep();

        act.enterServiceName(serviceName);
        act.enterServiceDescription(serviceDescription);
        act.setDuration(serviceDurationDays, serviceDurationHours, serviceDurationMinutes);
        act.setPrice(servicePrice);
        act.scrollDown();
        act.selectServiceLocationOnline();
        act.clickSecondStep();

        act.clickThirdStep();

        act.fillEmail(testUser3);
        act.fillUserInfo(userFirstName, userLastName, testPassword3, userCountry, userCity);
        act.clickFourthStep();

        act.clickFifthStep();

        act.fillSpecialization(serviceSpecialization);
        act.clickSixthStep();

        act.fillSchedule();
        act.confirmInstantBooking();
        act.selectPaymentByCash();
        act.selectOnlinePayment();
        act.clickSeventhStep();

        act.checkPublishFormOnline(serviceName, servicePrice, serviceTotalDuration, serviceDescription);
    }
}
