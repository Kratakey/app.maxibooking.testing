package zMessages;

import io.qameta.allure.*;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import pageObjects.LogIn;
import pageObjects.Messages;
import pageObjects.Orders;

import static com.codeborne.selenide.Selenide.sleep;

public class PositiveTests extends setup.TestBase {


    Messages act = new Messages();
    Orders ord = new Orders();
    LogIn log = new LogIn();

    @Test
    @Feature("Messages")
    @Owner("Egor Khlebnikov")
    @Story("2 users chatting tests")
    @Severity(SeverityLevel.BLOCKER)
    @DisplayName("Conversation test: step 1 out of 3")
    void t001() {
        log.popupSkip();
        log.account5();

        ord.openOrderPageTopEN();
        ord.tabArchivedOrdersOutbox();
        ord.viewDetailsOutbox();
        act.openChatFromOrderDetails();
        act.sendMessage(testMessage1);
        act.checkMessage(testMessage1);
    }

    @Test
    @Feature("Messages")
    @Owner("Egor Khlebnikov")
    @Story("2 users chatting tests")
    @Severity(SeverityLevel.BLOCKER)
    @DisplayName("Conversation test: step 2 out of 3")
    void t002() {
        log.popupSkip();
        log.account3();

        act.openChatFromTopBar();
        act.findUserChat(user5FirstName);
        act.selectUser();
        act.checkMessage(testMessage1);
        act.sendMessage(testMessage2);
        act.checkMessage(testMessage2);
    }

    @Test
    @Feature("Messages")
    @Owner("Egor Khlebnikov")
    @Story("2 users chatting tests")
    @Severity(SeverityLevel.BLOCKER)
    @DisplayName("Conversation test: step 3 out of 3")
    void t003() {
        log.popupSkip();
        log.account5();

        act.openChatFromTopBar();
        act.findUserChat(user3FirstName);
        act.selectUser();
        act.checkMessage(testMessage1);
        act.checkMessage(testMessage2);
    }
}

