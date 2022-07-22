package Gun07;

import Ultils.BaseStaticDriver;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

public class _02_ElamaninStatusu extends BaseStaticDriver {

    public static void main(String[] args) {
        driver.get("http://samples.gwtproject.org/samples/Showcase/Showcase.html#!CwCheckBox");

        WebElement sali= driver.findElement(By.id("gwt-debug-cwCheckBox-Tuesday-input"));

        System.out.println(sali.isDisplayed()); // yani görünüypr mu
        System.out.println(sali.isEnabled()); // yani aktif mi
        System.out.println(sali.isSelected()); // yani secili mi

        sali.click();
        Bekle(2);
        System.out.println(sali.isSelected());


        BekleKapat();
    }



}
