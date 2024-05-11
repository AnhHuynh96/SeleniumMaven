package Bai7_WebDriver;

import Bai5_Locator.XpathTuongDoi.BT_Locators;
import Common.BaseTest;
import org.openqa.selenium.By;
import org.openqa.selenium.Cookie;

import java.util.Set;

public class DemoCookies extends BaseTest {
    public static void main(String[] args) {
        createBrowser();
        driver.get("https://crm.anhtester.com/admin/authentication");


        driver.findElement(By.xpath(BT_Locators.inputEmail)).sendKeys("admin@example.com");
        driver.findElement(By.xpath(BT_Locators.inputPassword)).sendKeys("123456");
        driver.findElement(By.xpath(BT_Locators.buttonLogin)).submit();
        Set<Cookie> cookies = driver.manage().getCookies();
        System.out.println(cookies.iterator().next().toString());
        closeBrowser();
    }
}
