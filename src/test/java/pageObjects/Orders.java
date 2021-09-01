package pageObjects;

import io.qameta.allure.Step;

import static com.codeborne.selenide.Condition.text;
import static com.codeborne.selenide.Selectors.byText;
import static com.codeborne.selenide.Selenide.*;

public class Orders extends setup.TestBase {

    @Step("Open the page by url")
    public void openPageUrl(String urlOrders) {
        open(urlOrders);
    }

    @Step("Open the page (top bar)")
    public void openOrderPageTopEN() {
        $("app-profile").$("ion-toolbar").$(byText("My orders")).click();

    }

    @Step("Open the page (top bar)")
    public void openPageTopRU() {
        $("app-profile").$("ion-toolbar").$(byText("Мои заказы")).click();
    }

    @Step("Click toggle Sent/Received orders")
    public void toggleSentReceivedClick() {
        $("app-my-orders-page").$("main").$("ion-button").click();
    }

    @Step("Select new orders: Inbox")
    public void tabNewOrdersInbox() {
        $("app-my-orders-page").$("ion-segment-button", 0).click();
    }

    @Step("Select current orders: Inbox")
    public void tabCurrentOrdersInbox() {
        $("app-my-orders-page").$("ion-segment-button", 1).click();
    }

    @Step("Select archived orders: Inbox")
    public void tabArchivedOrdersInbox() {
        $("app-my-orders-page").$("ion-segment-button", 2).click();
    }

    @Step("Select current orders: Outbox")
    public void tabCurrentOrdersOutbox() {
        $("app-outbox").$("ion-segment-button", 0).click();
    }

    @Step("Select archived orders: Outbox")
    public void tabArchivedOrdersOutbox() {
        $("app-outbox").$("ion-segment-button", 1).click();
    }

    @Step("Simple order check inbox")
    public void checkOrderInbox(
            String userFirstName,
            String servicePrice,
            String serviceTotalDuration
    ) {
//        $("app-received-order-list-item").$("app-client-widget").shouldHave(text(userFirstName));
//        $("app-received-order-list-item").$("app-service-title").shouldHave(text(serviceName));
//        $("app-received-order-list-item").$("app-price").shouldHave(text(servicePrice));
//        $("app-received-order-list-item").$("app-duration-viewer").shouldHave(text(serviceTotalDuration));
        $("app-my-orders-page").shouldHave(
                text(userFirstName),
                text(servicePrice),
                text(serviceTotalDuration)
        );
    }

    @Step("Simple order check outbox")
    public void checkOrderOutbox(
            String userFirstName,
            String serviceName,
            String servicePrice,
            String serviceTotalDuration
    ) {
//        $("app-sent-order-list-item").$("app-professional-card").shouldHave(text(userFirstName));
//        $("app-sent-order-list-item").$("app-service-title").shouldHave(text(serviceName));
//        $("app-sent-order-list-item").$("app-price").shouldHave(text(servicePrice));
//        $("app-sent-order-list-item").$("app-duration-viewer").shouldHave(text(serviceTotalDuration));
        $("app-my-orders-page").shouldHave(
                text(userFirstName),
                text(serviceName),
                text(servicePrice),
                text(serviceTotalDuration)
        );
    }

    @Step("Click view details")
    public void viewDetails() {
        $("app-received-order-list-item").$("ion-card").$("ion-button",0).click();
    }

    @Step("Click view details: Outbox")
    public void viewDetailsOutbox() {
        $("app-outbox").$("ion-card").$("ion-button",1).click();
    }

    @Step("Discard the order")
    public void discardOrder() {
        $("app-received-order-list-item").$("ion-card").$("ion-button",1).click();
        sleep(500);
    }

    @Step("Accept the order")
    public void acceptOrder() {
        $("app-received-order-list-item").$("ion-card").$("ion-button",2).click();
        sleep(500);
    }

    @Step("Complete the order")
    public void completeOrder() {
        $("app-received-order-list-item").$("ion-card").$("ion-button",1).click();
        sleep(500);
    }

    @Step("Click 'show more'")
    public void clickShowMore() {
        $("app-more-info").$("ion-note").click();
    }

    @Step("Select master in Outbox")
    public void selectMaster(String userName) {
        $("app-outbox").$(byText(userName)).click();
    }
}