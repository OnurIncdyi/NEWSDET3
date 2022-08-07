package _01_SelenıumYoutube.LocatersAssert;

import Ultils.BaseStaticDriver;
import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

public class Ornek1 extends BaseStaticDriver {
    public static void main(String[] args) {

        driver.get("http://www.tutorialsninja.com/demo/index.php?route=common%2Fhome");

        WebElement myAccount= driver.findElement(By.xpath("//span[text()='My Account']"));
        myAccount.click();

        WebElement register=driver.findElement(By.xpath("//a[text()='Register']"));
        register.click();

        String isim="Onur";
        WebElement firstName=driver.findElement(By.cssSelector("#input-firstname"));
        firstName.sendKeys(isim);

        String soyisim="Incedayi";
        WebElement lastName= driver.findElement(By.cssSelector("[placeholder='Last Name']"));
        lastName.sendKeys(soyisim);

        String mail="Onur123456673@gmail.com";
        WebElement email= driver.findElement(By.name("email"));
        email.sendKeys(mail);

        String tel="5397186012";
        WebElement telPhone= driver.findElement(By.xpath("//input[@class='form-control' and @id='input-telephone']"));
        telPhone.sendKeys(tel);

        String pass="onur123";
        WebElement passb= driver.findElement(By.id("input-password"));
        passb.sendKeys(pass);

        WebElement confirm=driver.findElement(By.name("confirm"));
        confirm.sendKeys(pass);

        WebElement agree=driver.findElement(By.name("agree"));
        agree.click();

        WebElement continueOne=driver.findElement(By.cssSelector("input.btn-primary"));
        continueOne.click();

        String myMessage="Your Account Has Been Created!";
        Assert.assertEquals(myMessage,driver.getTitle());

        System.out.println("Hesabınız Başarıyla Oluşturuldu");








    }
}
