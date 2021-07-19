package setup;

import com.codeborne.selenide.Configuration;
import com.github.javafaker.Faker;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.BeforeEach;

import java.util.Locale;

import static com.codeborne.selenide.Selenide.closeWebDriver;
import static com.codeborne.selenide.Selenide.open;
import static java.lang.Long.parseLong;

public class TestBase {

    public static String
            testUser1,
            testUser2,
            testUser3,
            testPassword1,
            testPassword2,
            testPassword3;

    Faker random = new Faker(new Locale("en-US"));

    public String
            urlBase = "https://d8base.com/",
            urlLogin = urlBase + "/auth/login",
            urlServicePublish = urlBase + "/service/publish",
            urlUserRegistration = urlBase + "/auth/registration",
            userFirstName = random.name().firstName(),
            userLastName = random.name().lastName(),
            userEmail = random.name().username() + "@dd.dd",
            userPassword = random.internet().password(),
            userPhoneNumber = "911" + random.number().digits(7),
            userCountry = "Russia",
            userCity = "Moscow",
            serviceName = random.name().title(),
            serviceDescription = random.lorem().characters(20, 2000),
            serviceDurationDays = String.valueOf(random.number().numberBetween(0, 7)),
            serviceDurationHours = String.valueOf(random.number().numberBetween(0, 24)),
            serviceDurationMinutes = String.valueOf(random.number().numberBetween(0, 60)),
            servicePrice = String.valueOf(random.number().numberBetween(0, 999)),
            serviceSpecialization = random.job().title(),
            serviceCountry = "Russia",
            serviceCity = "Moscow",
            serviceAddress = random.address().fullAddress(),
            serviceDistance = String.valueOf(random.number().numberBetween(0, 9999)),
            serviceEmail = random.name().username() + "@jj.jj";

    Long serviceDurationDaysLong = parseLong(serviceDurationDays),
            serviceDurationHoursLong = parseLong(serviceDurationHours),
            serviceDurationMinutesLong = parseLong(serviceDurationMinutes),
            serviceTotalDurationLong = serviceDurationDaysLong * 24 * 60 + serviceDurationHoursLong * 60 + serviceDurationMinutesLong;

    public String serviceTotalDuration = Long.toString(serviceTotalDurationLong);

    public static void setTestAccounts() {
        Faker generate = new Faker(new Locale("en-US"));
        testUser1 = generate.name().username() + "@dd.dd";
        testUser2 = generate.name().username() + "@dd.dd";
        testUser3 = generate.name().username() + "@dd.dd";
        testPassword1 = generate.internet().password();
        testPassword2 = generate.internet().password();
        testPassword3 = generate.internet().password();
    }

    @BeforeEach
    public void setupConfig() {
        Configuration.browser = "chrome";
        Configuration.startMaximized = true;
        open(urlBase);
    }

    @AfterEach
    public void refresh() {
        closeWebDriver();
    }

}