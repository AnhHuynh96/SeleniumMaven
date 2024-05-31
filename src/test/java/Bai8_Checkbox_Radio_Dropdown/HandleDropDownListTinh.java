package Bai8_Checkbox_Radio_Dropdown;

import Common.BaseTest;
import dev.failsafe.internal.util.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;

import java.util.List;

import static java.lang.Thread.sleep;

public class HandleDropDownListTinh extends BaseTest {
    public static void main(String[] args) throws InterruptedException {
        createBrowser();
        driver.get("https://demo.seleniumeasy.com/basic-select-dropdown-demo.html");
        //Handle Dropdown
        Select select = new Select(driver.findElement(By.xpath("//select[@id='select-demo']")));
        System.out.println(select.getFirstSelectedOption().getText());
        select.selectByVisibleText("Tuesday");
        //Kiem tra da chon dung hay chua
        System.out.println(select.getFirstSelectedOption().getText());
        //Assert.assertEquals(select.getFirstSelectedOption().getText(),"Tuesday"); So sanh 2 gia tri co bang nhau khong
        Thread.sleep(1000);
        select.selectByIndex(4); //Wednesday
        System.out.println(select.getFirstSelectedOption().getText());
        Thread.sleep(1000);
        select.selectByValue("Saturday");
        System.out.println(select.getFirstSelectedOption().getText());

        System.out.println("==============");
        Select selectMultiple = new Select(driver.findElement(By.xpath("//select[@id='multi-select']")));
        selectMultiple.selectByIndex(1);
        selectMultiple.selectByIndex(2);
        selectMultiple.selectByIndex(3);
        List<WebElement> listOptionMulti = selectMultiple.getAllSelectedOptions();
        for (WebElement element : listOptionMulti ){
            System.out.println(element.getText());
        }






        closeBrowser();
    }
}
