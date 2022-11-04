package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class Modal extends HomePage {
    public void clickBasketBtn() {
        clickButton(basketButton);
    }

    @FindBy (xpath = "//a[@data-default-localized-pattern='Basket / Checkout']")
    private WebElement basketButton;
}
