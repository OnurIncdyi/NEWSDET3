package Gun08;

import Ultils.BaseStaticDriver;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

public class _05_AlertPart2 extends BaseStaticDriver {
    public static void main(String[] args) {


        driver.get("http://demo.seleniumeasy.com/javascript-alert-box-demo.html");

        WebElement clicme2= driver.findElement(By.cssSelector("[class='btn btn-default']"));
        clicme2.click();

        driver.switchTo().alert().dismiss(); // Alert kutucuguna gecildi ve CANCEL (İPTAL) butonuna basıldı
        Bekle(2);
        //kapattıgında sayfa donmuş oluyorsun
        BekleKapat();

    }
}
