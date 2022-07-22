package Odevler.Gun06odevler;

import Ultils.BaseStaticDriver;
import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

public class Soru1 extends BaseStaticDriver {
    public static void main(String[] args) {
        driver.get("http://demoqa.com/text-box");

        Bekle(1);
        WebElement fullName=driver.findElement(By.xpath("//input[@placeholder='Full Name']"));
        fullName.sendKeys("Automation");

        Bekle(1);
        WebElement eMail=driver.findElement(By.xpath("//*[@class='mr-sm-2 form-control']"));
        eMail.sendKeys("Testing@gmail.com");

        WebElement crn= driver.findElement(By.xpath("//*[@placeholder='Current Address']"));
        crn.sendKeys("Testing Current Address");

        Bekle(1);
        WebElement currentAdres=driver.findElement(By.xpath("//*[@id='permanentAddress']"));
        currentAdres.sendKeys("Testing Permanent Address");

        Bekle(1);
        WebElement sbmtbtn=driver.findElement(By.xpath("//button[text()='Submit']"));
        sbmtbtn.click();

        WebElement autmtn=driver.findElement(By.xpath("//*[text()='Automation']"));
        WebElement emil= (WebElement) driver.findElements(By.xpath("//*[text()='Testing@gmail.com']"));

        Assert.assertTrue(autmtn.getText().contains("Automation"));
        Assert.assertTrue(emil.getText().contains("Testing"));


        BekleKapat();
    }
}
