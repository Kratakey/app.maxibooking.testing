package pageObjects;

import org.junit.jupiter.api.Test;
import org.openqa.selenium.By;

import static com.codeborne.selenide.Selectors.byClassName;
import static com.codeborne.selenide.Selectors.byText;
import static com.codeborne.selenide.Selenide.*;

public class LogIn extends setup.TestBase {

    public void presetAcc1() {
        $("ion-buttons").$("ion-menu-toggle").$("ion-button").click();
        sleep(500);
        $("app-main-menu").$(byText("Log in")).click();
        $("app-login").$("input", 0).setValue("SeleTest5@gg.gg");
        $("app-login").$("input", 1).setValue("qazxcdew");
        $("app-login-form").$("ion-button[type='submit']").click();
        sleep(1000);
    }

    public void logOut() {
        open(urlLogOut);
    }

    public void account1() {
        $("ion-buttons").$("ion-menu-toggle").$("ion-button").click();
        sleep(500);
        $("app-main-menu").$(byText("Log in")).click();
        $("app-login").$("input", 0).setValue(testUser1);
        $("app-login").$("input", 1).setValue(testPassword1);
        $("app-login-form").$("ion-button[type='submit']").click();
        sleep(1000);
    }

    public void account2() {
        $("ion-buttons").$("ion-menu-toggle").$("ion-button").click();
        sleep(500);
        $("app-main-menu").$(byText("Log in")).click();
        $("app-login").$("input", 0).setValue(testUser2);
        $("app-login").$("input", 1).setValue(testPassword2);
        $("app-login-form").$("ion-button[type='submit']").click();
        sleep(1000);
    }

    public void account3() {
        $("ion-buttons").$("ion-menu-toggle").$("ion-button").click();
        sleep(500);
        $("app-main-menu").$(byText("Log in")).click();
        $("app-login").$("input", 0).setValue(testUser3);
        $("app-login").$("input", 1).setValue(testPassword3);
        $("app-login-form").$("ion-button[type='submit']").click();
        sleep(1000);
    }

    public void account4() {
        $("ion-buttons").$("ion-menu-toggle").$("ion-button").click();
        sleep(500);
        $("app-main-menu").$(byText("Log in")).click();
        $("app-login").$("input", 0).setValue(testUser4);
        $("app-login").$("input", 1).setValue(testPassword4);
        $("app-login-form").$("ion-button[type='submit']").click();
        sleep(1000);
    }

    public void account5() {
        $("ion-buttons").$("ion-menu-toggle").$("ion-button").click();
        sleep(500);
        $("app-main-menu").$(byText("Log in")).click();
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

    public void popupSkip() {
        $("ion-alert").pressEscape();
    }

    public void clickSideMenu() {
        sleep(500);
        $("ion-buttons").$("ion-menu-toggle").$("ion-button").click();
        sleep(500);
    }
    public void clickSideMenuFromProfile() {
        sleep(500);
        $("app-profile").$("ion-menu-toggle").$("ion-button").click();
        sleep(500);
    }
}
