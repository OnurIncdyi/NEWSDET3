package Odevler.Gun07Odevler;

import Ultils.BaseStaticDriver;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Action;
import org.openqa.selenium.interactions.Actions;

public class Soru2 extends BaseStaticDriver {
    public static void main(String[] args) {


        driver.get("http://dhtmlgoodies.com/scripts/drag-drop-nodes/drag-drop-nodes.html");

        WebElement element= driver.findElement(By.id("node10"));
        WebElement element1=driver.findElement(By.id("box3"));

        Actions aksiyonlar=new Actions(driver);
        Action aksiyon=aksiyonlar.dragAndDrop(element,element1).build();
        aksiyon.perform();



    }
}
