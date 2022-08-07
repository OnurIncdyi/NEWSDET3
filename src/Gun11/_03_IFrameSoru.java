package Gun11;

import Ultils.BaseStaticDriver;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;

public class _03_IFrameSoru extends BaseStaticDriver {
    /*
   1-driver.get("http://chercher.tech/practice/frames"); sayfasına gidiniz.
   2-Inputa ülke adı yazınız
   3-CheckBox ı çekleyiniz.
   4-Select in 4.elemanını seçiniz.
 */
    public static void main(String[] args) {

        driver.get("http://chercher.tech/practice/frames");


        //2-Inputa ülke adı yazınız
        driver.switchTo().frame(0); // frame1
        WebElement input= driver.findElement(By.cssSelector("b[id='topic']~input"));
        input.sendKeys("Turkey");

        WebElement chechbox= driver.findElement(By.id("a"));
        chechbox.click();

        driver.switchTo().parentFrame(); // şu anda frame 1 geri geldim
        driver.switchTo().parentFrame(); // şu anda ana sayafaya geri geldim

     //   driver.switchTo().defaultContent(); veya direkt ana sayfaya geri geldim

        driver.switchTo().frame(1); //frame2

        //4- Select in 4.elemanı seçiniz
        driver.switchTo().frame(1);// frame2

        WebElement menu=driver.findElement(By.id("animals"));
        Select ddMenu=new Select(menu); // drop down
        ddMenu.selectByIndex(3); //4.eleman yani 3 indexli eleman secildi

        BekleKapat();

    }
}
