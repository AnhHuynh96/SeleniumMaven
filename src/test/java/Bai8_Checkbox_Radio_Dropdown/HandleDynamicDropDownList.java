package Bai8_Checkbox_Radio_Dropdown;

import Common.BaseTest;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;

import java.util.List;

public class HandleDynamicDropDownList extends BaseTest {
    public static void main(String[] args) throws InterruptedException {
        createBrowser("chrome");
        driver.get("https://crm.anhtester.com/admin/authentication");
        driver.findElement(By.xpath("//input[@id='email']")).sendKeys("admin@example.com");

        driver.findElement(By.xpath("//input[@id='password']")).sendKeys("123456");
        driver.findElement(By.xpath("//button[@type='submit']")).click();

        Thread.sleep(3000);
        driver.findElement(By.xpath("//span[normalize-space()='Customers']")).click();

        driver.findElement(By.xpath("//a[contains(normalize-space() ,'New Cus')]")).click();

        //dropdown dong
        driver.findElement(By.xpath("//label[normalize-space()='Groups']/following-sibling::div//button[@title='Nothing selected']")).click();
        driver.findElement(By.xpath("//button[@data-id='groups_in[]']/following-sibling::div//input[@aria-label='Search']")).sendKeys("VIP");
        driver.findElement(By.xpath("//button[@data-id='groups_in[]']/following-sibling::div//input[@aria-label='Search']")).sendKeys(Keys.ENTER);
        driver.findElement(By.xpath("//button[@data-id='groups_in[]']")).click();
        //dropdown dong
        driver.findElement(By.xpath("//button[@data-id='default_currency']")).click();
        driver.findElement(By.xpath("//button[@data-id='default_currency']/following-sibling::div//input[@aria-label='Search']")).sendKeys("USD");
        driver.findElement(By.xpath("//button[@data-id='default_currency']/following-sibling::div//input[@aria-label='Search']")).sendKeys(Keys.ENTER);

        //dropdown tinh
        Select select = new Select(driver.findElement(By.xpath("//select[@id='default_language']")));
        select.selectByValue("polish");
        System.out.println(select.getFirstSelectedOption().getText());
        closeBrowser();


    }
}










