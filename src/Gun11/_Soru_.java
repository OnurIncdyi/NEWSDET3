package Gun11;
//
//import Ultils.BaseStaticDriver;
//import org.junit.Assert;
//import org.openqa.selenium.By;
//import org.openqa.selenium.WebElement;
//import org.openqa.selenium.support.ui.WebDriverWait;
//
//import java.time.Duration;
//
///*
//    Senaryo
//    1- https://testsheepnz.github.io/BasicCalculator.html sitesine gidiniz.
//    2- random 100 e kadar 2 sayı üretiniz.
//    3- Sayıları hesap makinesinin bütün fonksiyonları için çalıştırınız.
//    4- Sonuçları Assert ile kontrol ediniz.
//    5- Yukarıdaki işlemi 5 kez tekrar ettiriniz.
// */
//
//public class _Soru_ extends BaseStaticDriver {
//
//    public static int main(String[] args) {
//
//
//        driver.get("https://testsheepnz.github.io/BasicCalculator.html");
//        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(15));
//
//        for (int i = 0; i < 5; i++) {
//            {
//
//                WebElement firstNumber = driver.findElement(By.id("number1Field"));
//                firstNumber.click();
//
//                firstNumber.sendKeys("" + randomSayi());
//                WebElement secondNumber = driver.findElement(By.id("number2Field"));
//                secondNumber.sendKeys("" + randomSayi());
//
//                WebElement add = driver.findElement(By.cssSelector("[id='selectOperationDropdown']>option[value='0']"));
//                add.click();
//                WebElement brna = driver.findElement(By.id("calculateButton"));
//                Bekle(3);
//                brna.click();
//                WebElement result = driver.findElement(By.cssSelector("#numberAnswerField"));
//                int expectedResult = Integer.parseInt(result.getAttribute("value"));
//                Assert.assertEquals(add, expectedResult);
//
//            }
//            {
//                WebElement subtract = driver.findElement(By.cssSelector("[id='selectOperationDropdown']>option[value='1']"));
//                subtract.click();
//                WebElement brn = driver.findElement(By.id("calculateButton"));
//                Bekle(3);
//                brn.click();
//            }
//            {
//                WebElement multiply = driver.findElement(By.cssSelector("[id='selectOperationDropdown']>option[value='2']"));
//                multiply.click();
//                WebElement brnt = driver.findElement(By.id("calculateButton"));
//                Bekle(3);
//                brnt.click();
//            }
//            {
//                WebElement divide = driver.findElement(By.cssSelector("[id='selectOperationDropdown']>option[value='3']"));
//                divide.click();
//                WebElement brndt = driver.findElement(By.id("calculateButton"));
//                Bekle(3);
//                brndt.click();
//            }
//        }
//        WebElement concatenate = driver.findElement(By.cssSelector("[id='selectOperationDropdown']>option[value='4']"));
//        concatenate.click();
//        WebElement brndtd = driver.findElement(By.id("calculateButton"));
//        Bekle(3);
//        brndtd.click();
//
//        {
//        }





//         WebElement sonuclar=driver.findElement(By.id("selectOperationDropdown"));

//        Actions aksiyonlar=new Actions(driver);
//        Action aksiyon=aksiyonlar.moveToElement(sonuclar).click().keyDown(Keys.DOWN).click().build();
//        aksiyon.perform();
//        Bekle(3);
//        WebElement brn=driver.findElement(By.id("calculateButton"));
//        Bekle(3);
//        brn.click();
//
//        Bekle(5);
//        aksiyonlar.moveToElement(sonuclar).click().keyDown(Keys.DOWN).click().build();
//        aksiyonlar.perform();
//        Bekle(3);
//        WebElement brnt=driver.findElement(By.id("calculateButton"));
//        brnt.click();

//        Bekle(3);
//        aksiyonlar.moveToElement(sonuclar).click().keyDown(Keys.DOWN).keyDown(Keys.DOWN).keyDown(Keys.DOWN).build().perform();
//        WebElement brntd=driver.findElement(By.id("calculateButton"));
//        brntd.click();