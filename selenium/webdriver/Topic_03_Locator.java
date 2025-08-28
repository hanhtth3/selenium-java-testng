package webdriver;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

public class Topic_03_Locator {
    WebDriver driver;

    @BeforeClass
    public void beforeClass() {
        driver = new FirefoxDriver();
        driver.get("https://www.facebook.com/");
    }
//Tu selenium 1/2/3/4 deu co 8 loai locator
    //ID
    //Class/ClassName
    //Name
    //TagName
    //LinkText
    // Partial LinkText
    //CS Selecter(Corve toan bo 6 loai tren)
    //XPath (Cover ca 7 loai tren)
    @Test
    public void TC_01_Register() {

    }

    @Test
    public void TC_01_Login() {

    }

    @AfterClass
    public void afterClass() {
        driver.quit();
    }
}
