package webdriver;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

public class Topic_05_Xpath_Technical {
    WebDriver driver;

    @BeforeClass
    public void beforeClass() {
        driver = new FirefoxDriver();

    }

    @Test
    public void TC_01() {
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

    @Test
    public void TC_02() {
        driver.get("https://live.techpanda.org/index.php/customer/account/login/");
        //Lấy xpath theo thẻ cha
        driver.findElement(By.xpath("//div[@class='footer']//a[@title='My Account']"));
        driver.findElement(By.xpath("//div[@id='header-account']//a[@title='My Account']"));
    }
    @Test
    public void TC_03() {
        driver.get("https://demo.nopcommerce.com/");
        //Lấy xpath theo thẻ cha
        driver.findElement(By.xpath("//ul[@class='top-menu mobile']//a[@href='/desktops']"));
        driver.findElement(By.xpath("//ul[@class='top-menu notmobile']//a[@href='/desktops']"));
        //Hàm lấy giá trị tuyệt đối trong Xpath
        driver.findElement(By.xpath("//ul[@class='top-menu notmobile']//a[text()='Desktops ']"));
        driver.findElement(By.xpath("//ul[@class='top-menu mobile']//a[text()='Desktops ']"));
        //Hàm lấy giá trị tương đối
        driver.findElement(By.xpath("//ul[@class='top-menu notmobile']//a[contains(text(),'Digital')]"));
        driver.findElement(By.xpath("//ul[@class='top-menu mobile']//a[contains(text(),'Digital')]"));
    }
    @Test
    public void TC_04() {
        driver.get("https://demo.nopcommerce.com/notebooks");
        //Hàm lấy các elements ngang hàng
        driver.findElement(By.xpath("(//button[text()='Add to cart'])[1]"));
        //Hàm lấy vị trí bằng hàm postion
        driver.findElement(By.xpath("(//button[text()='Add to cart'])[position()=2]"));
        //Hàm lấy giá trị cuối cùng bằng hàm last
        driver.findElement(By.xpath("(//button[text()='Add to cart'])[last()]"));
    }

    @AfterClass
    public void afterClass() {
        driver.quit();
    }

}
