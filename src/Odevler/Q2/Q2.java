//package Q2;
//
//import Utils.BaseStaticDriver;
//import org.openqa.selenium.By;
//import org.openqa.selenium.WebElement;
//import org.openqa.selenium.interactions.Action;
//import org.openqa.selenium.interactions.Actions;
//
//import java.util.List;
//
//public class Q2 extends BaseStaticDriver {
//    public static void main(String[] args) {
//
//        driver.get("http://dhtmlgoodies.com/scripts/drag-drop-nodes/drag-drop-nodes.html");
//
//        Bekle(5);
//        List<WebElement> allitems = driver.findElements(By.cssSelector("[id=\"allItems\"]>li"));
//        List<WebElement> container = driver.findElements(By.cssSelector("[id*=\"box\"]"));
//        WebElement cont;
//        int height, counter = 0;
//
//        for (int i = container.size() - 1; i >= 0; i--
//        ) {
//
//            // System.out.println(all.getText());
//            cont = container.get(i);
//            Bekle(2);
//            height = Integer.parseInt(cont.getAttribute("style").replaceAll("\\D", ""));
//            for (int j = allitems.size() - 1; j >= 0; j--
//            ) {
//
//                WebElement all = allitems.get(j);
//                Bekle(2);
//
//                Actions act = new Actions(driver);
//
//                act.moveToElement(all).clickAndHold().perform();
//                Bekle(1);
//
//                Action a = act.release(cont).build();
//                Bekle(1);
//                a.perform();
//                Bekle(2);
//                allitems.remove(j);
//                counter++;
//                if (counter > 0 && (height / counter) == 29) {
//
//
//                    container.remove(i);
//                    counter = 0;
//                    break;
//                }
//
//
//            }
//
//        }
//
//        BekleKapat();
//    }
//
//}