package pages.main;

import io.qameta.allure.Step;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import pages.base.BasePage;

public class SoxesHomePage extends BasePage {
    public SoxesHomePage(WebDriver driver) {
        super(driver);
    }

    private final By langButton = By.xpath("//*[@class=\"wpml-ls-display\"]");
    private final By acceptButton = By.xpath("//a[@class=\"cn-set-cookie cn-button\"]");
    private final By itemButton = By.xpath("//div[@class=\"nectar-category-grid-item\"][1]");
    private final By langLabel = By.xpath("//span[@class='wpml-ls-native']");

    public SoxesHomePage acceptCookie() {
        try {
            WebElement accept = driver.findElement(acceptButton);
            waitElementIsVisible(accept).click();
            Thread.sleep(2000);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
        return this;
    }
    public SoxesHomePage changeLanguage () {
        try {
            WebElement lang = driver.findElement(langButton);
            waitElementIsVisible(lang).click();
            Thread.sleep(2000);

            WebElement langLb = driver.findElement(langLabel);
            String lb = waitElementIsVisible(langLb).getText();
            Assert.assertEquals(lb, "EN");

        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
        return this;
    }

    public SoxesHomePage clickToItem() {
        WebElement button = driver.findElement(itemButton);
        waitElementIsVisible(button).click();
        return this;
    }

}
