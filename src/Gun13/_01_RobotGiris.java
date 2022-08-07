package Gun13;

import Ultils.BaseStaticDriver;
import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.devtools.v85.indexeddb.model.Key;
import org.openqa.selenium.support.ui.ExpectedConditions;

import java.awt.*;
import java.awt.datatransfer.StringSelection;
import java.awt.event.KeyEvent;

public class _01_RobotGiris extends BaseStaticDriver {
    public static void main(String[] args) throws AWTException {
        driver.get("http://demo.guru99.com/test/upload/");

        //toDO: frame in varlığı kontrol edilip var ise veya yok ise her iki duruma göre çözüm yapılacak
//        driver.switchTo().frame(8);  //"gdpr-consent-notice"
//        WebElement acceptAll = wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//span[text()='Accept All']")));
//        //WebElement acceptAll = driver.findElement(By.xpath("//span[text()='Accept All']"));
//        acceptAll.click();
//        driver.switchTo().defaultContent();

        Robot rbt=new Robot();

        for(int i=0;i<13;i++) {
            rbt.keyPress(KeyEvent.VK_TAB); // tuşa basıldı  down
            rbt.keyRelease(KeyEvent.VK_TAB); // tuş bırakıldı up
            Bekle(1);
        }

        rbt.keyPress(KeyEvent.VK_ENTER); // tuşa basıldı  down
        rbt.keyRelease(KeyEvent.VK_ENTER); // tuş bırakıldı up

//         Stringi hafızaya-clipboard a kopyalama kodu
        StringSelection stringSelection = new StringSelection("C:\\Users\\onuri\\OneDrive\\Masaüstü");//         Stringi hafızaya-clipboard a kopyalama kodu

        Toolkit.getDefaultToolkit().getSystemClipboard().setContents(stringSelection , null);
        // Verilen stringi clipboard a set ediyor.

        Bekle(1);
        rbt.keyPress(KeyEvent.VK_CONTROL);
        rbt.keyPress(KeyEvent.VK_V);  // BU IKI TUS su anda basılmıs vaziyette, hafızdakı yapıştırıldı
        Bekle(1);
        rbt.keyRelease(KeyEvent.VK_CONTROL); // tuslar serbest bırakıldı
        rbt.keyRelease(KeyEvent.VK_V);

        for (int i=0;i<2;i++){ // 2 kere tab ile OPEN butonuna ulastık
            rbt.keyPress(KeyEvent.VK_TAB); // tusa basıldı down
            rbt.keyRelease(KeyEvent.VK_TAB); // tusa basıldı up
            Bekle(1);
        }
        rbt.keyPress(KeyEvent.VK_ENTER); // TUSA BASILDI DOWN // ENTER BASTIK ACILAN PENCERE KAPANDI
        rbt.keyPress(KeyEvent.VK_ENTER); // TUS BIRAKILDI UP

        WebElement submitButton=driver.findElement(By.id("submitbutton")); // submıt butonuna bastık
        submitButton.click();

        WebElement asser=wait.until(ExpectedConditions.visibilityOfElementLocated(By.id("res")));
        Assert.assertTrue(asser.getText().contains("has been successfully uploaded."));

        // garanti çözüm ama usttekini kullanın alttakı dırekt sayfada bu var mı dıye aratıyor
     //   Assert.assertTrue(driver.getPageSource().contains("has been successfully uploaded."));



        // uzun yontem
//        rbt.keyPress(KeyEvent.VK_TAB); // tuş bırakıldı up
//        Bekle(2);
//        rbt.keyPress(KeyEvent.VK_TAB); // tuşa basıldı
//        rbt.keyPress(KeyEvent.VK_TAB); // tuş bırakıldı up
//        Bekle(2);
//        rbt.keyPress(KeyEvent.VK_TAB); // tuşa basıldı
//        rbt.keyPress(KeyEvent.VK_TAB); // tuş bırakıldı up
//        Bekle(2);
//        rbt.keyPress(KeyEvent.VK_TAB); // tuşa basıldı
//        rbt.keyPress(KeyEvent.VK_TAB); // tuş bırakıldı up
//        Bekle(2);
//        rbt.keyPress(KeyEvent.VK_TAB); // tuşa basıldı
//        rbt.keyPress(KeyEvent.VK_TAB); // tuş bırakıldı up
//        Bekle(2);
//        rbt.keyPress(KeyEvent.VK_TAB); // tuşa basıldı
//        rbt.keyPress(KeyEvent.VK_TAB); // tuş bırakıldı up











        BekleKapat();
    }
}
