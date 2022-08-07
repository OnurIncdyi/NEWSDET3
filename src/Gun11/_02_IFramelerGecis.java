package Gun11;

import Ultils.BaseStaticDriver;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Action;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;

public class _02_IFramelerGecis extends BaseStaticDriver {
    public static void main(String[] args) {

        driver.get("https://chercher.tech/practice/frames");

        driver.switchTo().frame(0); //frame1

        WebElement input=driver.findElement(By.cssSelector("b[id='topic']~input"));
        input.sendKeys("Turkiye");

     //   driver.switchTo().parentFrame(); // geldiği yere geri dön (1 basamak geri git)
        driver.switchTo().defaultContent();// ilk ana sayfaya direk geri dön

        driver.switchTo().frame(1); //frame2
        WebElement avatar= driver.findElement(By.cssSelector("[id='animals']"));
        Select ddmenu=new Select(avatar);

        ddmenu.selectByIndex(ddmenu.getOptions().size()-1); // son elemanı sectık
        BekleKapat();
    }
}
//frame 0
//        >subframe 0
//        >subframe 1
//        frame 1
