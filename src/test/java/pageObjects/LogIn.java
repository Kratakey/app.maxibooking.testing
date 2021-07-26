package pageObjects;

import org.junit.jupiter.api.Test;

import static com.codeborne.selenide.Selectors.byClassName;
import static com.codeborne.selenide.Selectors.byText;
import static com.codeborne.selenide.Selenide.*;

public class LogIn extends setup.TestBase {

    public void presetAcc1() {
        $("app-main-menu").$(byText("Sign-in")).click();
        $("app-login").$("input", 0).setValue("SeleTest3@gg.gg");
        $("app-login").$("input", 1).setValue("qazxcdew");
        $("app-login-form").$("ion-button[type='submit']").click();
        sleep(1000);
    }

    public void logOut() {
        open(urlLogOut);
    }

    public void account1() {
        $("app-main-menu").$(byText("Sign-in")).click();
        $("app-login").$("input", 0).setValue(testUser1);
        $("app-login").$("input", 1).setValue(testPassword1);
        $("app-login-form").$("ion-button[type='submit']").click();
        sleep(1000);
    }

    public void account2() {
        $("app-main-menu").$(byText("Sign-in")).click();
        $("app-login").$("input", 0).setValue(testUser2);
        $("app-login").$("input", 1).setValue(testPassword2);
        $("app-login-form").$("ion-button[type='submit']").click();
        sleep(1000);
    }

    public void account3() {
        $("app-main-menu").$(byText("Sign-in")).click();
        $("app-login").$("input", 0).setValue(testUser3);
        $("app-login").$("input", 1).setValue(testPassword3);
        $("app-login-form").$("ion-button[type='submit']").click();
        sleep(1000);
    }

    public void account4() {
        $("app-main-menu").$(byText("Sign-in")).click();
        $("app-login").$("input", 0).setValue(testUser4);
        $("app-login").$("input", 1).setValue(testPassword4);
        $("app-login-form").$("ion-button[type='submit']").click();
        sleep(1000);
    }

    public void account5() {
        $("app-main-menu").$(byText("Sign-in")).click();
        $("app-login").$("input", 0).setValue(testUser5);
        $("app-login").$("input", 1).setValue(testPassword5);
        $("app-login-form").$("ion-button[type='submit']").click();
        sleep(1000);
    }

    public void langRU() {
        $("app-profile").$("ion-item").click();
        $("app-country-flag").$(byClassName("flag-icon")).click();
        $("app-flag-menu").$("ion-select").click();
        $("ion-alert").$("button",1).click();
        $(byText("OK")).click();
    }

    public void langEN() {
        $("app-profile").$("ion-item").click();
        $("app-country-flag").$(byClassName("flag-icon")).click();
        $("app-flag-menu").$("ion-select").click();
        $("ion-alert").$("button",0).click();
        $(byText("OK")).click();
    }

    public void popupSelect() {
        $("ion-alert").$("button",1).click();

        $("app-on-map-popover").$("app-country-selector").$("ion-item").click();
        sleep(1000);
        $("ionic-selectable-modal").$("input").sendKeys(user1Country);
        sleep(500);
        $("ionic-selectable-modal").$("ion-label").click();

        $("app-on-map-popover").$("app-city-selector").$("ion-item").click();
        sleep(1000);
        $("ionic-selectable-modal").$("ion-label").click();
        $("app-on-map-popover").$(byText("Save")).click();
    }
}
