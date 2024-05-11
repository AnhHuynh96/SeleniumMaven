package Bai7_WebDriver;

import Common.BaseTest;
import org.openqa.selenium.By;
import org.openqa.selenium.Cookie;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WindowType;
import org.openqa.selenium.edge.EdgeDriver;

import java.time.Duration;
import java.util.Set;

public class DemoSwitchtoNewWindow extends BaseTest {
    public static void main(String[] args) throws InterruptedException {
        createBrowser("edge");

        //Navigate to page
        driver.get("https://anhtester.com");
        String mainWindow = driver.getWindowHandle();
        System.out.println(mainWindow);

        driver.switchTo().newWindow(WindowType.TAB);
        driver.get("https://google.com");
        Thread.sleep(2000);
        driver.switchTo().window(mainWindow);
        Set<Cookie> cookies = driver.manage().getCookies();
        System.out.println();
        closeBrowser();
    }
}



