package Bai5_Locator.XpathTuongDoi;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import java.time.Duration;

public class AddCustomer {
    public static void main(String[] args) throws InterruptedException {
        //Khoi tao Browser
        //ChromDriver, EdgeDriver, FirefoxDriver
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));

        driver.get("https://crm.anhtester.com/admin/authentication");

        driver.findElement(By.xpath("//input[@id='email']")).sendKeys("admin@example.com");

        driver.findElement(By.xpath("//input[@id='password']")).sendKeys("123456");
        driver.findElement(By.xpath("//button[@type='submit']")).click();
        driver.findElement(By.xpath("//span[normalize-space() = 'Customers']")).click();
        //Thread.sleep(3000);

        driver.quit();


        ////button[@type='submit']
    }


}
