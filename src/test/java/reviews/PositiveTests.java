package reviews;

import io.qameta.allure.*;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import pageObjects.LogIn;
import pageObjects.Reviews;

public class PositiveTests extends setup.TestBase {

    Reviews act = new Reviews();
    LogIn log = new LogIn();

    @Test
    @Feature("Reviews")
    @Owner("Egor Khlebnikov")
    @Story("Review check")
    @Severity(SeverityLevel.BLOCKER)
    @DisplayName("Post and check review")
    void UserReviewCheckTest() {
        log.popupSkip();
        log.account5();

        log.clickSideMenuFromProfile();
        act.clickOutboxEN();
        act.tabArchivedOrdersOutbox();
        act.clickMaster();
        act.clickReviewTab();
        act.clickAllReviewsLink();
        act.clickSendReviewButton();
        act.choseRating4();
        act.sendReviewText(reviewText1);
        act.pressSend();
        act.verifyReview(user5FirstName, reviewText1);
    }
}
