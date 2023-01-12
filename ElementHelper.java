package Util;
import io.cucumber.java.de.Wenn;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedCondition;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
public class ElementHelper {
    WebDriver driver;
    WebDriverWait wait;
    Actions action;
    public ElementHelper(WebDriver driver){
        this.driver = driver;
        this.wait = new WebDriverWait(driver,10);
        this.action = new Actions(driver);
    }

    public WebElement presenceElement(By key){
        return
                wait.until(ExpectedConditions.presenceOfElementLocated(key)); //wait here until the element arrives
    }
    public WebElement findElemet(By key){
        WebElement element = presenceElement(key);
        return element;
    }
    public void Click(By key) {
        findElemet(key).click();
    }
    public void sendKey(By key, String text){
        findElemet(key).sendKeys(text);
    }





}
