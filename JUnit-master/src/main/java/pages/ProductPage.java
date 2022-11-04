package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class ProductPage extends HomePage {
    public void clickAddToBasket() {
        clickButton(addToBasket);
    }

    @FindBy (xpath = "//a[contains(@class,'add-to-basket')]")
    private WebElement addToBasket;


}