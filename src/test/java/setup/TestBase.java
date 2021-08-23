package setup;

import com.codeborne.selenide.Configuration;
import com.github.javafaker.Faker;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import pageObjects.LogIn;

import java.util.Locale;

import static com.codeborne.selenide.Selectors.byText;
import static com.codeborne.selenide.Selenide.*;
import static com.codeborne.selenide.Selenide.$;
import static java.lang.Long.parseLong;

public class TestBase {

    public static String
            testUser1,
            testUser2,
            testUser3,
            testUser4,
            testUser5,
            testPassword1,
            testPassword2,
            testPassword3,
            testPassword4,
            testPassword5,
            user1FirstName,
            user1LastName,
            user1PhoneNumber,
            user1Country,
            user1City,
            user2FirstName,
            user2LastName,
            user2PhoneNumber,
            user2Country,
            user2City,
            user3FirstName,
            user3LastName,
            user3PhoneNumber,
            user3Country,
            user3City,
            user4FirstName,
            user4LastName,
            user4PhoneNumber,
            user4Country,
            user4City,
            user5FirstName,
            user5LastName,
            user5PhoneNumber,
            user5Country,
            user5City,
            service1Name,
            service1Description,
            service1DurationDays,
            service1DurationHours,
            service1DurationMinutes,
            service1TotalDuration,
            service1Price,
            service1Specialization,
            service1Country,
            service1City,
            service1Address,
            service1Distance,
            service2Name,
            service2Description,
            service2DurationDays,
            service2DurationHours,
            service2DurationMinutes,
            service2TotalDuration,
            service2Price,
            service2Specialization,
            service2Country,
            service2City,
            service2Address,
            service2Distance,
            service3Name,
            service3Description,
            service3DurationDays,
            service3DurationHours,
            service3DurationMinutes,
            service3TotalDuration,
            service3Price,
            service3Specialization,
            service3Country,
            service3City,
            service3Address,
            service3Distance,
            service4Name,
            service4Description,
            service4DurationDays,
            service4DurationHours,
            service4DurationMinutes,
            service4TotalDuration,
            service4Price,
            service4Specialization,
            service4Country,
            service4City,
            service4Address,
            service4Distance;

    public String
            urlBase = "https://app.maxibooking.ru/",
            urlLogin = urlBase + "/auth/login",
            urlLogOut = urlBase + "/auth/login?logout=",
            urlServicePublish = urlBase + "/service/publish",
            urlOrders = urlBase + "/my-orders/inbox",
            urlUserRegistration = urlBase + "/auth/registration";

