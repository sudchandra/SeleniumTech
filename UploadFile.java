package seleniumtrainee;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.awt.*;
import java.awt.datatransfer.StringSelection;

public class UploadFile {
    public static void main(String args[]) throws AWTException {
        System.setProperty("webdriver.chrome.driver", "/Users/sudarshanhs/Downloads/chromedriver_mac64-2/chromedriver");
        WebDriver driver = new ChromeDriver();
        driver.get("https://www.foundit.in/");
        driver.manage().window().maximize();

        //xpath of the uploading file
        driver.findElement(By.xpath("//div[@class=\'heroSection-buttonContainer_secondaryBtn__text\']")).click();
        //using sendkeys
        //driver.findElement(By.xpath(" //input[@id='file-upload']")).sendKeys("/Users/sudarshanhs/Downloads/Document from Sud.pdf ");
        //using robot classs(whenever type=file is not present in the html then we have to go for this
        WebElement button = driver.findElement(By.xpath(" //input[@id='file-upload']"));
        JavascriptExecutor js = (JavascriptExecutor) driver;
        js.executeScript("arguments[0].click();", button);


        //using robot calss
       /* Robot rb=new Robot();
        rb.delay();
        StringSelection ss=new StringSelection("/Users/sudarshanhs/Downloads/Document from Sud.pdf");
        Toolkit.getDefaultToolkit().getSystemClipboard().setContents(ss,null );*/


    }
}
