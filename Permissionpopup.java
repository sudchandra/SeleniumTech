package seleniumtrainee;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeDriverService;
import org.openqa.selenium.chrome.ChromeOptions;

public class Permissionpopup {
    public static void main(String args[])

    {
        ChromeOptions options=new ChromeOptions();
        options.addArguments( "--disable-notifications");
        System.setProperty("webdriver.chrome.driver", "/Users/sudarshanhs/Downloads/chromedriver_mac64-2/chromedriver");
        WebDriver driver=new ChromeDriver(options);
        driver.get("https://www.redbus.in/");


    }
}
