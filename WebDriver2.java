package seleniumtrainee;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class WebDriver2 {
    public static void main(String args[]) {

        System.setProperty("webdriver.chrome.driver", "/Users/sudarshanhs/Downloads/chromedriver_mac64/chromedriver");
        WebDriver driver = new ChromeDriver();

        driver.get("https://www.youtube.com/watch?v=OdvgWRLP3CE&list=PLUDwpEzHYYLtEENXAFbVPrLeLNHM6OLk7&index=3");

        WebElement store=driver.findElement(By.xpath("//*[@id=\"container\"]/div/div[1]/div[1]/div[2]/div[3]"));
        System.out.println(store.isDisplayed());
       System.out.println(store.isEnabled());
       WebElement store1=driver.findElement(By.xpath("//*[@id=\"container\"]/div/div[2]"));
       store.click();
       System.out.println(store1.isSelected());



    }
}



