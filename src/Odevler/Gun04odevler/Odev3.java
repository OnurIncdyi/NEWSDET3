package Odevler.Gun04odevler;

import Ultils.BaseStaticDriver;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

public class Odev3 extends BaseStaticDriver {
    public static void main(String[] args) {
        driver.get("https://www.snapdeal.com/");

        WebElement search=driver.findElement(By.id("inputValEnter"));
        search.sendKeys("teddy bear");

        WebElement searchButton=driver.findElement(By.className("searchTextSpan"));
        searchButton.click();

        WebElement confirm=driver.findElement(By.className("nnn"));

        if (confirm.getText().contains("results for 'teddy bear'"))
            System.out.println("Test Passed");
        else System.out.println("test failed");

        BekleKapat();
    }
}
