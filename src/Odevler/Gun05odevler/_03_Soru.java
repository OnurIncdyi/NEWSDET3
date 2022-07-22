package Odevler.Gun05odevler;

import Ultils.BaseStaticDriver;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

public class _03_Soru extends BaseStaticDriver {
    public static void main(String[] args) {
        driver.get("https://www.snapdeal.com/");

        WebElement usrnm= driver.findElement(By.cssSelector("div[class=header_wrapper] input"));
        usrnm.sendKeys("teddy bear");

        Bekle(2);
        WebElement srcbtn=driver.findElement(By.cssSelector("[class='sd-icon sd-icon-search-under-catagory lfloat']"));
        srcbtn.click();

        Bekle(2);
        WebElement dgrlm= driver.findElement(By.cssSelector("[class='search-result-txt-section  marT12']"));
        if (dgrlm.getText().contains("results for 'teddy bear'"))
            System.out.println("Test Passed");
        else System.out.println("Test Failed");


        BekleKapat();

    }
}
