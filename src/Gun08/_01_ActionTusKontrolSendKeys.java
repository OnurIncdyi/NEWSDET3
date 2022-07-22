package Gun08;

import Ultils.BaseStaticDriver;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Action;
import org.openqa.selenium.interactions.Actions;

public class _01_ActionTusKontrolSendKeys extends BaseStaticDriver {
    public static void main(String[] args) {
        driver.get("https://demoqa.com/auto-complete");

        WebElement element=driver.findElement(By.id("autoCompleteSingleInput"));

        Actions aksiyonlar=new Actions(driver);

        Action aksiyon=aksiyonlar
                .moveToElement(element) //kutuca gittim
                .click() // icine tıklattım
                .keyDown(Keys.SHIFT) // SHIFT tusuna bastım
                .sendKeys("a")// kucuk a harfini gonderdim fakat SHIFT basılı oldugu ıcın A gorulmelı
                .keyUp(Keys.SHIFT)// SHIFT tusunda elımızı kaldırıyoruz
                .sendKeys("hmet") // kalanı
                .build();


        BekleKapat();
    }
}
