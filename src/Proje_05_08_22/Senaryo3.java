package Proje_05_08_22;

import Ultils.BaseStaticDriver;
import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;

public class Senaryo3 extends BaseStaticDriver {
    public static void main(String[] args) {
        driver.get("http://demowebshop.tricentis.com/");

        WebElement login=driver.findElement(By.linkText("Log in"));
        login.click();

        WebElement email=driver.findElement(By.id("Email"));
        email.sendKeys("technostudygrup16@gmail.com");

        WebElement password= driver.findElement(By.id("Password"));
        password.sendKeys("123456");

        WebElement loginBtn= driver.findElement(By.cssSelector("[class='button-1 login-button']"));
        loginBtn.click();

     //   wait.until(ExpectedConditions.visibilityOfElementLocated(By.id("input[onclick*='catalog/2/1/1']")));
        WebElement addToCart=driver.findElement(By.cssSelector("[onclick=\"AjaxCart.addproducttocart_catalog('/addproducttocart/catalog/2/1/1    ');return false;\"]"));
        addToCart.click();

        WebElement  recipientName = driver.findElement(By.id("giftcard_2_RecipientName"));
        recipientName.sendKeys("Hello Mello");

        WebElement recipientMail = driver.findElement(By.id("giftcard_2_RecipientEmail"));
        recipientMail.sendKeys("technostudygrup16@gmail.com");

        WebElement goToCart = driver.findElement(By.cssSelector("[class='ico-cart']"));
        goToCart.click();

        WebElement addToCartd = driver.findElement(By.cssSelector("input[id='add-to-cart-button-2']"));
        addToCartd.click();

        WebElement goToCartde = driver.findElement(By.cssSelector("[class='ico-cart']"));
        goToCartde.click();
        wait.until(ExpectedConditions.invisibilityOf(addToCart));

        WebElement CheckBoxClick=driver.findElement(By.id("termsofservice"));
        CheckBoxClick.click();


        WebElement CheckClickBox=driver.findElement(By.cssSelector("[id=\"checkout\"]"));
        CheckClickBox.click();


        WebElement companyName=driver.findElement(By.id("BillingNewAddress_Company"));
        companyName.sendKeys("TechnoStudy");

        WebElement countrySelect=driver.findElement(By.cssSelector("[value='77']"));
        countrySelect.click();

        WebElement city=driver.findElement(By.id("BillingNewAddress_City"));
        city.sendKeys("ISTANBUL");

        WebElement adressOne=driver.findElement(By.id("BillingNewAddress_Address1"));
        adressOne.sendKeys("levent");

        WebElement addressTwo=driver.findElement(By.id("BillingNewAddress_Address2"));
        addressTwo.sendKeys("besiktas");

        WebElement postCode=driver.findElement(By.id("BillingNewAddress_ZipPostalCode"));
        postCode.sendKeys("34415");

        WebElement phoneNumber=driver.findElement(By.id("BillingNewAddress_PhoneNumber"));
        phoneNumber.sendKeys("05051555555");

        WebElement faxNumber=driver.findElement(By.id("BillingNewAddress_FaxNumber"));
        faxNumber.sendKeys("25285258");

        Bekle(2);
        WebElement contineuOne=driver.findElement(By.cssSelector("[id='billing-buttons-container']>input"));
        contineuOne.click();
       // wait.until(ExpectedConditions.invisibilityOf(contineuOne));

        WebElement continueTwo=driver.findElement(By.cssSelector("[class='button-1 payment-method-next-step-button']"));
        continueTwo.click();
        wait.until(ExpectedConditions.invisibilityOf(continueTwo));

        WebElement continueThree=driver.findElement(By.cssSelector("[class='button-1 payment-info-next-step-button']"));
        continueThree.click();
        wait.until(ExpectedConditions.invisibilityOf(continueThree));

        WebElement confirmClick=driver.findElement(By.cssSelector("[class='button-1 confirm-order-next-step-button']"));
        confirmClick.click();
        wait.until(ExpectedConditions.invisibilityOf(confirmClick));

        WebElement assertLastOne=driver.findElement(By.cssSelector("[class='title']>strong"));
        Assert.assertTrue(assertLastOne.getText().contains("Your order has been successfully processed!"));

        BekleKapat();


//        WebElement cashOnPay=driver.findElement(By.id("paymentmethod_0"));
//        cashOnPay.click();
//        wait.until(ExpectedConditions.invisibilityOf(cashOnPay));
//
//        WebElement continueFour=driver.findElement(By.cssSelector("[class='button-1 payment-method-next-step-button']"));
//        continueFour.click();
//        wait.until(ExpectedConditions.invisibilityOf(continueFour));
//
//        WebElement continueFive=driver.findElement(By.cssSelector("button-1 payment-info-next-step-button"));
//        continueFive.click();
//        wait.until(ExpectedConditions.invisibilityOf(continueFive));














    }
}
