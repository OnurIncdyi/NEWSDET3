package Gun08;

import Ultils.BaseStaticDriver;
import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

public class _06_AlertPart3 extends BaseStaticDriver {
    public static void main(String[] args) {
        driver.get("http://demo.seleniumeasy.com/javascript-alert-box-demo.html");

        WebElement clicme2= driver.findElement(By.cssSelector("[onclick='myPromptFunction()']"));
        clicme2.click();

        System.out.println(driver.switchTo().alert().getText()); // alert in texti alındı
        driver.switchTo().alert().sendKeys("onur");
        Bekle(2);
        driver.switchTo().alert().accept(); // Alert kutucuguna gecildi ve TAMAM butonuna basıldı
        Bekle(2);
      WebElement txtActual=driver.findElement(By.id("prompt-demo"));
        Assert.assertTrue(txtActual.getText().contains("onur"));

        Bekle(2);
        //kapattıgında sayfa donmuş oluyorsun
        BekleKapat();
    }

}
