import com.codeborne.selenide.Condition;
import com.codeborne.selenide.Configuration;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;

import static com.codeborne.selenide.Selectors.byClassName;
import static com.codeborne.selenide.Selectors.byText;
import static com.codeborne.selenide.Selenide.*;
import static java.lang.Long.parseLong;

public class ServicePublish {

    String  serviceName = "Service name",
            serviceDescription = "Service description with long enough name",
            serviceDurationDays = "1",
            serviceDurationHours = "2",
            serviceDurationMinutes = "15",
            servicePrice = "900",
            serviceSpecialization = "My specialization";

    Long    serviceDurationDaysLong = parseLong(serviceDurationDays),
            serviceDurationHoursLong = parseLong(serviceDurationHours),
            serviceDurationMinutesLong = parseLong(serviceDurationMinutes),
            serviceTotalDurationLong = serviceDurationDaysLong*24*60+serviceDurationHoursLong*60+serviceDurationMinutesLong;

    String  serviceTotalDuration = Long.toString(serviceTotalDurationLong);

    @BeforeAll
    static void setUpConfig() {
        Configuration.browser = "chrome";
        Configuration.startMaximized = true;
        open("https://d8base.com/auth/login");
        $("app-login").$("input").setValue("SeleTest@gg.gg");
        $("app-login").$("input",1).setValue("qazxcdew");
        $("app-login").$("ion-button[type='submit']").click();
        sleep(1000);
    }

    @Test
    void positiveServiceReg() {
        open("https://d8base.com/service/publish/step-one");
        $("ionic-selectable").click();
        $("ionic-selectable-modal").$("ion-label").click();
        $("ionic-selectable",1).click();
        $("ionic-selectable-modal").$("ion-label").click();
        $("ion-button[type='submit']").click();
        $(".native-input[type='text']").val(serviceName);
        $(".native-textarea").val(serviceDescription);
        $("textarea").scrollIntoView(true);
        $("app-duration-editor").$("input").setValue(serviceDurationDays);
        $("app-duration-editor").$("input",1).setValue(serviceDurationHours);
        $("app-duration-editor").$("input",2).setValue(serviceDurationMinutes);
        $("app-price-editor").$("input").setValue(servicePrice);
        $("app-price-editor").$("ionic-selectable").click();
        $("ionic-selectable-modal").$("ion-label",2).click();
        $("ion-radio-group").$("ion-item").click();
        $("ion-button[type='submit']",1).click();
        $("ion-button[type='submit']",2).click();
        $("ion-button[type='submit']",3).click();
        $("app-service-publish-step-six").$("form").$("input").setValue(serviceSpecialization);
        $("ion-button[type='submit']",4).click();
        $("app-service-publish-step-seven").$("form").$("ion-icon").click();
        $("app-add-button").$("ion-label").click();
        $("app-timetable-add-time-popover").$("ion-label").click();
        $("app-add-button").$("ion-label").click();
        $("app-timetable-add-time-popover").$("ion-label",1).click();
        $("app-add-button").$("ion-label").click();
        $("app-timetable-add-time-popover").$("ion-label",2).click();
        $("app-add-button").$("ion-label").click();
        $("app-timetable-add-time-popover").$("ion-label",3).click();
        $("app-add-button").$("ion-label").click();
        $("app-timetable-add-time-popover").$("ion-label",4).click();
        $("app-timetable").$("app-content-wrapper").$("ion-button[type='submit']").click();
        $("app-service-publish-step-seven").$("form").$("ion-item",2).click();
        $("app-service-publish-step-seven").$("form").$("ion-list").$("ion-item",1).click();
        $("app-service-publish-step-seven").$("form").$("ion-list").$("ion-item",2).click();
        $("app-service-publish-step-seven").$("ion-button[type='submit']").click();

        $("h2").shouldHave(Condition.textCaseSensitive(serviceName));
        $("app-price").shouldHave(Condition.text(servicePrice));
        $("app-duration-viewer").shouldHave(Condition.text(serviceTotalDuration));
        $("app-service-publish-final-step").$("ion-content").$("ion-item",2).shouldHave(Condition.textCaseSensitive(serviceDescription));

        $("app-service-publish-final-step").$("ion-content").$("ion-button",1).click();
    }
}
