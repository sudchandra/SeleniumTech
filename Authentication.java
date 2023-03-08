package seleniumtrainee;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Authentication  {
    public static void main(String args[])
    {
        System.setProperty("webdriver.chrome.driver", "/Users/sudarshanhs/Downloads/chromedriver_mac64-2/chromedriver");
        WebDriver driver=new ChromeDriver();
        driver.get("https://admin:admin@the-internet.herokuapp.com/basic_auth");


    }
}