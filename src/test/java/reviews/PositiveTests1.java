package reviews;

import io.qameta.allure.*;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import pageObjects.LogIn;
import pageObjects.Reviews;

public class PositiveTests1 extends setup.TestBase {

    Reviews act = new Reviews();
    LogIn log = new LogIn();

    @Test
    @Feature("Reviews")
    @Owner("Egor Khlebnikov")
    @Story("Review check")
    @Severity(SeverityLevel.BLOCKER)
    @DisplayName("Post and check review with 10 words")
    void t001() {
        log.popupSkip();
        log.account5();

        log.clickSideMenuFromProfile();
        act.clickOutboxEN();
        act.tabArchivedOrdersOutbox();
        act.clickMaster1();
        act.clickReviewTab();
        act.clickAllReviewsLink();
        act.clickSendReviewButton();
        act.choseRating4();
        act.sendReviewText(reviewText1);
        act.pressSend();
        act.verifyReview(user5FirstName, reviewText1);
    }

    @Test
    @Feature("Reviews")
    @Owner("Egor Khlebnikov")
    @Story("Review check")
    @Severity(SeverityLevel.BLOCKER)
    @DisplayName("Post and check review with a lot of characters")
    void t002() {
        log.popupSkip();
        log.account5();

        log.clickSideMenuFromProfile();
        act.clickOutboxEN();
        act.tabArchivedOrdersOutbox();
        act.clickMaster2();
        act.clickReviewTab();
        act.clickAllReviewsLink();
        act.clickSendReviewButton();
        act.choseRating1();
        act.sendReviewText(reviewText2);
        act.scrollDown();
        act.pressSend();
        act.verifyReview(user5FirstName, reviewText2);
    }

    @Test
    @Feature("Reviews")
    @Owner("Egor Khlebnikov")
    @Story("Review check")
    @Severity(SeverityLevel.BLOCKER)
    @DisplayName("Post and check review add to favorites in the process")
    void t003() {
        log.popupSkip();
        log.account5();

        log.clickSideMenuFromProfile();
        act.clickOutboxEN();
        act.tabArchivedOrdersOutbox();
        act.clickMaster3();
        act.clickReviewTab();
        act.clickAllReviewsLink();
        act.clickSendReviewButton();
        act.addToFavorite();
        act.choseRating5();
        act.sendReviewText(reviewText3+" "+reviewText4);
        act.pressSend();
        act.verifyReview(user5FirstName, reviewText3+" "+reviewText4);

        act.clickMenuMain();
        act.openBookmarksMenu();
        act.verifyBookmark(user1FirstName+" "+user1LastName);
    }
}
