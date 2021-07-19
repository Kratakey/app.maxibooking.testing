package registration;

import io.qameta.allure.*;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import pageObjects.Registration;

public class PositiveTests extends setup.TestBase {

    Registration act = new Registration();

    @Test
    @Feature("User Registration")
    @Owner("Egor Khlebnikov")
    @Story("Minimal registration")
    @Severity(SeverityLevel.BLOCKER)
    @DisplayName("Basic Positive User Registration")
    public void basicPositiveUserRegistration() {
        setTestAccounts();
        act.openPage(urlUserRegistration);
        act.fillUserFirstName(userFirstName);
        act.fillEmail(testUser1);
        act.choosePassword(testPassword1);
        act.selectCountry(userCountry);
        act.selectCity(userCity);
        act.confirm();
        act.verifyRegistrationDataBasic(userFirstName, testUser1, userCountry, userCity);
    }

    @Test
    @Feature("User Registration")
    @Owner("Egor Khlebnikov")
    @Story("Minimal registration")
    @Severity(SeverityLevel.BLOCKER)
    @DisplayName("Full Positive User Registration")
    public void fullPositiveUserRegistration() {
        act.openPage(urlUserRegistration);
        act.fillUserFirstName(userFirstName);
        act.fillUserLastName(userLastName);
        act.fillEmail(testUser2);
        act.choosePassword(testPassword2);
        act.fillPhoneNumber(userPhoneNumber, userCountry);
        act.selectCountry(userCountry);
        act.selectCity(userCity);
        act.confirm();
        act.verifyRegistrationDataFull(userFirstName, userLastName, testUser2, userPhoneNumber, userCountry, userCity);
    }
}
