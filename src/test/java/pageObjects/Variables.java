//package pageObjects;
//
//import com.github.javafaker.Faker;
//
//import java.io.File;
//import java.io.FileDescriptor;
//import java.io.FileWriter;
//import java.io.IOException;
//import java.util.Locale;
//
//import static java.lang.Long.parseLong;
//
//public class Variables {
//
//    Faker random = new Faker(new Locale("en-US"));
//
//    public String   urlBase = "https://app.maxibooking.ru",
//                    urlLogin = urlBase+"/auth/login",
//                    urlServicePublish = urlBase+"/service/publish",
//                    urlUserRegistration = urlBase+"/auth/registration",
//                    userFirstName = random.name().firstName(),
//                    userLastName = random.name().lastName(),
//                    userEmail = random.name().username()+"@dd.dd",
//                    userPassword = random.internet().password(),
//                    userPhoneNumber = "911"+random.number().digits(7),
//                    userCountry = "Russia",
//                    userCity = "Moscow",
//                    serviceName = random.name().title(),
//                    serviceDescription = random.lorem().characters(20, 2000),
//                    serviceDurationDays = String.valueOf(random.number().numberBetween(0, 7)),
//                    serviceDurationHours = String.valueOf(random.number().numberBetween(0, 24)),
//                    serviceDurationMinutes = String.valueOf(random.number().numberBetween(0, 60)),
//                    servicePrice = String.valueOf(random.number().numberBetween(0, 999)),
//                    serviceSpecialization = random.job().title(),
//                    serviceCountry = "Russia",
//                    serviceCity = "Moscow",
//                    serviceAddress = random.address().fullAddress(),
//                    serviceDistance = String.valueOf(random.number().numberBetween(0, 9999)),
//                    serviceEmail = random.name().username()+"@jj.jj";
//
//    Long    serviceDurationDaysLong = parseLong(serviceDurationDays),
//            serviceDurationHoursLong = parseLong(serviceDurationHours),
//            serviceDurationMinutesLong = parseLong(serviceDurationMinutes),
//            serviceTotalDurationLong = serviceDurationDaysLong * 24 * 60 + serviceDurationHoursLong * 60 + serviceDurationMinutesLong;
//
//    public String   serviceTotalDuration = Long.toString(serviceTotalDurationLong);
//}
//
//
