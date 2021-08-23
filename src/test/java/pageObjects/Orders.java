package pageObjects;

import io.qameta.allure.Step;

import static com.codeborne.selenide.Condition.text;
import static com.codeborne.selenide.Selectors.byText;
import static com.codeborne.selenide.Selenide.$;
import static com.codeborne.selenide.Selenide.open;

public class Orders extends setup.TestBase {

    @Step("Open the page by url")
    public void openPageUrl(String urlOrders) {
        open(urlOrders);
    }

    @Step("Open the page (top bar)")
    public void openPageTopEN() {
        $("ion-toolbar").$(byText("My orders")).click();

    }

    @Step("Open the page (top bar)")
    public void openPageTopRU() {
        $("ion-toolbar").$(byText("Мои заказы")).click();
    }

    @Step("Open the page (menu)")
    public void openPageMenuEN() {
        $("ion-menu").$(byText("My orders")).click();
    }

    @Step("Open the page (menu)")
    public void openPageMenuRU() {
        $("ion-menu").$(byText("Мои заказы")).click();
    }

    @Step("Click toggle Sent/Received orders")
    public void toggleSentReceivedClick() {
        $("main").$("ion-button").click();
    }

    @Step("Select new orders")
    public void tabNewOrders() {
        $("ion-segment").$("ion-segment-button",0).click();
    }

    @Step("Select current orders")
    public void tabCurrentOrders() {
        $("ion-segment").$("ion-segment-button",1).click();
    }

    @Step("Select archived orders")
    public void tabArchivedOrders() {
        $("ion-segment").$("ion-segment-button",2).click();
    }

    @Step("Order check")
    public void checkOrder(
            String userFirstName,
            String serviceDescription,
            String servicePrice,
            String serviceTotalDuration
    ) {
        $("app-received-order-list-item").$("app-client-widget").shouldHave(text(userFirstName));
        $("app-received-order-list-item").$("app-service-title").shouldHave(text(serviceDescription));
        $("app-received-order-list-item").$("app-price").shouldHave(text(servicePrice));
        $("app-received-order-list-item").$("app-duration-viewer").shouldHave(text(serviceTotalDuration));
    }

    @Step("Click view details")
    public void viewDetails() {
        $("app-received-order-list-item").$("ion-card").$("ion-button",0).click();
    }

    @Step("Discard the order")
    public void discardOrder() {
        $("app-received-order-list-item").$("ion-card").$("ion-button",1).click();
    }

    @Step("Accept the order")
    public void acceptOrder() {
        $("app-received-order-list-item").$("ion-card").$("ion-button",2).click();
    }

    @Step("Complete the order")
    public void completeOrder() {
        $("app-received-order-list-item").$("ion-card").$("ion-button",1).click();
    }

    @Step("Click 'show more'")
    public void clickShowMore() {
        $("app-more-info").$("ion-note").click();
    }
}