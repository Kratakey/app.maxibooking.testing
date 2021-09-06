package reviews;

import io.qameta.allure.*;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import pageObjects.LogIn;
import pageObjects.Reviews;

public class PositiveTests2 extends setup.TestBase {

    Reviews act = new Reviews();
    LogIn log = new LogIn();

    @Test
    @Feature("Reviews")
    @Owner("Egor Khlebnikov")
    @Story("Review master answers")
    @Severity(SeverityLevel.BLOCKER)
    @DisplayName("Review answer")
    void MasterReviewAnswerTest() {
        log.popupSkip();
        log.account2();

        act.clickMenuProfile();
        act.openMasterProfile();
        act.clickMasterReviews();
        act.postMasterComment(masterComment);
        act.verifyMasterComment(masterComment);
    }

}
