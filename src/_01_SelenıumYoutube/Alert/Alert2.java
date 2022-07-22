package _01_SelenıumYoutube.Alert;

import Ultils.BaseStaticDriver;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import java.util.WeakHashMap;

public class Alert2 extends BaseStaticDriver {
    public static void main(String[] args) throws InterruptedException {
        driver.get("https://demo.automationtesting.in/Alerts.html");

        WebElement btn=driver.findElement(By.cssSelector(".btn.btn-danger"));
        btn.click();
        Thread.sleep(2000);
        driver.switchTo().alert().accept();

        WebElement iknbtn=driver.findElement(By.xpath("//*[contains(@href,'Cance')]"));
         iknbtn.click();


         WebElement btnbtn=driver.findElement(By.xpath("//*[@onclick='confirmbox()']"));
         btnbtn.click();

         driver.switchTo().alert().dismiss();



         BekleKapat();
    }
}
