package Gun07;

import Ultils.BaseStaticDriver;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

public class _01_GetAttributeGetCssValue extends BaseStaticDriver {
    public static void main(String[] args) {
        driver.get("https://www.snapdeal.com/");

        WebElement inputValueEnter= driver.findElement(By.id("inputValEnter"));

        System.out.println(inputValueEnter.getAttribute("name"));
        System.out.println(inputValueEnter.getAttribute("type"));
        System.out.println(inputValueEnter.getAttribute("class"));

        System.out.println(inputValueEnter.getCssValue("color"));
        System.out.println(inputValueEnter.getCssValue("background"));
        System.out.println(inputValueEnter.getCssValue("font-size"));
        System.out.println(inputValueEnter.getCssValue("height"));





        BekleKapat();
    }
}
