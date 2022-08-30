package Cucumber;


import io.cucumber.java.After;
import io.cucumber.java.Before;
import org.openqa.selenium.WebDriver;

public class Hooks {

    public static WebDriver driver;

    @Before
    public void beforeScenario(){
        //WebDriverManager.chromedriver().setup();
        //driver = new ChromeDriver();
        //driver.manage().window().maximize();
        //driver.get("https://magento2-demo.magebit.com/");
    }

    @After
    public void afterScenario(){
        //driver.close();
        //driver.quit();


    }

}
