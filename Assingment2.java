package seleniumtrainee;



import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

     class Assignment2 {
        public static void main(String args[]){
            System.setProperty("webdriver.chrome.driver","/Users/sudarshanhs/downloads/chromedriver_mac64/chromedriver");
            WebDriver driver =new ChromeDriver();
            driver.get("https:google.com");

            WebElement searchbar=driver.findElement(By.xpath("//input[@title='Search']"));//locate the search bar
            searchbar.sendKeys("amazon.in");
            searchbar.submit();//redirect to amazon

            WebElement amazonlink=driver.findElement(By.xpath("//h3[normalize-space()='Amazon.in']"));
            amazonlink.click();


            WebElement drpdwn=driver.findElement(By.xpath("//select[@id='searchDropdownBox']"));
            drpdwn.click();
            Select drp =new Select(drpdwn);
            drp.selectByValue("search=electronics");

            WebElement search=driver.findElement(By.xpath("//div[@class='nav-search-submit nav-sprite']"));
            search.submit();
            WebElement searchsmthg=driver.findElement(By.xpath("//input[@id='twotabsearchtextbox']"));
            searchsmthg.sendKeys("Sony Bravia 55 inch");
            searchsmthg.submit();
            WebElement price=driver.findElement(By.className("a-price-whole"));
            System.out.println(price.getText());


            driver.quit();


        }
    }

