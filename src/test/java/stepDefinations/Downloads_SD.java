package stepDefinations;

import io.cucumber.java.en.*;
import org.testng.Assert;
import pageObjects.Downloads_PO;
import utilities.Base;

public class Downloads_SD extends Base {

    @Given("User launch the Chrome browser")
    public void user_launch_the_chrome_browser() {
        setBrowser();

    }

    @When("User opens URL {string}")
    public void user_opens_url(String url) {
        driver.get(url);
    }

    @Then("Page title should be {string}")
    public void page_title_should_be(String title) {
        Assert.assertEquals(driver.getTitle(),title);
    }

    @When("clicks on plus button")
    public void clicks_on_plus_button() {
        user = new Downloads_PO(driver);
        user.clickBrowserButton();
    }

    @Then("Numbers of browser options are visible")
    public void numbers_of_browser_options_are_visible() throws InterruptedException {
        Assert.assertEquals(user.numberOfWebElements(),6);
        Thread.sleep(4000);
        quit();
    }
}