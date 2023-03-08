package seleniumtrainee;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.io.FileHandler;

import java.io.File;
import java.io.IOException;
import java.io.IOException;

class Screeenshot1 {
  WebDriver driver;
         public void launch()
         {
             System.setProperty("webdriver.chrome.driver","/Users/sudarshanhs/Downloads/chromedriver_mac64-2/chromedriver");
             driver = new ChromeDriver();
             driver.get("https://www.makemytrip.com/");
         }
          public void fullpageScreenshot() throws IOException {
              TakesScreenshot ts=(TakesScreenshot) driver;
              File src=ts.getScreenshotAs(OutputType.FILE);
              File trg=new File("/Users/sudarshanhs/Downloads/newsc.png");
             FileHandler.copy(src,trg);
          }
         public static void  main(String args[]) throws IOException {
             Screeenshot1 sc=new Screeenshot1();
             sc.launch();
             sc.fullpageScreenshot();
         }

}
