package Bai7_WebDriver;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.edge.EdgeDriver;

import java.time.Duration;

public class DemoWebDriverBasic {
    public static void main(String[] args) throws InterruptedException {
        WebDriver driver = new EdgeDriver();
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
        driver.manage().timeouts().pageLoadTimeout(Duration.ofSeconds(10));
        // Navigate to a page
        driver.navigate().to("http://anhtester.com");
        driver.findElement(By.xpath("//a[@id='btn-login']")).click();
        Thread.sleep(1000);

       // Điều hướng về lịch sử trang trước đó
        driver.navigate().back();
      // Điều hướng đến trang tiếp sau
        driver.navigate().forward();
       // Làm mới trang hiện tại
        driver.navigate().refresh();



// Get the title of the page
        String title = driver.getTitle();
        System.out.println(title);
// Get the current URL
        String url = driver.getCurrentUrl();
        System.out.println(url);
// Get the current page HTML source
        String html = driver.getPageSource();
        //System.out.println(html);
        driver.quit();
    }
}
