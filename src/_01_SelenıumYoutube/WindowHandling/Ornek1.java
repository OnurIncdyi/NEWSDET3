package _01_SelenıumYoutube.WindowHandling;

import Ultils.BaseStaticDriver;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import java.util.Set;

public class Ornek1 extends BaseStaticDriver {
    public static void main(String[] args) {

        driver.get("https://www.demo.guru99.com/popup.php");

        String firstWin=driver.getWindowHandle();
// ilk penceremi kaydettm
        String firstWinUrl=driver.getCurrentUrl();
        System.out.println("Baslangıc Pencerem = " + firstWinUrl);

        WebElement clickHere= driver.findElement(By.xpath("//a[text()='Click Here']"));
        clickHere.click();
// pencere değişimi için set kullandım
        Set<String>windowAllWindows=driver.getWindowHandles();
// wındowun parantez içine sıradakı pencereyı yazdırdım
        for (String window:windowAllWindows){
            driver.switchTo().window(window);
        }


        WebElement eMail= driver.findElement(By.xpath("//input[@name='emailid']"));
        eMail.sendKeys("onur99@gmail.com");

        WebElement btn= driver.findElement(By.xpath("//input[@name='btnLogin']"));
        btn.click();

        System.out.println("2.pencerenin Url"+driver.getCurrentUrl());

        //pencereyi kapatmak için drive close girdim
        driver.close();

        driver.switchTo().window(firstWin);
        System.out.println("şuan kı sayfanın url i "+driver.getCurrentUrl());

        //sistemi kapatmak için driver quit
        driver.quit();


    }
}
