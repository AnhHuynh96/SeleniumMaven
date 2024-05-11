package Bai5_Locator;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;

import java.time.Duration;

public class LoginCMS {
    public static void main(String[] args) throws InterruptedException {
        //Khoi tao Browser
        //ChromDriver, EdgeDriver, FirefoxDriver
        WebDriver driver = new EdgeDriver();
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));

        //Open Website
        driver.get("https://cms.anhtester.com/login");
        //admin@example.com/123456

        //định vị các Element trên trang login CMS
        //1. ô email
        //driver.findElement(By.id("email")).sendKeys("admin@example.com");
        driver.findElement(By.xpath("/html/body/div/div/div/div/div/div/div/div/form/div[1]/input")).sendKeys("admin@example.com");

        //2. ô password
        driver.findElement(By.name("password")).sendKeys("123456");

        // 4. Link text forgot password
        driver.findElement(By.linkText("Forgot password ?")).click();
        //3. nút login
      //  driver.findElement(By.tagName("button")).click();

        Thread.sleep(3000);
        // Tắt browser
        driver.quit();



    }
}
