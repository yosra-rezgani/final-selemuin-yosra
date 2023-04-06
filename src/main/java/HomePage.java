import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class HomePage {
    WebDriver driver;

    By thirdelement = By.cssSelector("#B07XLML2YS>.a-link-normal:nth-child(2)");
    By hightech = By.cssSelector("div._p13n-zg-nav-tree-all_style_zg-browse-group__88fbz > div:nth-child(20)");
    By cookieAcceptButtonLocator = By.cssSelector("#sp-cc-accept");

    By topventes = By.cssSelector("#nav-xshop > a:nth-child(3)");

    public HomePage(WebDriver driver) {
        this.driver = driver;
    }

    public  void closeCookiePopup() {
        driver.findElement(cookieAcceptButtonLocator).click();
    }


    public HomePage topVente() {
        driver.findElement(topventes).click();
        return this;
    }

    public HomePage hightech() {
        driver.findElement(hightech).click();
        return this;
    }

    public HomePage thirdelement() {
        driver.findElement(thirdelement).click();
        return this;
    }



}
