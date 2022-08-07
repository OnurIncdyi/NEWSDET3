package Odevler.Gun12Odev;

import Ultils.BaseStaticDriver;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Action;
import org.openqa.selenium.interactions.Actions;

import java.util.List;

//1- https://www.youtube.com/ adresine gidiniz
//        2- "Selenium" kelimesi ile video aratınız.
//        3- Listelenen sonuçlarda 80 videoaya kadar lsiteyi uzatınız.
//        4- Son videonun title ını yazdırınız.
public class Odev1 extends BaseStaticDriver {
    public static void main(String[] args) {
        driver.get("https://www.youtube.com/");

        WebElement search = driver.findElement(By.cssSelector("[name='search_query']"));
        search.sendKeys("Selenium");
        Bekle(2);
        WebElement searchButton = driver.findElement(By.id("search-icon-legacy"));
        searchButton.click();
        JavascriptExecutor js=( JavascriptExecutor) driver;

        Bekle(2);
        js.executeScript("window.scrollBy(0,8000)");



        for (int i=0;i<80;i++){
            List<WebElement> linkler = driver.findElements(By.cssSelector("[class='yt-simple-endpoint style-scope ytd-video-renderer']er"));
            System.out.println(linkler.get(i).getText()+"\n");

            js.executeScript("arguments[0].scrollIntoView()",linkler);


        }
    }
}

