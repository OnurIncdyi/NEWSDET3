package Gun12;

import Ultils.BaseStaticDriver;
import org.openqa.selenium.JavascriptException;
import org.openqa.selenium.JavascriptExecutor;

import java.security.spec.NamedParameterSpec;

public class _04_Scrollintro extends BaseStaticDriver {
    public static void main(String[] args) {
        driver.get("https://triplebyte.com/");

        // JavaScript komutlarını çalıştırmak ıcın once js degiskenı tanımladı
        JavascriptExecutor js=(JavascriptExecutor) driver;
        js.executeScript("window.scrollBy(0,1500)");



        Bekle(2);




    }
}
