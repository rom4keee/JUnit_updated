package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import java.util.List;

public class SearchResult extends HomePage {
    public void findProductFromList(String containsText) {
        for (WebElement webElement :
                searchResults) {
            if (webElement.getText().contains(containsText)) {
                book = webElement;
            }
        }
    }

    public void openProductPage() {
        clickButton(book);
    }
    @FindBy(xpath = "//*[@id='book-search-form']//input[1]")
    private List<WebElement> searchResults;

    @FindBy(xpath = "//div[@class='item-info']//a[contains(text(), 'Camilla, Duchess of Cornwall')]")
    private WebElement book;


}
