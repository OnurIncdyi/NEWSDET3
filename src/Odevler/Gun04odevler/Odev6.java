package Odevler.Gun04odevler;

import Ultils.BaseStaticDriver;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

public class Odev6 extends BaseStaticDriver {
    public static void main(String[] args) {
        driver.get("https://testpages.herokuapp.com/styled/index.html");
        Bekle(3);
        WebElement fakeAlerts1=driver.findElement(By.id("fakealerttest"));
        fakeAlerts1.click();

        Bekle(3);
        WebElement showModal=driver.findElement(By.id("modaldialog"));
        showModal.click();
        Bekle(3);
        WebElement dialogok=driver.findElement(By.id("dialog-ok"));
        dialogok.click();

        BekleKapat();



    }
}
