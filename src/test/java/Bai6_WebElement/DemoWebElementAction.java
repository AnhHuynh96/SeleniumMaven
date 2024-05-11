package Bai6_WebElement;

import Bai5_Locator.XpathTuongDoi.BT_Locators;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import java.time.Duration;

public class DemoWebElementAction {
    public static void main(String[] args) throws InterruptedException {
        //Khoi tao browser
        WebDriver driver;
        driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));

        driver.get("https://crm.anhtester.com/admin/authentication");
        //sendkeys,Click,Clear
        driver.findElement(By.xpath(BT_Locators.inputEmail)).clear();
        driver.findElement(By.xpath(BT_Locators.inputPassword)).clear();

        driver.findElement(By.xpath(BT_Locators.inputEmail)).sendKeys("admin@example.com");
        driver.findElement(By.xpath(BT_Locators.inputPassword)).sendKeys("123456");
        driver.findElement(By.xpath(BT_Locators.buttonLogin)).submit();
        Thread.sleep(2000);
        driver.quit();

    }
}
