package _01_SelenıumYoutube.Alert;

import Ultils.BaseStaticDriver;
import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

public class Alert1 extends BaseStaticDriver {
    public static void main(String[] args) throws InterruptedException {
        driver.get("https://www.demo.guru99.com/test/delete_customer.php");

        WebElement customerid= driver.findElement(By.xpath("//input[@name='cusid']"));
        customerid.sendKeys("Onur");

        WebElement sumbitBtn=driver.findElement(By.xpath("//input[@name='submit']"));
        sumbitBtn.click();

        driver.switchTo().alert().accept();

        Assert.assertEquals("Customer Successfully Delete!",driver.switchTo().alert().getText());
        driver.switchTo().alert().accept();



        Thread.sleep(1000);

        BekleKapat();
    }
}