    public static void setTestData() {
        Faker generate = new Faker(new Locale("en-US"));
        testUser1 = generate.name().username() + "@uu.dd";
        testUser2 = generate.name().username() + "@uu.dd";
        testUser3 = generate.name().username() + "@uu.dd";
        testUser4 = generate.name().username() + "@uu.dd";
        testUser5 = generate.name().username() + "@uu.dd";
        testPassword1 = generate.internet().password();
        testPassword2 = generate.internet().password();
        testPassword3 = generate.internet().password();
        testPassword4 = generate.internet().password();
        testPassword5 = generate.internet().password();

        user1FirstName = generate.name().firstName() + generate.name().suffix();
        user1LastName = generate.name().lastName();
        user1PhoneNumber = "911" + generate.number().digits(7);
        user1Country = "Russia";
        user1City = "Moscow";

        user2FirstName = generate.name().firstName() + generate.name().suffix();
        user2LastName = generate.name().lastName();
        user2PhoneNumber = "911" + generate.number().digits(7);
        user2Country = "Russia";
        user2City = "Moscow";

        user3FirstName = generate.name().firstName() + generate.name().suffix();
        user3LastName = generate.name().lastName();
        user3PhoneNumber = "911" + generate.number().digits(7);
        user3Country = "Russia";
        user3City = "Moscow";

        user4FirstName = generate.name().firstName() + generate.name().suffix();
        user4LastName = generate.name().lastName();
        user4PhoneNumber = "911" + generate.number().digits(7);
        user4Country = "Russia";
        user4City = "Moscow";

        user5FirstName = generate.name().firstName() + generate.name().suffix();
        user5LastName = generate.name().lastName();
        user5PhoneNumber = "911" + generate.number().digits(7);
        user5Country = "Russia";
        user5City = "Moscow";

        service1Name = generate.name().title();
        service1Description = generate.lorem().characters(20, 2000);
        service1DurationDays = String.valueOf(generate.number().numberBetween(0, 0));
        service1DurationHours = String.valueOf(generate.number().numberBetween(0, 6));
        service1DurationMinutes = String.valueOf(generate.number().numberBetween(0, 59));
        service1Price = String.valueOf(generate.number().numberBetween(0, 999));
        service1Specialization = generate.job().title();
        service1Country = "Russia";
        service1City = "Moscow";
        service1Address = generate.address().fullAddress();
        service1Distance = String.valueOf(generate.number().numberBetween(0, 9999));

        service2Name = generate.name().title();
        service2Description = generate.lorem().characters(20, 2000);
        service2DurationDays = String.valueOf(generate.number().numberBetween(0, 0));
        service2DurationHours = String.valueOf(generate.number().numberBetween(0, 6));
        service2DurationMinutes = String.valueOf(generate.number().numberBetween(0, 59));
        service2Price = String.valueOf(generate.number().numberBetween(0, 999));
        service2Specialization = generate.job().title();
        service2Country = "Russia";
        service2City = "Moscow";
        service2Address = generate.address().fullAddress();
        service2Distance = String.valueOf(generate.number().numberBetween(0, 9999));

        service3Name = generate.name().title();
        service3Description = generate.lorem().characters(20, 2000);
        service3DurationDays = String.valueOf(generate.number().numberBetween(0, 0));
        service3DurationHours = String.valueOf(generate.number().numberBetween(0, 6));
        service3DurationMinutes = String.valueOf(generate.number().numberBetween(0, 59));
        service3Price = String.valueOf(generate.number().numberBetween(0, 999));
        service3Specialization = generate.job().title();
        service3Country = "Russia";
        service3City = "Moscow";
        service3Address = generate.address().fullAddress();
        service3Distance = String.valueOf(generate.number().numberBetween(0, 9999));

        service4Name = generate.name().title();
        service4Description = generate.lorem().characters(20, 2000);
        service4DurationDays = String.valueOf(generate.number().numberBetween(0, 9));
        service4DurationHours = String.valueOf(generate.number().numberBetween(0, 6));
        service4DurationMinutes = String.valueOf(generate.number().numberBetween(0, 59));
        service4Price = String.valueOf(generate.number().numberBetween(0, 999));
        service4Specialization = generate.job().title();
        service4Country = "Russia";
        service4City = "Moscow";
        service4Address = generate.address().fullAddress();
        service4Distance = String.valueOf(generate.number().numberBetween(0, 9999));

        long service1DurationDaysLong = parseLong(service1DurationDays),
                service1DurationHoursLong = parseLong(service1DurationHours),
                service1DurationMinutesLong = parseLong(service1DurationMinutes),
                service1TotalDurationLong = service1DurationDaysLong * 24 * 60 + service1DurationHoursLong * 60 + service1DurationMinutesLong;

        service1TotalDuration = Long.toString(service1TotalDurationLong);

        long service2DurationDaysLong = parseLong(service2DurationDays),
                service2DurationHoursLong = parseLong(service2DurationHours),
                service2DurationMinutesLong = parseLong(service2DurationMinutes),
                service2TotalDurationLong = service2DurationDaysLong * 24 * 60 + service2DurationHoursLong * 60 + service2DurationMinutesLong;

        service2TotalDuration = Long.toString(service2TotalDurationLong);

        long service3DurationDaysLong = parseLong(service3DurationDays),
                service3DurationHoursLong = parseLong(service3DurationHours),
                service3DurationMinutesLong = parseLong(service3DurationMinutes),
                service3TotalDurationLong = service3DurationDaysLong * 24 * 60 + service3DurationHoursLong * 60 + service3DurationMinutesLong;

        service3TotalDuration = Long.toString(service3TotalDurationLong);

        long service4DurationDaysLong = parseLong(service4DurationDays),
                service4DurationHoursLong = parseLong(service4DurationHours),
                service4DurationMinutesLong = parseLong(service4DurationMinutes),
                service4TotalDurationLong = service4DurationDaysLong * 24 * 60 + service4DurationHoursLong * 60 + service4DurationMinutesLong;

        service4TotalDuration = Long.toString(service4TotalDurationLong);
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