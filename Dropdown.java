package seleniumtrainee;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeDriverService;
import org.openqa.selenium.support.ui.Select;

import java.util.List;

public class Dropdown {
    public static void main(String args[]) {
        System.setProperty("webdriver.chrome.driver", "/Users/sudarshanhs/downloads/chromedriver_mac64/chromedriver");
        WebDriver driver = new ChromeDriver();
        driver.get("https://www.opencart.com/index.php?route=account/register");
        WebElement dropdown = driver.findElement(By.id("input-country"));
        Select drp = new Select(dropdown);
        // drp.selectByVisibleText("Antarctica");
       // drp.selectByValue("5");
        //drp.selectByindex("0")

        //without using the metghods

        List<WebElement> options=drp.getOptions();
        for(WebElement opt:options)
        {
            if(opt.getText().equals("Azerbaijan"))
            {
                opt.click();
            }
        }


    }
}
