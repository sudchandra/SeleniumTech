package seleniumtrainee;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Set;

public class BrowserWindow {
    public static void main(String args[])
    {
        System.setProperty("webdriver.chrome.driver","/Users/sudarshanhs/downloads/chromedriver_mac64/chromedriver");
        WebDriver driver=new ChromeDriver();
        driver.get("https://en-gb.facebook.com/");
//handling singlwindow
       // String WebId=driver.getWindowHandle();
           //     System.out.println(WebId);//CDwindow-CECB3FC8F1D305B0B1A2AFDB38862EEF(first time)it willll differ everytime

        //handling multiple window
        driver.findElement(By.xpath(" //a[normalize-space()='Create a Page']")).click();
        Set<String> webid2=driver.getWindowHandles();
        //<String> it=webid2.iterator();
        //String parentid1=it.next();
       // String childid1=it.next();
        //System.out.println("child id id"+childid1+" "+"parent id is"+parentid1);
        //converting into array list

        List<String> al=new ArrayList<>(webid2);
        //String parentid=al.get(0);
        //String childid=al.get(1);
        //System.out.println(parentid);
        //System.out.println(childid);

        //window ids for switichig
       /* driver.switchTo().window(parentid1);
        System.out.println("parent id"+driver.getTitle());

        driver.switchTo().window(childid1);
        System.out.println("child id"+driver.getTitle());*/

        //using for each loop
        for(String winid:al)
        {
            String title=driver.switchTo().window(winid).getTitle() ;
            System.out.println(title);
        }





    }


}
