package seleniumtrainee;


import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
public class CssLocaters
{
    public static void main(String args[])
    {
        System.setProperty("webdriver.chrome.driver","/Users/sudarshanhs/downloads/chromedriver_mac64/chromedriver");
                WebDriver driver=new ChromeDriver();
                driver.get("https://www.google.co.in/?client=safari&channel=mac_bm");
               driver.findElement(By.className("q")).sendKeys("youtube");
               driver.findElement(By.xpath("//*[@id=\"tsf\"]/div[1]/div[1]/div[2]/button/div/span/svg/path")).click();



    }
}



