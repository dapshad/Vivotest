package PageObject;


import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class BarefootPagePO {

    @FindBy(css = "#html-body > div.page-wrapper > header > div.header.content > div.account-wrapper > a")
    public static WebElement LoginLink;

    @FindBy(id = "email")
    public static WebElement EmailField;

    @FindBy(id = "pass")
    public static WebElement PasswordField;

    @FindBy(id = "send2")
    public static WebElement SignInButton;

    @FindBy(css = "#html-body > div.page-wrapper > header > div.header.content > nav > ul > li.vivo-main-menu__item.vivo-main-menu__item--parent.three-banners.nav-1 > a")
    public static WebElement LatestLink;

    @FindBy(css= "#amasty-shopby-product-list > div.products.wrapper.grid.products-grid > ol > li:nth-child(52) > div > a > span > span > img")
    public static WebElement LeatherLink;

    @FindBy(id = "product-addtocart-button")
    public static WebElement AddItemToBasket;

    @FindBy(css = "#html-body > div.page-wrapper > header > div.header.content > div.minicart-wrapper > a")
    public static WebElement MiniCartLink;

    @FindBy(linkText = "Remove")
    public static WebElement RemoveLink;

    @FindBy(linkText = "OK")
    public static WebElement OkayButton;


    public BarefootPagePO(WebDriver driver){
        PageFactory.initElements(driver,this);
    }

    public void clickLoginLink(){LoginLink.click();}

    public void enterEmail(String Email){EmailField.sendKeys(Email);}

    public void enterPassword(String Password){PasswordField.sendKeys(Password);}

    public void clickSignInButton(){SignInButton.click();}

    public void clickLatest(){LatestLink.click();}

    public void clickLeather(){LeatherLink.click();}

    public void clickAddItem(){AddItemToBasket.click();}

    public void clickMiniCart(){MiniCartLink.click();}

    public void clickRemove(){RemoveLink.click();}

    public void clickOkButton(){OkayButton.click();}



}
