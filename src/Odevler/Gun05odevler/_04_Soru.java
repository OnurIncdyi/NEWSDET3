package Odevler.Gun05odevler;

import Ultils.BaseStaticDriver;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

public class _04_Soru extends BaseStaticDriver {
    public static void main(String[] args) {

        driver.get("https://testpages.herokuapp.com/styled/index.html");

        WebElement calculate= driver.findElement(By.cssSelector("div[class=page-body]>*:nth-child(15)>*:nth-child(7) a"));
        calculate.click();

        Bekle(2);
        WebElement ilk=driver.findElement(By.cssSelector("form>*:nth-child(1)"));
        ilk.sendKeys("5");

        Bekle(2);
        WebElement ikn=driver.findElement(By.cssSelector("form>*:nth-child(3)"));
        ikn.sendKeys("9");

        Bekle(2);
        WebElement bttn=driver.findElement(By.cssSelector("form>*:nth-child(4)"));
        bttn.click();

        Bekle(3);
        WebElement ans=driver.findElement(By.cssSelector("body>*:nth-child(4)"));
        System.out.println(ans.getText());

        BekleKapat();


    }
}
