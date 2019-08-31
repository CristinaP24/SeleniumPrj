import org.junit.After;
import org.junit.BeforeClass;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;
public class Cart {

    private WebDriver driver;

    private By clickQ = By.cssSelector ("#qty");
    private By addToCartButton = By.cssSelector("button[onclick*='productAddToCartForm']");

    private By enterSearchItem = By.cssSelector("#search");

    private By viewDetailsAnnAnkleBoot = By.cssSelector("a[href*='ankle-boot']");
    private By chooseBlackColourAnn = By.cssSelector("img[alt*='Black']");
    private By chooseSize8Ann = By.cssSelector("#swatch100");

    private By magnifierButton = By.cssSelector("#search_mini_form");
    private By viewDetailsButtonRacerMaxiDress = By.cssSelector("#product-collection-image-423");

    private By choosePurpleColourRacerBlack = By.cssSelector("img[alt*='Purple']");
    private By chooseLSizeRacerBlack = By.cssSelector("#swatch78");


    @BeforeClass
    public void initDriver() {
        System.setProperty("webdriver.chrome.driver", "resources/chromedriver.exe");
        driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("https://fasttrackit.org/selenium-test/");
    }
    @Test
    //Add in stock product to cart
    public void vctAnnBlackAnkle() {
        System.setProperty("webdriver.chrome.driver", "resources/chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("https://fasttrackit.org/selenium-test/");
        //driver.findElement(By.cssSelector("#header > div > div.skip-links > div > div > a > span.label")).click();
        driver.findElement((enterSearchItem)).sendKeys("boot", Keys.RETURN);
        driver.findElement((magnifierButton));
        driver.findElement((viewDetailsAnnAnkleBoot)).click();
        driver.findElement((chooseBlackColourAnn));
        driver.findElement((chooseSize8Ann));

        driver.findElement((clickQ));
        driver.findElement((clickQ)).clear();
        driver.findElement((clickQ)).sendKeys("2"); //adauga in cos 2 perechi
        driver.findElement((addToCartButton));
    }
    @After
    public void closeDriverVctAnn () {
        driver.quit();
    }

    @Test
//Add 1000 items of one type of product in stock
    public void add1000ProductItems () {
        System.setProperty("webdriver.chrome.driver", "resources/chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("https://fasttrackit.org/selenium-test/");
        //driver.findElement(By.cssSelector("#header > div > div.skip-links > div > div > a > span.label")).click();
        driver.findElement((enterSearchItem)).sendKeys("skirt", Keys.RETURN);
        driver.findElement((magnifierButton));
        driver.findElement((viewDetailsButtonRacerMaxiDress)).click();
        driver.findElement((clickQ));
        driver.findElement((clickQ)).clear();
        driver.findElement((clickQ)).sendKeys("1000"); //adauga in cos 1000 itemi RACER BACK MAXI DRESS

        driver.findElement((choosePurpleColourRacerBlack));
        driver.findElement((chooseLSizeRacerBlack));
        driver.findElement((addToCartButton));
    }
    @After
    public void closeDriverAdd1000 () {
        driver.quit();
    }

    //Add -1 item of one type of product in stock - it is a bug as cart is updated to 1 item
   @Test
    public void addMinus1ProductItem (){
        System.setProperty("webdriver.chrome.driver", "resources/chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("https://fasttrackit.org/selenium-test/");
       // driver.findElement(By.cssSelector("#header > div > div.skip-links > div > div > a > span.label")).click();
        driver.findElement((enterSearchItem)).sendKeys("skirt", Keys.RETURN);
        driver.findElement((magnifierButton));
        driver.findElement((viewDetailsButtonRacerMaxiDress)).click();

       driver.findElement((clickQ)).click();
       driver.findElement((clickQ)).clear();
       driver.findElement((clickQ)).sendKeys("-1"); //adauga in cos -1 itemi RACER BACK MAXI DRESS

       driver.findElement((choosePurpleColourRacerBlack)); //alege culoarea neagra
       driver.findElement((chooseLSizeRacerBlack));
       driver.findElement ((addToCartButton));
}
    @After
    public void closeDriverAddMinus () {
        driver.quit();
    }
}
