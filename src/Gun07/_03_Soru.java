package Gun07;

import Ultils.BaseStaticDriver;
import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

public class _03_Soru extends BaseStaticDriver {
    public static void main(String[] args) {

        driver.get("https://www.facebook.com/");

        WebElement hspolstr= driver.findElement(By.cssSelector("[id^='u_0_0'] ")); // id nin sonu sürekli değiştiği için ile başlayan dedik
        hspolstr.click();

        WebElement ad=driver.findElement(By.cssSelector("[name='firstname']"));
        ad.sendKeys("onur");

        WebElement soyad=driver.findElement(By.cssSelector("[name='lastname']"));
        soyad.sendKeys("ncdy");

        WebElement reEmail= driver.findElement(By.name("reg_email_confirmation__"));
        Assert.assertFalse(reEmail.isDisplayed());

        WebElement email=driver.findElement(By.name("reg_email__"));
        email.sendKeys("leputard34@gmail.cm");

        Assert.assertTrue(reEmail.isDisplayed());










        BekleKapat();
    }
}
