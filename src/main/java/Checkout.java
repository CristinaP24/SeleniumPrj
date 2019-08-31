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


public class Checkout {

    private WebDriver driver;
    private By myAccountButton = By.cssSelector("a.skip-account span.label");
    private By loginLink = By.cssSelector("a[title='Log In']");
    private By userEmailField = By.id("email");
    private By userPasswordField = By.cssSelector("#pass");
    private By loginButton = By.cssSelector("#send2");


    private By womenCateg = By.cssSelector("#nav > ol > li.level0.nav-1.first.parent > a");
    private By childTopsBlousesCateg = By.cssSelector("a[href*='tops']");
    private By priceRangeButton = By.cssSelector("a[href*='price']");
    private By pinkColourButton = By.cssSelector("[title='Pink']");
    private By eveningOcassionButton = By.cssSelector("a[href*='29']");
    private By viewDetailsButtonNolita = By.cssSelector("a[href*='nolita-cami-493']");
    private By ViewDetailsButtonLove = By.cssSelector("a[href*='love-is-an-eternal-lie']");



    private By selectPink = By.cssSelector("[title~=Pink]");
    private By selectSizeM = By.cssSelector("[title~='M']");
    private By clickQ = By.cssSelector("#qty");
    private By addToCartButton = By.cssSelector("[onclick *='productAddToCartForm.submit(this)']");
    private By proceedToCheckoutButton = By.cssSelector("[title*='Proceed to Checkout']");

    private By billingAddressSelect = By.cssSelector("#billing-address-select");
    private By billingCompanyField = By.cssSelector("#billing:company");
    private By billingStreetField = By.cssSelector("#billing:street1");
    private By billingCityField = By.cssSelector("#billing:city");
    private By billingRegion = By.cssSelector("#billing:region_id");
    private By billingCountry = By.cssSelector("#billing:country_id");
    private By billingPostCodeField = By.cssSelector("#billing:postcode");
    private By billingTelephoneField = By.cssSelector("#billing:telephone");

    private By billingContButton = By.cssSelector("#billing-buttons-container > button > span > span"); //
    private By shipToTheseAddressButton = By.id("billing:use_for_shipping_yes");

    private By contButton2 = By.cssSelector("#shipping-method-buttons-container > button");
    private By contShoppingButton = By.cssSelector("body > div > div.page > div.main-container.col1-layout > div > div > div.buttons-set > button > span > span");
    private By contPayButton = By.cssSelector("#payment-buttons-container > button > span > span");
    private By enterSearchItem = By.cssSelector("#search");
    private By accountButton = By.cssSelector("a[href*='customer'] .label");
    private By checkoutButton = By.cssSelector("#header-account a[title*='Checkout']");
    private By viewDetailsLoveisEthernal = By.cssSelector("a[title*='View Details']");
    private By linksLoveButton = By.cssSelector("a[title*='View details']");


    @BeforeClass
    public void initDriver() {
        System.setProperty("webdriver.chrome.driver", "resources/chromedriver.exe");
        driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("https://fasttrackit.org/selenium-test/");
    }


@Test
    public void validCheckout() {
    System.setProperty("webdriver.chrome.driver", "resources/chromedriver.exe");
    WebDriver driver = new ChromeDriver();
    driver.manage().window().maximize();
    driver.get("https://fasttrackit.org/selenium-test/");


    driver.findElement((myAccountButton)).click();
    driver.findElement((loginLink)).click();
    driver.findElement((userEmailField)).sendKeys("hermioneg@gmail.com");
    driver.findElement((userPasswordField)).sendKeys("notamuggle77");
    driver.findElement((loginButton)).click();


    driver.findElement((accountButton)).click();
    driver.findElement((checkoutButton)).click();
}

    @After
    public void closeDriverCp () {
        driver.quit();
    }


