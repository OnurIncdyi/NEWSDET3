package Odevler.Gun06odevler;

import Ultils.BaseStaticDriver;
import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

public class Soru3 extends BaseStaticDriver {
    public static void main(String[] args) {
        driver.get("https://www.snapdeal.com/");

        WebElement usrnm= driver.findElement(By.xpath("//*[@class='col-xs-20 searchformInput keyword']"));
        usrnm.sendKeys("teddy bear");

        Bekle(2);
        WebElement srcbtn=driver.findElement(By.xpath("//*[@class='sd-icon sd-icon-search-under-catagory lfloat']"));
        srcbtn.click();

        Bekle(2);
        WebElement dgrlm= driver.findElement(By.xpath("//*[@class='nnn']"));

        Assert.assertTrue(dgrlm.getText().contains("teddy bear"));

        BekleKapat();
    }
}
