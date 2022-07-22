package Gun06;

import Ultils.BaseStaticDriver;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import org.junit.Assert;

import java.util.List;

public class _02_Soru extends BaseStaticDriver {
    public static void main(String[] args) {
        driver.get("https://www.saucedemo.com/ ");

        Bekle(1);
        WebElement u1=driver.findElement(By.xpath("//*[@id=\"user-name\"]"));
        u1.sendKeys("standard_user");

        Bekle(1);
        WebElement u2=driver.findElement(By.xpath("//*[@id=\"password\"]"));
        u2.sendKeys("secret_sauce");

        Bekle(1);
        WebElement u3=driver.findElement(By.xpath("//*[@id=\"login-button\"]"));
        u3.click();
        Bekle(1);
        //1.ürün
        WebElement u4=driver.findElement(By.xpath("//*[text()='Sauce Labs Backpack']"));
        u4.click();
        Bekle(1);
        WebElement addToCart= driver.findElement(By.xpath("//*[@name='add-to-cart-sauce-labs-backpack']"));
        addToCart.click();
        Bekle(1);
        WebElement backToButton=driver.findElement(By.xpath("//button[text()='Back to products']"));
        backToButton.click();

        //2.ürün
        WebElement boltTshirTextElement=driver.findElement(By.xpath("//div[text()='Sauce Labs Bolt T-Shirt']"));
        boltTshirTextElement.click();
        Bekle(1);
        WebElement addToCart2=driver.findElement(By.xpath("//*[@name='add-to-cart-sauce-labs-bolt-t-shirt']"));
        addToCart2.click();
        Bekle(1);
        WebElement sepet=driver.findElement(By.xpath("//*[@class='shopping_cart_link']"));
        sepet.click();
        Bekle(1);

        WebElement checkout=driver.findElement(By.xpath("//*[@name='checkout']"));
        checkout.click();
        Bekle(1);

        WebElement firstName=driver.findElement(By.xpath("//input[@placeholder='First Name']"));
        firstName.sendKeys("Onur");
        Bekle(1);
        WebElement lastNmae=driver.findElement(By.xpath("//input[@placeholder='Last Name']"));
        lastNmae.sendKeys("Incedayi");
        Bekle(1);
        WebElement zipCode=driver.findElement(By.xpath("//input[@name='postalCode']"));
        zipCode.sendKeys("34415");
        Bekle(1);
        WebElement btnContinue=driver.findElement(By.xpath("//*[@id='continue']"));
        btnContinue.click();
        Bekle(1);

        //(//*[@class='inventory_item_price'])[1]
        List<WebElement> ucretler=driver.findElements(By.xpath("//*[@class='inventory_item_price']"));

        double toplam=0;
        for(WebElement e: ucretler) {
            System.out.println("e.getText() = " + e.getText());
            toplam += Double.parseDouble(e.getText().substring(1));
        }
        System.out.println("toplam = " + toplam);

        // double çevirme işlemleri ayrı bir metod yardımıyla regex ile yapılacak
        WebElement webAltToplam=driver.findElement(By.xpath("//*[@class='summary_subtotal_label']"));
        System.out.println(webAltToplam.getText());
        double altToplam = Double.parseDouble(webAltToplam.getText().substring(13));
        System.out.println("altToplam = " + altToplam);

        if (toplam == altToplam)
            System.out.println("test passed");
        else
            System.out.println("test failed");


        Assert.assertTrue(toplam == altToplam);
        //Assert.assertEquals("merhaba", "merhaba1");

        BekleKapat();
    }
}
//*[@id="password"]