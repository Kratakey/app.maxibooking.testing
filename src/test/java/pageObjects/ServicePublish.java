package pageObjects;

import com.codeborne.selenide.Condition;
import io.qameta.allure.Step;

import static com.codeborne.selenide.Selenide.*;

public class ServicePublish {

    @Step("Open the page")
    public void openPage(String urlServicePublish) {
        open(urlServicePublish);
    }

    @Step("Choose a category")
    public void chooseCategory() {
        $("ionic-selectable").click();
        $("ionic-selectable-modal").$("ion-label").click();
    }

    @Step("Choose a subcategory")
    public void chooseSubcategory() {
        $("ionic-selectable", 1).click();
        $("ionic-selectable-modal").$("ion-label").click();
    }

    public void clickFirstStep() {
        $("ion-button[type='submit']").click();
    }

    @Step("Enter a service name")
    public void enterServiceName(String serviceName) {
        $(".native-input[type='text']").val(serviceName);
    }

    @Step("Enter a service description")
    public void enterServiceDescription(String serviceDescription) {
        $(".native-textarea").val(serviceDescription);
    }

    @Step("Enter a service duration")
    public void setDuration(String serviceDurationDays, String serviceDurationHours, String serviceDurationMinutes) {
        $("app-duration-editor").$("input").setValue(serviceDurationDays);
        $("app-duration-editor").$("input", 1).setValue(serviceDurationHours);
        $("app-duration-editor").$("input", 2).setValue(serviceDurationMinutes);
    }

    @Step("Enter a price")
    public void setPrice(String servicePrice) {
        $("app-price-editor").$("input").setValue(servicePrice);
        $("app-price-editor").$("ionic-selectable").click();
        $("ionic-selectable-modal").$("ion-label", 2).click();
    }

    public void scrollDown() {
        $("textarea").scrollIntoView(true);
    }
    public void scrollDown2() {
        $("app-service-publish-step-seven").$("textarea").scrollIntoView(true);
    }

    @Step("Select a service location")
    public void selectServiceLocationOnline() {
        $("ion-radio-group").$("ion-item", 0).click();
    }

    @Step("Select a service location")
    public void selectServiceLocationClient() {
        $("ion-radio-group").$("ion-item", 1).click();
    }

    @Step("Select a service location")
    public void selectServiceLocationMaster() {
        $("ion-radio-group").$("ion-item", 2).click();
    }

    public void clickSecondStep() {
        $("ion-button[type='submit']", 1).click();
    }

    public void clickThirdStep() {
        $("ion-button[type='submit']", 2).click();
    }

    public void fillEmail(String serviceEmail) {
        $("app-service-publish-step-four").$("input",0).val(serviceEmail);
    }

    public void fillUserInfo(String userFirstName, String userLastName, String userPassword, String userCountry, String userCity) {
        $("app-service-publish-step-four").$("input",1).val(userFirstName);
        $("app-service-publish-step-four").$("input",2).val(userLastName);
        $("app-service-publish-step-four").$("input",3).val(userPassword);
        $("app-service-publish-step-four").$("input",4).val(userPassword);

        $("app-service-publish-step-four").$("app-country-selector").$("button").click();
        sleep(1000);
        $("ionic-selectable-modal").$("input").sendKeys(userCountry);
        sleep(500);
        $("ionic-selectable-modal").$("ion-label", 0).click();

        $("app-service-publish-step-four").$("app-city-selector").$("button").click();
        sleep(1000);
        $("ionic-selectable-modal").$("input").sendKeys(userCity);
        sleep(500);
        $("ionic-selectable-modal").$("ion-label", 0).click();
    }

    public void clickFourthStep() { $("app-service-publish-step-four").$("ion-button[type='submit']").click(); }

    public void clickFifthStep() {
        $("app-service-publish-step-five").$("ion-button[type='submit']").click();
    }

    @Step("Fill the specialization form")
    public void fillSpecialization(String serviceSpecialization) {
        $("app-service-publish-step-six").$("form").$("input").setValue(serviceSpecialization);
    }

