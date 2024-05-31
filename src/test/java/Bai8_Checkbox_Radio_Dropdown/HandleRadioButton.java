package Bai8_Checkbox_Radio_Dropdown;

import Common.BaseTest;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import java.util.List;

public class HandleRadioButton extends BaseTest {
    public static void main(String[] args) {
        createBrowser();
        driver.get("https://demo.seleniumeasy.com/basic-radiobutton-demo.html");
        boolean checkRadioMale = driver.findElement(By.xpath("//div[normalize-space()='Radio Button Demo']/following-sibling::div//input[@value='Male']")).isSelected();
        System.out.println("Male: " + checkRadioMale);

        boolean checkRadioFemale = driver.findElement(By.xpath("//div[normalize-space()='Radio Button Demo']/following-sibling::div//input[@value='Female']")).isSelected();
        System.out.println("Female: " + checkRadioFemale);
        //Click chon Male
        driver.findElement(By.xpath("//div[normalize-space()='Radio Button Demo']/following-sibling::div//input[@value='Male']")).click();

        boolean checkRadioMale1 = driver.findElement(By.xpath("//div[normalize-space()='Radio Button Demo']/following-sibling::div//input[@value='Male']")).isSelected();
        System.out.println("Check Male: " + checkRadioMale1);

        //Click chon Female
        driver.findElement(By.xpath("//div[normalize-space()='Radio Button Demo']/following-sibling::div//input[@value='Female']")).click();
        boolean checkRadioFemale2 = driver.findElement(By.xpath("//div[normalize-space()='Radio Button Demo']/following-sibling::div//input[@value='Female']")).isSelected();
        System.out.println("Check Female2: " + checkRadioFemale2);

        boolean checkRadioMale2 = driver.findElement(By.xpath("//div[normalize-space()='Radio Button Demo']/following-sibling::div//input[@value='Male']")).isSelected();
        System.out.println("Check Male2: " + checkRadioMale2);
        closeBrowser();
        //Handle multi radio
        //List<WebElement> listRadio = driver.findElements(By.xpath("//h4[normalize-space()='Age Group :']/following-sibling::label/input"));
        //System.out.println("Radio Total: " + listRadio.size());


        closeBrowser();
    }
}
