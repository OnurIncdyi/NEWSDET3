package Odevler.Gun07Odevler;

import Ultils.BaseStaticDriver;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Action;
import org.openqa.selenium.interactions.Actions;
import java.util.List;

public class Soru1 extends BaseStaticDriver {
    public static void main(String[] args) {

        driver.get("http://dhtmlgoodies.com/scripts/drag-drop-quiz/drag-drop-quiz-d2.html");

        List<WebElement> sehır = driver.findElements(By.cssSelector(".dragDropSmallBox[id^='a']"));
        List<WebElement> ulke = driver.findElements(By.cssSelector("div[class=\"destinationBox\"]"));

        for (WebElement ans : sehır) {
            for (WebElement que : ulke) {
                Actions act = new Actions(driver);
                act.moveToElement(ans).clickAndHold().perform();
                Bekle(1);
                Action a = act.release(que).build();
                a.perform();

                if (ans.getAttribute("class").contains("correctAnswer")) {
                    ulke.remove(que);
                    break;}
            }
        }
        BekleKapat();
    }
}