    public void clickSixthStep() {
        $("app-service-publish-step-six").$("ion-button[type='submit']").click();
    }

    @Step("Set a schedule")
    public void fillSchedule() {
        $("app-service-publish-step-seven").$("form").$("ion-icon").click();
        $("app-add-button").$("ion-label").click();
        $("app-timetable-add-time-popover").$("ion-label", 0).click();
        $("app-add-button").$("ion-label").click();
        $("app-timetable-add-time-popover").$("ion-label", 1).click();
        $("app-add-button").$("ion-label").click();
        $("app-timetable-add-time-popover").$("ion-label", 2).click();
        $("app-add-button").$("ion-label").click();
        $("app-timetable-add-time-popover").$("ion-label", 3).click();
        $("app-add-button").$("ion-label").click();
        $("app-timetable-add-time-popover").$("ion-label", 4).click();
        $("app-timetable").$("app-content-wrapper").$("ion-button[type='submit']").click();
    }

    @Step("Confirm Instant Booking")
    public void confirmInstantBooking() {
        $("app-service-publish-step-seven").$("form").$("ion-item", 2).click();
    }

    @Step("Fill a service geography")
    public void fillServiceGeo(String serviceCountry, String serviceCity, String serviceAddress) {
        $("app-service-publish-step-seven").$("form").$("ionic-selectable", 0).click();
        $("ionic-selectable-modal").$("input").sendKeys(serviceCountry);
        $("ionic-selectable-modal").$("ion-label").click();

        $("app-service-publish-step-seven").$("form").$("ionic-selectable", 1).click();
        $("ionic-selectable-modal").$("input").sendKeys(serviceCity);
        $("ionic-selectable-modal").$("ion-label").click();

        $("app-service-publish-step-seven").$("form").$("textarea").setValue(serviceAddress);
    }
    @Step("Fill a service distance")
    public void fillServiceDistance(String serviceDistance) {
        $("app-service-publish-step-seven").$("form").$("ion-row").$("input", 1).setValue(serviceDistance);
    }

    @Step("Select payment by cash")
    public void selectPaymentByCash() {
        $("app-service-publish-step-seven").$("form").$("ion-list").$("ion-item", 1).click();
    }

    @Step("Select online payment")
    public void selectOnlinePayment() {
        $("app-service-publish-step-seven").$("form").$("ion-list").$("ion-item", 2).click();
    }

    public void clickSeventhStep() {
        $("app-service-publish-step-seven").$("ion-button[type='submit']").click();
    }

    @Step("Verify that the data all correct")
    public void checkPublishFormOnline(String serviceName, String servicePrice, String serviceTotalDuration, String serviceDescription) {
        $("h2").shouldHave(Condition.textCaseSensitive(serviceName));
        $("app-price").shouldHave(Condition.text(servicePrice));
        $("app-duration-viewer").shouldHave(Condition.text(serviceTotalDuration));
        $("app-service-publish-final-step").$("ion-content").$("ion-item", 2).shouldHave(Condition.textCaseSensitive(serviceDescription));
    }

    public void checkPublishFormClient(String serviceName, String servicePrice, String serviceTotalDuration, String serviceDescription, String serviceCountry, String serviceCity, String serviceAddress) {
        $("h2").shouldHave(Condition.textCaseSensitive(serviceName));
        $("app-price").shouldHave(Condition.text(servicePrice));
        $("app-duration-viewer").shouldHave(Condition.text(serviceTotalDuration));
        $("app-service-publish-final-step").$("ion-content").$("ion-item", 2).shouldHave(Condition.textCaseSensitive(serviceDescription));
        $("app-service-location").shouldHave(Condition.text(serviceCountry +", "+ serviceCity +", "+ serviceAddress));
    }

    @Step("Publish a service")
    public void publishService() {
        $("app-service-publish-final-step").$("ion-content").$("ion-button", 1).click();
    }


}
