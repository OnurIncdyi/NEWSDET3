package Odevler.Gun04odevler;

import Ultils.BaseStaticDriver;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

public class Odev2 extends BaseStaticDriver {
    public static void main(String[] args) {
       driver.get("https://demo.applitools.com/");
       WebElement usarName1=driver.findElement(By.id("username"));
       usarName1.sendKeys("ttechno@gmail.com");
       usarName1.click();

       WebElement password=driver.findElement(By.id("password"));
       password.sendKeys("techno123.");
       password.click();

       WebElement signIn=driver.findElement(By.id("log-in"));
       signIn.click();

       WebElement time=driver.findElement(By.id("time"));
       if (time.getText().contains("Your nearest branch closes in: 30m 5s"))
           System.out.println("Test Passed");
       else System.out.println("Test Failed");

       BekleKapat();




    }
}
