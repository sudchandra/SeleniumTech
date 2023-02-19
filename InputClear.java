package seleniumtrainee;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.WebElement;
import java.lang.String;

public class InputClear {
    public static void main(String args[])
    {
        System.setProperty("webdriver.chrome.driver","/Users/sudarshanhs/downloads/chromedriver_mac64/chromedriver");
        WebDriver driver=new ChromeDriver();


        driver.get("https://www.instagram.com/accounts/login/");

                WebElement links=driver.findElement(By.xpath("//*[@id=\"loginForm\"]/div/div[1]/div/label/input"));
                        links.clear();
        links.sendKeys("sudarshanhs@tekin.com");


    }
}
