package Bai6_WebElement;

import Bai5_Locator.XpathTuongDoi.BT_Locators;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import java.awt.*;
import java.time.Duration;

public class Demo6HamGet {
    public static void main(String[] args) throws InterruptedException {
        //Khoi tao browser
        WebDriver driver;
        driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));

        driver.get("https://crm.anhtester.com/admin/authentication");
        String headerPage = driver.findElement(By.xpath(BT_Locators.headerLoginPage)).getText();
        System.out.println("header" + headerPage);
        //Get Attribute de kiem tra xem data input vao co dung chua?
        driver.findElement(By.xpath(BT_Locators.inputEmail)).sendKeys("admin@example.com");
        driver.findElement(By.xpath(BT_Locators.inputPassword)).sendKeys("123456");
        Thread.sleep(2000);

        //Dimension dimension = driver.findElement(By.xpath(BT_Locators.buttonLogin))
        System.out.println("get value Email " + driver.findElement(By.xpath(BT_Locators.inputEmail)).getAttribute("value"));
        System.out.println("get value Password" + driver.findElement(By.xpath(BT_Locators.inputPassword)).getAttribute("value"));

        String buttonLoginColor = driver.findElement(By.xpath(BT_Locators.buttonLogin)).getCssValue("background-color");
        System.out.println("Color: " + buttonLoginColor);

        String buttonLoginAttribute = driver.findElement(By.xpath(BT_Locators.buttonLogin)).getAttribute("type");
        System.out.println("Get type of Login button " + buttonLoginAttribute);
        System.out.println("Get class of Login button " + driver.findElement(By.xpath(BT_Locators.buttonLogin)).getAttribute("class"));

        Thread.sleep(2000);
        driver.quit();

    }
}
