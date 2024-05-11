package Bai6_WebElement;

import Bai5_Locator.XpathTuongDoi.BT_Locators;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.time.Duration;

public class Demo3ActionCheck {
    public static void main(String[] args) throws InterruptedException {
        //Khoi tao browser
        WebDriver driver;
        driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));

        // driver.get("https://anhtester.com");
//        WebElement tagH1 = driver.findElement(By.xpath("//h1[normalize-space()='Anh Tester Automation Testing']"));
//        tagH1.isDisplayed();
//        System.out.println(tagH1.isDisplayed());

        driver.get("https://crm.anhtester.com/admin/authentication");
        WebElement checkboxRemember = driver.findElement(By.xpath("//input[@id='remember']"));
        Thread.sleep(2000);

        if (checkboxRemember.isSelected() == false) {
            System.out.println("True");
        } else {
            System.out.println("False");

        }

        driver.findElement(By.xpath("//label[normalize-space()='Remember me']")).click();
        if (checkboxRemember.isSelected() == true) {
            System.out.println("True");
        } else {
            System.out.println("False");

        }
        driver.quit();

    }
}
