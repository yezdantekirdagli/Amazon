package StepDefinations;

import Pages.AmazonPages;
import Util.DriverFactory;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.When;
import org.openqa.selenium.WebDriver;

public class AmazonSteps {
    WebDriver driver = DriverFactory.getDriver();
    AmazonPages amazonPages = new AmazonPages(driver);
    @Given("user is on homepage")
    public void userIsOnHomepage() {
        AmazonPages.HomePage();
    }

    @When("click accept cookies")
    public void clickAcceptCookies() {
        AmazonPages.AcceptCookie();
    }

    @When("click on search box")
    public void clickOnSearchBox() {
        AmazonPages.ClickSearch();
    }

    @When("write Airpods on search box")
    public void writeAirpodsOnSearchBox() {
        AmazonPages.writeProduct();
    }

    @When("click on search button")
    public void clickOnSearchButton() {
        AmazonPages.clickSearchButton();
    }

    @When("select item shipped by amazon only filter")
    public void selectItemShippedByAmazonOnlyFilter() {
        AmazonPages.selectAmazonFilter();
    }

    @When("select Apple filter as brand")
    public void selectAppleFilterAsBrand() {
        AmazonPages.selectBrandFilter();
    }

    @When("select the first product")
    public void selectTheFirstProduct() {
        AmazonPages.selectFirstProduct();
    }

    @When("add cart")
    public void addCart() {
        AmazonPages.addCart();
    }

    @When("go cart")
    public void goCart() {
        AmazonPages.goCart();
    }

    @When("see product on the cart page")
    public void seeProductOnTheCartPage() {
        AmazonPages.seeProduct();
    }
}
