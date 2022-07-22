package Odevler.Gun05odevler;

import Ultils.BaseStaticDriver;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

public class _02_Soru extends BaseStaticDriver {
    public static void main(String[] args) {
        driver.get("https://demo.applitools.com/");

        WebElement usarname=driver.findElement(By.cssSelector("form>*:nth-child(1) input'"));
        usarname.sendKeys("ttechno@gmail.com");

        WebElement password=driver.findElement(By.cssSelector("form>*:nth-child(2) input"));
        password.sendKeys("techno123.");

        WebElement btn= driver.findElement(By.cssSelector("form>*:nth-child(3) input"));
        btn.click();

        WebElement dgrl=driver.findElement(By.cssSelector("div[class='element-actions']+h6"));
        if (dgrl.getText().contains("Your nearest branch closes in: 30m 5s"))
            System.out.println("Test Passed");
        else System.out.println("Test Failed");


















        BekleKapat();
    }
}
