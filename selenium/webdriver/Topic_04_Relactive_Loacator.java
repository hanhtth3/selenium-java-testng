package webdriver;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chromium.ChromiumDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.locators.RelativeLocator;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

public class Topic_04_Relactive_Locator {
    WebDriver driver;

    @BeforeClass
    public void beforeClass() {
       // driver = new FirefoxDriver();
        driver = new ChromeDriver();
        driver.get("https://demo.nopcommerce.com/login?returnUrl=%2F");
    }
    @Test
    public void TC_01() {
        WebElement rememberMeText = driver.findElement(RelativeLocator.with(By.tagName("label"))
                //Bên trên button Login
                .above(By.cssSelector("button.login-button"))
                //Bên dưới Password text box
                .below(By.id("Password"))
                //Bên phải Remember Me text box
                .toRightOf(By.id("RememberMe"))
                //Bên trái Forgot Password text box
                .toLeftOf(By.xpath("//a[text()='Forgot password?']")));

        System.out.println(rememberMeText.getText());


    }

    @AfterClass
    public void afterClass() {
        driver.quit();
    }




}
