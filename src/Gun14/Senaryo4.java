package Gun14;

import Ultils.BaseStaticDriver;
import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
/*
        SENARYO 4:
        -"https://shopdemo.e-junkie.com/" web sitesine gidin
        -'Demo eBook' için 'Sepete Ekle'ye tıklayın
        -'Banka Kartı ile Öde' seçeneğine tıklayın
        -Fatura Ayrıntıları Formunu doldurun (sahte veri kullanın)
        -Kart numarasını "1111 1111 1111 1111" olarak giriniz
        -Doğrula "Geçersiz Kart Numarası" mesajı görüntüleniyor!*/

public class Senaryo4 extends BaseStaticDriver {
    public static void main(String[] args) throws InterruptedException {
        driver.get("https://shopdemo.e-junkie.com/");

        Bekle(2);
        WebElement demoEbook=driver.findElement(By.xpath("//div[@class='thumbnail'and @style='background-image: url(https://s3.amazonaws.com/static.e-junkie.com/products/thumbnails/1595015.png); border-radius: 4px 4px 0px 0px;']"));
        demoEbook.click();

        WebElement sepeteEkle=driver.findElement(By.cssSelector("[class='g_btn']"));
        sepeteEkle.click();

//        driver.switchTo().frame(driver.findElement(By.cssSelector("[class='EJIframeV3 EJOverlayV3']")));
        driver.switchTo().frame(3);

        Bekle(4);
        WebElement bankaKarti=driver.findElement(By.cssSelector("[class='Payment-Button CC']"));
        bankaKarti.click();
        Bekle(2);
        WebElement odeBtn=driver.findElement(By.cssSelector("[class='Pay-Button']"));
        odeBtn.click();
        Bekle(1);
        String eMailString="Proje13@gmail.com";
        WebElement eMail= driver.findElement(By.cssSelector("[placeholder='Email']"));
        eMail.sendKeys(eMailString);
        Bekle(1);
        WebElement emailTekrar= driver.findElement(By.cssSelector("[placeholder='Confirm Email']"));
        emailTekrar.sendKeys(eMailString);
        Bekle(1);
        WebElement name=driver.findElement(By.cssSelector("[placeholder='Name On Card']"));
        name.sendKeys("Grup16");
        Bekle(1);

        driver.switchTo().frame(2);

        Bekle(2);
        WebElement cardNumber=driver.findElement(By.cssSelector("[class='InputElement is-empty Input Input--empty'][autocomplete='cc-number']"));
        cardNumber.sendKeys("1111 1111 1111 1111");
        Bekle(3);
        driver.switchTo().defaultContent();

        Bekle(3);
        driver.switchTo().frame(4);
//        driver.switchTo().frame(driver.findElement(By.cssSelector("iframe[name*=__privateStripeFrame][title='Güvenli kart ödeme giriş çerçevesi']")));

//        WebElement assertOne= driver.findElement(By.xpath("//*[@id=\"SnackBar\"]/span"));
//        Assert.assertTrue(assertOne.getText().contains("Invalid Billing Name"));
//        Assert.assertEquals("Kart numaranız geçersiz.",assertOne.getText());
//        Assert.assertTrue(driver.getPageSource().contains("Kart numaranız geçersiz."));

//        WebElement assertOneb=wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//*[@id=\"SnackBar\"]/span")));
//        Assert.assertTrue(assertOneb.getText().contains("Kart numaranız geçersiz."));

        wait.until(ExpectedConditions.visibilityOfElementLocated(By.cssSelector("[id='SnackBar']>span")));
     WebElement  assertOne= wait.until(ExpectedConditions.visibilityOfElementLocated(By.cssSelector("[id='SnackBar']>span")));
        Assert.assertEquals(assertOne.getText(),"Kart numaranız geçersiz.");


        Thread.sleep(3000);
        BekleKapat();

        // son doğrulama kısmı kaldı

    }
}
