package pageObjects;

import com.github.javafaker.Faker;

import java.util.Locale;

import static java.lang.Long.parseLong;

public class Variables {

    Faker random = new Faker(new Locale("en-US"));

    public String   url = "https://d8base.com/service/publish/step-one",
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
                    serviceDistance = String.valueOf(random.number().numberBetween(0, 9999));

    Long    serviceDurationDaysLong = parseLong(serviceDurationDays),
            serviceDurationHoursLong = parseLong(serviceDurationHours),
            serviceDurationMinutesLong = parseLong(serviceDurationMinutes),
            serviceTotalDurationLong = serviceDurationDaysLong * 24 * 60 + serviceDurationHoursLong * 60 + serviceDurationMinutesLong;

    public String  serviceTotalDuration = Long.toString(serviceTotalDurationLong);
}
