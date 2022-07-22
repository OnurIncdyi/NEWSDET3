package Gun08;

import Ultils.BaseStaticDriver;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

public class _04_IntroAlert extends BaseStaticDriver {
    public static void main(String[] args) {
        /*
      Interview sorusu
      - Alertleri nasıl kullanırsın ?

      driver.switch().alert() bunula kullanırım.

      komutları;
      accept -> OK, TAMAM butonuna basmamızı sağlıyor.
      dismiss -> CANCEL, HAYIR yani olumsuz butonuna basmamızı sağlıyor.
      gettext -> alertin mesajını alıyoruz.
      SendKeys -> prompt(Alertin giriş kutusu olan hali) , yazı gönderiyoruz.
 */

        driver.get("http://demo.seleniumeasy.com/javascript-alert-box-demo.html");

        WebElement clicme1= driver.findElement(By.cssSelector("[class='btn btn-default']"));
        clicme1.click();

        driver.switchTo().alert().accept(); // Alert kutucuguna gecildi ve TAMAMM butonuna basıldı
        Bekle(2);
        //kapattıgında sayfa donmuş oluyorsun
        BekleKapat();


    }
}
