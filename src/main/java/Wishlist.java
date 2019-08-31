import org.junit.After;
import org.junit.BeforeClass;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Wishlist {

    private WebDriver driver;

    private By myAccountButton = By.cssSelector("a.skip-account span.label");
    private By loginLink = By.cssSelector("a[title='Log In']");
    private By userEmailField = By.cssSelector("#email");
    private By userPasswordField = By.cssSelector("#pass");
    private By loginButton = By.cssSelector("#send2");

    private By searchTextboxId = By. cssSelector("#search");
    private By addtoWishListLink = By.cssSelector("a[href*='413']");
    private By updateWishListButton = By.cssSelector("[title|='Update Wishlist']");



    @BeforeClass
    public void initDriver() {
        System.setProperty("webdriver.chrome.driver", "resources/chromedriver.exe");
        driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("https://fasttrackit.org/selenium-test/");
    }


    public void validWishListAdd() {
        System.setProperty("webdriver.chrome.driver", "resources/chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("https://fasttrackit.org/selenium-test/");

        driver.findElement((myAccountButton)).click();
        driver.findElement((loginLink)).click();
        driver.findElement((userEmailField)).sendKeys("hermioneg@gmail.com");
        driver.findElement((userPasswordField)).sendKeys("notamuggle77");
        driver.findElement((loginButton)).click();

        driver.findElement((searchTextboxId)).sendKeys("shirt", Keys.RETURN);
        driver.findElement((addtoWishListLink)).click();
        driver.findElement((updateWishListButton)).click();

    }
    @After
    public void closeDriverW1 () {
        driver.quit();
    }

    public void validWishListAddSame() {
        System.setProperty("webdriver.chrome.driver", "resources/chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("https://fasttrackit.org/selenium-test/");

        driver.findElement((myAccountButton)).click();
        driver.findElement((loginLink)).click();
        driver.findElement((userEmailField)).sendKeys("hermioneg@gmail.com");
        driver.findElement((userPasswordField)).sendKeys("notamuggle77");
        driver.findElement((loginButton)).click();


        driver.findElement((searchTextboxId)).click();
        driver.findElement((searchTextboxId)).sendKeys("core striped shirt", Keys.RETURN);
        driver.findElement((addtoWishListLink)).click();
        driver.findElement((updateWishListButton)).click();

    }
    @After
    public void closeDriverW2 () {
        driver.quit();
    }


}
