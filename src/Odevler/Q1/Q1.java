//package Q1;
//
//import Ultils.BaseStaticDriver;
//import Utils.BaseStaticDriver;
//import org.openqa.selenium.By;
//import org.openqa.selenium.WebElement;
//import org.openqa.selenium.interactions.Action;
//import org.openqa.selenium.interactions.Actions;
//
//import java.util.Arrays;
//import java.util.List;
//
//import static Ultils.BaseStaticDriver.*;
//
//public class Q1 extends BaseStaticDriver {
//
//    public static void main(String[] args) {
//
//        driver.get("http://dhtmlgoodies.com/scripts/drag-drop-quiz/drag-drop-quiz-d2.html");
//
//        Bekle(10);
//        List<WebElement> answer = driver.findElements(By.cssSelector("div[id^=\"a\"] div"));
//        List<WebElement> question = driver.findElements(By.cssSelector("div[class=\"destinationBox\"]"));
//
//        for (WebElement ans : answer
//        ) {
//
//            System.out.println(ans.getText());
//
//            Bekle(3);
//
//            /// 1. for
//            for (WebElement que : question
//            ) {
//
//                Actions act = new Actions(driver);
//
//
//                act.moveToElement(ans).clickAndHold().perform();
//                Bekle(1);
//
//                Action a = act.release(que).build();
//                a.perform();
//
//
//                if (ans.getAttribute("class").contains("correctAnswer")) {
//                    question.remove(que);
//                    break;
//                }
//
//                //// 2. for
//            }
//
//        }
//
//        BekleKapat();
//    }
//}
