package pages;

import io.qameta.allure.Step;

import static com.codeborne.selenide.Selenide.$;
import static com.codeborne.selenide.Selenide.$x;

public class ProfessionalProfile {

// other person's professional profile methods

    @Step("Open the chat")
    public void clickChat() {
        $x("//ion-button[@class='book-btn ion-color ion-color-primary md button button-outline ion-activatable ion-focusable hydrated']").click();
    }

// your own professional profile methods

    @Step("Open reviews")
    public void clickReviews() {
        $("app-professional-page").$("a.review-count").click();
    }

    @Step("Click avatar edit button")
    public void clickAvatarEdit() {
        $("app-professional-page").$("a[routerlink='/profile'] img").click();
    }

    @Step("Click create reservation button")
    public void clickCreateReservation() {
        $("app-professional-page").$("ion-button.book-btn").click();
    }

    @Step("Click edit professional address")
    public void editProfessionalAddress() {
        $("app-professional-page").$("app-location-viewer").click();
    }

    @Step("Click add new address")
    public void clickAddNewAddress() {
        $("app-professional-page").$("app-add-button").click();
    }
}


