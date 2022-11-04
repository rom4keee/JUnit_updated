package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class Basket extends HomePage {
    public void clickCheckoutButton () {
        clickButton(checkoutButton);
    }
    @FindBy (xpath = "//div[@class='basketHeaderButtons']//a[contains(@class,'checkout-btn')]")
    private WebElement checkoutButton;
}
