package Gun13;

import Ultils.BaseStaticDriver;
import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebElement;

import java.io.File;
import java.io.IOException;
import java.util.List;

public class _02_ScreenRecord extends BaseStaticDriver {
    public static void main(String[] args) throws IOException {
        driver.get("https://opensource-demo.orangehrmlive.com/index.php/auth/validateCredentials");

        WebElement usarName=driver.findElement(By.id("txtUsername"));
        usarName.sendKeys("Ad4min");

        WebElement password=driver.findElement(By.id("txtPassword"));
        password.sendKeys("admin4123");

        WebElement btn=driver.findElement(By.id("btnLogin"));
        btn.click();

        List<WebElement> spanMessage=driver.findElements(By.id("spanMessege"));
        if (spanMessage.size()==0){ // login olamadın hata ekran goruntusunu saklayalım
            // hata ekranının ScreenShot ını alalım
            System.out.println("Login olamadı. Hata mesajı gozuktu");

            //Ekran görüntüsü alalım
            TakesScreenshot ts=(TakesScreenshot) driver; // 1.aşama ekran goruntusunu alma değişkeinni tanımladım
           File hafizadakiHali= ts.getScreenshotAs(OutputType.FILE); //2.Asama saklama tipi seçildi (Dosya), data(veritabanı) (Byte)
           // hafizakiHali -> dosya olarak (jpg,png,bmp) kaydedeceğiz
            FileUtils.copyFile(hafizadakiHali, new File("ekranGoruntuleri/LogınKontrol.png"));
            // hafızadakı ekran dosyasınını al bunu verdiğim yola ve isme kaydet
            // jpg,bmp,gif

            // TODO  : ODEV BURADAKI dosya adını zamana bağlı hale getırınız kı hep ustune kaydetmesın
            // mesala 2021052611202.jpg gibi






        }

        BekleKapat();

    }
}
