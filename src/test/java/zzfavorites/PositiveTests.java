package zzfavorites;

import io.qameta.allure.*;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import pageObjects.Favorites;
import pageObjects.LogIn;

public class PositiveTests extends setup.TestBase {


    Favorites act = new Favorites();
    LogIn log = new LogIn();

    @Test
    @Feature("Favorites")
    @Owner("Egor Khlebnikov")
    @Story("Remove master from favorites")
    @Severity(SeverityLevel.BLOCKER)
    @DisplayName("Remove master from favorites")
    void t1UnfavMasterReview() {
        log.popupSkip();
        log.account5();

        act.clickMenuProfile();
        act.openBookmarksMenuEN();
        act.verifyBookmark(user2FirstName+" "+user2LastName, service2Specialization, user2City);

        act.removeBookmark();
        act.verifyDelBookmark(user2FirstName+" "+user2LastName);
    }

    @Test
    @Feature("Favorites")
    @Owner("Egor Khlebnikov")
    @Story("Add master to favorites")
    @Severity(SeverityLevel.BLOCKER)
    @DisplayName("Add master to favorite from search results")
    void t2FavSearchResultsTest() {
        log.popupSkip();
        log.account5();

        act.clickMenuProfile();
        act.clickSearchEN();
        act.closeFilters();
        act.findService(service1Name);
        act.verifyServiceSearch(user1FirstName, user1LastName, service1Specialization, service1Name, service1Price);
        act.clickFavSearch();
        act.clickMenuSearch();
        act.openBookmarksMenuEN();
        act.verifyBookmarkOnline(user1FirstName+" "+user1LastName, service1Specialization);
        act.verifyDelBookmark(user2FirstName+" "+user2LastName);
    }

    @Test
    @Feature("Favorites")
    @Owner("Egor Khlebnikov")
    @Story("Add master to favorites")
    @Severity(SeverityLevel.BLOCKER)
    @DisplayName("Add master to favorite from master's profile")
    void t3FavMasterProfileTest() {
        log.popupSkip();
        log.account5();

        act.clickMenuProfile();
        act.clickSearchEN();
        act.closeFilters();
        act.findService(service3Name);
        act.verifyServiceSearch(user3FirstName, user3LastName, service3Specialization, service3Name, service3Price);
        act.selectMasterSearch();
        act.clickFavMasterProfile();
        act.clickMenuMasterProfile();
        act.openBookmarksMenuEN();
        act.verifyBookmark(user3FirstName+" "+user3LastName, service3Specialization, user3City);
        act.verifyBookmarkOnline(user1FirstName+" "+user1LastName, service1Specialization);
        act.verifyDelBookmark(user2FirstName+" "+user2LastName);
    }

    @Test
    @Feature("Favorites")
    @Owner("Egor Khlebnikov")
    @Story("Add master to favorites")
    @Severity(SeverityLevel.BLOCKER)
    @DisplayName("Add master to favorite from the service info")
    void t4FavServiceInfoTest() {
        log.popupSkip();
        log.account5();

        act.clickMenuProfile();
        act.clickSearchEN();
        act.closeFilters();
        act.findService(service2Name);
        act.verifyServiceSearch(user2FirstName, user2LastName, service2Specialization, service2Name, service2Price);
        act.selectServiceSearch();
        act.clickFavServiceInfo();
        act.clickMenuServiceInfo();
        act.openBookmarksMenuEN();
        act.verifyBookmark(user2FirstName+" "+user2LastName, service2Specialization, user2City);
        act.verifyBookmark(user3FirstName+" "+user3LastName, service3Specialization, user3City);
        act.verifyBookmark(user1FirstName+" "+user1LastName, service1Specialization, user1City);
    }
}
