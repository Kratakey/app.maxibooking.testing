package aServicePublish;

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
    @DisplayName("Basic positive service publishing, service location: Online")
    void t001() {

        log.popupSkip();
        log.account1();
        log.langEN();

        log.clickSideMenu();
        act.openPageEN();

        act.chooseCategory();
        act.chooseSubcategory();
        act.clickFirstStep();

        act.enterServiceName(service1Name);
        act.enterServiceDescription(service1Description);
        act.setDuration(service1DurationDays, service1DurationHours, service1DurationMinutes);
        act.setPrice(service1Price);
        act.scrollDown();
        act.selectServiceLocationOnline();
        act.clickSecondStep();

        act.clickThirdStep();

        act.clickFifthStep();

        act.fillSpecialization(service1Specialization);
        act.clickSixthStep();

        act.fillScheduleLite();
        act.confirmInstantBooking();
        act.scrollDown2();
        act.selectPaymentByCash();
        act.selectOnlinePayment();
        act.clickSeventhStep();

        act.checkPublishFormOnline(service1Name, service1Price, service1TotalDuration, service1Description);
        act.publishService();
    }

    @Test
    @Feature("Service Publish")
    @Owner("Egor Khlebnikov")
    @Story("Minimal service publication")
    @Severity(SeverityLevel.BLOCKER)
    @DisplayName("Basic positive service publishing, service location: Client's place")
    void t002() {

        log.popupSkip();
        log.account2();
        log.langEN();

        log.clickSideMenu();
        act.openPageEN();

        act.chooseCategory();
        act.chooseSubcategory();
        act.clickFirstStep();

        act.enterServiceName(service2Name);
        act.enterServiceDescription(service2Description);
        act.setDuration(service2DurationDays, service2DurationHours, service2DurationMinutes);
        act.setPrice(service2Price);
        act.scrollDown();
        act.selectServiceLocationClient();
        act.clickSecondStep();

        act.clickThirdStep();

        act.clickFifthStep();

        act.fillSpecialization(service2Specialization);
        act.clickSixthStep();

        act.fillScheduleLite();
        act.confirmInstantBooking();
        act.scrollDown2();
        act.fillServiceGeo(service2Country, service2City, service2Address);
        act.fillServiceDistance(service2Distance);
        act.selectPaymentByCash();
        act.selectOnlinePayment();
        act.clickSeventhStep();

        act.checkPublishFormClient(service2Name, service2Price, service2TotalDuration, service2Description, service2Country, service2City, service2Address);
        act.publishService();
    }

    @Test
    @Feature("Service Publish")
    @Owner("Egor Khlebnikov")
    @Story("Minimal service publication")
    @Severity(SeverityLevel.BLOCKER)
    @DisplayName("Basic positive service publishing, service location: Professional's place")
    void t003() {

        log.popupSkip();
        log.account3();
        log.langEN();

        log.clickSideMenu();
        act.openPageEN();

        act.chooseCategory();
        act.chooseSubcategory();
        act.clickFirstStep();

        act.enterServiceName(service3Name);
        act.enterServiceDescription(service3Description);
        act.setDuration(service3DurationDays, service3DurationHours, service3DurationMinutes);
        act.setPrice(service3Price);
        act.scrollDown();
        act.selectServiceLocationMaster();
        act.clickSecondStep();

        act.clickThirdStep();

        act.clickFifthStep();

        act.fillSpecialization(service3Specialization);
        act.clickSixthStep();

        act.fillScheduleLite();
        act.confirmInstantBooking();
        act.scrollDown2();
        act.fillServiceGeo(service3Country, service3City, service3Address);
        act.selectPaymentByCash();
        act.selectOnlinePayment();
        act.clickSeventhStep();

        act.checkPublishFormClient(service3Name, service3Price, service3TotalDuration, service3Description, service3Country, service3City, service3Address);
        act.publishService();
    }

    @Test
    @Feature("Service Publish")
    @Owner("Egor Khlebnikov")
    @Story("Minimal service publication")
    @Severity(SeverityLevel.BLOCKER)
    @DisplayName("Basic positive service publishing with no account, service location: Online")
    void t004() {

        log.popupSkip();
        log.clickSideMenu();
        act.openPageEN();


        act.chooseCategory();
        act.chooseSubcategory();
        act.clickFirstStep();

        act.enterServiceName(service4Name);
        act.enterServiceDescription(service4Description);
        act.setDuration(service4DurationDays, service4DurationHours, service4DurationMinutes);
        act.setPrice(service4Price);
        act.scrollDown();
        act.selectServiceLocationOnline();
        act.clickSecondStep();

        act.clickThirdStep();

        act.fillEmail(testUser4);
        act.fillUserInfo(user4FirstName, user4LastName, testPassword4, user4Country, user4City);
        act.clickFourthStep();

        act.clickFifthStep();

        act.fillSpecialization(service4Specialization);
        act.clickSixthStep();

        act.fillScheduleLite();
        act.confirmInstantBooking();
        act.scrollDown2();
        act.selectPaymentByCash();
        act.selectOnlinePayment();
        act.clickSeventhStep();

        act.checkPublishFormOnline(service4Name, service4Price, service4TotalDuration, service4Description);
        act.publishService();
    }
}
