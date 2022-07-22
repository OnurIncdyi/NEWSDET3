package Odevler.Gun06odevler;

import Ultils.BaseStaticDriver;
import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

public class Soru2 extends BaseStaticDriver {
    public static void main(String[] args) {
        driver.get("https://demo.applitools.com/");

        WebElement usarname=driver.findElement(By.xpath("//*[@placeholder='Enter your username']"));
        usarname.sendKeys("ttechno@gmail.com");

        WebElement password=driver.findElement(By.xpath("//*[@placeholder='Enter your password']"));
        password.sendKeys("techno123.");

        WebElement btn= driver.findElement(By.xpath("//*[@class='btn btn-primary']"));
        btn.click();

        WebElement brcn=driver.findElement(By.xpath("//*[text()='Your nearest branch closes in: 30m 5s']"));
        Assert.assertTrue(brcn.getText().contains("Your nearest branch closes in: 30m 5s"));






        BekleKapat();
    }
}
