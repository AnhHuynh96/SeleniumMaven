package Bai8_Checkbox_Radio_Dropdown;

import Common.BaseTest;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import java.util.List;

public class HandleCheckbox extends BaseTest {
    public static void main(String[] args) {
        createBrowser("edge");
        driver.get("https://demo.seleniumeasy.com/basic-checkbox-demo.html");

        //Kiem tra duoc chon hay chua
        boolean checkCheckbox1 = driver.findElement(By.xpath("//input[@id='isAgeSelected']")).isSelected();
        System.out.println(checkCheckbox1);
        //Click chon checkbox
        driver.findElement(By.xpath("//input[@id='isAgeSelected']")).click();
        //Kiem tra lai da chon hay chua
        boolean checkCheckbox1a = driver.findElement(By.xpath("//input[@id='isAgeSelected']")).isSelected();
        System.out.println(checkCheckbox1a);
        //check message
        boolean checkMessageDisplayed = driver.findElement(By.xpath("//div[@id='txtAge']")).isDisplayed();
        System.out.println(checkMessageDisplayed);
        System.out.println(driver.findElement(By.xpath("//div[@id='txtAge']")).getText());
        //Handle Multi checkbox
        //Cach 1
        List<WebElement> listCheckboxDefault = driver.findElements(By.xpath("//div[normalize-space()='Multiple Checkbox Demo']/following-sibling::div//input[@type='checkbox']"));
        for (int i = 0; i < listCheckboxDefault.size(); i++){
            System.out.println("Vi tri thu " + (i+1)  + ":" + listCheckboxDefault.get(i).isSelected());

        }
        System.out.println("==========");
        driver.findElement(By.xpath("//label[normalize-space()='Option 1']")).click();
        driver.findElement(By.xpath("//label[normalize-space()='Option 2']")).click();
        List<WebElement> listCheckboxAfter = driver.findElements(By.xpath("//div[normalize-space()='Multiple Checkbox Demo']/following-sibling::div//input[@type='checkbox']"));
        for (int i = 0; i < listCheckboxAfter.size(); i++){
            System.out.println("Vi tri thu " + (i+1)  + ":" + listCheckboxAfter.get(i).isSelected());

        }
        //Cach 2 dung truc tiep index voi doan Xpath cu the
        for (int i = 0; i < listCheckboxDefault.size(); i++) {
            System.out.println("===================");

            System.out.println("Vi tri thu " + (i + 1) + ":" + driver.findElement(By.xpath("(//div[normalize-space()='Multiple Checkbox Demo']/following-sibling::div//input[@type='checkbox'])[" + (i + 1) + "]")).isSelected());
        }

        closeBrowser();

    }
}
