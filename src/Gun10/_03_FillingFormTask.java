package Gun10;

import Ultils.BaseStaticDriver;
import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;

public class _03_FillingFormTask extends BaseStaticDriver
/*
Bu siteye gidiniz.  http://demo.seleniumeasy.com/ajax-form-submit-demo.html
        Name giriniz.
        Comment giriniz.
        Submit'e tıklayınız.
        Form submited Successfully! yazısı görüntülenmelidir.
        assert ile kontrol ediniz
 */{
    public static void main(String[] args) throws InterruptedException {

        driver.get("http://demo.seleniumeasy.com/ajax-form-submit-demo.html");
        WebElement name=driver.findElement(By.id("title"));
        name.sendKeys("Onur");

        WebElement commet= driver.findElement(By.id("description"));
        commet.sendKeys("Merhaba Arkadaslar");

        WebElement sbmtbtn= driver.findElement(By.id("btn-submit"));
        sbmtbtn.click();


        wait.until(ExpectedConditions.textToBe(By.id("submit-control"),"Form submited Successfully!"));

        WebElement truee=driver.findElement(By.id("submit-control"));
        Assert.assertEquals("Form submited Successfully!",truee.getText());





        BekleKapat();
    }
}
