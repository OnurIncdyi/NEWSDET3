package Gun10;

import Ultils.BaseStaticDriver;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
/*
Senaryo
1-  https://www.demoblaze.com/index.html  siteyi açınız.
2- Samsung galaxy s6  linkine tıklayınız.
3- Sepete ekleyiniz.
4- Daha Sonra PRODUCT STORE yazısına tıklatarak ana ekrana geri dönününz
 */

public class _04_WaitSoru extends BaseStaticDriver {
    public static void main(String[] args) {
        driver.get("https://www.demoblaze.com/index.html");

        WebElement galaxy= driver.findElement(By.linkText("Samsung galaxy s6"));
        Bekle(2);
        galaxy.click();

        WebElement sepet= driver.findElement(By.linkText("Add to cart"));
        sepet.click();


        wait.until(ExpectedConditions.alertIsPresent());
        driver.switchTo().alert().accept();

        WebElement goBack= driver.findElement(By.id("nava"));
        goBack.click();


        BekleKapat();
    }
}
