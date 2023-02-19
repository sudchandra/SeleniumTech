package seleniumtrainee;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;



    public class SeleniumDemo1 {
        public static void main(String args[]) {
            System.setProperty("webdriver.chrome.driver", "/Users/sudarshanhs/Downloads/chromedriver_mac64/chromedriver");
            WebDriver driver = new ChromeDriver();
            driver.get("https:stackoverflow.com");
            System.out.println(driver.getTitle());
            //Thread.sleep(3000);
            driver.quit();
        }
    }

