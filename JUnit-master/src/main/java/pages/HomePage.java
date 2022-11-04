package pages;

import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.PageFactory;
import static driver.WDriver.*;

public class HomePage extends PageFactory {

    public static void searchInput(String s) {
        searchField.sendKeys(s);
    }

    public static void clickSearchButton() {
        clickButton(searchButton);
    }

    @FindBy(xpath = "//*[@id='book-search-form']//input[1]")
    private static WebElement searchField;

    @FindBy(xpath = "//button[@class='header-search-btn']")
    private static WebElement searchButton;

    public HomePage() {
        initElements(getDriver(), this);
    }

    protected static void clickButton(WebElement webElement) {
        webElement.click();
    }

    protected String getElementText(WebElement webElement) {
        return webElement.getText();
    }

    protected String getTextFieldText(WebElement webElement) {
        return webElement.getAttribute("value");
    }

    protected void enterTextIntoField(WebElement webElement, String text) {
        webElement.sendKeys(text);
    }

}

