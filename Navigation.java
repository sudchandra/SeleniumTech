package seleniumtrainee;
import org.openqa.selenium.WebDriver;

import org.openqa.selenium.chrome.ChromeDriver;

public class Navigation {
    public static void main(String args[])
    {
      System.setProperty("webdriver.chrome.driver", "/Users/sudarshanhs/Downloads/chromedriver_mac64/chromedriver");
                WebDriver driver =new ChromeDriver();
      driver.get("https://www.google.com/search?q=amazon&rlz=1C5GCEM_enIN1040IN1041&oq=amazon&aqs=chrome..69i57.4028j0j15&sourceid=chrome&ie=UTF-8");
      driver.navigate().to("https://www.google.com/search?q=sanpdeal&rlz=1C5GCEM_enIN1040IN1041&oq=sanpdeal&aqs=chrome..69i57.1673j0j15&sourceid=chrome&ie=UTF-8");
      driver.navigate().forward();
      driver.navigate().back();
      driver.navigate().refresh();
    }
}
