package Gun04;

import Ultils.BaseStaticDriver;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

public class _05_FindingByLinkText extends BaseStaticDriver {
    public static void main(String[] args) {
        driver.get("https://www.hepsiburada.com/");

        WebElement element=driver.findElement(By.linkText("Siparişlerim"));
        System.out.println("element = " + element.getText());

        System.out.println("element.getAttribute(title) = " + element.getAttribute("title"));
        System.out.println("element.getAttribute(href) = " + element.getAttribute("href"));
        System.out.println("element.getAttribute(rel) = " + element.getAttribute("rel"));


        WebElement elemen2=driver.findElement(By.partialLinkText("Süper Fiyat")); // SADECE a tag lerinde çalışır
        System.out.println("elemen2.getText() = " + elemen2.getText());


        BekleKapat();
    }
}
