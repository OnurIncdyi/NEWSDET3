package Gun12;

import Ultils.BaseStaticDriver;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import java.util.List;
import java.util.Set;





/*
   1- https://www.selenium.dev/  sayfasına gidiniz
   2- Sayfadaki bütün yeni sayfa açan linkleri tıklatınız(mailto hariç)
   3- Açılan bütün yeni sayfaları teer teker kapatınız
 */

public class _03_WindowsClosing extends BaseStaticDriver {
    public static void main(String[] args) {

        driver.get("https://www.selenium.dev/");
        List<WebElement> linkler= driver.findElements(By.cssSelector("a[target='_blank']"));

        for (WebElement link:linkler)
        {
            if (!link.getAttribute("href").contains("mailto"))
                link.click();
        }
        Set<String> windowsIdler=driver.getWindowHandles();

        for (String id: windowsIdler) {

            System.out.println("id = " + id);
            driver.switchTo().window(id); // diğer sayfaya (windowa ) geçiş yaptk
            System.out.println(id+"Title = " +driver.getTitle()); // açık olan tum sayfaların win id ler

            driver.close();
        }

        Bekle(3);



    }
}
