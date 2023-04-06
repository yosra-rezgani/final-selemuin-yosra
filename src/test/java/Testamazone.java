import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
import org.testng.annotations.TestInstance;

@Test
public class Testamazone {
    static final int TIMEOUT_SIDE_PANEL = 5; // 5s
    WebDriver driver;



    public void testAmazon() {

        HomePage homePage = new HomePage(driver);
        homePage.closeCookiePopup();
        homePage.topVente();

    }

    @BeforeMethod
    public void setup() {
        driver = new ChromeDriver();
        driver.get("https://www.amazon.fr");
        driver.manage().window().maximize();
    }

    @AfterMethod
    public void teardown() {
        driver.close();
    }

}
