package Gun13;

import Ultils.BaseStaticDriver;
import org.openqa.selenium.Dimension;

import java.awt.*;

public class _04_WindowSize extends BaseStaticDriver {
    public static void main(String[] args) {

        driver.get("https://www.youtube.com/");
        driver.manage().window().maximize();
        Bekle(3);

        // Ekranı yeni olculere gore set etme
        Dimension dim=new Dimension(516,600);
        driver.manage().window().setSize(dim);

        Bekle(3);

        BekleKapat();


    }
}
