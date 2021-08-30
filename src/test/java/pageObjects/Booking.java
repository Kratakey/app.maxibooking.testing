package pageObjects;

import io.qameta.allure.Step;

import static com.codeborne.selenide.Condition.text;
import static com.codeborne.selenide.Selectors.byText;
import static com.codeborne.selenide.Selenide.$;
import static com.codeborne.selenide.Selenide.sleep;

public class Booking {

    @Step("Click Search button")
    public void clickSearchEN() {
        $("app-main-menu").$(byText("Search")).click();
        sleep(300);
    }

    @Step("Close default filters")
    public void closeFilters() {
        $("app-applied-filters").$("ion-chip").click();
        sleep(1000);
    }

    @Step("Input search text and press Enter")
    public void findService(String serviceName) {
        $("app-search").$("form").$("input").setValue("\"" + serviceName + "\"");
        sleep(1000);
        $("app-search").$("form").$("input").pressEnter();
    }

    @Step("Verify that the search result is correct")
    public void verifyServiceSearch(
            String FirstName,
            String LastName,
            String Specialization,
            String ServiceName,
            String ServicePrice) {
        $("app-search-result").$("ion-card-content").$("app-professional-card")
                .shouldHave(text(FirstName), text(LastName), text(Specialization));
        $("app-search-result").$("ion-card-content").$("app-service-link").shouldHave(text(ServiceName));
        $("app-search-result").$("ion-card-content").$("app-price").shouldHave(text(ServicePrice));
    }

    @Step("Select a service")
    public void chooseService() {
        $("app-search-result").$("ion-card-content").$("app-service-link").$("a").click();
    }

    @Step("Verify that the service data is correct")
    public void verifyServiceBase(
            String ServiceName,
            String ServicePrice,
            String ServiceDuration,
            String FirstName,
            String LastName,
            String Specialization,
            String ServiceDescription) {
        $("app-service-widget").$("app-service-title").shouldHave(text(ServiceName));
        $("app-service-widget").$("app-price").shouldHave(text(ServicePrice));
        $("app-service-widget").$("app-duration-viewer").shouldHave(text(ServiceDuration));
        $("app-service-widget").$("app-professional-card")
                .shouldHave(text(FirstName), text(LastName), text(Specialization));
        $("app-service-widget").shouldHave(text(ServiceDescription));
    }

    @Step("Verify service location")
    public void verifyServiceLocation(String ServiceLocation) {
        $("app-service-widget").$("app-service-location").shouldHave(text(ServiceLocation));
    }

    @Step("Verify service country/city/address")
    public void verifyServiceGeo(String ServiceCountry, String ServiceCity, String ServiceAddress) {
        $("app-service-widget").$("app-service-location")
                .shouldHave(text(ServiceCountry), text(ServiceCity), text(ServiceAddress));
    }

    @Step("Check if payment by cash")
    public void verifyServicePaymentCash() {
        $("app-service-widget").$("app-payment-method-viewer").shouldHave(text("Cash"));
    }

    @Step("Check if payment online")
    public void verifyServicePaymentOnline() {
        $("app-service-widget").$("app-payment-method-viewer").shouldHave(text("Online payment"));
    }

    @Step("Check instant booking")
    public void verifyInstantBooking() {
        $("app-service-widget").shouldHave(text("Ordering of this service will be approved automatically"));
    }

    @Step("Click the 'Date' button to book")
    public void clickDate() {
        $(byText("Date")).click();
    }

    @Step("Select the next day")
    public void clickNextDay() {
        $("app-calendar-component").$("ion-item").$("ion-icon", 1).click();
    }

    @Step("Scroll down")
    public void scrollDown() {
        sleep(100);
        $(byText("Forward")).scrollIntoView(true);
    }

    @Step("Pick booking time")
    public void bookTime() {
        $("app-calendar-component").$(byText("11:00")).scrollIntoView(true);
        $("app-calendar-component").$(byText("11:00")).click();
    }

    @Step("Click the Forward button")
    public void clickForward() {
        $("app-date-time-step").$(byText("Forward")).click();
    }

    @Step("Select 'Book this for me' option")
    public void bookForMe() {
        $("app-client-details-step").$("ion-checkbox").click();
        $("app-client-details-step").$(byText("Forward")).click();
    }

    @Step("Select service location")
    public void chooseServiceLocation() {
        sleep(200);
        $("app-location-step").$("ion-radio-group").$("ion-item").click();
        sleep(200);
        $("app-location-step").$(byText("Forward")).click();
    }

    @Step("Place the order")
    public void placeOrder() {
        sleep(500);
        $("app-summary-step").$(byText("Place order")).click();
        sleep(2000);
    }

    @Step("Verify the order details")
    public void verifyOrderDetails() {

    }
}
