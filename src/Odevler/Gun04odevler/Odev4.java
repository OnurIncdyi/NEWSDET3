package Odevler.Gun04odevler;

import Ultils.BaseStaticDriver;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

public class Odev4 extends BaseStaticDriver {
    public static void main(String[] args) {
        driver.get("https://testpages.herokuapp.com/styled/index.html");

        WebElement Calculate=driver.findElement(By.id("Calculate"));
        Calculate.sendKeys("Calculate");
        Calculate.click();

        WebElement number1=driver.findElement(By.id("number1"));
        number1.sendKeys("5");
        number1.click();

        WebElement number2=driver.findElement(By.id("number2"));
        number2.sendKeys("6");
        number2.click();

        WebElement CalculateButton=driver.findElement(By.id("Calculate"));
        CalculateButton.click();

        WebElement Answer=driver.findElement(By.id("answer"));
        System.out.println("Answer.getText() = " + Answer.getText());


        BekleKapat();












    }
}
