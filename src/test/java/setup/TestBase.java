package setup;

import com.codeborne.selenide.Configuration;
import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.BeforeEach;

import static com.codeborne.selenide.Selenide.*;

public class TestBase {

    @BeforeEach
    public void setupConfig() {
        Configuration.browser = "chrome";
        Configuration.startMaximized = true;
        open("https://d8base.com/auth/login");
        $("app-login").$("input").setValue("SeleTest@gg.gg");
        $("app-login").$("input", 1).setValue("qazxcdew");
        $("app-login").$("ion-button[type='submit']").click();
        sleep(1000);
    }
    @AfterEach
    public void refresh() {
        closeWebDriver();
    }

}
