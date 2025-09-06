package webdriver;

import org.openqa.selenium.By;
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
        driver.get("https://live.techpanda.org/index.php/customer/account/login/");
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
    public void TC_01_ID() {
        //Cần tìm 1 element: findElement
        // Cần tìm nhiều element:findElements
        driver.findElement(By.id("email"));
        driver.findElement(By.id("search"));
    }
    @Test
    public void TC_02_Class() {
        //Class chỉ truyền vào một phần nếu có khoảng trắng
        //Có thể lấy hết nếu ko có khoảng trắng
        driver.findElement(By.className("validate-email"));
        driver.findElement(By.className("validate-password"));
    }
    @Test
    public void TC_03_Name() {
        driver.findElement(By.name("login[username]"));
        driver.findElement(By.name("login[password]"));
        driver.findElement(By.name("email"));
    }
    @Test
    public void TC_04_TagName() {
        //Thường dùng số nhiều, tìm ra bao nhiêu thẻ html giống nhau
        int inputNumber = driver.findElements(By.tagName("input")).size();
        System.out.println(inputNumber);
    }
    @Test
    public void TC_05_LinkText() {
        //Dùng với đường link
        //Tuyệt đối:lấy chính xác text
        driver.findElement(By.linkText("MY ACCOUNT"));
        driver.findElement(By.linkText("ORDERS AND RETURNS"));
        driver.findElement(By.linkText("SITE MAP"));

    }
    @Test
    public void TC_06_Partial_LinkText() {
        //Dùng với đường link
        //Tương đối:lấy một phần text
        driver.findElement(By.partialLinkText("ACCOUNT"));
        driver.findElement(By.partialLinkText("RETURNS"));
        driver.findElement(By.partialLinkText("SITE"));

    }
    @Test
    public void TC_07_Css() {
//Css format tagname[atribute='value']
        //Css voi ID
        driver.findElement(By.cssSelector("input[id='email']"));
        driver.findElement(By.cssSelector("#email"));
        driver.findElement(By.cssSelector("input#email"));
        //Css voi Class
        driver.findElement(By.cssSelector("div[class='account-login']"));
        driver.findElement(By.cssSelector(".account-login"));
        driver.findElement(By.cssSelector("div.account-login"));
        //Css voi Name
        driver.findElement(By.cssSelector("input[name='login[username]']"));
        //Css voi TagName
        driver.findElements(By.cssSelector("input"));
        //Css voi linkText
        driver.findElement(By.cssSelector("a[href='http://live.techpanda.org/index.php/customer/account/']"));
        //Css voi partialLink
        driver.findElement(By.cssSelector("a[href*='/customer/account/']"));
    }
    @Test
    public void TC_08_Xpath() {
//Xpath format //tagname[@atribute='value']
        //Xpath voi ID
        driver.findElement(By.xpath("//input[@id='email']"));
        //Xpath voi Class
        driver.findElement(By.xpath("//div[@class='account-login']"));
        //Xpath voi Name
        driver.findElement(By.xpath("//input[@name='login[username]']"));
        //Xpath voi TagName
        driver.findElements(By.xpath("//input"));
        //xpath voi linkText
        driver.findElement(By.xpath("//a[@href='http://live.techpanda.org/index.php/customer/account/']"));
        driver.findElement(By.xpath("//a[(text()= 'My Account')]"));
        //xpath voi partialLink
        driver.findElement(By.xpath("//a[contains(@href,'/customer/account/')]"));
        driver.findElement(By.xpath("//a[contains(text(),'My Account')]"));
      }

    @AfterClass
    public void afterClass() {
        driver.quit();
    }
}
