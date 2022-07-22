package _01_SelenıumYoutube.ActionClass;

import Ultils.BaseStaticDriver;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;

import java.util.List;

public class ActionClass extends BaseStaticDriver {
    public static void main(String[] args) throws InterruptedException {
        driver.get("https://www.etsy.com/");

        Actions action=new Actions(driver);

        List<WebElement>menubars=driver.findElements(By.xpath("//ul[@role='menubar']//li"));

        for (WebElement menubar:menubars){
            System.out.println(menubar.getText());

            action.moveToElement(menubar).perform();
            Thread.sleep(2000);
        }




    }


}
