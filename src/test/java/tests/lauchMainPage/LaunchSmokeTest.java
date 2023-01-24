package tests.lauchMainPage;

import org.testng.annotations.Test;
import tests.base.BaseTest;

import static constants.Constant.Urls.SOXES_HOME_PAGE;
public class LaunchSmokeTest extends BaseTest {
    @Test
    public void clickOnTermsOfUse() {
        basePage.open(SOXES_HOME_PAGE);
        soxesHomePage.acceptCookie();
    }
    @Test
    public void testLangChanging() {
        basePage.open(SOXES_HOME_PAGE);
        soxesHomePage.changeLanguage();
    }
    @Test
    public void digitTabWasPressed() {
        basePage.open(SOXES_HOME_PAGE);
        soxesHomePage
                .clickToItem();
        digitalisierungPage.checkCorrectTitle();
    }
    @Test
    public void testCountSolutionButtons() {
        basePage.open(SOXES_HOME_PAGE);
        soxesHomePage.checkCountSolutionsButtons();
    }
}
