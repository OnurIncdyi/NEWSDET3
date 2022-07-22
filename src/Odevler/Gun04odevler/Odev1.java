package Odevler.Gun04odevler;

import Ultils.BaseStaticDriver;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

public class Odev1 extends BaseStaticDriver {
    public static void main(String[] args) {

        driver.get("https://demoqa.com/text-box");
        WebElement FullName=driver.findElement(By.id("userName"));
        FullName.sendKeys("Automation");
        FullName.click();

        WebElement userEmail=driver.findElement(By.id("userEmail"));
        userEmail.sendKeys("Testing@gmail.com");
        userEmail.click();

        WebElement currentAddress=driver.findElement(By.id("currentAddress"));
        currentAddress.sendKeys("Testing Current Address");
        currentAddress.click();

        WebElement permanentAddress=driver.findElement(By.id("permanentAddress"));
        permanentAddress.sendKeys("Testing Permanent Address");
        permanentAddress.click();

        WebElement submitButton = driver.findElement(By.id("submit"));
        submitButton.click();


        WebElement fullname=driver.findElement(By.id("name"));
        if  (fullname.getText().contains("Automation'"))
            System.out.println("Test Passed");
        else System.out.println("test failed");

        WebElement email=driver.findElement(By.id("email"));
        if (email.getText().contains("Testing@gmail.com"))
            System.out.println("Test Passed");
        else System.out.println("Test Failed");

        BekleKapat();

    }
}