    public void validCheckoutProduct () {
        System.setProperty("webdriver.chrome.driver", "resources/chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("https://fasttrackit.org/selenium-test/");


        driver.findElement((myAccountButton)).click();
        driver.findElement((loginLink)).click();
        driver.findElement((userEmailField)).sendKeys("hermioneg@gmail.com");
        driver.findElement((userPasswordField)).sendKeys("notamuggle77");
        driver.findElement((loginButton)).click();

        driver.findElement((womenCateg)).click();//merge la Women

    Actions actions = new Actions(driver);
    WebElement e = driver.findElement(By.cssSelector("#nav > ol > li.level0.nav-1.first.active.parent"));actions.moveToElement(e).perform(); ////pe categoria parinte
        driver.findElement((childTopsBlousesCateg)).click();
    //driver.findElement(By.cssSelector("#nav > ol > li.level0.nav-1.first.active.parent > ul > li.level1.nav-1-2")).click(); //pe subcategoria child tops and blouses

     driver.findElement((priceRangeButton)).click();//range pret
     driver.findElement((pinkColourButton)).click();//alege culoarea pink
     driver.findElement((eveningOcassionButton)).click();//evening ocassion
     driver.findElement((viewDetailsButtonNolita)).click();//view details
     driver.findElement((selectPink)).click();//Select pink
     driver.findElement((selectSizeM)).click();//select size M
     driver.findElement((clickQ)).click();
     driver.findElement((clickQ)).clear();
     driver.findElement((clickQ)).sendKeys("2");//select 2 quantity
     driver.findElement((addToCartButton)).click();//adds to cart
     driver.findElement((proceedToCheckoutButton)).click();//proceed to checkout button


   Select dropdown = new Select(driver.findElement((billingAddressSelect)));
   dropdown.selectByVisibleText("New Address"); //de corectat


    driver.findElement((billingCompanyField)).click();
    driver.findElement((billingCompanyField)).clear();
    driver.findElement((billingCompanyField)).sendKeys("Hogwarts");

    driver.findElement((billingStreetField)).click();
    driver.findElement((billingStreetField)).clear();
    driver.findElement((billingStreetField)).sendKeys("Hogwarts 22");

    driver.findElement((billingCityField)).click(); //de terminat de aci
    driver.findElement((billingCityField)).clear();
    driver.findElement((billingCityField)).sendKeys("Land of Magic");

    Select select = new Select(driver.findElement((billingRegion)));
    select.selectByVisibleText("Guam");

    driver.findElement((billingPostCodeField)).click();
    driver.findElement((billingPostCodeField)).clear();
    driver.findElement((billingPostCodeField)).sendKeys("654321");

    driver.findElement((billingTelephoneField)).click();
    driver.findElement((billingTelephoneField)).clear();
    driver.findElement((billingTelephoneField)).sendKeys("0745905999");
    driver.findElement((shipToTheseAddressButton)).click(); //click ship to this address
//    driver.findElement((billingContButton)).click();
        // driver.findElement(By.cssSelector("#billing-buttons-container > button > span > span")); //click continue button

//    driver.findElement(By.cssSelector("#s_method_ups_WXS")).click(); //click unit parcel, a doua optiune

    Main.sleep(5);
    driver.findElement((billingContButton)).click();
    driver.findElement((contButton2)).click();// de corectat
}
    @After
    public void closeDriverCp1 () {
        driver.quit();
    }


@Test
    public void invalidCheckoutProduct_1 () {

        System.setProperty("webdriver.chrome.driver", "resources/chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("https://fasttrackit.org/selenium-test/");


    driver.findElement((myAccountButton)).click();
    driver.findElement((loginLink)).click();
    driver.findElement((userEmailField)).sendKeys("hermioneg@gmail.com");
    driver.findElement((userPasswordField)).sendKeys("notamuggle77");
    driver.findElement((loginButton)).click();



//        driver.findElement(By.cssSelector("#header > div > div.skip-links > div > a > span.label")).click();
//        driver.findElement(By.cssSelector("#header-account > div > ul > li.last > a")).click();
//        driver.findElement(By.id("email")).sendKeys("hermioneg@gmail.com");
//        driver.findElement(By.id("pass")).sendKeys("notamuggle77");
//        driver.findElement(By.id("send2")).click();

        driver.findElement((enterSearchItem)).click();
        driver.findElement((enterSearchItem)).clear();
        driver.findElement((enterSearchItem)).sendKeys("alice in wonderland", Keys.RETURN);

        //driver.findElement((viewDetailsButtonLove)); //view details - de corectat

       driver.findElement((viewDetailsLoveisEthernal)).click();
driver.findElement((linksLoveButton)).click(); //de corectat
        driver.findElement((addToCartButton)).click();//click add ot cart
        driver.findElement((proceedToCheckoutButton)).click();//proceed to checkout

        Select select = new Select(driver.findElement((billingAddressSelect)));
        select.selectByVisibleText("New Address"); //aleg alta adresa

        driver.findElement((billingStreetField)).click();
        driver.findElement((billingStreetField)).clear();
        driver.findElement((billingStreetField)).sendKeys("S0");

        driver.findElement((billingCityField)).click();
        driver.findElement((billingCityField)).clear();
        driver.findElement((billingCityField)).sendKeys("Sssssss");
        driver.findElement(((billingRegion))).click();
        Select select2 = new Select(driver.findElement((billingRegion)));
        select2.selectByVisibleText("Iowa");// selecteaza Iowa

        driver.findElement((billingPostCodeField)).click();
        driver.findElement((billingPostCodeField)).clear();
        driver.findElement((billingPostCodeField)).sendKeys("0000000");

        Select select3 = new Select(driver.findElement((billingCountry)));//click pe dropdown pt tara
        select3.selectByVisibleText("Chile");

        driver.findElement((billingTelephoneField)).click();
        driver.findElement((billingTelephoneField)).clear();
        driver.findElement((billingTelephoneField)).sendKeys("0740000000");

        driver.findElement((billingContButton)).click(); //buton continue
        driver.findElement((contButton2)).click();//click pe continue button //de corectat

        //driver.findElement(((contButton2))).click();
        driver.findElement((contShoppingButton)).click();

    }
    @After
    public void closeDriver2 () {
        driver.quit();

    }

}