package pageObjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import java.util.List;

public class Downloads_PO {

    public Downloads_PO(WebDriver driver) {
        PageFactory.initElements(driver, this);
    }
    @FindBy(xpath = "//button[normalize-space()='Browsers']")
    WebElement browserButton;

    @FindBy(xpath = "//div [@id = 'supported-browsers']//div[@class='card mb-3 border-0']")
    List<WebElement> list;


    public void clickBrowserButton() {
        browserButton.click();
    }

    public int numberOfWebElements() {
        return list.size();
    }
}