package Odevler.Gun06odevler;

import Ultils.BaseStaticDriver;
import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

public class Soru4 extends BaseStaticDriver {
    public static void main(String[] args) {
        driver.get("https://testpages.herokuapp.com/styled/index.html");

        WebElement calculate= driver.findElement(By.xpath("//*[@href='calculator']"));
        calculate.click();

        Bekle(2);
        WebElement ilk=driver.findElement(By.xpath("//input[@type='text'][1]"));
        ilk.sendKeys("3");

        Bekle(2);
        WebElement ikn=driver.findElement(By.xpath("//input[@type='text'][2]"));
        ikn.sendKeys("9");

        Bekle(2);
        WebElement bttn=driver.findElement(By.xpath("//input[@value='Calculate']"));
        bttn.click();

        Bekle(3);
        WebElement ans=driver.findElement(By.xpath("//*[@id='answer']"));
        System.out.println(ans.getText());

        BekleKapat();







        BekleKapat();
    }
}
