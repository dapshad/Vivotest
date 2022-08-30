package StepDefinition;

import Cucumber.Hooks;
import PageObject.BarefootPagePO;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;



public class Steps {

    WebDriver driver = Hooks.driver;
    @Given("I am on the barefoot login page")
    public void iAmOnTheBarefootLoginPage() {
        WebDriverManager.chromedriver().setup();
        driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("https://www.vivobarefoot.com/uk/");
        BarefootPagePO barefootPagePO = new BarefootPagePO(driver);
        barefootPagePO.clickLoginLink();

    }

    @And("I enter {string} {string}")
    public void iEnter(String Email, String Password) {
        BarefootPagePO barefootPagePO = new BarefootPagePO(driver);
        barefootPagePO.enterEmail(Email);
        barefootPagePO.enterPassword(Password);
    }

    @And("I click on sign in")
    public void iClickOnSignIn() {
        BarefootPagePO barefootPagePO = new BarefootPagePO(driver);
        barefootPagePO.clickSignInButton();
    }

    @And("I click on latest")
    public void iClickOnLatest() {
        BarefootPagePO barefootPagePO = new BarefootPagePO(driver);
        barefootPagePO.clickLatest();
    }

    @And("I click on leather nourisher")
    public void iClickOnLeatherNourisher() {
        BarefootPagePO barefootPagePO = new BarefootPagePO(driver);
        barefootPagePO.clickLeather();
    }

    @And("I click Add to basket")
    public void iClickAddToBasket() {
        BarefootPagePO barefootPagePO = new BarefootPagePO(driver);
        barefootPagePO.clickAddItem();
    }

    @And("I click on mini basket")
    public void iClickOnMiniBasket() {
        BarefootPagePO barefootPagePO = new BarefootPagePO(driver);
        barefootPagePO.clickMiniCart();
    }

    @And("I click on remove an item")
    public void iClickOnRemoveAnItem() {
        BarefootPagePO barefootPagePO = new BarefootPagePO(driver);
        barefootPagePO.clickRemove();
    }

    @And("click on okay")
    public void clickOnOkay() {
        BarefootPagePO barefootPagePO = new BarefootPagePO(driver);
        barefootPagePO.clickOkButton();
    }

    @Then("item is removed and basket updated")
    public void itemIsRemovedAndBasketUpdated() {
    }
}
