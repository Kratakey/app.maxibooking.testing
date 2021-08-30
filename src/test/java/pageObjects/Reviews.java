package pageObjects;

import io.qameta.allure.Step;

import static com.codeborne.selenide.Condition.text;
import static com.codeborne.selenide.Selectors.byText;
import static com.codeborne.selenide.Selenide.*;

public class Reviews {

    @Step("Click Outbox button")
    public void clickOutboxEN() {
        $("app-main-menu").$(byText("Sent orders")).click();
        sleep(300);
    }

    @Step("Select current orders")
    public void tabCurrentOrdersOutbox() {
        $("app-my-orders-page").$("ion-segment-button", 0).click();
    }

    @Step("Select archived orders")
    public void tabArchivedOrdersOutbox() {
        $("app-my-orders-page").$("ion-segment-button", 1).click();
    }

    @Step("Click master")
    public void clickMaster() {
        $("app-outbox").$("app-professional-card").$("a").click();
    }

    @Step("Open reviews tab")
    public void clickReviewTab() {
        $("app-professional-page").$(byText("Reviews")).click();
    }

    @Step("Click all reviews link")
    public void clickAllReviewsLink() {
        $("app-professional-page").$(byText("All reviews")).click();
    }

    @Step("Click review/rating button")
    public void clickReviews() {
        $("app-my-orders-page").$("app-rating").$("a").click();
    }

    @Step("Click send review button")
    public void clickSendReviewButton() {
        $("app-reviews-list").$(byText("Send review")).click();
    }


    @Step("Choose rating 4 stars")
    public void choseRating4() {
        $("app-edit-review").$("app-rating-picker").$("ion-item",3).click();
        sleep(200);
    }

    @Step("Type review text")
    public void sendReviewText(String reviewText) {
        $("app-edit-review").$("textarea").sendKeys(reviewText);
        sleep(200);
    }

    @Step("Send review")
    public void pressSend() {
        $("app-edit-review").$("ion-row").$("ion-button",1).click();
        sleep(500);
    }

    @Step("Verify review")
    public void verifyReview(String userName, String reviewText) {
        $("app-reviews-list").$("ion-card").$("ion-label").shouldHave(text(userName));
        $("app-reviews-list").$("ion-card").$("ion-item",2).shouldHave(text("Very good"));
        $("app-reviews-list").$("ion-card").shouldHave(text(reviewText));
    }
}
