package Gun14;

import Ultils.BaseStaticDriver;
import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;

/*
SCENARIO 1:
        -Navigate to "https://shopdemo.e-junkie.com/”
        -Click on 'Add to Cart' for 'Demo eBook'
        -Validate cart item no is '1'
        -Click on 'Remove' button to remove item from your cart
        -Click on 'Continue Shopping'
        -Validate cart item no is '0'
*/
public class Senaryo1 extends BaseStaticDriver {
    public static void main(String[] args) {
        driver.get("https://shopdemo.e-junkie.com/");

        Bekle(2);
        WebElement demoEbook=driver.findElement(By.xpath("//div[@class='thumbnail'and @style='background-image: url(https://s3.amazonaws.com/static.e-junkie.com/products/thumbnails/1595015.png); border-radius: 4px 4px 0px 0px;']"));
        demoEbook.click();

        WebElement sepeteEkle=driver.findElement(By.cssSelector("[class='g_btn']"));
        sepeteEkle.click();


        Bekle(5);
        driver.switchTo().frame(driver.findElement(By.cssSelector("[class='EJIframeV3 EJOverlayV3']")));

        Bekle(5);
        WebElement assertt=driver.findElement(By.cssSelector("[class='Product-Quantity-Value readOnly']"));
        System.out.println(assertt);


        WebElement cartItemNo_iFrame = driver.findElement(By.xpath("//div[@class='Fixed-Actions Desktop-Only']//span"));
        Assert.assertTrue(cartItemNo_iFrame.getText().contains("1"));

        BekleKapat();

    }
}
