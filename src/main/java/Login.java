import org.junit.After;
import org.junit.Assert;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.AfterClass;
import org.junit.Test;
import org.junit.runners.MethodSorters;
import org.junit.FixMethodOrder;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

@FixMethodOrder(MethodSorters.NAME_ASCENDING)
public class Login {

    private WebDriver driver;
    private By myAccountButton = By.cssSelector("a.skip-account span.label"); //selector modificat
    private By loginLink = By.cssSelector("a[title='Log In']"); //selector modificat
    private By userEmailField = By.id("email");
    private By userPasswordField = By.cssSelector("#pass");
    private By loginButton = By.cssSelector("#send2");

    @BeforeClass
    public void initDriver() {
        System.setProperty("webdriver.chrome.driver", "resources/chromedriver.exe");
        driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("https://fasttrackit.org/selenium-test/");
    }

//    @Test
        public void a_validLoginTest () { //Exemplu Login Cosmin

            System.setProperty("webdriver.chrome.driver", "resources/chromedriver.exe");
            WebDriver driver = new ChromeDriver();
            driver.manage().window().maximize();
            driver.get("https://fasttrackit.org/selenium-test/");

            driver.findElement((myAccountButton)).click();
            driver.findElement(loginLink).click();
           driver.findElement(userEmailField).sendKeys("cosmin@fasttrackit.org");

            driver.findElement(userPasswordField).sendKeys("123456");
            driver.findElement(loginButton).click();
            //Main.sleep(3);
            Assert.assertTrue(driver.findElement(By.cssSelector(" .welcome-msg .hello strong")).getText().equals("Hello, asdasda asdasd!"));
            //driver.quit();
        }

    @Test
    //    Positive login //doar sa le pun sa se inchida browserul dupa fiecare
     public void b_validLoginforAll () {// //a fi folosita in Register, Checkout, Cart, Wishlist

                    System.setProperty("webdriver.chrome.driver", "resources/chromedriver.exe");
                    WebDriver driver = new ChromeDriver();
                    driver.manage().window().maximize();
                    driver.get("https://fasttrackit.org/selenium-test/");


        driver.findElement((myAccountButton)).click();
        driver.findElement((loginLink)).click();
        driver.findElement((userEmailField)).sendKeys("hermioneg@gmail.com");
        driver.findElement((userPasswordField)).sendKeys("notamuggle77");
        driver.findElement((loginButton)).click();
        Assert.assertTrue(driver.findElement(By.cssSelector(" .welcome-msg .hello strong")).getText().equals("Hello, Hermione Granger Muggle!"));

    }
    @After
    public void closeDriver () {
        driver.quit();
    }


    //Login with special char
        @Test
        public void c_loginWithInvalidChar () {

            System.setProperty("webdriver.chrome.driver", "resources/chromedriver.exe");
            WebDriver driver = new ChromeDriver();
            driver.manage().window().maximize();
            driver.get("https://fasttrackit.org/selenium-test/");

            driver.findElement((myAccountButton)).click();
            driver.findElement((loginLink)).click();
            driver.findElement((userEmailField)).sendKeys("herm&ine@gamail.com");
            driver.findElement((userPasswordField)).sendKeys("notamuggle77");
            driver.findElement((loginButton)).click();
        }
 @After
    public void closeDriver2 () {
       driver.quit();
    }
//

        //Main.sleep(3);
        //driver.quit();

//Login with space for username and password
    @Test
        public void d_loginWithSpace () {
            System.setProperty("webdriver.chrome.driver", "resources/chromedriver.exe");
            WebDriver driver = new ChromeDriver();
            driver.manage().window().maximize();
            driver.get("https://fasttrackit.org/selenium-test/");

            driver.findElement((myAccountButton)).click();
            driver.findElement((loginLink)).click();
            driver.findElement((userEmailField)).sendKeys(" ");
            driver.findElement((userPasswordField)).sendKeys("");
            driver.findElement((loginButton)).click();

        }
    @After
    public void closeDriver3 () {
        driver.quit();
    }


    //Login with Caps for username and password
    @Test
        public void e_loginWithCaps () {
           System.setProperty("webdriver.chrome.driver", "resources/chromedriver.exe");
            WebDriver driver = new ChromeDriver();
            driver.manage().window().maximize();
            driver.get("https://fasttrackit.org/selenium-test/");



            driver.findElement(((myAccountButton))).click();
            driver.findElement((loginLink)).click();
            driver.findElement((userEmailField)).sendKeys("hERMIONEG@gmail.com");
            driver.findElement((userPasswordField)).sendKeys("NOTAMUGGLE77");
            driver.findElement((loginButton)).click();

        }

    @After
    public void closeDriver4 () {
        driver.quit();
    }

    //Login with 256 characters as username
    @Test
    @After
    public void closeDriver5 () {
        driver.quit();
    }
        public void f_loginWith256h () {
            System.setProperty("webdriver.chrome.driver", "resources/chromedriver.exe");
            WebDriver driver = new ChromeDriver();
            driver.manage().window().maximize();
            driver.get("https://fasttrackit.org/selenium-test/");

            driver.findElement((myAccountButton)).click();
            driver.findElement((loginLink)).click();
            driver.findElement((userEmailField)).sendKeys("350hQ8gKhWhOIpQUIuPwuMdpRMn5xJKBz44PXUprozsEVb0oAbT36O4uRRS0FToeMAt2iGsec2uoCNfJDpd7FYAXJ51dmcOmfujqvmm8kuTymszolJTpWzcuxlb6jq0rxsRZANrpVIWP89Qoa2f7kdAir0yYYWYAtmy7vPJTyTyCxRqrY2ufVF3Nbb87MaxOxxwHsuD1nvG27jOSHeIX2OH2QnFVG0aJXe8SKK4kXisjniAWFa6XK2WFRhmLkSsn@gmail.com");
            driver.findElement((userPasswordField)).sendKeys("notamuggle77");
            driver.findElement((loginButton)).click();

//            Main.sleep(4);
//            driver.quit();

        }



}

