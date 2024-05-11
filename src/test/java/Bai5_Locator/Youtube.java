package Bai5_Locator;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import java.time.Duration;

public class Youtube {
    public static void main(String[] args) throws InterruptedException {
        //Khoi tao Browser
        //ChromDriver, EdgeDriver, FirefoxDriver
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));

        driver.get("https://youtube.com");
        driver.findElement(By.xpath("//div[@id='search-container']")).sendKeys("baby shark");

        //Thread.sleep(3000);

        driver.quit();


        ////button[@type='submit']
    }


}
