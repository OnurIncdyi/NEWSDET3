package Odevler.Gun04odevler;

import Ultils.BaseStaticDriver;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

public class Odev5 extends BaseStaticDriver {
    public static void main(String[] args) {
        driver.get("https://testpages.herokuapp.com/styled/index.html");
        Bekle(3);
        WebElement fakeAlerts1=driver.findElement(By.id("fakealerttest"));
        fakeAlerts1.click();
        Bekle(3);
        WebElement showAlerts=driver.findElement(By.id("fakealert"));
        showAlerts.click();
        Bekle(3);
        WebElement dialogOk=driver.findElement(By.id("dialog-ok"));
        dialogOk.click();

        BekleKapat();


    }
}
