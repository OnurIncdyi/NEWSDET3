package Odevler.Gun13Odev;

import Ultils.BaseStaticDriver;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.devtools.v85.indexeddb.model.Key;

import java.awt.*;
import java.awt.event.KeyEvent;

//        kod ile Browser'
//        da iki tane boş tab açıyorsun, Bu tabların birinde twitter diğerinde instagram sayfalarını açıyorsun

public class Odev1 extends BaseStaticDriver {
    public static void main(String[] args) throws AWTException {

        driver.get("https://twitter.com/");
        String anaSayfaWindowId=driver.getWindowHandle(); // bulundugun sayfanın wın ıd sı
        Robot rbt=new Robot();
        rbt.keyPress(KeyEvent.VK_CONTROL);
        rbt.keyPress(KeyEvent.VK_T);






























    }
}
