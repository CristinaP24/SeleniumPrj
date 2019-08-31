import org.junit.After;
import org.junit.BeforeClass;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;

public class Register {

    private WebDriver driver;
    private By accountButtonMenu = By.cssSelector("[data-target-element*=header-account]");

    private By registerButton = By.cssSelector("[title*='Register']");
    private By firstNameField = By.cssSelector("#firstname");
    private By middleNameField = By.cssSelector("#middlename");
    private By lastNameField = By.cssSelector("#lastname");

    private By userEmailFieldReg = By.cssSelector("#email_address");
    private By userPasswordFieldReg = By.cssSelector("#password");
    private By confirmPasswordField = By.cssSelector("#confirmation");
    private By registerButton1 = By.cssSelector("button[title*='Register']");

//[title*='Register']

    @BeforeClass
    public void initDriver() {
        System.setProperty("webdriver.chrome.driver", "resources/chromedriver.exe");
        driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("https://fasttrackit.org/selenium-test/");
    }
@Test
    //Register valid name
    public void validReg() {
        System.setProperty("webdriver.chrome.driver", "resources/chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("https://fasttrackit.org/selenium-test/");

        driver.findElement((accountButtonMenu)).click();
        driver.findElement((registerButton)).click();

        driver.findElement((firstNameField)).sendKeys("Hermione");
        driver.findElement((middleNameField)).sendKeys("Granger");
        driver.findElement((lastNameField)).sendKeys("Muggle");

        driver.findElement((userEmailFieldReg)).sendKeys("hermioneg@gmail.com");
        driver.findElement((userPasswordFieldReg)).sendKeys("notamuggle77");
        driver.findElement((confirmPasswordField)).sendKeys("notamuggle77");
        driver.findElement((registerButton1)).click();

    }
    @After
    public void closeDriverVR () {
        driver.quit();
    }
    @Test
    //Register with numbers as name
    public void invalidRegNo (){
        System.setProperty("webdriver.chrome.driver", "resources/chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("https://fasttrackit.org/selenium-test/");

        driver.findElement((accountButtonMenu)).click();
        driver.findElement((registerButton)).click();
        driver.findElement((firstNameField)).sendKeys("123456789");
        driver.findElement((middleNameField)).sendKeys("0");
        driver.findElement((lastNameField)).sendKeys("1000");

        driver.findElement((userEmailFieldReg)).sendKeys("hermioneg@gmail.com");
        driver.findElement((userPasswordFieldReg)).sendKeys("12345678");
        driver.findElement((confirmPasswordField)).sendKeys("12345678");
        driver.findElement((registerButton1)).click();
    }
    @After
    public void closeDriverIR () {
        driver.quit();
    }


}
