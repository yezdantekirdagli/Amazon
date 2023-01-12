package Pages;

import Util.ElementHelper;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.WebDriverWait;

public class AmazonPages {
    static WebDriver driver;
    static ElementHelper elementHelper;
    WebDriverWait wait;
    static By accept = By.id("sp-cc-accept");
    static By searchBox = By.id("twotabsearchtextbox");
    static By searchButton = By.id ("nav-search-submit-button");
    static By amazonFilter = By.cssSelector("body > div:nth-child(1) > div:nth-child(30) > div:nth-child(11) > div:nth-child(2) > div:nth-child(1) > div:nth-child(3) > span:nth-child(1) > div:nth-child(1) > div:nth-child(1) > div:nth-child(1) > div:nth-child(7) > ul:nth-child(34) > li:nth-child(3) > span:nth-child(1) > a:nth-child(1) > div:nth-child(1) > label:nth-child(1) > i:nth-child(2)");
    static By brandFilter = By.cssSelector("body > div:nth-child(1) > div:nth-child(30) > div:nth-child(11) > div:nth-child(2) > div:nth-child(1) > div:nth-child(3) > span:nth-child(1) > div:nth-child(1) > div:nth-child(1) > div:nth-child(1) > div:nth-child(5) > ul:nth-child(2) > li:nth-child(2) > span:nth-child(1) > a:nth-child(1) > div:nth-child(1) > label:nth-child(1) > i:nth-child(2)");
    static By firstProduct = By.cssSelector("img[alt='Apple Wireless Charging Case for AirPods']");
    static By addCart = By.cssSelector("#add-to-cart-button");



    public AmazonPages(WebDriver driver){
        this.driver = driver;
        this.wait = new WebDriverWait(driver, 10);
        this.elementHelper = new ElementHelper(driver);
    }

    public static void HomePage() { //We will not use this method because the url we have already defined leads to homePage.
    }

    public static void AcceptCookie() { //we should use ElementHelper for this
        //First, we found the path of the accept cookies button.
        elementHelper.Click(accept);
    }
    public static void ClickSearch() {
        elementHelper.Click(searchBox);
    }

    public static void writeProduct() {
        elementHelper.findElemet(searchBox).sendKeys("Airpods");
    }

    public static void clickSearchButton() {
        elementHelper.Click(searchButton);
    }

    public static void selectAmazonFilter() {
        elementHelper.Click(amazonFilter);
    }

    public static void selectBrandFilter() {
        elementHelper.Click(brandFilter);
    }

    public static void selectFirstProduct() {
        elementHelper.Click(firstProduct);
    }

    public static void addCart() {
        elementHelper.Click(addCart);
    }

    public static void goCart() {
        elementHelper.Click(addCart);
    }

    public static void seeProduct() {
    }
}
