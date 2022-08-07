package _02__Mentorıng.Soru1;

import Ultils.BaseStaticDriver;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

//  https://www.google.com/ sitesine gidin
//          2.    Search kısmına “Media Markt” yazın
//          3.    Google da arayın
//          4.    “Media Markt” sitesine tıklayın
//          5.    “Hesabım” butonuna tıkla
//          6.    Açılan menüde “Üye Ol” butonuna tıkla
//          7.    Üyelik formunu geçerli bilgilerle doldur
//          8.    “Hemen Üye Ol” butonuna tıkla
//          9.    Search kısmına “Laptop” yaz
//          10.    “Search” butonuna tıkla
//          11.    Açılan sayfada 1. Ürünün “İncele” butonuna tıkla
//          12.    Ürünün resimlerinde 3.süne tıkla
//          13.    “Sepete Ekle” butonuna tıkla
public class Senaryo2 extends BaseStaticDriver {
    public static void main(String[] args) throws InterruptedException {
        driver.get("https://www.google.com/");
        driver.manage().window().maximize();


     WebElement searchGoogle=   driver.findElement(By.xpath("//input[@class='gLFyf gsfi']"));
        searchGoogle.sendKeys("Media Markt");

        WebElement AraButton=driver.findElement(By.xpath("//div[@class='CqAVzb lJ9FBc']//input[@class='gNO89b']"));
        AraButton.click();

        WebElement mediaMarkt=driver.findElement(By.xpath("//a[@href='https://www.mediamarkt.com.tr/']"));
        mediaMarkt.click();

        WebElement hesabımBtn=driver.findElement(By.xpath("//span[@class='ms-dropdown__trigger']/Button"));
        hesabımBtn.click();

        Bekle(3);
        WebElement uyeOl=driver.findElement(By.xpath("(//ul[@class='ms-list']/li)[1]"));
        uyeOl.click();

        WebElement cinsiyetSec=driver.findElement(By.xpath("//input[@type='radio' and @value='Mr']"));
        cinsiyetSec.click();

        String isim="Onur";
        WebElement firstName=driver.findElement(By.xpath("//*[@name='firstName']"));
        firstName.sendKeys(isim);

        String soyAd="Ncdyi";
        WebElement lastName=driver.findElement(By.xpath("//*[contains(@name,'lastName')]"));
        lastName.sendKeys(soyAd);

        String cepNo="5397186015";
        WebElement phone=driver.findElement(By.xpath("//input[@name='phone2' or @id='phone2']"));
        phone.sendKeys(cepNo);

        String eMail="onur0@gmail.com";
        WebElement ePosta= driver.findElement(By.xpath("//*[@id='register-email']"));
        ePosta.sendKeys(eMail);

        String password="Deniz5241=43";
        WebElement passwordOne=driver.findElement(By.xpath("//*[@id='register-password']"));
        passwordOne.sendKeys(password);

        WebElement rePassword=driver.findElement(By.xpath("//*[@id='register-password-confirm']"));
        rePassword.sendKeys(password);

        Bekle(5);
        WebElement hemenUyeOlBtn=driver.findElement(By.xpath("//*[@id='my-account-register-submit']"));
        hemenUyeOlBtn.click();

        Bekle(2);
        WebElement searchLast=driver.findElement(By.xpath("//input[@name='query']"));
        searchLast.sendKeys("Laptop");

        Bekle(2);
        WebElement saerchBtnt=driver.findElement(By.xpath("//button[@class='ms-button2 ms-button2--search ms-button2--size_medium u--hidden-m-down ms-autosugestions__submit-input' and @data-identifier='searchButton']"));
        saerchBtnt.click();
        Bekle(2);
        WebElement ilkSira=driver.findElement(By.xpath("//a[@data-clickable-href='/tr/product/_matebook-d15-%C4%B1ntel-core-i5-1135g7-8gb-ram-512gb-ssd-15-6-w11-laptop-gri-1221731.html'and@data-gtm-event='EEC_PRODUCT_CLICK'][1]//span"));
        ilkSira.click();

        Bekle(2);
        WebElement ucuncuResim=driver.findElement(By.xpath("//img[@alt='HUAWEI Matebook D15/Intel Core i5-1135G7/8GB RAM/512GB SSD/15.6\"/W11 Laptop Gri'][1]"));
        ucuncuResim.click();

        Bekle(1);
        WebElement sepeteEkle=driver.findElement(By.xpath("//*[@id='pdp-add-to-cart']"));
        sepeteEkle.click();


        BekleKapat();

    }
}
