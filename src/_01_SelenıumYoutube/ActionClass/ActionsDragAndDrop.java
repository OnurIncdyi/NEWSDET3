package _01_SelenıumYoutube.ActionClass;

import Ultils.BaseStaticDriver;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;

public class ActionsDragAndDrop extends BaseStaticDriver {
    public static void main(String[] args) {
        driver.get("http://www.dhtmlgoodies.com/scripts/drag-drop-custom/demo-drag-drop-3.html");



        //Baskentler

        WebElement oslo= driver.findElement(By.id("box1"));
        WebElement washington= driver.findElement(By.id("box3"));
        WebElement copenghan= driver.findElement(By.id("box4"));
        WebElement madrid= driver.findElement(By.id("box7"));
        WebElement stockholm= driver.findElement(By.id("box2"));
        WebElement rome= driver.findElement(By.id("box6"));
        WebElement seul= driver.findElement(By.id("box5"));



        // Ulkeler
        WebElement italy=driver.findElement(By.id("box106"));
        WebElement spain=driver.findElement(By.id("box107"));
        WebElement norway=driver.findElement(By.id("box101"));
        WebElement denmark=driver.findElement(By.id("box104"));
        WebElement south=driver.findElement(By.id("box105"));
        WebElement sweden=driver.findElement(By.id("box102"));
        WebElement unitedstates=driver.findElement(By.id("box103"));

        Actions actions=new Actions(driver);

        actions.dragAndDrop(rome,italy).build().perform();
        actions.dragAndDrop(seul,south).build().perform();
        actions.dragAndDrop(stockholm,sweden).build().perform();
        actions.dragAndDrop(oslo,norway).build().perform();
        actions.dragAndDrop(madrid,spain).build().perform();
        actions.dragAndDrop(copenghan,denmark).build().perform();
        actions.dragAndDrop(washington,unitedstates).build().perform();



        BekleKapat();
    }
}
