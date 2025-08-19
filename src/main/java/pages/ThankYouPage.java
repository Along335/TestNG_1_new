package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class ThankYouPage {
    public ThankYouPage(WebDriver driver){
        PageFactory.initElements(driver,this);

    }
    @FindBy(tagName = "h1")
    private WebElement thankYouText;

    public boolean isInitialized() {
        return thankYouText.isDisplayed();
    }
}
