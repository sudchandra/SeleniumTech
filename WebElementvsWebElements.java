package seleniumtrainee;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import java.util.List;

public class WebElementvsWebElements {
 public static void main(String args[])
 {
     System.setProperty( "webdriver.chrome.driver","/Users/sudarshanhs/downloads/chromedriver_mac64/chromedriver");
     WebDriver driver=new ChromeDriver();
     driver.get("https://www.flipkart.com");

    //  WebElement search= driver.findElement(By.xpath("//*[@id=\"container\"]/div/footer/div/div[2]/div"));
      //search.sendKeys("mobilephones");
      List<WebElement> links=driver.findElements(By.xpath("/html/body/script[5] "));
      System.out.println("number of elements cptured"+links.size());
      for(WebElement ele:links)
      {
          System.out.println(ele.getText());
      }
 }
}
