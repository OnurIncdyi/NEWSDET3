package _02__Mentorıng.Soru1;

import Ultils.BaseStaticDriver;
import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Action;
import org.openqa.selenium.interactions.Actions;

public class Senaryo1 extends BaseStaticDriver {
    public static void main(String[] args) throws InterruptedException {
        driver.get("https://www.akakce.com/");

        WebElement anasyfaBtn=driver.findElement(By.cssSelector("div[class='g-4_v8']>a"));
        Assert.assertEquals("Akakce.com",anasyfaBtn.getText());

        WebElement hesapAc= driver.findElement(By.cssSelector("div[id='H_rl_v8'] a:first-child"));
        hesapAc.click();

        WebElement nameGir= driver.findElement(By.cssSelector("form input[name='rnufn']"));
        nameGir.sendKeys("Onur");

        WebElement soyadGir= driver.findElement(By.cssSelector("span>[name='rnufs']"));
        soyadGir.sendKeys("ncdyi");

        WebElement ePosta=driver.findElement(By.id("rnufe1"));
        ePosta.sendKeys("41a4kronur523879@gmail.com");

        WebElement ePostaTekrar= driver.findElement(By.id("rnufe2"));
        ePostaTekrar.sendKeys("41a4kronur523879@gmail.com");

        WebElement sifre=driver.findElement(By.cssSelector("label[for='rnufp1']+span>input"));
        sifre.sendKeys("Tempo52415241");

        WebElement sifreTekrar=driver.findElement(By.cssSelector("label[for='rnufp2']+span>input"));
        sifreTekrar.sendKeys("Tempo52415241");

        WebElement erkekClick=driver.findElement(By.cssSelector("[id='rngm']"));
        erkekClick.click();

        Bekle(3);
        WebElement ilSec=driver.findElement(By.cssSelector("[id='locpr'"));

        Actions aksiyonlar=new Actions(driver);
        Action aksiyon=aksiyonlar.moveToElement(ilSec).click().keyDown(Keys.DOWN).click().build();
        aksiyon.perform();

        WebElement ilceSec=driver.findElement(By.cssSelector("[id='locds']"));
        aksiyonlar.moveToElement(ilceSec).click().keyDown(Keys.DOWN).keyDown(Keys.DOWN).click().build().perform();

        Bekle(2);
        WebElement dogumGunu=driver.findElement(By.cssSelector("[id='bd']"));
        aksiyonlar.moveToElement(dogumGunu).click().keyDown(Keys.DOWN).keyDown(Keys.DOWN).keyDown(Keys.DOWN).keyDown(Keys.DOWN)
                .keyDown(Keys.DOWN).keyDown(Keys.DOWN).keyDown(Keys.DOWN).keyDown(Keys.DOWN).keyDown(Keys.DOWN).keyDown(Keys.DOWN)
                .keyDown(Keys.DOWN).keyDown(Keys.DOWN)
                .click().build().perform();

        WebElement dogumAy=driver.findElement(By.cssSelector("[id='bm']"));
        aksiyonlar.moveToElement(dogumAy).click().keyDown(Keys.DOWN).click().build().perform();

        WebElement dogumYili= driver.findElement(By.cssSelector("[id='by']"));
        aksiyonlar.moveToElement(dogumYili).click().keyDown(Keys.NUMPAD1).keyDown(Keys.NUMPAD9).click().build().perform();

        Bekle(1);
        WebElement kullanimSozlesmesi= driver.findElement(By.cssSelector("[id='rnufpca']"));
        kullanimSozlesmesi.click();

        WebElement enter= driver.findElement(By.cssSelector("[id='rfb']"));
        enter.click();

        Bekle(2);

        WebElement dogruMuHesap= driver.findElement(By.cssSelector("div[id='HM_v8'] a:first-child"));
        Assert.assertTrue(dogruMuHesap.getText().contains("Onur"));
      //  Assert.assertEquals("Onur",doğruMuHesap.getText());

        WebElement ustuneGel= driver.findElement(By.cssSelector("[id='H_a_v8'] "));
        ustuneGel.click();

        WebElement sonSiparislerim= driver.findElement(By.cssSelector("li[id='HM_p_v8'] a:first-child"));
        sonSiparislerim.click();

        WebElement siparislerim= driver.findElement(By.cssSelector("[class='order first']>a"));
        siparislerim.click();

        Bekle(2);

        WebElement dogrula=driver.findElement(By.cssSelector("div[class='no-record']"));
        Assert.assertTrue(dogrula.getText().contains("Kayıtlı siparişiniz bulunmuyor"));
        //Assert.assertEquals("Kayıtlı siparişiniz bulunmuyor.",dogrula);

        WebElement ustunegeliki= driver.findElement(By.cssSelector("#HM_v8>*:nth-child(1)>a"));
        ustunegeliki.click();

        WebElement mesajlarim= driver.findElement(By.cssSelector("li[class=\"order first\"]>:nth-of-type(2)"));
        mesajlarim.click();

        WebElement mesajDogrula= driver.findElement(By.cssSelector("div[class='wbb_v8'] p"));
        Assert.assertTrue(mesajDogrula.getText().contains("Listelenecek mesaj bulunamadı."));

        WebElement anaSayfa= driver.findElement(By.cssSelector("[id='H_l_v8'] "));
        anaSayfa.click();

        WebElement sicakFirsatlar= driver.findElement(By.cssSelector("#igSet>li:nth-of-type(2)"));
        sicakFirsatlar.click();

        WebElement tumFiyatlariGor= driver.findElement(By.cssSelector("#PLDgi_1>li:nth-child(5)>a[class='tfg']"));
        tumFiyatlariGor.click();

        WebElement saticiPuani= driver.findElement(By.cssSelector("div[id$=LM]>:nth-of-type(1)>a[href='https://www.akakce.com/oyun-kolu/en-ucuz-logitech-f710-kablosuz-pc-fiyati,421564.html?o=4']"));
        saticiPuani.click();


        BekleKapat();









    }
}
