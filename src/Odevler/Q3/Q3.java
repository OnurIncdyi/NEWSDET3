//package Q3;
//
//import Utils.BaseStaticDriver;
//import org.openqa.selenium.By;
//import org.openqa.selenium.WebElement;
//import org.openqa.selenium.interactions.Action;
//import org.openqa.selenium.interactions.Actions;
//
//import java.util.List;
//
//public class Q3 extends BaseStaticDriver {
//
//    public static void main(String[] args) {
//
//        driver.get("http://dhtmlgoodies.com/scripts/drag-drop-nodes-quiz/drag-drop-nodes-quiz.html");
//
//        Bekle(5);
//        List<WebElement> allitems = driver.findElements(By.cssSelector("[id=\"allItems\"]>li"));
//        List<WebElement> container = driver.findElements(By.cssSelector("[id*=\"box\"]"));
//        WebElement all;
//        int height, counter = 0;
//
//        for (int i = allitems.size() - 1; i >= 0; i--
//        ) {
//
//            // System.out.println(all.getText());
//            all = allitems.get(i);
//
//            for (int j = container.size() - 1; j >= 0; j--
//            ) {
//
//
//                WebElement cont = container.get(j);
//                height = Integer.parseInt(cont.getAttribute("style").replaceAll("\\D", ""));
//
//
//                Actions act = new Actions(driver);
//
//                act.moveToElement(all).clickAndHold().perform();
//
//
//                Action a = act.release(cont).build();
//                Bekle(1);
//                a.perform();
//
//
//                if(i==0)
//                {
//                    Bekle(2);
//                    driver.switchTo().alert().accept();
//                }
//                if (all.getAttribute("class").contains("correctAnswer") ) {
//                    allitems.remove(i);
//                    counter++;
//
//                    List<WebElement> lilist=cont.findElements(By.cssSelector("[id*=\"box\"]>li"));
//                    Bekle(1);
//                    if (lilist.size()==3) {
//
//
//                        container.remove(j);
//                        counter = 0;
//
//                    }
//                    break;
//                }
//
//                 }
//
//        }
//
//
//
//        BekleKapat();
//
//    }
//}
