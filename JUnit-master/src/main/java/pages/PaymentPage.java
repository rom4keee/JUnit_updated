package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;


public class PaymentPage extends HomePage {
    public void enterEmailAddress(String email) {
        enterTextIntoField(emailField, email);
    }

    public String getEmailAddress () {
        return getTextFieldText(emailField);
    }
    public String getOrderTotal () {
        return getElementText(orderTotal);
    }
    public String getOrderSubTotal () {
        return getElementText(orderSubTotal);
    }

    @FindBy(xpath = "//input[@name='emailAddress']")
    private static WebElement emailField;

    @FindBy(xpath = "//dd[@class='text-right'][@aria-hidden='true']")
    private static WebElement orderSubTotal;

    @FindBy(xpath = "//dd[@class='text-right total-price']")
    private static WebElement orderTotal;


}