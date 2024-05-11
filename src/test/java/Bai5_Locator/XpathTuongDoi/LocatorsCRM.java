package Bai5_Locator.XpathTuongDoi;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;

import java.time.Duration;

public class LocatorsCRM {
    public static void main(String[] args) throws InterruptedException {

        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));

        driver.get("https://crm.anhtester.com/admin/authentication");

        driver.findElement(By.xpath("//input[@id='email']")).sendKeys("admin@example.com");

        driver.findElement(By.xpath("//input[@id='password']")).sendKeys("123456");
        driver.findElement(By.xpath("//button[@type='submit']")).click();

        Thread.sleep(3000);
        driver.findElement(By.xpath("//span[normalize-space()='Customers']")).click();

        driver.findElement(By.xpath("//a[contains(normalize-space() ,'New Cus')]")).click();


        driver.findElement(By.xpath("//input[@id='company']")).sendKeys("Anh Test 123");

        //driver.findElement(By.xpath("//button[(contains(normalize-space() , 'Save and create'))]")).click();
        // O Vat number
        driver.findElement(By.xpath("//input[@id='vat']")).sendKeys("10");
        // O phone
        driver.findElement(By.xpath("//input[@name='phonenumber']")).sendKeys("0909123456");

        //label website
        driver.findElement(By.xpath("//label[normalize-space()='Website']"));

        //input website
        driver.findElement(By.xpath("//input[@id='website']")).sendKeys("https://anhtester.com/");

        //Address
        driver.findElement(By.xpath("//textarea[@id='address']")).sendKeys(" 01 Avenue");
         //City
        driver.findElement(By.xpath("//input[@id='city']")).sendKeys("Philla");
        //State
        driver.findElement(By.xpath("//input[@id='state']")).sendKeys("California");
        //zipcode
        driver.findElement(By.xpath("//input[@id='zip']")).sendKeys("343150");

        Thread.sleep(2000);
        //Save button
        //driver.findElement(By.xpath("//button[normalize-space()='Save and create contact']")).click();


        Thread.sleep(3000);

        driver.quit();

    }
}
