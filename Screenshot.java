package seleniumtrainee;

import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.io.FileHandler;

import java.io.File;
import java.io.IOException;

public class Screenshot {
    public static void main(String args[]) throws IOException {
        System.setProperty("webdriver.chrome.driver","/Users/sudarshanhs/downloads/chromedriver_mac64/chromedriver");
        WebDriver driver=new ChromeDriver();
        driver.get("https://www.amazon.in/");
        driver.manage().window().maximize();


       //taking full page screeenshot

       /* TakesScreenshot ts= (TakesScreenshot)driver;
        File src=ts.getScreenshotAs(OutputType.FILE);
        File trg=new File("/Users/sudarshanhs/Downloads/homepage.png");
        FileHandler.copy(src,trg);*/
        //taking the screnshot of specific element
        WebElement section= driver.findElement(By.xpath(" //div[@id='lycSrvi12nBSdJfD_J5GlQ']"));
        File src=section.getScreenshotAs(OutputType.FILE);
        File trg=new File("/Users/sudarshanhs/Downloads/sectionsc.png");
        FileHandler.copy(src,trg);
        //finding whether the object is present or not








    }

}
