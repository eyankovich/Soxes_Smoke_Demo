package tests.base;

import common.CommonActions;
import org.openqa.selenium.WebDriver;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.AfterTest;
import pages.base.BasePage;
import pages.main.SoxesHomePage;
import pages.soxes.DigitalisierungPage;

import static common.Config.CLEAR_COOKIES;
import static common.Config.HOLD_BROWSER_OPEN;

public class BaseTest {
    protected WebDriver driver = CommonActions.createDriver();
    protected BasePage basePage = new BasePage(driver);
    protected SoxesHomePage soxesHomePage = new SoxesHomePage(driver);
    protected DigitalisierungPage digitalisierungPage = new DigitalisierungPage(driver);

    @AfterTest
    public void clearCookies() {
        if (CLEAR_COOKIES) {
            driver.manage().deleteAllCookies();
        }
    }
    @AfterSuite
    public void close() {
        if (HOLD_BROWSER_OPEN) {
            driver.quit();
        }
    }
}
