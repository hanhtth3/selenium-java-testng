package webdriver;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.locators.RelativeLocator;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

public class Topic_04_Relactive_Locators {
    WebDriver driver;

    @BeforeClass
    public void beforeClass() {
       // driver = new FirefoxDriver();
        driver = new ChromeDriver();

    }
    @Test
    public void TC_01() {
        driver.get("https://demo.nopcommerce.com/login?returnUrl=%2F");
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

    @Test
    public void TC_02_() {
        driver.get("https://demo.nopcommerce.com/register?returnUrl=%2F");
        driver.findElement(By.xpath("//input[@id='gender-male']"));
        driver.findElement(By.xpath ("//input[@value='M']"));
        driver.findElement(By.xpath ("//input[@id='FirstName']"));
        driver.findElement(By.xpath ("//input[@name='LastName']"));
        driver.findElement(By.xpath ("//input[@name='Email']"));
        driver.findElement(By.xpath ("//input[@id='Company']"));
        driver.findElement(By.xpath ("//input[@id='Newsletter']"));
        driver.findElement(By.xpath ("//input[@id='Password']"));
        driver.findElement(By.xpath ("//input[@id='ConfirmPassword']"));
    }

    @AfterClass
    public void afterClass() {
        driver.quit();
    }




}
