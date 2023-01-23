package tests.lauchMainPage;

import org.testng.annotations.Test;
import tests.base.BaseTest;

import static constants.Constant.Urls.SOXES_HOME_PAGE;

public class LaunchSmokeTest extends BaseTest {
    @Test
    public void acceptCookiesWasPressed() {
        basePage.open(SOXES_HOME_PAGE);
        soxesHomePage
                .changeLanguage()
                .clickToItem();
        digitalisierungPage.checkCorrectTitle();
    }
}
