package pageObjects;

import org.junit.jupiter.api.Test;

import static com.codeborne.selenide.Selectors.byClassName;
import static com.codeborne.selenide.Selectors.byText;
import static com.codeborne.selenide.Selenide.*;

public class LogIn extends setup.TestBase {

    public void account1() {
        open(urlLogin);
        $("app-login").$("input", 0).setValue(testUser1);
        $("app-login").$("input", 1).setValue(testPassword1);
        $("ion-button[type='submit']").click();
        sleep(1000);
    }

    public void account2() {
        open(urlLogin);
        $("app-login").$("input", 0).setValue(testUser2);
        $("app-login").$("input", 1).setValue(testPassword2);
        $("ion-button[type='submit']").click();
        sleep(1000);
    }

    public void account3() {
        open(urlLogin);
        $("app-login").$("input", 0).setValue(testUser3);
        $("app-login").$("input", 1).setValue(testPassword3);
        $("ion-button[type='submit']").click();
        sleep(1000);
    }
    public void langRU() {
        open(urlBase);
        $(byClassName("flag-icon")).click();
        $("app-flag-menu").$("ion-select").click();
        $("ion-alert").$("button",1).click();
        $(byText("OK")).click();
    }

    public void langEN() {
        open(urlBase);
        $(byClassName("flag-icon")).click();
        $("app-flag-menu").$("ion-select").click();
        $("ion-alert").$("button",0).click();
        $(byText("OK")).click();
    }
}
