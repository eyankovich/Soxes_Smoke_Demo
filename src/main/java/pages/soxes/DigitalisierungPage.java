package pages.soxes;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import pages.base.BasePage;

public class DigitalisierungPage extends BasePage {
    public DigitalisierungPage(WebDriver driver) {
        super(driver);
    }
    private final By title = By.xpath("//h1[text()='Digitalisierun1']");
    public DigitalisierungPage checkCorrectTitle () {
        WebElement titleForPage = driver.findElement(title);
        String element = waitElementIsVisible(titleForPage).getText();
        Assert.assertEquals(element, "Digitalisierung");
        return this;
    }
}
