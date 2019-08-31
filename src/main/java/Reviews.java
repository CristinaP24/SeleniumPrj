import org.junit.After;
import org.junit.BeforeClass;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.interactions.Actions;


public class Reviews {
    private WebDriver driver;

    private By myAccountButton = By.cssSelector("a.skip-account span.label"); //selector modificat
    private By loginLink = By.cssSelector("a[title='Log In']"); //selector modificat
    private By userEmailField = By.cssSelector("#email");
    private By userPasswordField = By.cssSelector("#pass");
    private By loginButton = By.cssSelector("#send2");
    private By enterSearchItem = By.cssSelector("#search");
    private By reviewField = By.cssSelector("#review_field");
    private By summaryField = By.cssSelector("#summary_field");
    private By submitReviewButton = By.cssSelector("button[title*='Submit Review']");
    private By beFirstToReviewButton = By.cssSelector("a[href*='review-form']");

    private By price1Button = By.cssSelector("#Price_1");
    private By price2Button = By.cssSelector("#Price_2");
    private By price3Button = By.cssSelector("#Price_3");
    private By value2Button = By.cssSelector("#Value_2");
    private By value1Button = By.cssSelector("#Value_1");
    private By quality3Button = By.cssSelector ("#Quality_3");
    private By quality2Button = By.cssSelector("#Quality_2");
    private By quality1Button = By.cssSelector("#Quality_1");
    private By newArrivalsCateg = By.cssSelector("a[href*='new-arrivals']");
    private By womenCateg = By.cssSelector("a[href*='cat=4&q']");

    private By reviewButton = By.cssSelector("li.last>span");
    private By accessoriesCateg = By.cssSelector("a[href*='accessories']");
    private By viewDetailsButton = By.cssSelector("a[href*='top-593']");

    private By chooseRedColourButton = By.cssSelector("img[alt*='Red']");
    private By chooseMSizeButton = By.cssSelector("a[name*='m']");


    @BeforeClass
    public void initDriver() {
        System.setProperty("webdriver.chrome.driver", "resources/chromedriver.exe");
        driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("https://fasttrackit.org/selenium-test/");
    }
    @Test
    public void validReviewLoggedIn() {
        System.setProperty("webdriver.chrome.driver", "resources/chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("https://fasttrackit.org/selenium-test/");

        driver.findElement((myAccountButton)).click();
        driver.findElement((loginLink)).click();
        driver.findElement((userEmailField)).sendKeys("hermioneg@gmail.com");
        driver.findElement((userPasswordField)).sendKeys("notamuggle77");
        driver.findElement((loginButton)).click();

        driver.findElement((enterSearchItem));
        driver.findElement((enterSearchItem)).sendKeys("knit top", Keys.RETURN);
        driver.findElement ((viewDetailsButton)).click();
        driver.findElement((chooseRedColourButton)).click();
        driver.findElement((chooseMSizeButton)).click();

        driver.findElement((reviewButton)).click();
        driver.findElement((beFirstToReviewButton)).click();
        driver.findElement((quality1Button)).click();
        driver.findElement((price3Button)).click();
        driver.findElement((value1Button)).click();

        driver.findElement((reviewField)).click();
        driver.findElement((reviewField)).sendKeys("Top is nice. But I am not interested in shopping. This type of activity is boring as hell.");
        driver.findElement((summaryField)).click();
        driver.findElement((summaryField)).sendKeys("Really, like we're writing novels now.");
        driver.findElement((submitReviewButton)).submit(); //folosesc submit pt. formular
    }
    @After
    public void closeDriverValidReviewLoggedIn () {
        driver.quit();
    }
@Test
    public void invalidReviewLoggedIn_1() {
        System.setProperty("webdriver.chrome.driver", "resources/chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("https://fasttrackit.org/selenium-test/");

    driver.findElement((myAccountButton)).click();
    driver.findElement((loginLink)).click();
    driver.findElement((userEmailField)).sendKeys("hermioneg@gmail.com");
    driver.findElement((userPasswordField)).sendKeys("notamuggle77");
    driver.findElement((loginButton)).click();
    driver.findElement((enterSearchItem)).click();
    driver.findElement((enterSearchItem)).sendKeys("knit top", Keys.RETURN);
    driver.findElement((viewDetailsButton)).click();
    driver.findElement((reviewButton)).click();

    driver.findElement((beFirstToReviewButton)).click();
    driver.findElement((price1Button)).click();
    driver.findElement((value2Button)).click();
    driver.findElement((quality3Button)).click();
    driver.findElement((reviewField)).click();
    driver.findElement((reviewField)).sendKeys("wDVdNa7I5c\n" +
                "pfIKk0hh31\n" +
                "UkaikvfJji\n" +
                "gpWuA6BiDv\n" +
                "pwttAMdhVx\n" +
                "I94MC04vnb\n" +
                "FIqpobB3K3\n" +
                "if0cZxw54X\n" +
                "c3i2GHrGR\n" +
                "w9GGJM6Y047\n");
    driver.findElement((summaryField)).click();
    driver.findElement((summaryField)).sendKeys("Really, like we're writing novels now.");
    driver.findElement((submitReviewButton)).submit();
    }
    @After
    public void closeDriverinvalidReviewLoggedIn_1 () { driver.quit();
    }

    @Test
        public void invalidReviewLoggedIn_2() {
            System.setProperty("webdriver.chrome.driver", "resources/chromedriver.exe");
            WebDriver driver = new ChromeDriver();
            driver.manage().window().maximize();
            driver.get("https://fasttrackit.org/selenium-test/");

            driver.findElement((myAccountButton)).click();
            driver.findElement((loginLink)).click();
            driver.findElement((userEmailField)).sendKeys("hermioneg@gmail.com");
            driver.findElement((userPasswordField)).sendKeys("notamuggle77");
            driver.findElement((loginButton)).click();
            driver.findElement((enterSearchItem)).click();

            Actions action = new Actions(driver);
            driver.findElement((womenCateg)).click();//de corectat
            WebElement el = driver.findElement((accessoriesCateg));action.moveToElement(el).perform(); //categoria parinte Accesorii
            driver.findElement((newArrivalsCateg)).click();

            driver.findElement(By.id("product-collection-image-339")).click();

            driver.findElement(By.cssSelector("body > div.wrapper > div.page > div.main-container.col1-layout > div > div.col-main > div.product-view > div.product-collateral.toggle-content.tabs > ul > li.last > span")).click();
            driver.findElement((beFirstToReviewButton)).click();
            driver.findElement((price2Button)).click();
            driver.findElement((value2Button)).click();
            driver.findElement((quality2Button)).click();
            driver.findElement((reviewField)).click();
            driver.findElement((reviewField)).sendKeys("a");
            driver.findElement((summaryField)).click();
            driver.findElement((summaryField)).sendKeys("b");
            driver.findElement((submitReviewButton)).submit();
    }
    @After
    public void closeDriverinvalidReviewLoggedIn_2 () { driver.quit();
    }
}
