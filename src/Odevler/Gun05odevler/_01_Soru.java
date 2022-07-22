package Odevler.Gun05odevler;

import Ultils.BaseStaticDriver;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

public class _01_Soru extends BaseStaticDriver {
    public static void main(String[] args) {
        driver.get("https://demoqa.com/text-box");

        WebElement fullname=driver.findElement(By.cssSelector("[autocomplete='off']"));
        fullname.sendKeys("Automation");

        WebElement email=driver.findElement(By.cssSelector("[type='email'][placeholder='name@example.com']"));
        email.sendKeys("Testing@gmail.com");

        WebElement currentAdres=driver.findElement(By.cssSelector("[class='form-control']"));
        currentAdres.sendKeys("Testing Current Address");

        WebElement permantAddress=driver.findElement(By.cssSelector("[rows='5'][cols='20']"));
        permantAddress.sendKeys("Testing Permanent Address");

        WebElement sbmtBtn=driver.findElement(By.cssSelector("[id='submit']"));
        sbmtBtn.click();

        WebElement fullnm=driver.findElement(By.cssSelector("[id='name'][class='mb-1']" ));
        if (fullnm.getText().contains("Automation"))
            System.out.println("Test Passed");
        else System.out.println("Test Failed");

        WebElement email1=driver.findElement(By.cssSelector("[id='email'][class='mb-1'] "));
        if (email1.getText().contains("Testing@gmail.com"))
            System.out.println("Test Passed");
        else System.out.println("Test Failed");













    }
}
