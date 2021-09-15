package aRegistration;

import io.qameta.allure.*;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import pageObjects.LogIn;
import pageObjects.Registration;

public class PositiveTests extends setup.TestBase {

    Registration act = new Registration();
    LogIn log = new LogIn();

    @Test
    @Feature("User Registration")
    @Owner("Egor Khlebnikov")
    @Story("Full registration")
    @Severity(SeverityLevel.BLOCKER)
    @DisplayName("Full Positive User Registration")
    public void t001() {
        setTestData();
        log.popupSkip();
        log.clickSideMenu();
        act.openPageEN();
        act.fillUserFirstName(user1FirstName);
        act.fillUserLastName(user1LastName);
        act.fillEmail(testUser1);
        act.choosePassword(testPassword1);
        act.fillPhoneNumber(user1PhoneNumber, user1Country);
        act.selectCountry(user1Country);
        act.selectCity(user1City);
        act.confirm();
        act.verifyRegistrationDataFull(user1FirstName, user1LastName, testUser1, user1PhoneNumber, user1Country, user1City);
    }

    @Test
    @Feature("User Registration")
    @Owner("Egor Khlebnikov")
    @Story("Full registration")
    @Severity(SeverityLevel.BLOCKER)
    @DisplayName("Full Positive User Registration")
    public void t002() {
        log.popupSkip();
        log.clickSideMenu();
        act.openPageEN();
        act.fillUserFirstName(user2FirstName);
        act.fillUserLastName(user2LastName);
        act.fillEmail(testUser2);
        act.choosePassword(testPassword2);
        act.fillPhoneNumber(user2PhoneNumber, user2Country);
        act.selectCountry(user2Country);
        act.selectCity(user2City);
        act.confirm();
        act.verifyRegistrationDataFull(user2FirstName, user2LastName, testUser2, user2PhoneNumber, user2Country, user2City);
    }

    @Test
    @Feature("User Registration")
    @Owner("Egor Khlebnikov")
    @Story("Full registration")
    @Severity(SeverityLevel.BLOCKER)
    @DisplayName("Full Positive User Registration")
    public void t003() {
        log.popupSkip();
        log.clickSideMenu();
        act.openPageEN();
        act.fillUserFirstName(user3FirstName);
        act.fillUserLastName(user3LastName);
        act.fillEmail(testUser3);
        act.choosePassword(testPassword3);
        act.fillPhoneNumber(user3PhoneNumber, user3Country);
        act.selectCountry(user3Country);
        act.selectCity(user3City);
        act.confirm();
        act.verifyRegistrationDataFull(user3FirstName, user3LastName, testUser3, user3PhoneNumber, user3Country, user3City);
    }

    @Test
    @Feature("User Registration")
    @Owner("Egor Khlebnikov")
    @Story("Minimal registration")
    @Severity(SeverityLevel.BLOCKER)
    @DisplayName("Basic Positive User Registration")
    public void t004() {
        log.popupSkip();
        log.clickSideMenu();
        act.openPageEN();
        act.fillUserFirstName(user5FirstName);
        act.fillEmail(testUser5);
        act.choosePassword(testPassword5);
        act.selectCountry(user5Country);
        act.selectCity(user5City);
        act.confirm();
        act.verifyRegistrationDataBasic(user5FirstName, testUser5, user5Country, user5City);
    }

    @Test
    @Feature("User Registration")
    @Owner("Egor Khlebnikov")
    @Story("Full registration")
    @Severity(SeverityLevel.BLOCKER)
    @DisplayName("Full Positive User Registration")
    public void t005() {
        log.popupSkip();
        log.clickSideMenu();
        act.openPageEN();
        act.fillUserFirstName(user6FirstName);
        act.fillUserLastName(user6LastName);
        act.fillEmail(testUser6);
        act.choosePassword(testPassword6);
        act.fillPhoneNumber(user6PhoneNumber, user6Country);
        act.selectCountry(user6Country);
        act.selectCity(user6City);
        act.confirm();
        act.verifyRegistrationDataFull(user6FirstName, user6LastName, testUser6, user6PhoneNumber, user6Country, user6City);
    }

    @Test
    @Feature("User Registration")
    @Owner("Egor Khlebnikov")
    @Story("Full registration")
    @Severity(SeverityLevel.BLOCKER)
    @DisplayName("Full Positive User Registration")
    public void t006() {
        log.popupSkip();
        log.clickSideMenu();
        act.openPageEN();
        act.fillUserFirstName(user7FirstName);
        act.fillUserLastName(user7LastName);
        act.fillEmail(testUser7);
        act.choosePassword(testPassword7);
        act.fillPhoneNumber(user7PhoneNumber, user7Country);
        act.selectCountry(user7Country);
        act.selectCity(user7City);
        act.confirm();
        act.verifyRegistrationDataFull(user7FirstName, user7LastName, testUser7, user7PhoneNumber, user7Country, user7City);
    }
}
